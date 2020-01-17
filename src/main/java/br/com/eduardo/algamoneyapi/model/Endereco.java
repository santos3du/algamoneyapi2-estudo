package br.com.eduardo.algamoneyapi.model;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;
}
