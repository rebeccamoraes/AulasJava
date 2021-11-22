package com.capgemini.atp55.vendas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.atp55.vendas.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria categoria = new Categoria();
        categoria.setNome(req.getParameter("nome"));
        categoria.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria\n%s", categoria);
    }
}