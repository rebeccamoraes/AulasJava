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

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PrintWriter out = resp.getWriter();
        
        Categoria categoria = new Categoria();
        CategoriaDao dao = new CategoriaDao();
        
        categoria.setNome(req.getParameter("nome"));
        categoria.setDescricao(req.getParameter("descricao"));

        categoria.setId(dao.create(categoria));

        RequestDispatcher rd = req.getRequestDispatcher("categoria-sucesso.jsp");
        rd.forward(req, resp);
    }
}
