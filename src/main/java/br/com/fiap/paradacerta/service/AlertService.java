package br.com.fiap.paradacerta.service;

import br.com.fiap.paradacerta.domain.Alert;
import br.com.fiap.paradacerta.repository.AlertRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlertService {
    private final AlertRepository repository;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
    }

    public List<Alert> getAlertsByRegion(String region) {
        return repository.findByRegion(region);
    }

    public Alert createAlert(Alert alert) {
        return repository.save(alert);
    }
}