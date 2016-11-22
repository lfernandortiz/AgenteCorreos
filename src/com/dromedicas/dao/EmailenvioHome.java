package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Emailenvio;

/**
 * Home object for domain model class Emailenvio.
 * @see com.dromedicas.dto.Emailenvio
 * @author Hibernate Tools
 */
public class EmailenvioHome extends BaseHibernateDAO {
	
	private static final Log log = LogFactory.getLog(EmailenvioHome.class);

	public static final String ESTADOEMAIL = "estadoemail";

	public void save(Emailenvio transientInstance) {
		log.debug("saving Emailenvio instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Emailenvio persistentInstance) {
		log.debug("deleting Emailenvio instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Emailenvio findById(com.dromedicas.dto.EmailenvioId id) {
		log.debug("getting Emailenvio instance with id: " + id);
		try {
			Emailenvio instance = (Emailenvio) getSession().get("com.dromedicas.dto.Emailenvio", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Emailenvio instance) {
		log.debug("finding Emailenvio instance by example");
		try {
			List results = getSession().createCriteria("com.dromedicas.dto.Emailenvio").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Emailenvio instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Emailenvio as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEstadoemail(Object estadoemail) {
		return findByProperty(ESTADOEMAIL, estadoemail);
	}

	public List findAll() {
		log.debug("finding all Emailenvio instances");
		try {
			String queryString = "from Emailenvio";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Emailenvio merge(Emailenvio detachedInstance) {
		log.debug("merging Emailenvio instance");
		try {
			Emailenvio result = (Emailenvio) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Emailenvio instance) {
		log.debug("attaching dirty Emailenvio instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Emailenvio instance) {
		log.debug("attaching clean Emailenvio instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}
