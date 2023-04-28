fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(valor = 200.0)

    val contaFran = ContaPoupanca(titular = "Fran", numero = 1001)
    contaFran.deposita(valor = 300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(valor = 50.0)
    println("Novo saldo Fran: ${contaFran.saldo}")

    println("Depositando na conta do Alex")
    contaAlex.deposita(valor = 75.0)
    println("Novo saldo Alex: ${contaAlex.saldo}")

    println("Sacando da conta da Fran")
    contaFran.saca(valor = 350.0)
    println("Novo saldo da Fran: ${contaFran.saldo}")

    println("Transferindo do Alex para a Fran")
    if (contaAlex.transfere(valor = 100.0, destino = contaFran)) {
        println("Transferência realizada com sucesso")
        println("Novo saldo Alex: ${contaAlex.saldo}")
        println("Novo saldo Fran: ${contaFran.saldo}")
    } else {
        println("Saldo insuficiente, transferência falhou")
    }
}