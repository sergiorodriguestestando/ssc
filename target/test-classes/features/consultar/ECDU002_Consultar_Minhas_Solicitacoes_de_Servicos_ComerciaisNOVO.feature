#language: pt
Funcionalidade: Minhas Solicitações

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
      
  Esquema do Cenário: Validar Botão Limpar Campos
    Dado seleciona menu Solicitação de Minhas Solicitacoes
    Quando preenche ID da Solicitacao '<ID>'
    E preenche CNPJ '<CNPJ>'
    E preenche CPF '<CPF>'
    E preenche Razao Social do Cliente ou Nome '<Razao Social ou Nome>'
    E seleciona Aprovador '<Aprovador>'
    E seleciona Status '<Status>'
    E seleciona Tipo de ServicoMinhas '<Tipo de Servico>'
    E clica em Limpar

    Exemplos: 
      | ID | CNPJ | CPF | Razao Social ou Nome | Aprovador | Status               | Tipo de Servico                 |
      | 01 | 0000 |  43 | teste                | SERGIO    | Aguardando Aprovação | Alterações de Limite de crédito |

  Esquema do Cenário: Buscar Solicitação
    Dado seleciona menu Solicitação de Minhas Solicitacoes
    E seleciona Tipo de ServicoMinhas '<Tipo de Servico>'
    E clica em PesquisarMinhaSolicitacoes
    E clica em Visualizar Solicitacao
    Então Valida a solicitacao

    Exemplos: 
      | Tipo de Servico                 |
      | Alterações de Limite de crédito |

  Cenário: Cancelar Solicitação
    Dado seleciona menu Solicitação de Minhas Solicitacoes
    Quando seleciona Status 'Aguardando Aprovação'
    E clica em PesquisarMinhaSolicitacoes
    E clica em Visualizar Solicitacao
    E clica em Cancelar Solicitacao
    Então sistema Cancela Solicitacao
    E sair do sistema
