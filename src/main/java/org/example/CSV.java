package org.example;

public class CSV implements Formato{
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibir(this);
    }
}
