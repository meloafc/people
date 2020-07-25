package com.meloafc.people.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="endereco")
public class Endereco implements BaseModel<Long> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @NotEmpty
    @Column(name = "rua")
    private String rua;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

}
