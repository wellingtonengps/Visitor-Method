package org.example;

public class CSVVisitor implements Visitor{

    @Override
    public String exibir(Formato formato) {
            return "csv";
    }
}
