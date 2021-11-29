# Atividade Prática 56 - Java web, parâmetros post e camada dao

## Requisitos
1. Utilize os projetos construídos nas atividades ATP52(JDBC) e ATP54(WEB) como base para este projeto.
2. Ajuste o projeto para incluir as dependências do driver de conexão do postgres e a dependencia C3P0 para criação o pool de conexões.
3. Altere a aplicação para construir uma camada DAO. Adicione na camada DAO, a classe de fábrica de conexões e a classe CategoriaDAO.
4. Ajuste o model Categoria e Produto para possuírem um id. Adicione os metodos getter e setter.
5. Ajuste o servlet de categoria para salvar uma categoria no banco utilizando a classe DAO. Retorne na resposta o ID gerado no banco.
6. Crie um novo servlet para listar as categorias cadastradas. 
