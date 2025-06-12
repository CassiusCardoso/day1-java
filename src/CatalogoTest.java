import domain.entity.Catalogo;
import domain.entity.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoTest {
    public static void main(String[] args) {
        Catalogo<Produto> catalogo = new Catalogo<>();
        Produto p1 = new Produto("Salmão", 10);
        Produto p2 = new Produto("Feijão", 5.99);
        Produto p3 = new Produto("Carne", 9.99);
        Produto p4 = new Produto("Arroz", 4.99);
        Produto p5 = new Produto("Couve-flor", 2.99);
        catalogo.adicionarItem(p1);
        catalogo.adicionarItem(p2);
        catalogo.adicionarItem(p3);
        catalogo.adicionarItem(p4);
        catalogo.adicionarItem(p5);
        List<Produto> produtos = catalogo.listarItens();

        List<Produto> produtosPrecoMenorMaior = produtos.stream()
                .sorted(Comparator.comparing(Produto::getPreco))
                .collect(Collectors.toList());
        produtosPrecoMenorMaior.forEach(System.out::println);
    }
}