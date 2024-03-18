package com.example.servlet;

import com.example.model.Product;
//import com.example.model.Product.ProductBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = new Product.ProductBuilder()
                .withName(name)
                .withPrice(price)
                .build();

        request.setAttribute("product", product);
        request.getRequestDispatcher("product.jsp").forward(request, response);
    }
}
