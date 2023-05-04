class SistemaInterno {

    fun entra(usuario: Autenticavel, senha: Int){
        if (usuario.autentica(senha)){
            println("Bem-Vindo ao ByteBank")
        } else {
            println("Falha na autenticação")
        }
    }
}