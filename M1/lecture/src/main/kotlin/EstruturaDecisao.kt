package br.com.renanalencar

fun estruturaIfElse() {
    val numero = 42
//    var paridade = ""
//    if (numero % 2 == 0) {
//        paridade = "Par";
//    } else {
//        paridade = "Ímpar";
//    }
    val paridade = if (numero % 2 == 0) "Par" else "Ímpar"
    println("$numero é $paridade")
}

fun estrutraWhen() {
    val mes = 7
    val estacao = when (mes) {
        12, 1, 2 -> "Verão"
        3, 4, 5 -> "Outono"
        else -> "Outra estação"
    }
    println(estacao)
}