package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Condicionservicio;
import com.dromedicas.dto.CondicionservicioId;

/**
 * Home object for domain model class Condicionservicio.
 * @see com.dromedicas.dto.Condicionservicio
 * @author Hibernate Tools
 */
public class CondicionservicioHome {

	private static final Log log = LogFactory
			.getLog(CondicionservicioHome.class);

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

	public void persist(Condicionservicio transientInstance) {
		log.debug("persisting Condicionservicio instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Condicionservicio instance) {
		log.debug("attaching dirty Condicionservicio instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Condicionservicio instance) {
		log.debug("attaching clean Condicionservicio instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Condicionservicio persistentInstance) {
		log.debug("deleting Condicionservicio instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Condicionservicio merge(Condicionservicio detachedInstance) {
		log.debug("merging Condicionservicio instance");
		try {
			Condicionservicio result = (Condicionservicio) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Condicionservicio findById(com.dromedicas.dto.CondicionservicioId id) {
		log.debug("getting Condicionservicio instance with id: " + id);
		try {
			Condicionservicio instance = (Condicionservicio) sessionFactory
					.getCurrentSession().get(
							"com.dromedicas.dto.Condicionservicio", id);
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

	public List findByExample(Condicionservicio instance) {
		log.debug("finding Condicionservicio instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Condicionservicio")
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
