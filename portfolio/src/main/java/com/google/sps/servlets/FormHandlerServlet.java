package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String textValue = request.getParameter("text-input");

    // Print the value so you can see it in the server logs.
    System.out.println("You submitted: " + textValue);

    // Write the value to the response so the user can see it.
    response.setContentType("text/html;");
    response.getWriter().println("You submitted: " + textValue + " </br><h3>Thank you for submitting your information!</h3>");
    // " <!DOCTYPE html>"+
    // "<html>"+
    //   "<head>"+
    //     "<meta charset=\"UTF-8\">"+
    //     "<title>My Projects</title>"+
    //     "<link rel=\"stylesheet\" href=\"style.css\">"+
    //     +"<script src=\"script.js\"></script>"+
    //   "</head>"+
    //   "<body>"_+
    //     <div class ="content">
    //     <h1>Thank you for submitting your information!</h1>
        
    //     </div>
    //   </body>
    // </html>>");

    // response.sendRedirect("./thankyou.html");
  }
}