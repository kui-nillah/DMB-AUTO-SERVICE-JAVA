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
                + "<th>Full name</th>"
                + "<th>Location</th>"
                + "<th>Email</th>"
                + "<th>Driver's age</th>"
                + "<th>Phone number</th>"
                + "<th>Vehicle</th>"
                + "<th>Message</th>"
                + "<th>Check box</th>"
                 + "<th col='2'>Action</th>"
                + "</tr>");
        
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn = DriverManager.getConnection(url,user,password);
            String sel= "SELECT * FROM shipping";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sel);

            while(result.next()){
                int id = result.getInt("id");
                String fname = result.getString("fname");
                String loc = result.getString("loc");
                String mail = result.getString("mail");
                String d_age = result.getString("d_age");
                String tel = result.getString("tel");
                String vehc = result.getString("vehc");
                String message = result.getString("message");
                String check_box = result.getString("check_box");
                
                
              
                
                out.println("<tr>"
                            +"<td>"+id+"</td>"
                            + "<td>"+fname+"</td>"
                            + "<td>"+loc+"</td>"
                            + "<td>"+mail+"</td>"
                            + "<td>"+d_age+"</td>"
                            + "<td>"+tel+"</td>"
                            + "<td>"+vehc+"</td>"
                            + "<td>"+message+"</td>"
                            + "<td>"+check_box+"</td>");
                            out.println("</tr>");
                
                       
                         
              
            }
            out.println("</table>");
 }catch(SQLException e){
     out.println(e);
     
 }





%>