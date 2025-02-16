package org.example;

public class XML implements FormatoXml {

    @Override
    public String aceitar(XmlVisitor visitor) {
        return visitor.exibirXml(this);
    }
}
