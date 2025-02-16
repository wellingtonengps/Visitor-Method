package org.example;

public class JsonVisitor {
    public String exibir(FormatoJson formato) {return formato.aceitar(this);}

    public String exibirJson(JSON json) {
        return "json";
    }
}
