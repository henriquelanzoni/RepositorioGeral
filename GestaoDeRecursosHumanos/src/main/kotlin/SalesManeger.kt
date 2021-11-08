open class SalesManeger (nome: String,
                         sobreNome: String,
                         registro: Int,
                         idade: Int,
                         diasTrabalhados: Int,
                         diasFerias: Int,
                         salario: Double,
                         anosTrabalhados: Int,): employee(nome, sobreNome,
    registro, idade, diasTrabalhados, diasFerias, salario, anosTrabalhados) {


    val listaEquipe = hashMapOf<Int, SalesRep>()
    var totalVendas = 0.0
    var comissaoGerente = 0.0

    fun addSalesRep(SalesRep: SalesRep) {
        listaEquipe.put(SalesRep.registro, SalesRep)
    }


    fun calculoComissaoGeral() {

        var numVendas = 0.0
        if (listaEquipe.isEmpty()) {
            println("nao há representantes de vendas na equipe")
        } else {
            for (item in listaEquipe)
                numVendas += item.value.vendidos
        }
        val comissao = 0.03 * numVendas
        println("a comissao geral feita pela equipe é de? R$$comissao")
    }
}