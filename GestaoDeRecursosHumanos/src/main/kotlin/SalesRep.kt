 open class SalesRep( nome: String,
                      sobreNome: String,
                      registro: Int,
                      idade: Int,
                      diasTrabalhados: Int,
                      diasFerias: Int,
                      salario: Double,
                      anosTrabalhados: Int,
                      var vendidos: Double ): employee(nome, sobreNome,
     registro, idade, diasTrabalhados, diasFerias, salario, anosTrabalhados) {




     fun calculoComissao() {
      var comissao = 0.1 * vendidos
      return println("Comissão de vendas é: R$$comissao")
     }





 }


