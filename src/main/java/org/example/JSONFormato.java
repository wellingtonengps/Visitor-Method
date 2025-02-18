package org.example;

public class JSONFormato implements Formato {
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibir(this);
    }
}
