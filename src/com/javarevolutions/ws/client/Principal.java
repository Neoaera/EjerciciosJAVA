package com.javarevolutions.ws.client;

import java.rmi.RemoteException;

import com.javarevolutions.ws.bean.BeanLogin;
import com.javarevolutions.ws.service.ImplLogin;
import com.javarevolutions.ws.service.ImplLoginProxy;

public class Principal {
	
	/**
	 * 
	 * @param args
	 * @author Andres Ramos
	 * @version 1.0
	 */

	public static void main(String[] args) {
		ImplLogin iface = new ImplLoginProxy("http://localhost:8080/ValidaCredenciales/services/ImplLogin");
		BeanLogin obj = new BeanLogin();
		obj.setUsuario("SRios");
		obj.setPassword("rios");
		try {
			obj = iface.validaLogin(obj);
			if(obj.getStatus()){
				System.out.println("Welcome	.	.	.");
			}else{
				System.out.println(obj.getMensaje());
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
