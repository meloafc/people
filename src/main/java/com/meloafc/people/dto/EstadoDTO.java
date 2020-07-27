package com.meloafc.people.dto;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDTO {

    private Long id;
    private String sigla;
    private String nome;

}
