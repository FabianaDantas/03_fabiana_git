package br.com.seniorsolution.entidades;


public class Sugestao {

	private String nome;
	
	private String email;
	
	private String sugestao;
	
	public Sugestao(String nome, String email, String sugestao) {
		this.nome = nome;
		this.email = email;
		this.sugestao = sugestao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSugestao() {
		return sugestao;
	}

	public void setSugestao(String sugestao) {
		this.sugestao = sugestao;
	}
	
		
	
}
