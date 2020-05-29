package br.com.vinnirx.casevoxus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vinnirx.casevoxus.domain.PagamentoDomain;

@Repository
public interface PagamentoRepository extends JpaRepository<PagamentoDomain, String>{

}
