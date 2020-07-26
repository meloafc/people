package com.meloafc.people.model;

import com.meloafc.people.enums.Perfil;
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
@Table(name="pessoa")
public class Pessoa implements BaseModel<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @NotEmpty
    @Column(name = "nome")
    private String nome;

    @Getter
    @Setter
    @NotEmpty
    @Size(max = 11)
    @Column(name = "cpf")
    private String cpf;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private Perfil perfil;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

}
