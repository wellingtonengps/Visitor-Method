package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CsvVisitor2Test {

    @Test
    void deveExibirCsv(){
        CSV csv = new CSV();

        CsvVisitor2 visitor = new CsvVisitor2();
        assertEquals("csv", visitor.exibir(csv));
    }
}