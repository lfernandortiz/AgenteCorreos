package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Puntos;
import com.dromedicas.dto.PuntosId;

/**
 * Home object for domain model class Puntos.
 * @see com.dromedicas.dto.Puntos
 * @author Hibernate Tools
 */
public class PuntosHome {

	private static final Log log = LogFactory.getLog(PuntosHome.class);

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

	public void persist(Puntos transientInstance) {
		log.debug("persisting Puntos instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Puntos instance) {
		log.debug("attaching dirty Puntos instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Puntos instance) {
		log.debug("attaching clean Puntos instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Puntos persistentInstance) {
		log.debug("deleting Puntos instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Puntos merge(Puntos detachedInstance) {
		log.debug("merging Puntos instance");
		try {
			Puntos result = (Puntos) sessionFactory.getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Puntos findById(com.dromedicas.dto.PuntosId id) {
		log.debug("getting Puntos instance with id: " + id);
		try {
			Puntos instance = (Puntos) sessionFactory.getCurrentSession().get(
					"com.dromedicas.dto.Puntos", id);
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

	public List findByExample(Puntos instance) {
		log.debug("finding Puntos instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Puntos")
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
