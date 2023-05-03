class SistemaInterno {

    fun entra(gerente: FuncionarioAdmin, senha: Int){
        if (gerente.autentica(senha)){
            println("Bem-Vindo ao ByteBank")
        }
        println("Falha na autenticação")
    }
}