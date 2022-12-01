/*
    *Esta classe será responsável pela conexão com o MySql
    *terá 3 métodos:
    *abertura da conexão;
    *fechamento da conexão;
    *e execucção de comandos SQL.
 */

//pacote conexao
package conexao;

import javax.swing.JOptionPane; //importando classe JOptionPane
import java.sql.*;  // para execução de comandos SQL no ambiente Java

public class Conexao {

    final private String driver = "com.mysql.jdbc.Driver"; //definição do driver MySql para acesso aos dados
    final private String url = "jdbc:mysql://localhost/barbeariabd";//acesso ao bd clientes no servidor
    final private String usuario = "root"; // usuario do MySql - Xamp
    final private String senha = ""; // senha do MySql - easyphp
    private Connection conexao; // variavel que armazenará a conexao aberta
    public Statement statement; //variavel para execução dos comandos SQL dentro do ambiente java
    public ResultSet resultset; // variavel que armazenara o resultado da execução de um comando SQL 

    public boolean conecta() {
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException Driver) {
            result = false;
        } catch (SQLException Fonte) {
        }
        return result;
    }

    public void desconecta() {
        try {
            conexao.close();
        } catch (SQLException fecha) {

        }
    }

    public void executaSQL(String sql) {
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
