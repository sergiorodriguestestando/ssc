# language: pt

Funcionalidade: Atendimento de solicitações de serviços comerciais

Cenário: Realiza login
		Dado realiza login
		

Esquema do Cenário: Aprovar Atendimento
	Dado seleciona menu Fila de Atendimento
	Quando clica em PesquisarFilaAtendimento
	E clica em Visualizar SolicitacaoFila
	E clica em Finalizar
	E preenche Comentario '<Comentario>'
	E clica em Confirmar
	Então valida atendimento '<Status Atendimento>'
	 E sair do sistema

Exemplos:
| Comentario	| Status Atendimento	|
| teste			 	| Finalizado					|

