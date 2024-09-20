import java.util.*

//Não consegui resolver o erro a tempo...

fun main(){
    val scanner = Scanner(System.`in`)
    val opcao: Int

    do{
        println("--------MENU--------")
        println("1- Calcular o IMC")
        println("2- Sair")
        println("Escolha uma opção:")
        opcao = scanner.nextInt()

        when (opcao){
            1 ->{
                val (peso, altura) = coletarDados(scanner)
                val categoria = determinarCategoria(imc)
                println("Seu IMC é %.2f e o Resultado: %s".format(imc, categoria))
            }
            2 -> println("Saindo do Menu")
            else -> println("Opção invalida. Tente novamente")
        }
    }while (opcao !=2)
    }

    fun coletarDados(scanner.Scanner):Pair<Double, Double>{
        println("Digite seu peso Kg: ")
        val peso = scanner.nextDouble()

        print("Digite sua altura (em metros): ")
        val altura = scanner.nextDouble()

        return Pair(peso, altura)
    }

    fun calcularImc(peso: Double, altura: Double):
    Double{
        return peso / (altura * altura)
    }

    fun determinarCategoria(imc: Double): String {
        return when {
            imc < 18.5 -> "Excesso de Magreza"
            imc < 25 -> "Peso normal"
            imc < 30 -> "Execesso de Peso"
            imc < 35 -> "Obesidade 1ºg"
            imc < 40 -> "Obesidade 2ºg"
            else -> "Obesidade 3ºg ou Superior"
        }
    }
    