<h1 align="center">
  Place Service
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Platform&message=Spring WebFlux&color=brightgreen" alt="Spring WebFlux"/>
 <img src="https://img.shields.io/static/v1?label=Type&message=Reactive API&color=8257E5&labelColor=000000" alt="Reactive API" />
</p>

API com a funcionalidade de gerenciamento de lugares (CRUD places).
Projeto de finalidade didática.

## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Spring Data + R2DBC](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Slugify](https://github.com/slugify/slugify)

## Práticas adotadas

- SOLID
- Testes automatizados
- Consultas com filtros dinâmicos usando o Query By Example
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

## Formas de executar a API:

### Localmente
- Clonar repositório git
- Construir o projeto:
```
./mvnw clean package
```
- Executar:
```
java -jar place-service/target/place-service-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

### Usando Docker

- Clonar repositório git
- Construir o projeto:
```
./mvnw clean package
```
- Construir a imagem:
```
./mvnw spring-boot:build-image
```
- Executar o container:
```
docker run --name place-service -p 8080:8080  -d place-service:0.0.1-SNAPSHOT
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).

## API Endpoints

Para fazer as requisições HTTP, foi utilizada a ferramenta [Postman](https://www.postman.com/):

- POST /places
```
curl --location --request POST 'http://localhost:8080/place' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Place water",
    "state": "State"
}'
```

