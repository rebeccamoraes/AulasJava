package com.capgemini.atp55.vendas.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.capgemini.atp55.vendas.model.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        Produto produto = new Produto();
        produto.setNome(req.getParameter("nome"));
        
        String valor = req.getParameter("valor");
        String idCategoria = req.getParameter("id_categoria");
        String id = req.getParameter("id");

        
        if(id != null) {
            produto.setIdCategoria(Integer.parseInt(id));
        }
        if(valor != null) {
            produto.setValor(Float.parseFloat(valor));
        }
        if(idCategoria != null) {
            produto.setIdCategoria(Integer.parseInt(idCategoria));
        }

        
        out.printf("Modulo Produto\n%s", produto);
    }
}
