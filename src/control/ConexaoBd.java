/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author marco.junior
 */
public class ConexaoBd {
    private Statement st; //Executa comandos SQL simples como select insert 
    private ResultSet rs; //Conjunto de registro que retornam de uma consulta
    private Connection conn;// varial de conexão com o banco de dados
    
    public Connection conexao;
    
    public ConexaoBd() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// Responsável por gerenciar os driver do Banco de Dados
        String url = "jdbc:sqlserver://;databaseName=spacenet_teste"; // String de conexão com o banco de Dados
        conexao = DriverManager.getConnection(url,"sa","spnsw2002"); // Cria uma conexão com o banco de dados ,url login e senha
    }
    public Connection getConexao()
    {
        return conexao;
    }
}
