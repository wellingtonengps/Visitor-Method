package org.example;

public class CsvVisitor2 {
    public String exibir(FormatoCsv formato) {return formato.aceitar(this);}

    public String exibirCSV(CSV csv) {
        return "csv";
    }
}
