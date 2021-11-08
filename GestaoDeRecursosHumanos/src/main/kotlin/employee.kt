import kotlin.math.min

open class employee (var nome: String,
                     var sobreNome: String,
                     var registro: Int,
                     var idade: Int,
                     var diasTrabalhados: Int,
                     var diasFerias: Int,
                     var salario: Double,
                     var anosTrabalhados: Int) {


    fun tempoParaAposentar() {
        var aposentadoria = min(60 - idade, 40 - anosTrabalhados)
        return println("faltam $aposentadoria anos para poder se aposentar")
    }
    fun tempoRestanteFerias() {
        var tempoDeFerias = (diasTrabalhados/360)*(30 - diasFerias)
        return println("O tempo de ferias é: $tempoDeFerias")
    }

    fun calculoBonus() {
        var bonus = 2.2*salario
        return println("O bônus salarial é de: R$$bonus")
    }

























}