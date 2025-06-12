import domain.entity.Agenda;
import domain.entity.Tarefa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TarefaTest {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Tarefa t1 = new Tarefa(1, "Fazer malas para a viagem do dia 12/06/2025");
        Tarefa t2 = new Tarefa(2, "Fazer almoço antes de 11h00");
        Tarefa t3 = new Tarefa(3, "Levar Toninho para a creche");
        Tarefa t4 = new Tarefa(5, "Comprar maças para a salada de fruta");
        Tarefa t5 = new Tarefa(5, "Aprender uma receita doce nova");

        agenda.adicionarTarefas(t1);
        agenda.adicionarTarefas(t2);
        agenda.adicionarTarefas(t3);
        agenda.adicionarTarefas(t4);
        agenda.adicionarTarefas(t5);

        // Exibir a tarefa mais importante
        System.out.println(agenda.proximaTarefa());
        List<Tarefa> ts = agenda.getTarefas().stream()
                .sorted(Comparator.comparing(Tarefa::getPrioridade))
                .collect(Collectors.toList());
        System.out.println(ts);
    }
}
