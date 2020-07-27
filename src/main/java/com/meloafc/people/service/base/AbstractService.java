package com.meloafc.people.service.base;

import com.meloafc.people.exception.NotFoundException;
import com.meloafc.people.model.BaseModel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<T extends BaseModel<I>, I extends Serializable, R extends JpaRepository<T,I>> implements Service<T, I> {

    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PRIVATE)
    private R repository;

    public AbstractService(R repository) {
        setRepository(repository);
    }

    @Override
    public T findOne(I id) throws NotFoundException {
        return repository.findById(id).orElseThrow(() -> new NotFoundException(getNotFoundMessage()));
    }

    @Override
    public List<T> find() {
        return getRepository().findAll();
    }

    @Override
    public T add(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T update(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public void remove(T entity) {
        getRepository().delete(entity);
    }

    @Override
    public void remove(I id) {
        getRepository().deleteById(id);
    }

    protected String getNotFoundMessage() {
        return "resource.notFound";
    }
}
