package org.example.PadroesCriacionais;

public class Oracle implements BancoDeDados {

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o Oracle.";
    }

    @Override
    public int getNumero() {
        return 2;
    }
}
