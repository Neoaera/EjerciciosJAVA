package com.javarevolutions.ws.service;

import com.javarevolutions.ws.bean.BeanLogin;

public class ImplLogin implements IfaceLogin{

	@Override
	public BeanLogin validaLogin(BeanLogin obj) {
		BeanLogin bean = new BeanLogin();
		if(obj.getUsuario().equals("SRios") && obj.getPassword().equals("rios")){
			bean.setMensaje("Usuario Correcto 	.	.	.	.");
			bean.setStatus(true);
		}else{
			bean.setMensaje("Usuario INCORRECTO	.	.	.	.");
			bean.setStatus(false);
		}
	return bean;
	}

}
