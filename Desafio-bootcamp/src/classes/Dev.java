package classes;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Atividade> atividadesInscritas = new LinkedHashSet<>();
    private Set<Atividade> atividadesConcluidas = new LinkedHashSet<>();


    public Dev(){}

    public Dev(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Atividade> getAtividadesInscritas() {
        return atividadesInscritas;
    }

    public void setAtividadesInscritas(Set<Atividade> atividadesInscritas) {
        this.atividadesInscritas = atividadesInscritas;
    }

    public Set<Atividade> getAtividadesConcluidas() {
        return atividadesConcluidas;
    }

    public void setAtividadesConcluidas(Set<Atividade> atividadesConcluidas) {
        this.atividadesConcluidas = atividadesConcluidas;
    }

    public void entrarEmBootcamp(Bootcamp bootcamp) {
        Set<Atividade> atividades = new LinkedHashSet<>(bootcamp.getConteudos());
        atividades.removeAll(atividadesConcluidas);
        atividadesInscritas.addAll(atividades);
        bootcamp.getDevsInscritos().add(this);
    }
    
    public void sairDoBootcamp(Bootcamp bootcamp) {
        atividadesInscritas.removeAll(bootcamp.getConteudos());
    }

    public void progredir() {
        Optional<Atividade> atividade = atividadesInscritas.stream().findFirst();
        if (atividade.isPresent()){
            this.atividadesConcluidas.add(atividade.get());
            this.atividadesInscritas.remove(atividade.get());
        } else {
            System.err.println(nome + " não está inscrito em nenhuma atividade");
        }
    }
    
    public int calcularTotalXp() {
        return atividadesConcluidas.stream()
            .mapToInt(Atividade :: calcularXp)
            .sum();
    }
    @Override
    public String toString() {
        return getNome();
    }
}
