package org.example;

public class XmlVisitor {

    public String exibir(FormatoXml formato) {return formato.aceitar(this);}

    public String exibirXml(XML xml) {
        return "xml";
    }
}
