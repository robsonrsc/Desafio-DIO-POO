package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Conceitos basicos de Java");
        curso.setCargahoraria(5);



        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Conceitos basicos de Java");
        curso2.setCargahoraria(5);



        mentoria.setTitulo("Java");
        mentoria.setDescricao("Ensino de java basico ao avancado");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Desenvolvimento Java");
        bootcamp.setDescricao("Conceito basico ao avancado");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev = new Dev();
        dev.inscreverBootcamp(bootcamp);
        dev.setNome("Robson");

        dev.progredir();
        System.out.println("Conteudos inscritos" + dev.getConteudoInscritos());
        System.out.println("Conteudos inscritos" + dev.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.inscreverBootcamp(bootcamp);
        dev2.setNome("Ricardo");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("Joao "+dev2.getConteudoInscritos());
        System.out.println("Joao "+dev2.getConteudosConcluidos());
        //System.out.println(dev2.calcularXP());
    }
}
