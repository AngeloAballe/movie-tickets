package movietickets.infrastructure.jpa;

import movietickets.domain.model.Movie;
import movietickets.domain.model.MovieSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.LockModeType;
import java.util.List;

/**
 * Created by zeus on 9/28/17.
 */
@Repository
@Transactional
public interface MovieScheduleJpaRepository extends JpaRepository<MovieSchedule, Long> {
    MovieSchedule findById(Long id);

    List<MovieSchedule> findAll();

    @Lock(LockModeType.OPTIMISTIC)
    MovieSchedule save(MovieSchedule movieSchedule);

    void delete(MovieSchedule movieSchedule);
}
