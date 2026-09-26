package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Pedido;
import br.edu.unifio.ecomerce.repositorio.PedidoRepositorio;

@SpringBootTest 
public class PedidoRepositorioTests {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    @Test
    public void deveBuscarUmPedidoPorID () {
        Pedido pedido = pedidoRepositorio.findById(1).orElseThrow();

        assertNotNull(pedido);
        assertEquals("FINALIZADO", pedido.getStatus());
        assertEquals(new BigDecimal("146.88"), pedido.getValorTotal());

        assertNotNull(pedido.getCliente());
        assertEquals("Bruno Shiguematu", pedido.getCliente().getNome());
    }

    @Test
    public void deveListarTodosOsPedidos () {
        List<Pedido> pedidos = pedidoRepositorio.findAll();

        assertNotNull(pedidos);
        assertEquals(5, pedidos.size());
        assertEquals("PAGO", pedidos.get(2).getStatus());
    }

}
