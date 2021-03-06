package softuni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.entities.Game;
import softuni.entities.User;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
}
