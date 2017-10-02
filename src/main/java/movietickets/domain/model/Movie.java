package movietickets.domain.model;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;

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

    @NotBlank
    private String title;

    @NotBlank
    private String summary;

    @NotNull
    @Range(min=1, max=500)
    private Integer runningTimeMinutes;

    public Movie(String title, String summary, int runningTimeMinutes) {
        this.title = title;
        this.summary = summary;
        this.runningTimeMinutes = runningTimeMinutes;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getRunningTimeMinutes() {
        return runningTimeMinutes;
    }

    public void setRunningTimeMinutes(Integer runningTimeMinutes) {
        this.runningTimeMinutes = runningTimeMinutes;
    }

    protected Movie() {

    }
}
