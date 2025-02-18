package org.example;

public class VisitorCSV implements Visitor {
    @Override
    public String exibir(Formato formato) {
        return formato.aceitar(this);
    }
}
