package com.trybe.polimorfismo;

/** Init. */
public class FuncionarioPessoaJuridica extends Funcionario {

  public double calcularSalarioLiquido() {
    return getSalarioBruto() - (getSalarioBruto() * 0.1);
  }
}
