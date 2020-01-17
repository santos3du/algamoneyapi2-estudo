package br.com.eduardo.algamoneyapi.model;

import com.sun.javafx.geom.transform.Identity;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
@Entity
@Table(name = "pessoa")
@Data
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    @Size(min = 5, max = 60)
    private String nome;
    @Embedded
    private Endereco endereco;

    private boolean ativo;
}
