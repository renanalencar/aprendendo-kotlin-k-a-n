package br.com.renanalencar

fun estruturaFor() {
    for (i in 1..3) {
        println("Contagem: $i")
    }
}

fun estruturaWhile() {
    var contador = 3
    while (contador > 0) {
        println("Contador: $contador")
        contador-- // contador = contador - 1
    }
}
