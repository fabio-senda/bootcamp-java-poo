package classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Atividade {
    private LocalDateTime data;

    public Mentoria(){}
    public Mentoria(String titulo, String descricao, LocalDateTime data){
        super(titulo, descricao);
        this.data = data;
    }
    
    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public int calcularXp() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("hh:mm dd/MM/yy");
        return getTitulo() + ": Início -> " + getData().format(dataFormatada);
    }
}