package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistema {
	
	@Test
	public void queSePuedaCrearUnSistema() {
		Sistema sistema = new Sistema("windows", 5);
		
		
		assertNotNull(sistema);
	}

	@Test
	public void queSePuedaCrearUnUsuario() {
		Usuario usuario = new Usuario("Lucas", "hola");
				
		assertNotNull(usuario);
	}

	
	@Test
	public void queSePuedaIngresarUnUsuario() {
		Sistema sistema = new Sistema("windows", 5);
		Usuario usuario = new Usuario("Lucas", "hola");

		sistema.ingresarUsuario(usuario);
		
		
		
		assertNotNull(usuario);
	}
}
