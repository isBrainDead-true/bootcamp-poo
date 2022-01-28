package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria \ndata:" + data 
				+ "\nTitulo: " + getTitulo() 
				+ "\nDescrição: " + getDescricao();
	}
	
	public double CalcularXp() {
		// TODO Auto-generated method stub
		return XP + 10;
	}
	
	
	
	
	
	
}
