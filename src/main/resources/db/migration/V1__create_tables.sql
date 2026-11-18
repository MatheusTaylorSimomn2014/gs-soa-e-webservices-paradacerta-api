CREATE TABLE tb_line (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    accessible BOOLEAN DEFAULT TRUE
);

CREATE TABLE tb_alert (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    region VARCHAR(255) NOT NULL,
    type VARCHAR(50) NOT NULL,
    message VARCHAR(500) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Inserindo dados iniciais para teste
INSERT INTO tb_line (name, accessible) VALUES ('875A-10 Perimetral', TRUE);
INSERT INTO tb_line (name, accessible) VALUES ('477A-10 Ibirapuera', FALSE);