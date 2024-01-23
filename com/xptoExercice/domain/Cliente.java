package com.xptoExercice.domain;

public class Cliente {

	private String nome;
	private int idade;
	private String email;
	private double faixaSalarial;
	
	private Conta conta;
	
	public Cliente() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getFaixaSalarial() {
		return faixaSalarial;
	}

	public void setFaixaSalarial(double faixaSalarial) {
		this.faixaSalarial = faixaSalarial;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}
