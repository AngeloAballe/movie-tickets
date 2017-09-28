package movietickets;

import movietickets.domain.model.Cinema;
import movietickets.domain.model.CinemaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.ArrayList;

/**
 * Created by zeus on 9/27/17.
 */
@SpringBootApplication
public class MovieTicketApplication implements CommandLineRunner {

    @Autowired
    CinemaJpaRepository cinemaJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(MovieTicketApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        boolean[][] seats = {
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true},
                {true, true, false, true, true}
        };

        Cinema cinema = new Cinema(seats);

        cinemaJpaRepository.insert(cinema);
    }
}
