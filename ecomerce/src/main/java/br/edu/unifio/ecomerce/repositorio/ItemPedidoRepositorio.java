package br.edu.unifio.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.ItemPedido;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, Integer> {

}
