package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Smsbroadcast;
import com.dromedicas.dto.SmsbroadcastId;

/**
 * Home object for domain model class Smsbroadcast.
 * @see com.dromedicas.dto.Smsbroadcast
 * @author Hibernate Tools
 */
public class SmsbroadcastHome {

	private static final Log log = LogFactory.getLog(SmsbroadcastHome.class);

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

	public void persist(Smsbroadcast transientInstance) {
		log.debug("persisting Smsbroadcast instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Smsbroadcast instance) {
		log.debug("attaching dirty Smsbroadcast instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Smsbroadcast instance) {
		log.debug("attaching clean Smsbroadcast instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Smsbroadcast persistentInstance) {
		log.debug("deleting Smsbroadcast instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Smsbroadcast merge(Smsbroadcast detachedInstance) {
		log.debug("merging Smsbroadcast instance");
		try {
			Smsbroadcast result = (Smsbroadcast) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Smsbroadcast findById(com.dromedicas.dto.SmsbroadcastId id) {
		log.debug("getting Smsbroadcast instance with id: " + id);
		try {
			Smsbroadcast instance = (Smsbroadcast) sessionFactory
					.getCurrentSession().get("com.dromedicas.dto.Smsbroadcast",
							id);
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

	public List findByExample(Smsbroadcast instance) {
		log.debug("finding Smsbroadcast instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Smsbroadcast")
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
