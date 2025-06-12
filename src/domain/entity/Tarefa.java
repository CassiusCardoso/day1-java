package domain.entity;

public class Tarefa {
    private int prioridade;
    private String descricao;
    public Tarefa(int prioridade, String descricao) {
        this.prioridade = prioridade;
        this.descricao = descricao;
    }
    public int getPrioridade() {
        return prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "prioridade=" + prioridade +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
