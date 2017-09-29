package movietickets.domain.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @NotBlank
    private String name;

    public Cinema(String name, boolean[][] seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
