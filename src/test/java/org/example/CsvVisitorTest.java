package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvVisitorTest {

    @Test
    void deveExibirCsv(){
        CSV csv = new CSV();

        CsvVisitor visitor = new CsvVisitor();
        assertEquals("csv", visitor.exibir(csv));
    }
}