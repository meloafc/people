package com.meloafc.people.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="estado")
public class Estado implements BaseModel<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Size(max = 2)
    @Column(name = "sigla")
    private String sigla;

    @Getter
    @Setter
    @NotEmpty
    @Column(name = "nome")
    private String nome;

    @Getter
    @Setter
    @Size(max = 15)
    @Column(name = "regiao")
    private String regiao;

}
