package br.edu.unifio.ecomerce.repositorios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.unifio.ecomerce.entidades.Cliente;
import br.edu.unifio.ecomerce.repositorio.ClienteRepositorio;

@SpringBootTest 
public class ClienteRepositorioTests {

     @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void deveBuscarUmClientePorID () {
        Cliente cliente = clienteRepositorio.findById(1).orElseThrow();

        assertNotNull(cliente);
        assertEquals("Bruno Shiguematu", cliente.getNome());
        assertEquals("bruno.shiguematu@email.com", cliente.getEmail());
    }

    @Test
    public void deveListarTodosOsClientes () {
        List<Cliente> clientes = clienteRepositorio.findAll();

        assertNotNull(clientes);
        assertEquals(5, clientes.size());
        assertEquals("Davi Corsini", clientes.get(1).getNome());
    }
}
