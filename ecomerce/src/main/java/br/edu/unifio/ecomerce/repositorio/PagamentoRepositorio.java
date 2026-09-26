package br.edu.unifio.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unifio.ecomerce.entidades.Pagamento;

public interface PagamentoRepositorio extends JpaRepository<Pagamento, Integer>{

}
