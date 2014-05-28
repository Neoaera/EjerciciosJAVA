package com.javarevolutions.ws.bean;

import java.io.Serializable;

public class beanLogin implements Serializable{
private String usuario;
private String pasword;
private String mensaje;
private Boolean status;
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getPassword() {
	return pasword;
}
public void setPassword(String password) {
	this.pasword = password;
}
public String getMensaje() {
	return mensaje;
}
public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
}
