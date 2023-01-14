package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        System.out.println("\n\n");

        curso.setTitulo("Curso Java");
        curso.setDescricao("Conceitos basicos de Java");
        curso.setCargahoraria(5);

        System.out.println(curso);


        mentoria.setTitulo("Java");
        mentoria.setDescricao("Ensino de java basico ao avancado");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
