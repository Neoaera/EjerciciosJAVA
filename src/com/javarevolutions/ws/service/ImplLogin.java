package com.javarevolutions.ws.service;

import com.javarevolutions.ws.bean.BeanLogin;

public class ImplLogin implements IfaceLogin{

	@Override
	public BeanLogin validaLogin(BeanLogin obj) {
		BeanLogin bean = new BeanLogin();
		if(obj.getUsuario().equals("SRios") && obj.getPassword().equals("rios")){
			bean.setMensaje("Usuario Correcto 	.	.	.	.");
		}else{
			bean.setMensaje("Usuario INCORRECT	.	.	.	.");
		}
	}

}
