package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonVisitorTest {
    @Test
    void deveExibirJson(){
        JSON json = new JSON();

        JsonVisitor visitor = new JsonVisitor();
        assertEquals("json", visitor.exibir(json));
    }
}