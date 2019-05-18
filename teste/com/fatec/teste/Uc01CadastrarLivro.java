package com.fatec.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.fatec.model.Livro;

class Uc01CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Software");
			umLivro.setAutor("Pressman");
			
			umLivro.getAutor();
			umLivro.getIsbn();
			umLivro.getTitulo();
		} catch (RuntimeException e) {
			// verificacao
			fail("Não deve falhar");
		}
	}

	@Test
	 public void CT02cadastrarLivroComISBN_em_branco(){
	 //cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
	 	livro.setAutor("Pressman");
	 try{
	 //acao
		livro.setIsbn("");
	 	fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
		 //verificacao
		 assertEquals("ISBN invalido", e.getMessage());
	 	}
	 }

	@Test
	public void CT03CadastrarLivroComTitulo_em_branco() {
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
	 	livro.setAutor("Pressman");
	 try{
	 //acao
		livro.setTitulo("");
	 	fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
		 //verificacao
		 assertEquals("Titulo invalido", e.getMessage());
	 	}
	}
	
	@Test
	public void CT04CadastrarLivroComAutor_em_branco() {
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
	 	livro.setAutor("Pressman");
	 try{
	 //acao
		livro.setAutor("");
	 	fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
		 //verificacao
		 assertEquals("Autor invalido", e.getMessage());
	 	}
	}
	
	@Test
	 public void CT05cadastrarLivroComISBN_nulo(){
	 //cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
	 	livro.setAutor("Pressman");
	 try{
	 //acao
		livro.setIsbn(null);
	 	fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
		 //verificacao
		 assertEquals("ISBN invalido", e.getMessage());
	 	}
	 }
	
	@Test
	public void CT06CadastrarLivroComTitulo_nulo() {
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
	 	livro.setAutor("Pressman");
	 try{
	 //acao
		livro.setTitulo(null);
	 	fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
		 //verificacao
		 assertEquals("Titulo invalido", e.getMessage());
	 	}
	}
	
	@Test
	public void CT07CadastrarLivroComAutor_nulo() {
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
	 	livro.setAutor("Pressman");
	 try{
	 //acao
		livro.setAutor(null);
	 	fail ("deveria lançar uma exceção");
	 }catch(RuntimeException e){
		 //verificacao
		 assertEquals("Autor invalido", e.getMessage());
	 	}
	}
	
	
}
