package movietickets.infrastructure.jpa;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zeus on 9/29/17.
 */

@Repository
@Transactional
public interface CinemaJpaRepository extends JpaRepository<Cinema, Long> {
    Cinema findById(Long id);

    List<Cinema> findAll();

    Cinema save(Cinema cinema);

    void delete(Cinema cinema);
}
