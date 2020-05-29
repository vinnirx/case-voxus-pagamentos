# Case Voxus - Pagamentos

## Testando o projeto

Abrir o código fonte e subir o Java, depois abrir o Postman:

### Incluir Pagamento (POST):

http://localhost:8090/criar

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
