package testecaixabranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
/** 
* Classe de login do usuário
*/
public class user {
    /** 
    * Metodo para conectar banco de dados 
    **/
    public Connection conectarBD(){
        /** 
        * Variavel para salvar conexao do banco de dados 
        **/
        Connection conn = null;
        /** 
        * Try Catch para estabelecer conexao 
        **/
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e) { }
        /** 
        * Se o try for bem sucedido, retorna a conexao na variavel criada 
        **/
        return conn;} 
    /** 
    * Variaveis criadas para utilizar no metodo VerificarUsuario 
    **/
    public String nome="";
    public boolean result = false;
    /** 
    * Metodo para verificar usuario 
    **/
    public boolean VerificarUsuario(String login, String senha){
        String sql = "";
        /** 
        * Execucao do metodo ConectarBD 
        **/
        Connection conn = conectarBD();
        /** 
        * Instrucao SQL 
        **/
        sql += "select nome from usuarios";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + ";";
        /** 
        * Try catch para verificar se a conexao e instrucao SQL foram bem sucedidas 
        **/
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            /** 
            * If para verificar se a informacao foi recebida do banco de dados 
            **/
            if(rs.next()){
                result = true;
                /** 
                * Variavel nome sendo preenchida com informacao do banco de dados 
                **/
                nome = rs.getString("nome");}
            }catch (Exception e) { }
        /** 
        * Se for bem sucedido o resultado retornara como true 
        **/
        return result;}
    }
    

