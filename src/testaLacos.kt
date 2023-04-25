fun testaLacos() {
    for (i in 5 downTo 1 step 2) {
        println("Bem vindo ao Bytebank")
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)
        println()
    }
    var i = 0
    while (i < 5) {
        println("Bem vindo ao Bytebank")
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")

        testaCondicoes(saldo)
        println()
        i++
    }
}