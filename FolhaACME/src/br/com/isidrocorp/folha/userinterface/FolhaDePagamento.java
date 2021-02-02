package br.com.isidrocorp.folha.userinterface;

import java.util.ArrayList;

import br.com.isidrocorp.folha.core.Chefe;
import br.com.isidrocorp.folha.core.Comissionado;
import br.com.isidrocorp.folha.core.Empreiteiro;
import br.com.isidrocorp.folha.core.Funcionario;
import br.com.isidrocorp.folha.core.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		/*
		Funcionario lista[];
		
		lista = new Funcionario[5];
		
		lista[0] = new Chefe(1234,"Jose Almeida", 8500.00f,10.0f,650.0f);
		lista[1] = new Comissionado(1235, "Adriana Nunes", 7850.0f, 22.0f);
		lista[2] = new Comissionado(1236, "Pedro Pereira", 6500.0f, 25.0f);
		lista[3] = new Horista(1237, "Maria Moreira", 120, 78.54f);
		lista[4] = new Empreiteiro(1238, "Manoel Marques", 7950.00f);
		*/
		
		ArrayList<Funcionario> lista; // declaro uma lista redimensionável de objetos do tipo Funcionario (e sua respectiva descendência)
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe(1234,"Jose Almeida", 8500.00f,10.0f,650.0f));
		lista.add(new Comissionado(1235, "Adriana Nunes", 7850.0f, 22.0f));
		lista.add(new Comissionado(1236, "Pedro Pereira", 6500.0f, 25.0f));
		lista.add(new Horista(1237, "Maria Moreira", 120, 78.54f));
		lista.add(new Empreiteiro(1238, "Manoel Marques", 7950.00f));
		
		lista.remove(2);
		for (Funcionario f : lista) {
			System.out.println(f.getNumRegistro()+" - "+f.getNome()+ "  R$ "+f.calcularSalario());
		}
		
	}

}
