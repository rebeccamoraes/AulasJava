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

@WebServlet(urlPatterns = "/categoria/carregar")
public class CategoriaCarregarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();

        int id = Integer.parseInt(req.getParameter("id"));
        
        Categoria categoria = dao.readById(id);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria/alterar.jsp");
        req.setAttribute("categoria", categoria);
        rd.forward(req, resp);
        
    }
}
