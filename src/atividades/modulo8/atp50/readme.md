# Atividade Prática 49 - Pool de conexões

## Requisitos
1. Crie uma cópia das classes criadas durante a atividade ATP49.
2. Faça o download das bibliotecas para criação do pool: [C3P0](https://repo1.maven.org/maven2/com/mchange/c3p0/0.9.5.4/c3p0-0.9.5.4.jar) e [mchange](https://repo1.maven.org/maven2/com/mchange/mchange-commons-java/0.2.15/mchange-commons-java-0.2.15.jar)
4. Altere a fábrica de conexões para utilizarem um pool de conexões com um limite de 50 conexões.
5. Altere o método que retorna a conexão para retornar uma conexão vinda de um DataSource;
