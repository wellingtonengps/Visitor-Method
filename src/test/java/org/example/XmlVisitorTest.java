package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLVisitorTest {
    @Test
    void deveExibirXML() {
        Formato formato = FormatoFactory.obterFormato("XLM");

        XMLVisitor visitor = new XMLVisitor();
        assertEquals("xml", visitor.exibir(formato));
    }
}