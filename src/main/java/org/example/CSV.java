package org.example;

public class CSV implements FormatoCsv {

    @Override
    public String aceitar(CsvVisitor visitor) {
        return visitor.exibirCSV(this);
    }
}
