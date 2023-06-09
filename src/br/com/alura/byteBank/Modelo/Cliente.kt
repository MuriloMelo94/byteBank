package br.com.alura.byteBank.Modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha){
            return true
        } else {
            return false
        }
    }
}