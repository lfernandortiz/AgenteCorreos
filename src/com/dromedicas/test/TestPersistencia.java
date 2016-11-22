package com.dromedicas.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dromedicas.dto.Empresa;
import com.dromedicas.dto.EmpresaHome;
import com.dromedicas.servicio.EmpresaServicio;

public class TestPersistencia {

	public static void main(String[] args) {
//		persistir();
//		obtenerEmpresaByNit("9002657300");
		EmpresaServicio s = new EmpresaServicio();
		System.out.println(s.buscarEmpresaByNombre("DROMe").getNombreEmpresa());
	}
	
	
	public static void persistir(){
		Empresa emp = new Empresa();
		emp.setNombreEmpresa("Dromedicas Del Ortiente");
		emp.setNit("9002657300");
		emp.setDireccion("Avenida 11 Be # 8Bn - 10 Guaimaral");
		emp.setTelefono("5740075");
		emp.setEmailNotificaciones("servicioalcliente@dromedicas.com.co");
		emp.setCreacion(new Date());
		
		EmpresaServicio s = new EmpresaServicio();
		s.guarDarEmpresa(emp);
	}

	public static void obtenerEmpresaByNit(String n){
		EmpresaServicio s = new EmpresaServicio();
		Empresa e = s.buscarEmpresaByNitRut(n);
		System.out.println(e.getNombreEmpresa());
		
	}
}
