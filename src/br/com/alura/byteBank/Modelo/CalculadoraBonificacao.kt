package br.com.alura.byteBank.Modelo

class CalculadoraBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario){
        this.total += funcionario.bonificacao()
    }

//    fun registra(gerente: br.com.alura.byteBank.Modelo.Gerente){
//        this.total += gerente.bonificacao()
//    }
//
//    fun registra(diretor: br.com.alura.byteBank.Modelo.Diretor){
//        this.total += diretor.bonificacao()
//    }
}