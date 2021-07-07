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
                + "<th>Phone number</th>"
                + "<th>Whatsapp number</th>"
                + "<th>Email</th>"
                + "<th>Country</th>"
                + "<th>Comment</th>"
                 + "<th col='2'>Action</th>"
                + "</tr>");
        
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(url,user,password);
            String sel= "SELECT * FROM enquiry";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sel);

            while(result.next()){
                int id = result.getInt("id");
                String fname = result.getString("fname");
                String lname = result.getString("lname");
                String tel = result.getString("tel");
                String tsap = result.getString("tsap");
                String mail = result.getString("mail");
                String country = result.getString("country");
                String comment = result.getString("comment");
                
                
              
                
                out.println("<tr>"
                            +"<td>"+id+"</td>"
                            + "<td>"+fname+"</td>"
                            + "<td>"+lname+"</td>"
                            + "<td>"+tel+"</td>"
                            + "<td>"+tsap+"</td>"
                            + "<td>"+mail+"</td>"
                            + "<td>"+country+"</td>"
                            + "<td>"+comment+"</td>");
                            out.println("</tr>");
                
                       
                         
              
            }
            out.println("</table>");
 }catch(SQLException e){
     out.println(e);
     
 }





%>