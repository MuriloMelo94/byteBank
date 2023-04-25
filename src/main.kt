fun main() {
    val murilo = Funcionario(
        nome = "Murilo",
        cpf = "123.456.789-10",
        salario = 1000.0
    )

    println()
    println("Dados do Funcionário")
    println("Nome: ${murilo.nome}")
    println("CPF: ${murilo.cpf}")
    println("Salário: ${murilo.salario}")
    println("Bonificação: ${murilo.bonificacao()}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Dados do Gerente")
    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")
    if (fran.autentica(1234)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val gui = Diretor(
        nome = "Guilherme",
        cpf = "333.333.333.33",
        salario = 4000.0,
        senha = 4000,
        plr = 400.0
    )

    println("Dados do Diretor")
    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao()}")
    if (gui.autentica(4000)) {
        println("Autenticado com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()
}