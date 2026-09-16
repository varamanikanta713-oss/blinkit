package com.grocery;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Quick Grocery</title>");

        out.println("<style>");
        out.println("body {");
        out.println("font-family: Arial;");
        out.println("margin: 0;");
        out.println("background: #f5f5f5;");
        out.println("}");

        out.println(".header {");
        out.println("background: #ffd700;");
        out.println("padding: 20px;");
        out.println("display: flex;");
        out.println("align-items: center;");
        out.println("gap: 30px;");
        out.println("}");

        out.println(".logo {");
        out.println("font-size: 30px;");
        out.println("font-weight: bold;");
        out.println("}");

        out.println(".search {");
        out.println("width: 400px;");
        out.println("padding: 12px;");
        out.println("border: none;");
        out.println("border-radius: 8px;");
        out.println("}");

        out.println(".login {");
        out.println("margin-left: auto;");
        out.println("font-size: 18px;");
        out.println("}");

        out.println(".container {");
        out.println("padding: 30px;");
        out.println("}");

        out.println(".products {");
        out.println("display: flex;");
        out.println("gap: 20px;");
        out.println("flex-wrap: wrap;");
        out.println("}");

        out.println(".product {");
        out.println("background: white;");
        out.println("width: 180px;");
        out.println("padding: 20px;");
        out.println("border-radius: 10px;");
        out.println("text-align: center;");
        out.println("}");

        out.println(".product img {");
        out.println("width: 120px;");
        out.println("height: 120px;");
        out.println("object-fit: contain;");
        out.println("}");

        out.println(".button {");
        out.println("background: green;");
        out.println("color: white;");
        out.println("border: none;");
        out.println("padding: 10px 20px;");
        out.println("border-radius: 5px;");
        out.println("cursor: pointer;");
        out.println("}");

        out.println("</style>");
        out.println("</head>");

        out.println("<body>");

        out.println("<div class='header'>");
        out.println("<div class='logo'>Quick Grocery</div>");
        out.println("<input class='search' type='text' placeholder='Search for groceries...'>");
        out.println("<div class='login'>Login</div>");
        out.println("<div>🛒 Cart</div>");
        out.println("</div>");

        out.println("<div class='container'>");

        out.println("<h1>Groceries delivered quickly</h1>");
        out.println("<p>Fresh groceries and daily essentials at your doorstep.</p>");

        out.println("<h2>Popular Products</h2>");

        out.println("<div class='products'>");

        product(out, "Milk", "₹40",
                "https://images.unsplash.com/photo-1563636619-e9143da7973b");

        product(out, "Bread", "₹35",
                "https://images.unsplash.com/photo-1509440159596-0249088772ff");

        product(out, "Eggs", "₹70",
                "https://images.unsplash.com/photo-1582722872445-44dc5f7e3c8f");

        product(out, "Rice", "₹120",
                "https://images.unsplash.com/photo-1586201375761-83865001e31c");

        out.println("</div>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }

    private void product(PrintWriter out,
                         String name,
                         String price,
                         String image) {

        out.println("<div class='product'>");

        out.println("<img src='" + image +
                    "?auto=format&fit=crop&w=300&q=80'>");

        out.println("<h3>" + name + "</h3>");

        out.println("<p>" + price + "</p>");

        out.println("<button class='button'>Add to Cart</button>");

        out.println("</div>");
    }
}
