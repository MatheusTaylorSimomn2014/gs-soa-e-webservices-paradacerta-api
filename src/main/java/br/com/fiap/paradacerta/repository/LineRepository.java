package br.com.fiap.paradacerta.repository;

import br.com.fiap.paradacerta.domain.Line;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LineRepository extends JpaRepository<Line, Long> {
    List<Line> findByAccessibleTrue();
}