package persistence;

import entities.EntityBase;

public interface Repository<T extends EntityBase> {
    
    T find (int id);
    T save (T entity);
    void delete(T entity);
    void commit();
    
}
