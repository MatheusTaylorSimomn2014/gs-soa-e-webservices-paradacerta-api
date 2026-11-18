package br.com.fiap.paradacerta.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_alert")
public class Alert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String region;

    @Column(nullable = false)
    private String type; // Ex: CHUVA, ATRASO, ACESSIBILIDADE

    @Column(nullable = false)
    private String message;

    private LocalDateTime createdAt;

    public Alert() {
        this.createdAt = LocalDateTime.now();
    }

    public Alert(Long id, String region, String type, String message) {
        this.id = id;
        this.region = region;
        this.type = type;
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}