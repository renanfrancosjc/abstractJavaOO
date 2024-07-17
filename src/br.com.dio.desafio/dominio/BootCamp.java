package br.com.dio.dominio;

import java.util.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BootCamp{
    private String nome;
    private String descricao;
    private final LocalDate inicio = LocalDate.now();
    private final LocalDate fim = inicio.plusDays(45);
    private Set<Dev> inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
}