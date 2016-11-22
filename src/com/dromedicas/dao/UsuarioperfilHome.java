package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Usuarioperfil;
import com.dromedicas.dto.UsuarioperfilId;

/**
 * Home object for domain model class Usuarioperfil.
 * @see com.dromedicas.dto.Usuarioperfil
 * @author Hibernate Tools
 */
public class UsuarioperfilHome {

	private static final Log log = LogFactory.getLog(UsuarioperfilHome.class);

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

	public void persist(Usuarioperfil transientInstance) {
		log.debug("persisting Usuarioperfil instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Usuarioperfil instance) {
		log.debug("attaching dirty Usuarioperfil instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Usuarioperfil instance) {
		log.debug("attaching clean Usuarioperfil instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Usuarioperfil persistentInstance) {
		log.debug("deleting Usuarioperfil instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Usuarioperfil merge(Usuarioperfil detachedInstance) {
		log.debug("merging Usuarioperfil instance");
		try {
			Usuarioperfil result = (Usuarioperfil) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Usuarioperfil findById(com.dromedicas.dto.UsuarioperfilId id) {
		log.debug("getting Usuarioperfil instance with id: " + id);
		try {
			Usuarioperfil instance = (Usuarioperfil) sessionFactory
					.getCurrentSession().get(
							"com.dromedicas.dto.Usuarioperfil", id);
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

	public List findByExample(Usuarioperfil instance) {
		log.debug("finding Usuarioperfil instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Usuarioperfil")
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
