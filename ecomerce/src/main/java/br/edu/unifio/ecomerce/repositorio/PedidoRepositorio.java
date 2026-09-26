package br.edu.unifio.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {

}
