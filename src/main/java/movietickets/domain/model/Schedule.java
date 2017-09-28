package movietickets.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by zeus on 9/28/17.
 */

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;


}
