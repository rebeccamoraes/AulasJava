# Atividade Prática 49 - Padrão de Projeto Factory

## Requisitos
1. Crie uma cópia das classes criadas durante a atividade ATP48.
2. Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
3. Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.