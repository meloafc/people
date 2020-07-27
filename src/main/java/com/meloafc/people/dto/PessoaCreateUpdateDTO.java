package com.meloafc.people.dto;

import com.meloafc.people.enums.Perfil;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaCreateUpdateDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Perfil perfil;
    private String rua;
    private Long cidadeId;

}
