package br.com.renanalencar

fun calculadoraSimples() {
    print("Número 1: ")
    var a = readln().toDouble()
    print("Número  2: ")
    var b = readln().toDouble()
    print("Operação (+, -, *, /): ")
    var o = readln()
    var resultado = 0.0

    when (o) {
        "+" -> {
            resultado = a+b
            println("$a + $b = $resultado")
        }
        "-" -> {
            resultado = a-b
            println("$a - $b = $resultado")
        }
        "*" -> {
            resultado = a*b
            println("$a * $b = $resultado")
        }
        "/" -> {
            if (b > 0) {
                resultado = a/b
                println("$a / $b = $resultado")
            }
        }
        else -> println("Operação inválida!")
    }
}