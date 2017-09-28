package movietickets.domain.model;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by zeus on 9/28/17.
 */
@Repository
@Transactional
public class CinemaJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public Cinema findById(String id) {
        return entityManager.find(Cinema.class, Long.parseLong(id));
    }

    public List<Cinema> findAll() {
        TypedQuery<Cinema> namedQuery = entityManager.createNamedQuery("find_all_cinemas", Cinema.class);

        return namedQuery.getResultList();
    }

    public Cinema update(Cinema cinema) {
        return entityManager.merge(cinema);
    }

    public Cinema insert(Cinema cinema) {
        return entityManager.merge(cinema);
    }

    public void delete(Cinema cinema) {
        entityManager.remove(entityManager.contains(cinema) ? cinema : entityManager.merge(cinema));
    }
}
