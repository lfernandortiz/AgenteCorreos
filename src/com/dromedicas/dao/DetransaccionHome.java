package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Detransaccion;
import com.dromedicas.dto.DetransaccionId;

/**
 * Home object for domain model class Detransaccion.
 * @see com.dromedicas.dto.Detransaccion
 * @author Hibernate Tools
 */
public class DetransaccionHome {

	private static final Log log = LogFactory.getLog(DetransaccionHome.class);

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

	public void persist(Detransaccion transientInstance) {
		log.debug("persisting Detransaccion instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Detransaccion instance) {
		log.debug("attaching dirty Detransaccion instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Detransaccion instance) {
		log.debug("attaching clean Detransaccion instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Detransaccion persistentInstance) {
		log.debug("deleting Detransaccion instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Detransaccion merge(Detransaccion detachedInstance) {
		log.debug("merging Detransaccion instance");
		try {
			Detransaccion result = (Detransaccion) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Detransaccion findById(com.dromedicas.dto.DetransaccionId id) {
		log.debug("getting Detransaccion instance with id: " + id);
		try {
			Detransaccion instance = (Detransaccion) sessionFactory
					.getCurrentSession().get(
							"com.dromedicas.dto.Detransaccion", id);
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

	public List findByExample(Detransaccion instance) {
		log.debug("finding Detransaccion instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Detransaccion")
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
