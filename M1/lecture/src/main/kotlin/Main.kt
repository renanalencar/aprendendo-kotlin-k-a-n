package br.com.renanalencar

import kotlinx.coroutines.*

fun corrotina() = runBlocking {
    launch {
        delay(1000L)
        println("Corrotina Kotlin!")
    }
}

fun main() {
//    val name = "Kotlin"
//    println("Hello, $name!")
//
//    for (i in 1..5) {
//        println("i = $i")
//    }

//    helloWorld()
//    estruturaIfElse()
//    estrutraWhen()
//    olaMundo()
//    calculadoraSimples()
//    parOuImpar()
//    tabuada()
    corrotina()
}