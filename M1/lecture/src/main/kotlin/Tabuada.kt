package br.com.renanalencar

fun tabuada() {
    print("Digite um número inteiro: ")
    val n = readln().toInt()

    for (i in 1..10) {
        println("$n * $i = ${n * i}")
    }
}