package br.com.alura.byteBank.Teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("A conta está positiva")
    } else if (saldo == 0.0) {
        println("A conta está neutra")
    } else {
        println("A conta está negativa")
    }

    when {
        saldo > 0.0 -> {
            println("A conta está positiva")
        }

        saldo == 0.0 -> {
            println("A conta está neutra")
        }

        else -> {
            println("A conta está negativa")
        }
    }
}