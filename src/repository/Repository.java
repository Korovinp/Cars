package repository;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface Repository<T, ID> {
    T save(T entity);
    List<T> saveAll(Collection<T> entities);
    Optional<T> findByID(ID id);
    void deleteByID(ID id);
    void deleteAll();
    long count();
    boolean existByID(ID id);
}