package br.com.alura.byteBank.Teste

import br.com.alura.byteBank.Modelo.Cliente
import br.com.alura.byteBank.Modelo.ContaCorrente
import br.com.alura.byteBank.Modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente(
            nome = "Antonio",
            cpf = "333.333.333-33",
            senha = 3333
        ),  numero = 2100
    )

    println()
    println("Conta Corrente do: ${contaCorrente.titular.nome}")
    println("Numero da conta: ${contaCorrente.numero}")
    println("Sando inicial: ${contaCorrente.saldo}")
    println()

    val contaPoupanca = ContaPoupanca(Cliente(
        nome = "Ana",
        cpf = "444.444.444-44",
        senha = 4444
    ),
        numero = 3232
    )

    println()
    println("Conta Poupança da: ${contaPoupanca.titular.nome}")
    println("Numero da conta Poupança: ${contaPoupanca.numero}")
    println("Sando inicial Poupança: ${contaPoupanca.saldo}")
    println()

    println(" ----- realizando Depósitos ----- ")
    Thread.sleep(3000L)
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println()

    println("Saldo atual Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo atual Conta Poupança: ${contaPoupanca.saldo}")
    println()

    println(" ----- realizando Saques ----- ")
    Thread.sleep(3000L)
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    println()

    println("Saldo atual pós SAQUE Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo atual pós SAQUE Conta Poupança: ${contaPoupanca.saldo}")
    println()

    println(" ----- realizando Transferência Corrente > Poupança ----- ")
    Thread.sleep(3000L)
    contaCorrente.transfere(100.0, contaPoupanca)
    println("Saldo atual pós TRANSFERÊNCIA Conta Corrente: ${contaCorrente.saldo}")
    println("Saldo atual pós TRANSFERÊNCIA Conta Poupança: ${contaPoupanca.saldo}")
    println()
}
