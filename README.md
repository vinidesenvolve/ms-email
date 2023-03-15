# API para envio de email

## Descrição

Microserviço para envio de email seguindo tutorial Spring API Microservices por Michelli Brito.

Desenvolvida com Java, Spring, JPA, PostgreSQL, RabbitMQ

## Índice
<p align="center"> - 
 <a href="#status">Status</a> - 
 <a href="#status"> Funcionalidades </a> - 
 <a href="#requisitos">Requisitos</a> - 
 <a href="#executando">Executando</a> - 
 <a href="#tecnologias">Tecnologias</a> - 
 <a href="#autor">Autor</a> - 
 <a href="#licença">Licença</a> - 
</p>

## Status 

Desenvolvida

## Funcionalidades

- [x] Enviar email
- [x] Salvar email na base de dados
- [x] Consumir mensagem com RabbitMQ

## Requisitos

### Ferramentas necessárias

Instale essas ferramnetas em sua máquina (caso não as tenha)

- [Git](https://git-scm.com)
- [Java 11+](https://www.java.com/en/)
- [PostgreSQL](https://www.postgresql.org/) instalar pgAdmin pode ajudar na manipulação* 
- [Eclipse IDE](https://www.eclipse.org/) ou outra IDE da sua preferência com suporte para Java*

### Clone o repositório

Baixe o arquivo compactado ou faça um clone do git

No terminal ou prompt de comando dentro da pasta que deseja colocar o projeto

<code> $ git clone <https://github.com/vinidesenvolve/ms-email.git> </code>

## Executando

### Preparando o Ambiente

  Instale, configure o usuário Postgres e suba o aplicação. 

  Para verificar se está online use <code>systemctl status postgresql</code> no Ubuntu
  
  No arquivo application.properties configure com as suas informações
  
  <code>spring.datasource.url= jdbc:postgresql://localhost:5432/ms-email
  spring.datasource.username=usuariopostgre
  spring.datasource.password=suasenha
  spring.jpa.hibernate.ddl-auto=create-drop</code>

  No mesmo arquivo também caso queira utilizar o RabbitMQ também configure com seus dados 

  <code>spring.mail.host=smtp.gmail.com
  spring.mail.port=587
  spring.mail.username=seuemail@gmail.com
  spring.mail.password=*******  #Senha de app google
  spring.mail.properties.mail.smtp.auth=true
  spring.mail.properties.mail.smtp.starttls.enable=true</code>

### Fazendo a chamada 
 Execute o projeto Spring em sua IDE

 Para realizar consultas a API recomendo utilizar o [Postman](https://www.postman.com/)
 
 Exemplo de JSON para ser enviado no body da chamada POST
 
 <code>{
    "ownerRef": "Vini",
    "emailFrom": "vini@gmail.com",
    "emailTo": "you@gmail.com",
    "subject": "Título Teste",
    "content": "Conteúdo Teste" 
  }</code>
 
  Para mais detalhes veja o vídeo tutorial da Michelle Brito no [link](https://www.youtube.com/watch?v=V-PqR0BxA8c&ab_channel=MichelliBrito)
 
## Tecnologias

- [Java](https://www.java.com/en/)
- [Spring](https://spring.io/)
- [PostgreSQL](https://www.postgresql.org/)
- [JPA](https://jakarta.ee/specifications/persistence/3.0/)
- [RabbitMQ](https://www.rabbitmq.com/)

## Autor

<p> <a href="https://github.com/vinidesenvolve">Vinicius Alves Rodrigues</a> </p>
<p> <a href="https://www.linkedin.com/in/vinidesenvolve/">Likedin</a> </p>
<p> <a href="vinidesenvolve@gmail.com">Email</a> </p>

## Licença

<p align="center">
MIT License

Copyright (c) 2023 Vinicius A. Rodrigues

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
</p>
