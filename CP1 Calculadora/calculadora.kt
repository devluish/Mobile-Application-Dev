fun main() {
    println("Escolha uma operação: +, -, *, /")
    val calculo = readLine()!!

    when (calculo) {
        "+" -> {
            println("Digite o primeiro número:")
            val num1 = readLine()!!.toDouble()
            println("Digite o segundo número:")
            val num2 = readLine()!!.toDouble()
            val result = num1 + num2
            println("Resultado: $num1 + $num2 = $result")
        }
        "-" -> {
            println("Digite o primeiro número:")
            val num1 = readLine()!!.toDouble()
            println("Digite o segundo número:")
            val num2 = readLine()!!.toDouble()
            val result = num1 - num2
            println("Resultado: $num1 - $num2 = $result")
        }
        "*" -> {
            println("Digite o primeiro número:")
            val num1 = readLine()!!.toDouble()
            println("Digite o segundo número:")
            val num2 = readLine()!!.toDouble()
            val result = num1 * num2
            println("Resultado: $num1 * $num2 = $result")
        }
        "/" -> {
            println("Digite o primeiro número:")
            val num1 = readLine()!!.toDouble()
            println("Digite o segundo número:")
            val num2 = readLine()!!.toDouble()
            if (num2 != 0.0) {
                val result = num1 / num2
                println("Resultado: $num1 / $num2 = $result")
            } else {
                println("Erro: Divisão por zero!")
            }
        }
        else -> println("Operação inválida!")
    }
}