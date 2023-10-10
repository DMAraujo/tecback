package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;
    private String email;

    @ManyToOne
    private CartaoCredito cartaoCredito;
}
