package com.fatec.teste;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.fatec.model.Usuario;

class UC02CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuario() {
		try {
			Usuario user = new Usuario();
			user.setNome("Fabricio");
			user.setRa("1110481712008");
			user.getNome();
			user.getRa();
			
		}catch(RuntimeException e){
			
			fail("Não deve Falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuario_ra_em_branco() {
		Usuario user = new Usuario();
		user.setNome("Fabricio");
		user.setRa("111048171208");
		
		try {
			user.setRa("");
			fail("Deve Lançar Exception");
			
		} catch (Exception e) {
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuario_ra_nulo() {
		Usuario user = new Usuario();
		user.setNome("Fabricio");
		user.setRa("111048171208");
		
		try {
			user.setRa(null);
			fail("Deve Lançar Exception");
			
		} catch (Exception e) {
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuario_nome_em_branco() {
		Usuario user = new Usuario();
		user.setNome("Fabricio");
		user.setRa("111048171208");
		
		try {
			user.setNome("");
			fail("Deve Lançar Exception");
			
		} catch (Exception e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuario_nome_nulo() {
		Usuario user = new Usuario();
		user.setNome("Fabricio");
		user.setRa("111048171208");
		
		try {
			user.setNome(null);
			fail("Deve Lançar Exception");
		} catch (Exception e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	
}
