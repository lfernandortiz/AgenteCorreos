package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Emailparametro;

/**
 * Home object for domain model class Emailparametro.
 * @see com.dromedicas.dto.Emailparametro
 * @author Hibernate Tools
 */
public class EmailparametroHome extends BaseHibernateDAO{

	private static final Log log = LogFactory.getLog(EmailparametroHome.class);

	private final Session sessionFactory = super.getSession();

	protected Session getSessionFactory() {
		try {
			return this.sessionFactory;
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Emailparametro transientInstance) {
		log.debug("persisting Emailparametro instance");
		try {
			this.getSessionFactory().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Emailparametro instance) {
		log.debug("attaching dirty Emailparametro instance");
		try {
			this.getSessionFactory().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Emailparametro instance) {
		log.debug("attaching clean Emailparametro instance");
		try {
			this.getSessionFactory().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Emailparametro persistentInstance) {
		log.debug("deleting Emailparametro instance");
		try {
			this.getSessionFactory().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Emailparametro merge(Emailparametro detachedInstance) {
		log.debug("merging Emailparametro instance");
		try {
			Emailparametro result = (Emailparametro) this.getSessionFactory().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Emailparametro findById(java.lang.Integer id) {
		log.debug("getting Emailparametro instance with id: " + id);
		try {
			Emailparametro instance = (Emailparametro) this.getSessionFactory().get(
							"com.dromedicas.dto.Emailparametro", id);
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

	public List findByExample(Emailparametro instance) {
		log.debug("finding Emailparametro instance by example");
		try {
			List results = this.getSessionFactory().createCriteria("com.dromedicas.dto.Emailparametro")
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
