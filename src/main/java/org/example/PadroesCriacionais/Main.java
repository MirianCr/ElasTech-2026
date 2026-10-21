package org.example.PadroesCriacionais;

public class Main {
    public static void conectarBanco(BancoDeDados banco) {
        System.out.println(banco.chamarBanco());
     //   System.out.println("Número do banco: " + banco.getNumero()); ver numero do banco
    }

    public static void main(String[] args) {

        BancoDeDados mysql = new MySql();
        BancoDeDados oracle = new Oracle();

        conectarBanco(mysql);
        conectarBanco(oracle);
    }

}
