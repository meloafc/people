package com.meloafc.people.controller;

import com.meloafc.people.dto.PessoaDTO;
import com.meloafc.people.mapper.PessoaMapper;
import com.meloafc.people.model.Pessoa;
import com.meloafc.people.service.PessoaService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    private final PessoaMapper pessoaMapper = new PessoaMapper();

    @GetMapping()
    @ApiOperation(value = "Listar todas as pessoas")
    public List<PessoaDTO> getAll() {
        return pessoaMapper.convertToListDTO(pessoaService.find());
    }

    @PostMapping()
    @ApiOperation(value = "Criar nova pessoa")
    public PessoaDTO novaPessoa(@RequestBody PessoaDTO dto) {
        Pessoa pessoa = pessoaService.add(pessoaMapper.convertToEntity(dto));
        return pessoaMapper.convertToDTO(pessoa);
    }

}
