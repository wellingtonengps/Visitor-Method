package org.example;

public class JSONVisitor implements Visitor {

    @Override
    public String exibir(Formato formato) {
        return "json";
    }
}
