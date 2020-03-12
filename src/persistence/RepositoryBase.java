package persistence;

import entities.EntityBase;
import javax.persistence.EntityManager;

public abstract class RepositoryBase<T extends EntityBase>
        implements Repository<T> {

    private final EntityManager entityManager;
    private final Class<T> cls;

    public RepositoryBase(EntityManager entityManager, Class<T> cls) {
        this.entityManager = entityManager;
        this.cls = cls;
    }

    @Override
    public T find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T save(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void commit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
