# Projeto Angular com Backend Spring Boot e Spring Security

Este é um projeto que integra um frontend Angular com um backend Spring Boot, utilizando o Spring Security para autenticação com JWT (JSON Web Token).

## Pré-requisitos

Antes de começar, certifique-se de ter as seguintes tecnologias instaladas em sua máquina:

- Java Development Kit (JDK) 21 ([Faça o download do JDK](link para download))
- Node.js (Versão compatível com Angular 18)
- npm (Gerenciador de pacotes do Node.js)
- Maven ([Faça o download do Maven](link para download))

## Configuração do Backend (Spring Boot)

1. Clone este repositório para sua máquina local.
2. Navegue até o diretório `backend` do projeto.
3. Configure suas credenciais de banco de dados no arquivo `application.properties`.
4. Execute o comando `mvn spring-boot:run` para iniciar o servidor Spring Boot.
5. O backend estará disponível em [http://localhost:8080](http://localhost:8080).

## Configuração do Frontend (Angular)

1. Navegue até o diretório `frontend` do projeto.
2. Execute o comando `npm install` para instalar as dependências do projeto.
3. Após a conclusão da instalação, execute `npm start` para iniciar o servidor de desenvolvimento do Angular.
4. O frontend estará disponível em [http://localhost:3000](http://localhost:3000).

## Configuração da Autenticação JWT

O Spring Security está configurado para autenticação com JWT. Certifique-se de configurar corretamente o frontend para enviar o token JWT no cabeçalho de autorização para as solicitações ao backend.

## Estrutura do Projeto

- `backend/`: Contém o código-fonte do backend Spring Boot.
- `frontend/`: Contém o código-fonte do frontend Angular.
- `README.md`: Este arquivo de instruções.

## Como Contribuir

1. Faça um fork deste repositório.
2. Crie uma branch para sua modificação (`git checkout -b feature/nova-feature`).
3. Faça commit de suas alterações (`git commit -am 'Adicionando nova feature'`).
4. Faça push para a branch (`git push origin feature/nova-feature`).
5. Crie um novo Pull Request.

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato através do email: [rgsa@outlook.com.br](mailto:rgsa@outlook.com.br).
