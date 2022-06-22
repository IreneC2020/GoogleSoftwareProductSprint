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
        // Convert messages to JSON
        String json = convertToJsonUsingGson(messages);

        // Send the JSON as the response
        response.setContentType("application/json;");
        response.getWriter().println(json);
    }
    private String convertToJson(ArrayList<String> messages) {
        String json = "{";
        json += "\"one\": ";
        json += "\"" + messages.get(0) + "\"";
        json += ", ";
        json += "\"two\": ";
        json += "\"" + messages.get(1) + "\"";
        json += ", ";
        json += "\"three\": ";
        json += "\"" + messages.get(2) + "\"";
        json += "}";
        return json;
      }

      private String convertToJsonUsingGson(ArrayList<String> messages) {
        Gson gson = new Gson();
        String json = gson.toJson(messages);
        return json;
      }
}