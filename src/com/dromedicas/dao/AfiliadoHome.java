package com.dromedicas.dao;

// Generated 31/10/2016 11:16:27 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import com.dromedicas.dto.Afiliado;

/**
 * Home object for domain model class Afiliado.
 * @see com.dromedicas.dto.Afiliado
 * @author Hibernate Tools
 */
public class AfiliadoHome extends BaseHibernateDAO {

	private static final Log log = LogFactory.getLog(AfiliadoHome.class);
	// property constants
	public static final String NOMBRES = "nombres";
	public static final String APELLIDOS = "apellidos";
	public static final String SEXO = "sexo";
	public static final String TELEFONOFIJO = "telefonofijo";
	public static final String CELULAR = "celular";
	public static final String DEPARTAMENTO = "departamento";
	public static final String CIUDAD = "ciudad";
	public static final String STREET = "street";
	public static final String STREETVALOR = "streetvalor";
	public static final String STREETDOS = "streetdos";
	public static final String STREETDOSVALOR = "streetdosvalor";
	public static final String EMAIL = "email";
	public static final String EMAILVALIDADO = "emailvalidado";
	public static final String URLIMAGEPERFIL = "urlimageperfil";
	public static final String FACEBOOKPERFIL = "facebookperfil";
	public static final String TWITTERPERFIL = "twitterperfil";
	public static final String IDVENDEDOR = "idvendedor";
	public static final String USUARIOWEB = "usuarioweb";
	public static final String CLAVEWEB = "claveweb";

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

	public void persist(Afiliado transientInstance) {
		log.debug("persisting Afiliado instance");
		try {
			this.getSessionFactory().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Afiliado instance) {
		log.debug("attaching dirty Afiliado instance");
		try {
			this.getSessionFactory().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Afiliado instance) {
		log.debug("attaching clean Afiliado instance");
		try {
			this.getSessionFactory().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Afiliado persistentInstance) {
		log.debug("deleting Afiliado instance");
		try {
			this.getSessionFactory().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Afiliado merge(Afiliado detachedInstance) {
		log.debug("merging Afiliado instance");
		try {
			Afiliado result = (Afiliado) this.getSessionFactory().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Afiliado findById(com.dromedicas.dto.AfiliadoId id) {
		log.debug("getting Afiliado instance with id: " + id);
		try {
			Afiliado instance = (Afiliado) this.getSessionFactory().get("com.dromedicas.dto.Afiliado", id);
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

	public List findByExample(Afiliado instance) {
		log.debug("finding Afiliado instance by example");
		try {
			List results = this.getSessionFactory().createCriteria("com.dromedicas.dto.Afiliado")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Afiliado instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from Afiliado as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	
	public List findAll() {
		log.debug("finding all Afiliado instances");
		try {
			String queryString = "from Afiliado";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	
	public List findByNombres(Object nombres) {
		return findByProperty(NOMBRES, nombres);
	}

	public List findByApellidos(Object apellidos) {
		return findByProperty(APELLIDOS, apellidos);
	}

	public List findBySexo(Object sexo) {
		return findByProperty(SEXO, sexo);
	}

	public List findByTelefonofijo(Object telefonofijo) {
		return findByProperty(TELEFONOFIJO, telefonofijo);
	}

	public List findByCelular(Object celular) {
		return findByProperty(CELULAR, celular);
	}

	public List findByDepartamento(Object departamento) {
		return findByProperty(DEPARTAMENTO, departamento);
	}

	public List findByCiudad(Object ciudad) {
		return findByProperty(CIUDAD, ciudad);
	}

	public List findByStreet(Object street) {
		return findByProperty(STREET, street);
	}

	public List findByStreetvalor(Object streetvalor) {
		return findByProperty(STREETVALOR, streetvalor);
	}

	public List findByStreetdos(Object streetdos) {
		return findByProperty(STREETDOS, streetdos);
	}

	public List findByStreetdosvalor(Object streetdosvalor) {
		return findByProperty(STREETDOSVALOR, streetdosvalor);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByEmailvalidado(Object emailvalidado) {
		return findByProperty(EMAILVALIDADO, emailvalidado);
	}

	public List findByUrlimageperfil(Object urlimageperfil) {
		return findByProperty(URLIMAGEPERFIL, urlimageperfil);
	}

	public List findByFacebookperfil(Object facebookperfil) {
		return findByProperty(FACEBOOKPERFIL, facebookperfil);
	}

	public List findByTwitterperfil(Object twitterperfil) {
		return findByProperty(TWITTERPERFIL, twitterperfil);
	}

	public List findByIdvendedor(Object idvendedor) {
		return findByProperty(IDVENDEDOR, idvendedor);
	}

	public List findByUsuarioweb(Object usuarioweb) {
		return findByProperty(USUARIOWEB, usuarioweb);
	}

	public List findByClaveweb(Object claveweb) {
		return findByProperty(CLAVEWEB, claveweb);
	}
}
