package org.example.PadroesCriacionais;

public class MySql implements BancoDeDados {

    @Override
    public String chamarBanco() {
        return "O Banco conectado é o MySql.";
    }

    @Override
    public int getNumero() {
        return 1;
    }
}
