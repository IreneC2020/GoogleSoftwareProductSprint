package com.google.sps.servlets;

// import com.google.sps.data.ServerStats;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random-message")

public class RandomMessageServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<String> messages = new ArrayList<String>();
        messages.add("first message");
        messages.add("second message");
        messages.add("third message");
        response.setContentType("text/html;");
        response.getWriter().println(messages);
    }

}