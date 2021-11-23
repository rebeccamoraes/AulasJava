package com.capgemini.rebecca.vendas.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.rebecca.vendas.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Página de produto");

        Produto produto = new Produto();
        produto.setNome(req.getParameter("nome"));
        produto.setValor(Float.parseFloat(req.getParameter("valor")));
        produto.setId(Integer.parseInt(req.getParameter("id")));
        produto.setIdCategoria(Integer.parseInt(req.getParameter("id_categoria")));

        out.println(produto);
    }
}
