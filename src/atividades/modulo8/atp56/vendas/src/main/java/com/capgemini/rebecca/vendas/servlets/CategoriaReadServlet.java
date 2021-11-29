package com.capgemini.rebecca.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.rebecca.vendas.dao.CategoriaDao;
import com.capgemini.rebecca.vendas.model.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "/categoria/listar")
public class CategoriaReadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Lista de categorias");
        CategoriaDao dao = new CategoriaDao();

        for (Categoria categoria: dao.read()) {
            out.println(categoria);
            out.println("---");
        }
    }
}
