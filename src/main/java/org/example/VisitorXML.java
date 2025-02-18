package org.example;

public class VisitorXML implements Visitor {
    @Override
    public String exibir(Formato formato) {
        return formato.aceitar(this);
    }
}
