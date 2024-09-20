fun main() {
    val quantidadeCoxinha = 3
    val precoCoxinha = 5.00
    val quantidadeCerveja = 2
    val precoCerveja = 15.00

    val somar = (quantidadeCoxinha * precoCoxinha) + (quantidadeCerveja * precoCerveja)

    val taxa = somar * 0.10
    val total = somar + taxa

    println("-----------------------------------")
    println("Lanchonete do Vinny")
    println("-----------------------------------")
    println("TOTAL")
    println("$quantidadeCoxinha coxinha R$: ${precoCoxinha * quantidadeCoxinha}")
    println("$quantidadeCerveja cerveja R$: ${precoCerveja * quantidadeCerveja}")
    println("-----------------------------------")
    println("Somatoria R$: $somar")
    println("Taxa de 10% R$: $taxa")
    println("-----------------------------------")
    println("Total R$: $total")
    println("")
}