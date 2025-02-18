package org.example;

public class XMLVisitor implements Visitor {
    @Override
    public String exibir(Formato formato) {
        return "xml";
    }
}
