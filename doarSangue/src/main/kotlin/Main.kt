fun main(args: Array<String>) {

    var idade = 0
    var peso = 0

    println("***sistema de doação de sangue***")

    println("informe a idade do doador:")
    idade = readLine()!!.toInt()

    println("informe o peso do doador:")
    peso = readLine()!!.toInt()

    if (idade >= 18 && idade <60 && peso >= 45) {
        println("Apto para doar sangue")
    } else {
            return println("Não pode doar")
        }
    }






