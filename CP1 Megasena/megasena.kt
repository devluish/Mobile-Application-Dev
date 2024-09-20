import kotlin.random.Random

fun realizarSorteioMegaSena() {
    println("Bem vindo(a) à Simulação da Mega Sena!")

    val numerosSorteados = mutableListOf<Int>()
    val random = Random.Default

    while (numerosSorteados.size < 6) {
        val numero = random.nextInt(1, 61)
        if (!numerosSorteados.contains(numero)) {
            numerosSorteados.add(numero)
        }
    }
    val numerosSorteadosMegaSena = numerosSorteados.sorted()
    println("Números sorteados: ${numerosSorteadosMegaSena.joinToString(", ")}")
}

fun main() {
    realizarSorteioMegaSena()
}





































