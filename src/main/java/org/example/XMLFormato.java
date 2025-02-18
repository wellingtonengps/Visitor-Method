package org.example;

public class XMLFormato implements Formato {

    @Override
    public String aceitar(Visitor visitor) {
        visitor.exibir(this);
        return null;
    }
}
