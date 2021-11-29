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

@WebServlet(urlPatterns = "/categoria/alterar")
public class CategoriaAlterarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nome = req.getParameter("nome");
        String descricao = req.getParameter("descricao");

        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria.setNome(nome);
        categoria.setDescricao(descricao);

        CategoriaDao dao = new CategoriaDao();
        dao.update(categoria);

        RequestDispatcher rd = req.getRequestDispatcher("/categoria-alterada-sucesso.jsp");
        req.setAttribute("id", id);
        rd.forward(req, resp);
    }
}
