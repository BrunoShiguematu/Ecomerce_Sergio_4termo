package br.edu.unifio.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

}
