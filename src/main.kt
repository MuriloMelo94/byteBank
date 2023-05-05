fun main() {

    testaFuncionarioAdmin()
}

private fun testaFuncionarioAdmin() {
    val gerente = Gerente(
        nome = "Murilo",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretor = Diretor(
        nome = "Joao",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 2000)
    sistema.entra(diretor, 1000)
    sistema.entra(cliente, 4321)
}