package org.example;

public class CSV implements FormatoCsv {

    @Override
    public String aceitar(CsvVisitor2 visitor) {
        return visitor.exibirCSV(this);
    }
}
