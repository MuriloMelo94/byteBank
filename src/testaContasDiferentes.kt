fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Antonio",
        numero = 2100
    )

    println()
    println("Conta Corrente do: ${contaCorrente.titular}")
    println("Numero da conta: ${contaCorrente.numero}")
    println("Sando inicial: ${contaCorrente.saldo}")
    println()

    val contaPoupanca = ContaPoupanca(
        titular = "Ana",
        numero = 3232
    )

    println()
    println("Conta Poupança da: ${contaPoupanca.titular}")
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
