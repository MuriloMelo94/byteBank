package br.com.alura.byteBank

import br.com.alura.byteBank.Modelo.Cliente
import br.com.alura.byteBank.Modelo.ContaCorrente
import br.com.alura.byteBank.Modelo.totalContas
import br.com.alura.byteBank.Teste.testaContasDiferentes
import br.com.alura.byteBank.Teste.testaFuncionarioAdmin

fun main() {

    val fernanda = Cliente(nome = "Fernanda", cpf = "654.654.654-65", senha = 1234)
    val contaCorrente = ContaCorrente(titular = fernanda, numero = 3003)
    testaFuncionarioAdmin()
    testaContasDiferentes()

    println("Total de contas criadas $totalContas")

}

