open class SalesManeger (nome: String,
                         sobreNome: String,
                         registro: Int,
                         idade: Int,
                         diasTrabalhados: Int,
                         diasFerias: Int,
                         salario: Double,
                         anosTrabalhados: Int,): employee(nome, sobreNome,
    registro, idade, diasTrabalhados, diasFerias, salario, anosTrabalhados){


    val listaEquipe = hashMapOf<Int,SalesRep>()
    var totalVendas = 0.0
    var comissaoGerente = 0.0

    fun calculoComissaoGerente() {

        for (representante in listaEquipe){
           totalVendas += representante.value.vendidos
        }
        comissaoGerente = 0.03 * totalVendas
        return println("A comissão do gerente é: R$$comissaoGerente")

    }



}