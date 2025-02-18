package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JSONVisitorTest {
    @Test
    void deveExibirJSON() {
        Formato formato = FormatoFactory.obterFormato("JSON");

        JSONVisitor visitor = new JSONVisitor();
        assertEquals("json", visitor.exibir(formato));
    }
}