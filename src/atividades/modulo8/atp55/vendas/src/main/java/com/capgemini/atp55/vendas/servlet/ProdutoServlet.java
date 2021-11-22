package com.capgemini.atp55.vendas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String valorString = req.getParameter("valor");
        String idCategoriaString = req.getParameter("id_categoria");

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Produto\nNome: %s\n", nome);

        if(valorString != null) {
            float valor = Float.parseFloat(valorString);
            out.printf("Valor: %.2f\n", valor);
        }
        if(idCategoriaString != null) {
            int idCategoria = Integer.parseInt(idCategoriaString);
            out.printf("Id categoria: %d", idCategoria);
        }
    }
}
