package movietickets.infrastructure.jpa;

import movietickets.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zeus on 9/28/17.
 */
@Repository
@Transactional
public interface MovieJpaRepository extends JpaRepository<Movie, Long> {
    Movie findById(Long id);

    List<Movie> findAll();

    Movie save(Movie movie);

    void delete(Movie movie);
}
