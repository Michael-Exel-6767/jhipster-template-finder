package de.exelxp.poker.jhtemplatefinder.repository;

import de.exelxp.poker.jhtemplatefinder.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
