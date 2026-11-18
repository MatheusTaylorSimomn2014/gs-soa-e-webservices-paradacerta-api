package br.com.fiap.paradacerta.repository;

import br.com.fiap.paradacerta.domain.Alert;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Long> {
    List<Alert> findByRegion(String region);
}