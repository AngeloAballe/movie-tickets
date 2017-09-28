package movietickets.domain.model;

import javax.persistence.*;

import java.util.ArrayList;

import static javax.persistence.GenerationType.AUTO;

/**
 * Created by zeus on 9/28/17.
 */

@Entity
@NamedQuery(name = "find_all_cinemas", query = "select c from Cinema c")
public class Cinema {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column( length = 2000 )
    private boolean[][] seats;

    private ArrayList<boolean[]> seats2;

    public Cinema(boolean[][] seats) {
        this.seats = seats;
    }

    public void setSeats(boolean[][] seats) {
        this.seats = seats;
    }

    public boolean[][] getSeats() {
        return seats;
    }

    public Long getId() {
        return id;
    }

    protected Cinema() {

    }
}
