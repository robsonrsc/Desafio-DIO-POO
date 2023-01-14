package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;

    //LinkedHashSet organiza em lista em ordem de conclusao e permite somente um unico elemento evitando duplicidade.

    private Set<conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public  void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public  void  progredir (){

        Optional<conteudo> conteudo =  this.conteudoInscritos.stream().findFirst();

        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }else{
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }
    }

    public  double calcularXP(){

        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> calcularXP()).sum();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudosConcluidos);
    }
}
