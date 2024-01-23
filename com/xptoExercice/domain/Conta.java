package com.xptoExercice.domain;

import com.xptoExercice.domain.enums.Tipo;

public class Conta {

	private int id;
	private Tipo tipo;
	private double limite;
	private String cliente_id;
	
	public Conta() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(String cliente_id) {
		this.cliente_id = cliente_id;
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", tipo=" + tipo + ", limite=" + limite + ", cliente_id=" + cliente_id + "]";
	}
		
}
