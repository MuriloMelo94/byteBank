package br.com.alura.byteBank.Modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    private val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        } else {
            return false
        }
    }
}