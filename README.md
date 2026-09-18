# 🎬 Gerador de Frases Aleatórias de Filmes e Séries
## 📖 Sobre o Projeto
Este projeto foi desenvolvido como parte de um desafio prático da formação em Java, com o objetivo de construir um sistema capaz de gerar frases aleatórias de filmes e séries a partir de dados armazenados em um banco de dados.
O projeto simula uma funcionalidade muito comum em aplicações de entretenimento: a exibição de citações aleatórias de personagens famosos, proporcionando uma experiência dinâmica ao usuário. Para isso, foi implementada uma lógica de sorteio de registros persistidos no banco de dados, retornando uma frase diferente a cada consulta
Além de atender aos requisitos do desafio, o desenvolvimento serviu para reforçar conceitos importantes relacionados à persistência de dados, integração com front-end, consultas personalizadas e organização de aplicações Java com Spring Boot.
## 🎯 Motivação para o Desenvolvimento
O principal propósito do projeto foi consolidar conhecimentos adquiridos durante a formação, especialmente em:
- Desenvolvimento de aplicações web com Spring Boot;
- Integração entre aplicação e banco de dados PostgreSQL;
- Criação de consultas personalizadas utilizando JPA;
- Organização do código em camadas;
- Manipulação e recuperação de dados persistidos;
- Aplicação de boas práticas de desenvolvimento backend;
- Integração com front-end.
## 🛠️ Tecnologias Utilizadas
### Linguagem
- Java 21
### Framework
- Spring Boot
### Persistência de Dados
- Spring Data JPA
- Hibernate
### Banco de Dados
- PostgreSQL
### Gerenciamento de Dependências
- Maven
### Ferramentas de Desenvolvimento
- IntelliJ IDEA
- Git
- GitHub
- pgAdmin
## 🏗️ Arquitetura Utilizada
O projeto foi estruturado seguindo o padrão de arquitetura em camadas, tornando o código mais organizado e de fácil manutenção.
## 🔍 Técnicas Aplicadas
### Consulta Aleatória no Banco
Foi utilizada uma consulta customizada para recuperar uma frase aleatória entre os registros existentes, proporcionando resultados dinâmicos para cada requisição.
### Data Transfer Object (DTO)
Utilização de DTOs para transferir apenas os dados necessários ao cliente, reduzindo o acoplamento entre as camadas.
### Injeção de Dependência
Aplicação dos recursos do Spring para gerenciamento dos componentes da aplicação, aumentando a modularidade e facilitando testes e manutenção.
### Persistência com JPA
Emprego do Spring Data JPA para simplificar operações de acesso aos dados e reduzir a complexidade das consultas SQL.
### Separação de Responsabilidades
Cada camada possui uma responsabilidade específica, tornando o sistema mais organizado, escalável e aderente às boas práticas de desenvolvimento.
## 📚 Aprendizados Obtidos
Durante o desenvolvimento deste projeto foi possível aprofundar conhecimentos em:
- Spring Boot;
- Spring Data JPA;
- PostgreSQL;
- Mapeamento objeto-relacional (ORM);
- Consultas customizadas;
- Arquitetura em camadas;
- Integração entre banco de dados e aplicação Java.
- Integração entre Back e Front-End
## 🤝 Contribuição
Este é um projeto de estudo, mas contribuições são bem-vindas:
1. Faça um fork
2. Crie uma branch(git chekout -b feature/nova-feature)
3. Commite suas mudanças
4. Abra uma Pull Request
## 🖥️ O Front-End
O frent-end utilizado nesse desafio pode ser encontrado nesse [link](https://github.com/jacqueline-oliveira/3356-java-desafio-front)
