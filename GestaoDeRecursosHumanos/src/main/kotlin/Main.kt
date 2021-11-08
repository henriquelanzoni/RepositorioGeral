fun main (args: Array<String>) {


 val rosnei: employee = employee("rosnei", "leite",3,22,
330,30, 4000.00, 1)

 val xispirito: SalesRep = SalesRep("xispirito", "barbosa", 4,
 18,960,120,1200.00, 3,1200.00)

 val liza: SalesRep = SalesRep("liza", "barbosa", 4,
  18,960,120,1200.00, 3,1200.00)

 val reginaldo: SalesManeger = SalesManeger("reginaldo", "teixeira", 4,
  18,960,120,1200.00, 3)


 rosnei.tempoParaAposentar()
 xispirito.tempoRestanteFerias()
 reginaldo.calculoBonus()


 xispirito.calculoComissao()
 reginaldo.listaEquipe.put(1,xispirito)
 reginaldo.listaEquipe.put(2,liza)
 reginaldo.calculoComissaoGerente()
}
