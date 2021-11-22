package com.capgemini.rebecca.vendas.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.rebecca.vendas.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Servlet categoria");

        Categoria categoria = new Categoria();
        categoria.setId(Integer.parseInt(req.getParameter("id")));
        categoria.setNome(req.getParameter("nome"));
        categoria.setDescricao(req.getParameter("descricao"));

        out.println(categoria);
    }
}
