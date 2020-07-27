package com.meloafc.people.controller;

import com.meloafc.people.dto.EstadoDTO;
import com.meloafc.people.mapper.EstadoMapper;
import com.meloafc.people.service.EstadoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    EstadoService estadoService;

    private final EstadoMapper estadoMapper = new EstadoMapper();

    @GetMapping()
    @ApiOperation(value = "Listar todos os estados")
    public List<EstadoDTO> getAll() {
        return estadoMapper.convertToListDTO(estadoService.find());
    }

}
