package com.meloafc.people.dto;

import com.meloafc.people.enums.Perfil;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Perfil perfil;
    private String rua;
    private Long cidadeId;
    private String cidadeNome;
    private Long estadoId;
    private String estadoNome;

}
