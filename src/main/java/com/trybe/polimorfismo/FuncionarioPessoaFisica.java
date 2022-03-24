package com.trybe.polimorfismo;

/** Initial */
public class FuncionarioPessoaFisica extends Funcionario {

  public double calcularSalarioLiquido() {
    return getSalarioBruto() - (getSalarioBruto() * 0.2);
  }
}
