package org.example;

public class XML implements Formato {

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibir(this);
    }
}
