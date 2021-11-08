fun main (args: Array<String>) {

 val Xispirito: SalesRep = SalesRep("Xispirito", "Barbosa", 4,
 18,350,15,1200.00, 1,1200.00)

 val liza: SalesRep = SalesRep("liza", "Barbosa", 5,
  21,330,30,1200.00, 1,1500.00)

 val Reginaldo: SalesManeger = SalesManeger("Reginaldo", "Teixeira", 4,
  18,990,90,5200.00, 3)

 println("***INFORMAÇÕES XISPIRITO***")
 println(Xispirito.tempoParaAposentar())
 println(Xispirito.tempoRestanteFerias())
 println(Xispirito.calculoBonus())
 println(Xispirito.calculoComissao())
 println("--------------------------")

 Reginaldo.addSalesRep(Xispirito)
 Reginaldo.addSalesRep(liza)

 println("\nComissão geral da equipe:")
 Reginaldo.calculoComissaoGeral()
}
