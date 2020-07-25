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
@Table(name="cidade")
public class Cidade implements BaseModel<Long> {

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
    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

}
