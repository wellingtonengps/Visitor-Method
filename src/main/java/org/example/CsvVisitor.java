package org.example;

public class CsvVisitor  {
    public String exibir(FormatoCsv formato) {return formato.aceitar(this);}

    public String exibirCSV(CSV csv) {
        return "csv";
    }
}
