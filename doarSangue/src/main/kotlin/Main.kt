fun main(args: Array<String>) {

    var idade = 0
    var peso = 0

    println("***sistema de doação de sangue***")

    println("informe a idade do doador:")
    idade = readLine()!!.toInt()

    println("informe o peso do doador:")
    peso = readLine()!!.toInt()

    if (idade >= 18 && idade <60) {
        println("idade está ok")
        if (peso >= 45 && peso <= 120) {
            println("peso está ok")
        } else {
            return println("voce nao esta ok")
        }
    }
    fun apto (idade:Boolean , peso:Boolean ): Boolean{
        return apto(idade = true,peso = true)
    }
}




