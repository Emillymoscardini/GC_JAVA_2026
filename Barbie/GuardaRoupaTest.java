import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardaRoupaTest {
    private GuardaRoupa guardaRoupaBarbie;

    @BeforeEach
    void preparar() {
        guardaRoupaBarbie = new GuardaRoupa(500);

    }

    @Test @DisplayName("Desconto de 10% em 200 reais deve dar 180")
    void aplicaDesconto() {
        assertEquals(180.00, guardaRoupaBarbie.precoComDesconto(200.00, 10), 0.01);
    }

    @Test @DisplayName("Preço abaixo do orçamento. Preço exatamente igual ao orçamento")
    void verificaOrcamento(){
        assertTrue( guardaRoupaBarbie.cabeNoOrcamento(400));
    }

    @Test @DisplayName("acima de 200")
    void verificaEhDeGala(){
        assertTrue( guardaRoupaBarbie.ehDeGala(300));
    }

    @Test @DisplayName("exatamente 200")
    void verificaEhDeGala1(){
        assertTrue( guardaRoupaBarbie.ehDeGala(200));
    }

    @Test @DisplayName("Abaixo de 200")
    void verificaEhDeGala2(){
        assertFalse( guardaRoupaBarbie.ehDeGala(100));
    }

    @Test @DisplayName("Testando duas compras seguidas")
    void verificaCompras(){

        guardaRoupaBarbie.registrarCompra(100);
        assertEquals(400, guardaRoupaBarbie.getOrcamento());
        guardaRoupaBarbie.registrarCompra(100);
        assertEquals(300, guardaRoupaBarbie.getOrcamento());
    }

    @Test @DisplayName("Compra fora do orcamento")
    void verificaCompraAcimaOrcamento(){

        guardaRoupaBarbie.registrarCompra(600);
        assertEquals(-100, guardaRoupaBarbie.getOrcamento());

    }
}