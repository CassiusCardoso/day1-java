package domain.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Agenda {
    private List<Tarefa> tarefas = new ArrayList<>();

    public Agenda(){}

    public Agenda(List<Tarefa> tarefas){
        this.tarefas = tarefas;
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public static Comparator<Tarefa> porPrioridade(){
        return Comparator.comparing(Tarefa::getPrioridade);
    }
    public static Comparator<Tarefa> porDescricao(){
        return Comparator.comparing(Tarefa::getDescricao);
    }
    public void adicionarTarefas(Tarefa tarefas){
        this.tarefas.add(tarefas);
    }

    public Tarefa proximaTarefa(){
       return tarefas.stream()
                .min(Comparator.comparing(Tarefa::getPrioridade))
               .orElse(null);
    }

}
