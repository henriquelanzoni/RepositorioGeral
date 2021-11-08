import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {
var calculadora = Calculadora()

    @Test
    fun soma()
    {
        assertEquals(6, calculadora.Soma(5,1))
    }
    @Test
    fun subtracao()
    {
        assertEquals(4, calculadora.Subtracao(5,1))
    }
    @Test
    fun multiplicacao()
    {
        assertEquals(10, calculadora.Multiplicacao(5,2))
    }
    @Test
    fun divisao()
    {
        assertEquals(6.0, calculadora.Divisao(6.0,1.0))
    }
    @Test
    fun raizquadrada()
    {
        assertEquals(2.0, calculadora.RaizQuadrada(4.0))
    }
    @Test
    fun potencia()
    {
        assertEquals(6.0, calculadora.Potencia(6.0,1.0))
    }
}