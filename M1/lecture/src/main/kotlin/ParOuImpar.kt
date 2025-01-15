package br.com.renanalencar

fun parOuImpar() {
    print("Digite um número inteiro: ")
    val n = readln().toInt()
    if (n % 2 == 0) {
        println("$n é par!")
    } else {
        println("$n é ímpar!")
    }
}