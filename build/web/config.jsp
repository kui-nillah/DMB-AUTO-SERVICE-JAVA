<%@page import="java.sql.*" %>

<%
String url,user,password;

url = "jdbc:mysql://localhost/dmb_auto_services";

user ="root";

password = "";
 try {
        
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(url,user,password);
      Statement statement = conn.createStatement();
     if(conn != null){
         out.println("sucessfully connected");
     }
     
 }catch(SQLException e){
     out.println(e);
     
 }





%>