package movietickets.domain.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by zeus on 9/28/17.
 */

@Entity
public class MovieSchedule {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @OneToOne
    private Cinema cinema;

    @ManyToOne
    private Movie movie;

    // Schedule
}
