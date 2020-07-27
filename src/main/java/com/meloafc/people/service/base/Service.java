package com.meloafc.people.service.base;

import com.meloafc.people.exception.NotFoundException;
import com.meloafc.people.model.BaseModel;

import java.io.Serializable;
import java.util.List;

public interface Service<T extends BaseModel<I>, I extends Serializable> {
    T findOne(I id) throws NotFoundException;
    List<T> find();
    T add(T entity);
    T update(T entity);
    void remove(T entity);
    void remove(I id);
}
