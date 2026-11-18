package br.com.fiap.paradacerta.controller;

import br.com.fiap.paradacerta.domain.Line;
import br.com.fiap.paradacerta.service.LineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/lines")
public class LineController {

    private final LineService service;

    public LineController(LineService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Line>> getAllLines() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/accessible")
    public ResponseEntity<List<Line>> getAccessibleLines() {
        return ResponseEntity.ok(service.findAccessibleLines());
    }

    @PostMapping
    public ResponseEntity<Line> createLine(@RequestBody Line line) {
        return ResponseEntity.status(201).body(service.create(line));
    }
}