fun main (args: Array<String>) {



 val xispirito: SalesRep = SalesRep("xispirito", "barbosa", 4,
 18,960,120,1200.00, 3,1200.00)

 val liza: SalesRep = SalesRep("liza", "barbosa", 4,
  18,960,120,1200.00, 3,1200.00)

 val reginaldo: SalesManeger = SalesManeger("reginaldo", "teixeira", 4,
  18,960,120,1200.00, 3)


 xispirito.tempoParaAposentar()
 xispirito.tempoRestanteFerias()
 xispirito.calculoBonus()
 xispirito.calculoComissao()
 reginaldo.calculoComissaoGeral()
 
}
