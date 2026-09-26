package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Pagamento;
import br.edu.unifio.ecomerce.repositorio.PagamentoRepositorio;

@SpringBootTest 
public class PagamentoRepositorioTests {

    @Autowired
    private PagamentoRepositorio pagamentoRepositorio;

    @Test
    public void deveBuscarUmPagamentoPorID () {
        Pagamento pagamento = pagamentoRepositorio.findById(1).orElseThrow();

        assertNotNull(pagamento);
        assertEquals("PIX", pagamento.getTipo());
        assertEquals("APROVADO", pagamento.getStatus());

        assertNotNull(pagamento.getPedido());
        assertEquals(new BigDecimal("146.88"), pagamento.getPedido().getValorTotal());
    }

    @Test
    public void deveListarTodosOsPagamentos () {
        List<Pagamento> pagamentos = pagamentoRepositorio.findAll();

        assertNotNull(pagamentos);
        assertEquals(5, pagamentos.size());
        assertEquals("CARTAO_DEBITO", pagamentos.get(4).getTipo());
    }

}
