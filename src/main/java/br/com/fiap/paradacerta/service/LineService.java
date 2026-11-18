package br.com.fiap.paradacerta.service;

import br.com.fiap.paradacerta.domain.Line;
import br.com.fiap.paradacerta.repository.LineRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LineService {
    private final LineRepository repository;

    public LineService(LineRepository repository) {
        this.repository = repository;
    }

    public List<Line> findAll() {
        return repository.findAll();
    }

    public List<Line> findAccessibleLines() {
        return repository.findByAccessibleTrue();
    }

    public Line create(Line line) {
        return repository.save(line);
    }
}