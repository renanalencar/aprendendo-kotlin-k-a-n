package br.com.renanalencar

fun helloWorld() {
    // Null Safety
    val nome: String? = null  // Tipo anulável
    println(nome?.length)     // Uso seguro com operador ?.

    // Funções de Extensão
    fun String.saudar() = "Olá, $this!"
    println("Mundo".saudar())

    // val vs. var
    val linguagem = "Kotlin"  // Imutável
    var versao = 1.7           // Mutável

    println("Linguagem: $linguagem, Versão: $versao")

    versao = 1.8
    println("Linguagem: $linguagem, Versão: $versao")
}