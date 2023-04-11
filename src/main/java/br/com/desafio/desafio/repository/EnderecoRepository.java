package br.com.desafio.desafio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.desafio.desafio.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}