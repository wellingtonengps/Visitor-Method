package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CSVVisitorTest {
        @Test
        void deveExibirCSV() {
            Formato formato = FormatoFactory.obterFormato("CSV");

            CSVVisitor visitor = new CSVVisitor();
            assertEquals("csv", visitor.exibir(formato));
        }
}