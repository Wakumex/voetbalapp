<%-- 
    Document   : index
    Created on : 11-jun-2014, 13:01:36
    Author     : kevin
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "voetbal.*" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
           SpelersOverzicht so = new SpelersOverzicht();
           String land = request.getParameter("land");
           String positie = request.getParameter("positie");
        %>
        <link rel="stylesheet" href="pagina.css" type="text/css" media= "screen">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="index.jsp" method="post">
        <select name='land'>
            <option>Denemarken</option>
            <option>Nederland</option>
            <option>Spanje</option>
        </select>
        
        <select name='positie'>
            <option>Keeper</option>
            <option>Verdediger</option>
            <option>Middenvelder</option>
            <option>Aanvaller</option>
        </select>
       <input type='submit' name='zoeken' value='zoeken'>
 
      </form>
        <%
           if (request.getParameter("zoeken") !=null){
               
              ArrayList<Speler> lijst = so.getSpelers(land, positie);
              
              
           for(int i = 0; i < lijst.size(); i++){
               out.print(lijst.get(i).getNaam() + "<br><br>"
                    + lijst.get(i).getPositie() + "<br><br>"
                    + lijst.get(i).getTeam() + " - "
                    + lijst.get(i).getLand() + "<br>");
           }
        }
           
        %>
    </body>
</html>
