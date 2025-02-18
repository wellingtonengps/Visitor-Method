package org.example;

public class FormatoFactory {

    public static Formato obterFormato(String formato) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example." + formato);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Formato inexistente");
        }
        if (!(objeto instanceof Formato)) {
            throw new IllegalArgumentException("Formato inválido");
        }
        return (Formato) objeto;
    }
}