package br.com.eduardo.algamoneyapi.repository;

import br.com.eduardo.algamoneyapi.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
