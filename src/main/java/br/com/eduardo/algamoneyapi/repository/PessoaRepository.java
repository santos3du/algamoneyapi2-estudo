package br.com.eduardo.algamoneyapi.repository;

import br.com.eduardo.algamoneyapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
