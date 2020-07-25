package com.meloafc.people.service;

import com.meloafc.people.model.Estado;
import com.meloafc.people.repository.EstadoRepository;
import com.meloafc.people.service.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class EstadoService extends AbstractService<Estado, Long> {

    public EstadoService(EstadoRepository repository) {
        super(repository);
    }

}
