package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Instancia;
import com.dromedicas.dto.InstanciaId;

/**
 * Home object for domain model class Instancia.
 * @see com.dromedicas.dto.Instancia
 * @author Hibernate Tools
 */
public class InstanciaHome {

	private static final Log log = LogFactory.getLog(InstanciaHome.class);

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

	public void persist(Instancia transientInstance) {
		log.debug("persisting Instancia instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Instancia instance) {
		log.debug("attaching dirty Instancia instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Instancia instance) {
		log.debug("attaching clean Instancia instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Instancia persistentInstance) {
		log.debug("deleting Instancia instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Instancia merge(Instancia detachedInstance) {
		log.debug("merging Instancia instance");
		try {
			Instancia result = (Instancia) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Instancia findById(com.dromedicas.dto.InstanciaId id) {
		log.debug("getting Instancia instance with id: " + id);
		try {
			Instancia instance = (Instancia) sessionFactory.getCurrentSession()
					.get("com.dromedicas.dto.Instancia", id);
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

	public List findByExample(Instancia instance) {
		log.debug("finding Instancia instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Instancia")
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
