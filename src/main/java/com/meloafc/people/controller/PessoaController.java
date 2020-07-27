package com.meloafc.people.controller;

import com.meloafc.people.dto.PessoaCreateUpdateDTO;
import com.meloafc.people.dto.PessoaDTO;
import com.meloafc.people.enums.Perfil;
import com.meloafc.people.mapper.PessoaMapper;
import com.meloafc.people.service.PessoaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    public List<PessoaDTO> listar() {
        return pessoaMapper.convertToListDTO(pessoaService.find());
    }

    @GetMapping("/filtro")
    @ApiOperation(value = "Listagem de pessoas com filtro")
    public List<PessoaDTO> listarComFiltro(@RequestParam(required = false) Long estadoId, @RequestParam(required = false) Perfil perfil) {
        return pessoaMapper.convertToListDTO(pessoaService.find(estadoId, perfil));
    }

    @PostMapping()
    @ApiOperation(value = "Criar nova pessoa")
    public void criar(@RequestBody PessoaCreateUpdateDTO dto) {
        pessoaService.add(pessoaMapper.convertToEntity(dto));
    }

    @PutMapping()
    @ApiOperation(value = "Atualizar pessoa")
    public void atualizar(@RequestBody PessoaCreateUpdateDTO dto) {
        pessoaService.update(pessoaMapper.convertToEntity(dto));
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Deletar pessoa")
    public void deletar(@ApiParam(value = "id", required = true) @PathVariable Long id) {
        pessoaService.remove(id);
    }

}
