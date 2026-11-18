package br.com.fiap.paradacerta;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ParadaCertaApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
    }

    @Test
    void deveRetornarStatus200AoBuscarTodasAsLinhas() throws Exception {
        mockMvc.perform(get("/api/lines"))
                .andExpect(status().isOk());
    }

    @Test
    void deveRetornarStatus200AoBuscarAlertasPorRegiao() throws Exception {
        mockMvc.perform(get("/api/alerts").param("region", "Centro"))
                .andExpect(status().isOk());
    }
}