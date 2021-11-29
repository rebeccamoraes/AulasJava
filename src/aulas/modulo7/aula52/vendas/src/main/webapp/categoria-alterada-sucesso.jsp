<% 
    int id = req.getPatamter("id"); 
%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de categoria</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>Sucesso</h1>
    <p>Categoria, com id = <%= id %>, alterada com sucesso.</p><br />
    <a href="/vendas-1/categoria/listar">Lista de categorias</a>
</body>
</html>