#language: pt

Funcionalidade: Aprovar Solicitações

Cenário: Realiza login
		Dado realiza login
		
	
      
  
    Esquema do Cenário: Formulário Alterações de Limite de crédito
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E preenche Sugestao Limite Credito '<Sugestao Limite Credito>'
    E preenche Faturamento Medio Mensal '<Faturamento Medio Mensal>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                 | CNPJ               | Razao Social         | Sugestao Limite Credito | Faturamento Medio Mensal | Aprovador | Anexo     |
      | Alterações de Limite de crédito | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | R$ 999.999.999,00       | R$ 999.999.999,00        | ter01277  | teste.doc |
      | Alterações de Limite de crédito | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | R$ 999.999.999,00       | R$ 999.999.999,00        | ter01277  | teste.doc |
      

    Esquema do Cenário: Aprovar solicitação 
		Dado seleciona menu Aprovacao
		E seleciona Tipo de ServicoTESTE '<Tipo de Servico>'
		E clica em PesquisarAprovacoes
		E clica em Visualizar SolicitacaoTESTE
		E clica em Aprovar
		E preenche ComentarioTESTE '<Comentario>'
		E clica em Confirmar
	
		
Exemplos:
| ID 	| CNPJ 	| CPF	| Razao Social ou Nome	| Status	| Tipo de Servico	                              | Comentario	| Status Resultado				| 
|   	| 			|			| 										 	|					|	Alterações de Limite de crédito								|	Teste				| Aguardando Atendimento	| 

Esquema do Cenário: Negar solicitação 
		Dado seleciona menu Aprovacoes
		E seleciona Tipo de ServicoTESTE '<Tipo de Servico>'
		E clica em PesquisarAprovacoes
		E clica em Visualizar SolicitacaoTESTE
		E clica em NegarTESTE
		E preenche Motivo da RecusaTESTE '<Motivo da Recusa>'
		E clica em ConfirmarTESTE
		E sair do sistema
	
		
Exemplos:
| ID 	| CNPJ 	| CPF	| Razao Social ou Nome	| Status	| Tipo de Servico	                 | Motivo da Recusa	| Status Resultado	| 
|   	| 			|			| 										 	| 				|		Alterações de Limite de crédito								|	Teste							| Reprovado					| 

