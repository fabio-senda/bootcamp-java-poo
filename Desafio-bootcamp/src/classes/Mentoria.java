package classes;

import java.time.LocalDate;

public class Mentoria extends Atividade {
    private LocalDate data;

    public Mentoria(){}
    public Mentoria(String titulo, String descricao, LocalDate data){
        super(titulo, descricao);
        this.data = data;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int calcularXp() {
        return XP_PADRAO + 20;
    }
}