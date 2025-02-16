package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlVisitorTest {
    @Test
    void deveExibirXml(){
        XML xml = new XML();

        XmlVisitor visitor = new XmlVisitor();
        assertEquals("xml", visitor.exibir(xml));
    }
}