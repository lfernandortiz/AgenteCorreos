package com.dromedicas.servicio;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dromedicas.dto.Empresa;
import com.dromedicas.dto.EmpresaHome;

public class EmpresaServicio {
	
	private static Logger logger = Logger.getLogger(EmpresaServicio.class);
	EmpresaHome dao;
	
	
	public Empresa buscarEmpresaById( Integer id ){		
		logger.info("Buscando entidad Empresa con id: " + id);
		Session session = null;
		Transaction txt = null;
		dao = new EmpresaHome();
		Empresa empresa = null;		
		try {			
			txt = dao.getSession().beginTransaction();			
			empresa = dao.findById(id);
			txt.commit();				
		} catch (Exception e) {
			txt.rollback();
			logger.error("Error en la busqueda entidad Empresa con id: "+  id);
			e.printStackTrace();
		}finally{
			dao.getSession().close();
			//dao.getSession().close();
			logger.info("Cerrando Session");
		}				
		return empresa;		
	}
	
	
	
	public Empresa buscarEmpresaByNitRut( String nit ){		
		logger.info("Buscando entidad Empresa con Nit o Rut: " + nit);
		Session session = null;
		Transaction txt = null;
		dao = new EmpresaHome();
		Empresa empresa = null;		
		String queryString = "from Empresa e where e.nit = '"+ nit +"'";
		Query q = null;
		try {			
			q = dao.getSession().createQuery(queryString);
			List result = q.list();
			logger.info("Buscando entidad Empresa con Nit o Rut: " + nit);
			if(!result.isEmpty())
				empresa = (Empresa) result.get(0);
			logger.info("Total resultados: " + result.size());
		} catch (Exception e) {
			txt.rollback();
			logger.error("Error en la busqueda entidad Empresa con id: "+  nit);
			e.printStackTrace();
		}finally{
			dao.getSession().close();
			//dao.getSession().close();
			logger.info("Cerrando Session");
		}				
		return empresa;		
	}

	
	public Empresa buscarEmpresaByNombre( String nombre ){		
		logger.info("Buscando entidad Empresa por el nombre: " + nombre);
		Session session = null;
		Transaction txt = null;
		dao = new EmpresaHome();
		Empresa empresa = null;		
		String queryString = "from Empresa e where lower(e.nombreEmpresa) like '%"+ nombre.toLowerCase() +"%'";
		Query q = null;
		try {			
			q = dao.getSession().createQuery(queryString);
			List result = q.list();
			logger.info("Buscando entidad Empresa con nombre: " + nombre);
			if(!result.isEmpty())
				empresa = (Empresa) result.get(0);
			logger.info("Total resultados: " + result.size());
		} catch (Exception e) {
			txt.rollback();
			logger.error("Error en la busqueda entidad Empresa con id: "+  nombre);
			e.printStackTrace();
		}finally{
			dao.getSession().close();			
			logger.info("Cerrando Session");
			
		}				
		return empresa;		
	}
	
	
	public void guarDarEmpresa(Empresa empresa){		
		logger.info("Guardando empresa");
		Session session = null;
		Transaction txt = null;
		dao = new EmpresaHome();
		try {			
			txt = dao.getSession().beginTransaction();			
			empresa = dao.merge(empresa);
			txt.commit();				
		} catch (Exception e) {
			txt.rollback();
			logger.error("Error al guardar empresa");
			e.printStackTrace();
		}finally{
			dao.getSession().close();
			//dao.getSession().close();
			logger.info("Cerrando Session");
		}						
	}
	
	
	
}
