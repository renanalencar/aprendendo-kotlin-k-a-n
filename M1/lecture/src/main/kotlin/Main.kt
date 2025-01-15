package br.com.renanalencar

import kotlinx.coroutines.*

fun corrotina() = runBlocking {
    launch {
        print("Corrotina ")
        delay(1000L)
        println("Kotlin!")
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