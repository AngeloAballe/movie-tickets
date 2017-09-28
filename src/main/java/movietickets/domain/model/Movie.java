package movietickets.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by zeus on 9/28/17.
 */

@Entity
@NamedQuery(name = "find_all_movies", query = "select m from Movie m")
public class Movie {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String title;

    private String summary;
    // price
    //
}
