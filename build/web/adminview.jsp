<%@page import="java.sql.*" %>

<%
    
String url,user,password;

url = "jdbc:mysql://localhost/dmb_auto_services";

user ="root";

password = "";
 try {
        out.println("<table border 1>"
                + "<tr>"
                + "<th>S/No</th>"
                + "<th>First name</th>"
                + "<th>Last name</th>"
                + "<th>Address</th>"
                + "<th>Mobile phone</th>"
                + "<th>Email</th>"
                 + "<th col='2'>Action</th>"
                + "</tr>");
        
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(url,user,password);
            String sel= "SELECT * FROM register";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sel);

            while(result.next()){
                int id = result.getInt("id");
                String fname = result.getString("fname");
                String lname = result.getString("lname");
                String addr = result.getString("addr");
                String tel = result.getString("tel");
                String mail = result.getString("mail");
                
                
              
                
                out.println("<tr>"
                            +"<td>"+id+"</td>"
                            + "<td>"+fname+"</td>"
                            + "<td>"+lname+"</td>"
                            + "<td>"+addr+"</td>"
                            + "<td>"+tel+"</td>"
                            + "<td>"+mail+"</td>");
                            out.println("</tr>");
                
                       
                         
              
            }
            out.println("</table>");
 }catch(SQLException e){
     out.println(e);
     
 }





%>