package br.com.fiap.paradacerta.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_line")
public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean accessible;

    public Line() {}

    public Line(Long id, String name, Boolean accessible) {
        this.id = id;
        this.name = name;
        this.accessible = accessible;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Boolean getAccessible() { return accessible; }
    public void setAccessible(Boolean accessible) { this.accessible = accessible; }
}