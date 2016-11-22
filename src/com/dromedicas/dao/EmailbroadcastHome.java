package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Emailbroadcast;
import com.dromedicas.dto.EmailbroadcastId;

/**
 * Home object for domain model class Emailbroadcast.
 * @see com.dromedicas.dto.Emailbroadcast
 * @author Hibernate Tools
 */
public class EmailbroadcastHome {

	private static final Log log = LogFactory.getLog(EmailbroadcastHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Emailbroadcast transientInstance) {
		log.debug("persisting Emailbroadcast instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Emailbroadcast instance) {
		log.debug("attaching dirty Emailbroadcast instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Emailbroadcast instance) {
		log.debug("attaching clean Emailbroadcast instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Emailbroadcast persistentInstance) {
		log.debug("deleting Emailbroadcast instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Emailbroadcast merge(Emailbroadcast detachedInstance) {
		log.debug("merging Emailbroadcast instance");
		try {
			Emailbroadcast result = (Emailbroadcast) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Emailbroadcast findById(com.dromedicas.dto.EmailbroadcastId id) {
		log.debug("getting Emailbroadcast instance with id: " + id);
		try {
			Emailbroadcast instance = (Emailbroadcast) sessionFactory
					.getCurrentSession().get(
							"com.dromedicas.dto.Emailbroadcast", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Emailbroadcast instance) {
		log.debug("finding Emailbroadcast instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Emailbroadcast")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
