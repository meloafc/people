package com.meloafc.people.controller;

import com.meloafc.people.dto.CidadeDTO;
import com.meloafc.people.mapper.CidadeMapper;
import com.meloafc.people.service.CidadeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    CidadeService cidadeService;

    private final CidadeMapper cidadeMapper = new CidadeMapper();

    @GetMapping("/estado/{estadoId}")
    @ApiOperation(value = "Listar todas as cidades por estado")
    public List<CidadeDTO> getAllByEstado(@ApiParam(value = "estadoId", required = true) @PathVariable Long estadoId) {
        return cidadeMapper.convertToListDTO(cidadeService.findByEstadoId(estadoId));
    }

}
