package br.com.renanalencar

fun diaDaSemana() {
    print("Digite um número inteiro entre 1 e 7: ")
    val d = readln().toInt()
    if (d in 1..7) {
        when (d) {
            1 -> println("domingo")
            2 -> println("segunda")
            3 -> println("terça")
            4 -> println("quarta")
            5 -> println("quinta")
            6 -> println("sexta")
            7 -> println("sábado")
        }
    } else {
        println("Os dias da semana estão entre 1 e 7!")
    }
}