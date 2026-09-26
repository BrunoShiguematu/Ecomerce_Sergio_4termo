package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.ItemPedido;
import br.edu.unifio.ecomerce.repositorio.ItemPedidoRepositorio;

@SpringBootTest
public class ItemPedidoRepositorioTests {

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Test
    public void deveBuscarUmItemPedidoPorID () {
        ItemPedido itemPedido = itemPedidoRepositorio.findById(1).orElseThrow();

        assertNotNull(itemPedido);
        assertEquals(2, itemPedido.getQuantidade());
        assertEquals(new BigDecimal("73.44"), itemPedido.getValorUnitario());

        assertNotNull(itemPedido.getPedido());
        assertEquals("FINALIZADO", itemPedido.getPedido().getStatus());

        assertNotNull(itemPedido.getProduto());
        assertEquals("Código Limpo", itemPedido.getProduto().getNome());
    }

    @Test
    public void deveListarTodosOsItensPedido () {
        List<ItemPedido> itens = itemPedidoRepositorio.findAll();

        assertNotNull(itens);
        assertEquals(5, itens.size());
        assertEquals(3, itens.get(2).getQuantidade());
    }
}