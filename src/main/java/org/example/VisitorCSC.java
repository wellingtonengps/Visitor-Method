package org.example;

public class VisitorCSC implements Visitor {
    @Override
    public void exibir(Formato formato) {
        formato.aceitar(this);
    }
}
