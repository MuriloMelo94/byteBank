package br.com.alura.byteBank

import br.com.alura.byteBank.Modelo.*
import br.com.alura.byteBank.Teste.testaContasDiferentes
import br.com.alura.byteBank.Teste.testaFuncionarioAdmin

fun main() {

    val fran = object : Autenticavel {
        val nome = "Fran"
        val cpf = "444.333.444-33"
        val senha = 1000

        override fun autentica (senha : Int) = this.senha == senha

    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)

    println("Nome do novo usuário ${fran.nome}")
    println("CPF do novo usuário ${fran.cpf}")

    val fernanda = Cliente(nome = "Fernanda", cpf = "654.654.654-65", senha = 1234)
    val contaCorrente = ContaCorrente(titular = fernanda, numero = 3003)
    testaFuncionarioAdmin()
    testaContasDiferentes()

    println("Total de contas criadas $totalContas")

}

