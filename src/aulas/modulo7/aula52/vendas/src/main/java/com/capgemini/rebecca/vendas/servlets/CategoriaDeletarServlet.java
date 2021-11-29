package com.capgemini.rebecca.vendas.servlets;

import java.io.IOException;

import com.capgemini.rebecca.vendas.dao.CategoriaDao;
import com.capgemini.rebecca.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/deletar")
public class CategoriaDeletarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        Categoria categoria = new Categoria();
        
        int id = Integer.parseInt(req.getParameter("id"));
        categoria.setId(id);

        dao.delete(categoria);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria/listar");
        rd.forward(req, resp);
    }
}
