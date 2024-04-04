/ Definição da classe Pessoa
class Pessoa(val nome: String, var idade: Int) {
    // Método para exibir informações da pessoa
    fun exibirInformacoes() {
        println("Nome: $nome")
        println("Idade: $idade")
    }

    // Método para fazer a pessoa envelhecer
    fun envelhecer(anos: Int) {
        idade += anos
    }
}

fun main() {
    // Criando uma instância da classe Pessoa
    val pessoa = Pessoa("João", 30)

    // Exibindo as informações antes de envelhecer
    println("Informações iniciais:")
    pessoa.exibirInformacoes()

    // Fazendo a pessoa envelhecer 5 anos
    pessoa.envelhecer(5)

    // Exibindo as informações após envelhecer
    println("\nInformações após envelhecimento:")
    pessoa.exibirInformacoes()
}