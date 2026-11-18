package br.com.fiap.paradacerta.controller;

import br.com.fiap.paradacerta.domain.Alert;
import br.com.fiap.paradacerta.service.AlertService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertController {

    private final AlertService service;

    public AlertController(AlertService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Alert>> getAlerts(@RequestParam String region) {
        return ResponseEntity.ok(service.getAlertsByRegion(region));
    }

    @PostMapping
    public ResponseEntity<Alert> createAlert(@RequestBody Alert alert) {
        return ResponseEntity.status(201).body(service.createAlert(alert));
    }
}