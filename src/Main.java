import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso em Java");
        curso1.setDescricao("Descrição curso de java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso em js");
        curso2.setDescricao("Descrição curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrção Mentoria Java");
        mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Devloper");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " +
                devAlexandre.getNome()
        + devAlexandre.getConteudosInscritos() + "\n");

        devAlexandre.progredir();
        System.out.println("Conteúdos Inscritos " +
                devAlexandre.getNome()
                + devAlexandre.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " +
                devAlexandre.getNome()
                + devAlexandre.getConteudosConcluidos());

        System.out.println("XP" + devAlexandre.calcularXp());

        System.out.println("_________________");
        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " +
                devPaulo.getNome()
                + devPaulo.getConteudosInscritos() + "\n");
       // devPaulo.progredir() ;
        System.out.println("Conteúdos Inscritos " +
                devPaulo.getNome()
                + devPaulo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " +
                devPaulo.getNome()
                + devPaulo.getConteudosConcluidos());

        System.out.println("XP" + devPaulo.calcularXp());
    }
}
