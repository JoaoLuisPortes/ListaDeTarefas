/*
 * Tarefas.java
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Tarefas {
	
	String nomeDaTarefa;
	String horarioDaTarefa;
	String dataDaTarefa;
	
	public String toString() {
		return "Tarefa: " + nomeDaTarefa + " | Horário: " + horarioDaTarefa + " | Data: " + dataDaTarefa;
	}
	
	static void adicionarTarefa(ArrayList<Tarefas> arrayDeTarefas){
		Scanner leia = new Scanner(System.in);
		System.out.print("Adicione o nome da Tarefa; ");
		String nome = leia.nextLine();
		System.out.print("Adcione o horário da Tarefa; ");
		String horario = leia.nextLine();
		System.out.print("Adcione a data da Tarefa; ");
		String data = leia.nextLine();
		
		Tarefas novaTarefa = new Tarefas();
		novaTarefa.nomeDaTarefa = nome;
		novaTarefa.horarioDaTarefa = horario;
		novaTarefa.dataDaTarefa = data;
		
		arrayDeTarefas.add(novaTarefa);
		System.out.println("Tarefa adicionada com sucesso!\n");
	}
	
	static void removerTarefa(ArrayList<Tarefas> arrayDeTarefas){ 
		Scanner leia = new Scanner(System.in);
		if (arrayDeTarefas.isEmpty()){
			System.out.println("\nNão há tarefas registradas!\n");
			return;
		}
		System.out.print("\nDigite o nome da tarefa que deseja remover: ");
		String nome = leia.nextLine();
		
		for (int i = 0; i < arrayDeTarefas.size(); i++){
			if (arrayDeTarefas.get(i).nomeDaTarefa.equalsIgnoreCase(nome)){
				System.out.println("Tarefa \"" + arrayDeTarefas.get(i).nomeDaTarefa + "\" removida com sucesso!");
				arrayDeTarefas.remove(i);
				return;
			}
		}
		System.out.println("\nNenhuma tarefa chamada \"" + nome + "\" encontrada!\n");
	}
	
	static void listarTarefas(ArrayList<Tarefas> arrayDeTarefas){
		if (arrayDeTarefas.isEmpty()) {
			System.out.println("\nNenhuma tarefa cadastrada!\n");
		}else {
			System.out.println("\nTarefas cadastradas:");
			for (Tarefas tarefaAtual : arrayDeTarefas) {
				System.out.println(tarefaAtual);
			}
			System.out.println();
		}
	}
}

