package de.exelxp.poker.jhtemplatefinder.repository;

import de.exelxp.poker.jhtemplatefinder.domain.PersistentToken;
import de.exelxp.poker.jhtemplatefinder.domain.User;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
