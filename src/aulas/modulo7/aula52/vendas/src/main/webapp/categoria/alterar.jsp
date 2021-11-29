<%@ page import="com.capgemini.rebecca.vendas.models.Categoria" %>

<% 
    Categoria categoria = (Categoria)request.getAttribute("categoria");
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alterar Categoria</title>
</head>
<body>
    <h1>Categoria - Alterar</h1>
    <form action="/categoria/alterar" method="post">
        Id: <input type="text" name="id" id="id" value="<%= categoria.getId() %>" disabled><br />
        Nome: <input type="text" name="nome" id="nome" value="<%= categoria.getNome() %>" /> <br />
        Descrição: <input type="text" name="descricao" id="descricao" value="<%= categoria.getDescricao() %>" /> <br />
        <input type="submit" value="Salvar">
    </form>
</body>
</html>