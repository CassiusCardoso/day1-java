package domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> itens = new ArrayList<>();

    public Catalogo() {
        this.itens = itens;
    }
    public List<T> getItens() {
        return itens;
    }
    public void adicionarItem(T item){
        itens.add(item);
    }
    public List<T> listarItens(){
        return itens;
    }

    public static <E> List<E> inverterItens(List<E> listaOriginal){
        List<E> listaInvertida = new ArrayList<>();
        for(int i = listaOriginal.size() - 1; i>=0; i--){
            listaInvertida.add(listaOriginal.get(i));
        }
        return listaInvertida;
    }
}
