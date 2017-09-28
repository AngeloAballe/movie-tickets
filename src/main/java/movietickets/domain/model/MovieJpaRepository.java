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
public class MovieJpaRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Movie findById(Long id) {
        return entityManager.find(Movie.class, id);
    }

    public List<Movie> findAll() {
        TypedQuery<Movie> namedQuery = entityManager.createNamedQuery("find_all_movies", Movie.class);

        return namedQuery.getResultList();
    }

    public Movie update(Movie movie) {
        return entityManager.merge(movie);
    }

    public Movie insert(Movie movie) {
        return entityManager.merge(movie);
    }
}
