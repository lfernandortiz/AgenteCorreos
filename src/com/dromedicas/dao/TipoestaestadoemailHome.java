package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Tipoestaestadoemail;

/**
 * Home object for domain model class Tipoestaestadoemail.
 * @see com.dromedicas.dto.Tipoestaestadoemail
 * @author Hibernate Tools
 */
public class TipoestaestadoemailHome {

	private static final Log log = LogFactory
			.getLog(TipoestaestadoemailHome.class);

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

	public void persist(Tipoestaestadoemail transientInstance) {
		log.debug("persisting Tipoestaestadoemail instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tipoestaestadoemail instance) {
		log.debug("attaching dirty Tipoestaestadoemail instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tipoestaestadoemail instance) {
		log.debug("attaching clean Tipoestaestadoemail instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tipoestaestadoemail persistentInstance) {
		log.debug("deleting Tipoestaestadoemail instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tipoestaestadoemail merge(Tipoestaestadoemail detachedInstance) {
		log.debug("merging Tipoestaestadoemail instance");
		try {
			Tipoestaestadoemail result = (Tipoestaestadoemail) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tipoestaestadoemail findById(java.lang.Integer id) {
		log.debug("getting Tipoestaestadoemail instance with id: " + id);
		try {
			Tipoestaestadoemail instance = (Tipoestaestadoemail) sessionFactory
					.getCurrentSession().get(
							"com.dromedicas.dto.Tipoestaestadoemail", id);
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

	public List findByExample(Tipoestaestadoemail instance) {
		log.debug("finding Tipoestaestadoemail instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Tipoestaestadoemail")
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
