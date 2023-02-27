package fachim.raphael.api.infra.repository.impl;

import fachim.raphael.api.infra.repository.interfaces.IGenericRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.Collection;

@ApplicationScoped
public class GenericRepository<T> implements IGenericRepository<T> {

    @Inject
    EntityManager em;

    @Override
    public T create(T entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public Collection<T> list() {
        throw new UnsupportedOperationException("Method is not yet implemented");
    }
}
