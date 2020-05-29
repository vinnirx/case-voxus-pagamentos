# Case Voxus - Pagamentos

## Testando o projeto

  - Abrir código fonte
  - Subir o Java 
  - Abrir o Postman

obs.: É necessário ter o MySQL instalado, Maven e Java 8 configurados.

### Incluir Pagamento (POST):

Digitar a url abaixo:

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

### Excluir Pagamento (DELETE):

Digitar a url abaixo e incluindo como paramêtro na url qual é o id de pagamento que deseja que seja excluído e clicar no botão "Send":
http://localhost:8090/deletar?id=1

Por se tratar de um método void, este não tem retorno.

### Listar Pagamentos (GET):

Digitar a url abaixo e clicar no botão "Send":

URL: http://localhost:8090/listar

Retorno esperado de exemplo:

```json
[
    {
        "id": "1",
        "titulo": "testetitulo",
        "valor": 300.0,
        "data": "2020-07-26",
        "taxaExterna": 0.0,
        "comentario": "testenovo"
    },
    {
        "id": "2",
        "titulo": "testetitulo",
        "valor": 300.0,
        "data": "2020-07-26",
        "taxaExterna": 15.0,
        "comentario": "testenovo"
    },
    {
        "id": "3",
        "titulo": "pagamento",
        "valor": 200.0,
        "data": "2018-05-09",
        "taxaExterna": 10.0,
        "comentario": "TesteNew"
    },
    {
        "id": "4",
        "titulo": "pagamento de boleto",
        "valor": 1200.0,
        "data": "2012-09-01",
        "taxaExterna": 60.0,
        "comentario": ""
    },
    {
        "id": "5",
        "titulo": "pagamento de duplicata",
        "valor": 17800.0,
        "data": "2007-12-08",
        "taxaExterna": 890.0,
        "comentario": "Ultimo Comentario"
    }
]
```
