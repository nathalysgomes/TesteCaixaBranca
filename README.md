# TesteCaixaBranca
## Descrição
Repositório criado para realizar teste de caixa branca, no código sugerido pelo professor. Deve ser respondido as seguintes perguntas:

## Erros de código:
A documentação foi descrita no código?
O código possuí apenas dois comentários: de início de instrução de SQL e fim da class. O ideal seria que o código tivesse a explicação sobre seus métodos e variáveis.

As variáveis e constantes possuem boa nomeclatura?
Não, o ideal seria iniciar todas com letra maiúscula.

Existem legibilidade e organização no código?
Os problemas de legibilidade e organização encontrados no código são: falta de indentação nos blocos de código e falta de espaços em certos operadores.

Todos os nullpointers foram tratados?
Não, o código não trata corretamente essas exceções, é necessário acrescentar tratamento de exceções apropriados para evitar erros inesperados, como de falha de banco de dados por exemplo.

A arquitetura utilizada foi devidamente respeitada?
Não, ele não segue boas práticas de separações, o ideal seria otilizar MVC ou DAO para facilitar a manutenção do código quando necessário.

As conexões utilizadas foram fechadas?
Não, o ideal seria utlizar um "try-with-resources" nas declarações, para garantir que sejam fechadas corretamente.
## Grafo de fluxo:
<img src="/nbproject/grafo-fluxo1.jpg">

## Cálculo de complexidade:
V(G) = E - N + 2
V(G) = 11 - 9 + 2 =  4

V(G) = P + 1
V(G) = 2 + 1
V(G) = 3

## Sequências:
Caminho (1) = 1-2,3-4-6,7-8,10,11
Caminho (2) = 1-2,3-4-6,7-10,11
Caminho (3) = 1-2,3-4-6,7-9-11
Caminho (4) = 1-2,3-5-11

## Sequências no código:

//1.
package testecaixabranca;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
    public class user {
      public Connection conectarBD(){
//4.
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        }
//5.      
        catch (Exception e) { }
        return conn;} 
//2.
    public String nome="";
    public boolean result = false;
    public boolean VerificarUsuario(String login, String senha){
        String sql = "";
//3.
        Connection conn = conectarBD();
//6.
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + ";";
//7.
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
//8.
            if(rs.next()){
                result = true;
                nome = rs.getString("nome");}
            }
//9.
            catch (Exception e) { }
//10.
        return result;}
    }
    



