package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Produto;
import br.edu.unifio.ecomerce.repositorio.ProdutoRepositorio;

@SpringBootTest 
public class ProdutoRepositorioTests {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Test
    public void deveBuscarUmProdutoPorID () {
        Produto produto = produtoRepositorio.findById(1).orElseThrow();

        assertNotNull(produto);
        assertEquals("Código Limpo", produto.getNome());
        assertEquals(new BigDecimal("73.44"), produto.getPreco());

        assertNotNull(produto.getCategoria());
        assertEquals("Livros", produto.getCategoria().getNome());
    }

    @Test
    public void deveListarTodosOsProdutos () {
        List<Produto> produtos = produtoRepositorio.findAll();

        assertNotNull(produtos);
        assertEquals(5, produtos.size());
        assertEquals("Notebook Dell Inspiron", produtos.get(1).getNome());
    }

}
