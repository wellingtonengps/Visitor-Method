package org.example;

public class JSON implements Formato {
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibir(this);
    }
}
