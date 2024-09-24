/*
 * ListaDeTarefas.java
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ListaDeTarefas {
	
	static ArrayList<Tarefas> arrayDeTarefas = new ArrayList<>();
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selecionar;
		System.out.println("\n\t<---Lista de Afazeres--->\n");
		do{
			System.out.println("------------------------");
			System.out.println("Adicionar Nova Tarefa[1]");
			System.out.println("Remover Tarefa[2]");
			System.out.println("Listar Tarefas[3]");
			System.out.println("Sair[4]");
			System.out.print("Escolha uma Opção: ");
			selecionar = scanner.nextInt();
			
			switch (selecionar){
				case 1:
					Tarefas.adicionarTarefa(arrayDeTarefas);
					break;
				case 2:
					Tarefas.removerTarefa(arrayDeTarefas);
					break;
				case 3:
					Tarefas.listarTarefas(arrayDeTarefas);
					break;
				case 4:
					System.out.println("Programa Finalizado!");
					break;
				default:
					System.out.println("Escolha uma opção válida!");
					
			}
		} while (selecionar != 4);
		
	}
}

