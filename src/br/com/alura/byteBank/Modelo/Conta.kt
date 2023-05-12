package br.com.alura.byteBank.Modelo

var totalContas: Int = 0
    private set

abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    init {
        println("*** Criando Nova Conta ***")
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0.0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}