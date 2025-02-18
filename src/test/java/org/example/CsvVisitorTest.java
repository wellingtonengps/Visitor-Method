package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
*
    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("Formatura");
        assertEquals("Formatura efetivada", servico.executar());
    }
* */

class CSVVisitorTest {
        @Test
        void deveExibirCSV() {

            Formato formato = FormatoFactory.obterFormato("CSVFormato");

            CSVVisitor visitor = new CSVVisitor();
            assertEquals("csv", visitor.exibir(formato));
        }
}