import domain.entity.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FuncionarioTest {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario f1 = new Funcionario(1, "Pedro Antônio Leixão", 3000);
        Funcionario f2 = new Funcionario(2, "Loyam Troyer Nill", 10000);
        Funcionario f3 = new Funcionario(3, "Maria Antonieta Schulz", 1500);
        Funcionario f4 = new Funcionario(4, "Sadhaak Antons Lee", 400);
        Funcionario f5 = new Funcionario(5, "Hugh Soft Antônio", 1000);

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);

     Map<Integer, List<String>> salariosAcima3000 = funcionarios.stream()
             .filter(f -> {
                 try{
                     if(f.getSalario() < 3000){
                         return false;
                     }
                     return true;
                 }catch(Exception e){
                     return false;
                 }
             })
             .collect(Collectors.groupingBy(
                     Funcionario::getId,
                     Collectors.mapping(Funcionario::getNome, Collectors.toList())
             ));
        System.out.println(salariosAcima3000);
    }
}