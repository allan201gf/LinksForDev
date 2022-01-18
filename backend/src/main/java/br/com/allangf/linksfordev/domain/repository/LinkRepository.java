package br.com.allangf.linksfordev.domain.repository;

import br.com.allangf.linksfordev.domain.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Integer> {
}
