package br.com.dio.desafio.dominio;

public abstract class Conteudo{

  protected static final double Xp_padrao = 10;

  private String titulo;
  private String descricao;

  public abstract double calcularXp();

  public String getTitulo(){
    this.titulo = titulo;
  }

  public void setTitulo(){
    return titulo;
  }

  public String getDescricao(){
    this.descricao = descricao;
  }

  public void setDescricao(){
    return descricao;
  }

 }