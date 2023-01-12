import java.time.LocalDateTime;

import classes.*;

public class App {
    public static void main(String[] args) {
        Atividade curso1 = new Curso("Primeiros passos", "Java", 8);
        Atividade mentoria1 = new Mentoria("POO", "desc POO", LocalDateTime.now());
        Atividade curso2 = new Curso("Spring", "desc Spring", 10);

        Bootcamp bootcamp = new Bootcamp("Java", "Descricao Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev deki = new Dev("Deki");
        deki.entrarEmBootcamp(bootcamp);
        System.out.println("Inscrito: " + deki.getAtividadesInscritas());
        deki.progredir();
        System.out.println("Progrediu!!");
        System.out.println("Inscrito: " + deki.getAtividadesInscritas());
        System.out.println("Concluído: " + deki.getAtividadesConcluidas());

        deki.sairDoBootcamp(bootcamp);
        System.out.println("Saiu!!");
        deki.progredir();
        System.out.println("Inscrito: " + deki.getAtividadesInscritas());
        System.out.println("Concluído: " + deki.getAtividadesConcluidas());

        deki.entrarEmBootcamp(bootcamp);
        System.out.println("Entrou!!");
        deki.progredir();
        deki.progredir();
        System.out.println("Inscrito: " + deki.getAtividadesInscritas());
        System.out.println("Concluído: " + deki.getAtividadesConcluidas());
        System.out.println("Total: " + deki.calcularTotalXp());

        System.out.println("\t---------------------------");

        Dev joao = new Dev("João");
        joao.entrarEmBootcamp(bootcamp);
        System.out.println("Inscrito: " + joao.getAtividadesInscritas());
        System.out.println("Concluído: " + joao.getAtividadesConcluidas());
        System.out.println("Total: " + joao.calcularTotalXp());

        System.out.println(bootcamp.getDevsInscritos());

    }
}
