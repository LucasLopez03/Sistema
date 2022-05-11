package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Sistema {
	
	private String nombreDelSistema;
	private Integer cantidadMaximaDeUsuarios;
	private HashSet<Usuario> listaUsuario;

	public Sistema(String nombreDelSistema, Integer cantidadMaximaDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
		
	}
	
	public Boolean ingresarUsuario (Usuario nuevoUsuario) {

		listaUsuario.add(nuevoUsuario);
		
		return false;		
	}
	
	public Boolean loguearUsuario (String usuario, String contraseña) {
		return false;	
	}

}
