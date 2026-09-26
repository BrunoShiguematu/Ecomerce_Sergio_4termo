package br.edu.unifio.ecomerce.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.unifio.ecomerce.entidades.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Integer>{

}
