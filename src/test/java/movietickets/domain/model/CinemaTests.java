package movietickets.domain.model;

import movietickets.infrastructure.jpa.CinemaJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class CinemaTests {

	@Autowired
	CinemaJpaRepository cinemaJpaRepository;

	@Test
	public void zeroPointsWhenBelowMinimumPurchaseAmount() {
		boolean[][] seats = {
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},

				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},

				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},

				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},

				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},

				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
				{true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true, true, true, false, true, true},
		};

//		Cinema cinema = new Cinema("", seats);
//
//		cinemaJpaRepository.save(cinema);
//
		System.out.println("done");
	}

}
