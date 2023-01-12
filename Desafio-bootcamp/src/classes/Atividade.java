package classes;

public abstract class Atividade {
    protected final int XP_PADRAO = 10;
    protected String titulo;
    protected String descricao;

    public Atividade(){}

    public Atividade(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract int calcularXp();
}
