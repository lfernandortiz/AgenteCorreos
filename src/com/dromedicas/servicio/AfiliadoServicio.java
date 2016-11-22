package com.dromedicas.servicio;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dromedicas.dao.AfiliadoHome;
import com.dromedicas.dto.Afiliado;
import com.dromedicas.dto.AfiliadoId;
import com.dromedicas.dto.Empresa;
import com.dromedicas.dto.EmpresaHome;

public class AfiliadoServicio {
	private static Logger logger = Logger.getLogger(AfiliadoServicio.class);
	EmpresaHome daoEmpresa;
	AfiliadoHome daoAfiliado;
	
	
	public boolean afiliadoExiste( String documento, String nacionalidad ){
		AfiliadoId id = new AfiliadoId( documento, nacionalidad);
		Afiliado af = this.buscarAfiliadoById(id);
		if( af != null)
			return true;
		else
			return false;		
	}
	
	
	/**
	 * Permite buscar un afiliado por su Id compuesto por el numero de 
	 * cedula y nacionalidad
	 * @param id
	 * @return
	 */
	public Afiliado buscarAfiliadoById( AfiliadoId id ){		
		logger.info("Buscando entidad Afiliado con id: " + id);
		Session session = null;
		Transaction txt = null;
		daoAfiliado = new AfiliadoHome();
		Afiliado afiliado = null;		
		try {			
			txt = daoAfiliado.getSession().beginTransaction();			
			afiliado = daoAfiliado.findById(id);
			txt.commit();				
		} catch (Exception e) {
			txt.rollback();
			logger.error("Error en la busqueda entidad Empresa con id: "+  id);
			e.printStackTrace();
		}finally{
			daoAfiliado.getSession().close();
			//dao.getSession().close();
			logger.info("Cerrando Session");
		}				
		return afiliado;		
	}
	
	
	public void guardarAfiliado( Afiliado dto ){
		logger.info("Creado afiliado");
		Session session = null;
		Transaction txt = null;
		daoAfiliado = new AfiliadoHome();		
		try {			
			txt = daoAfiliado.getSession().beginTransaction();			
			daoAfiliado.persist(dto);
			txt.commit();				
		} catch (Exception e) {
			txt.rollback();
			logger.error("Error al guardar el afiliado");
			e.printStackTrace();
		}finally{
			daoAfiliado.getSession().close();
			//dao.getSession().close();
			logger.info("Cerrando Session");
		}
	}
}
