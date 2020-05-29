# Case Voxus - Pagamentos

## Testando o projeto

  - Abrir código fonte
  - Subir o Java 
  - Abrir o Postman

obs.: É necessário ter o MySQL instalado, Maven e Java 8 configurados.

### Incluir Pagamento (POST):

URL: http://localhost:8090/criar

Payload: No body do Postman, incluir o JSON abaixo e clicar no botão "Send":

```json
{
	"id":"5",
	"titulo":"pagamento de duplicata",	
	"valor":"17800.0",
	"data":"2007-12-09",
	"comentario":"Ultimo Comentario"

}
```

Retorno esperado de exemplo:

```json
{
    "id": "5",
    "titulo": "pagamento de duplicata",
    "valor": 17800.0,
    "data": "2007-12-09T00:00:00.000+00:00",
    "taxaExterna": 890.0,
    "comentario": "Ultimo Comentario"
}
```

### Alterar Pagamento (PUT):

Digitar a url abaixo e incluindo como paramêtro na url qual é o id de pagamento que deseja alterar:

URL: http://localhost:8090/atualizar?id=2

Payload: No body do Postman, incluir o JSON abaixo e clicar no botão "Send":

```json
{
	"titulo":"Duplicata",
	"valor":"50.0",
	"data":"2020-09-02",
	"comentario":"testefinal"
}
```

Retorno esperado de exemplo:

```json
{
    "id": "2",
    "titulo": "Duplicata",
    "valor": 50.0,
    "data": "2020-09-02T00:00:00.000+00:00",
    "taxaExterna": 2.5,
    "comentario": "testefinal"
}
```
