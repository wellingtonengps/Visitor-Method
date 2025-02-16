package org.example;

public class JSON implements FormatoJson {

    @Override
    public String aceitar(JsonVisitor visitor) {
        return visitor.exibirJson(this);
    }
}
