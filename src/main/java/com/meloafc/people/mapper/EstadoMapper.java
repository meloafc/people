package com.meloafc.people.mapper;

import com.meloafc.people.dto.EstadoDTO;
import com.meloafc.people.model.Estado;

public class EstadoMapper implements GenericMapper<Estado, EstadoDTO> {

    @Override
    public EstadoDTO convertToDTO(Estado entity) {
        return EstadoDTO.builder()
                .id(entity.getId())
                .nome(entity.getNome())
                .sigla(entity.getSigla())
                .build();
    }

    @Override
    public Estado convertToEntity(EstadoDTO dto) {
        return null;
    }

}
