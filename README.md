# Case Voxus - Pagamentos

## Testando o projeto

1- Abrir código fonte
2- Subir o Java 
3 - Abrir o Postman

obs.: É necessário ter o MySQL instalado e o Maven e Java 8 configurados.

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
