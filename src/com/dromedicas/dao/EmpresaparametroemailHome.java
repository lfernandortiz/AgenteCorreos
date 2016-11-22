package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Empresaparametroemail;
import com.dromedicas.dto.EmpresaparametroemailId;

/**
 * Home object for domain model class Empresaparametroemail.
 * @see com.dromedicas.dto.Empresaparametroemail
 * @author Hibernate Tools
 */
public class EmpresaparametroemailHome {

	private static final Log log = LogFactory
			.getLog(EmpresaparametroemailHome.class);

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

	public void persist(Empresaparametroemail transientInstance) {
		log.debug("persisting Empresaparametroemail instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Empresaparametroemail instance) {
		log.debug("attaching dirty Empresaparametroemail instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Empresaparametroemail instance) {
		log.debug("attaching clean Empresaparametroemail instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Empresaparametroemail persistentInstance) {
		log.debug("deleting Empresaparametroemail instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Empresaparametroemail merge(Empresaparametroemail detachedInstance) {
		log.debug("merging Empresaparametroemail instance");
		try {
			Empresaparametroemail result = (Empresaparametroemail) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Empresaparametroemail findById(
			com.dromedicas.dto.EmpresaparametroemailId id) {
		log.debug("getting Empresaparametroemail instance with id: " + id);
		try {
			Empresaparametroemail instance = (Empresaparametroemail) sessionFactory
					.getCurrentSession().get(
							"com.dromedicas.dto.Empresaparametroemail", id);
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

	public List findByExample(Empresaparametroemail instance) {
		log.debug("finding Empresaparametroemail instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.dromedicas.dto.Empresaparametroemail")
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
