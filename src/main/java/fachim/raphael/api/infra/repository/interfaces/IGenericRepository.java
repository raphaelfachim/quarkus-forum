package fachim.raphael.api.infra.repository.interfaces;

import java.util.Collection;

public interface IGenericRepository<T> {

    public T create(T entity);
    public T update(T entity);
    public void delete(T entity);
    public Collection<T> list();

    public T findById(Long id);
}
