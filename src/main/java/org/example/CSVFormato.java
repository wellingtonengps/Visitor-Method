package org.example;

public class CSVFormato implements Formato{
    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibir(this);
    }
}
