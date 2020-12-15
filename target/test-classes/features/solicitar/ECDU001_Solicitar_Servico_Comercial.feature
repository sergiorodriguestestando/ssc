# language: pt
Funcionalidade: Solicitar pagamentos

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

  Esquema do Cenário: Formulário Abatimentos de Titulos
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E preenche CNPJ '<CNPJ>'
    E preenche Justificativa '<Justificativa>'
    E seleciona Tipo de Abatimento '<Tipo de Abatimento>'
    E clica no botao Adicionar Novo
    E preenche Numero do Titulo '<Numero do Titulo>'
    E preenche Valor do Abatimento '<Valor do Abatimento>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico       | Unidade de Faturamento       | CNPJ               | Justificativa | Tipo de Abatimento              | Numero do Titulo | Valor do Abatimento | Aprovador | Anexo     |
      | Abatimento de Títulos | 01M-MDB FORTALEZA MASSA/BISC | 00.000.000/0000-00 | texto legal   | ABAT - COND VENDA-NEG.COMERCIAL |       1234567890 |            99999.99 | ter01277  | teste.csv |

  Esquema do Cenário: Formulário Analise de Multa
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E preenche Descricao da Solicitacao '<Descricao da Solicitacao>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico   | Descricao da Solicitacao | Telefone de Contato | Anexo      |
      | Análise de Multas | teste                    | (85) 99900-0000     | teste.docx |

  Esquema do Cenário: Formulário Cadastro de Cliente para Exportacao
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E preenche Razao Social '<Razao do Social do Cliente>'
    E seleciona Canal do Cliente '<Canal do Cliente>'
    E preenche Endereco '<Endereco>'
    E preenche Bairro '<Bairro>'
    E preenche Cidade '<Cidade>'
    E preenche Estado '<Estado>'
    E preenche Pais '<Pais>'
    E preenche Email '<Email>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E preenche Nome do Contato '<Nome do Contato>'
    E preenche Lista de Preco '<Lista de Preco>'
    E preenche Codigo do Representante '<Codigo do Representante>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                     | Razao do Social do Cliente | Canal do Cliente | Endereco | Bairro    | Cidade | Estado | Pais  | Email            | Telefone de Contato | Nome do Contato | Lista de Preco | Codigo do Representante | Unidade de Faturamento       | Anexo     |
      | Cadastro de Cliente para Exportação | Bodega do joao             | Rondelli         | Rua X    | Zé Walter | Fortal | Ceara  | Japao | abc@mdias.com.br | (85) 99900-0000     | Joazim da Venda | Legal          |                  123456 | 01M-MDB FORTALEZA MASSA/BISC | teste.odt |

  Esquema do Cenário: Formulário Cadastro de Cliente para Doacao Pessoa Física
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Tipo de Pessoa '<Tipo de Pessoa>'
    E preenche CPNJ ou CPF '<CNPJ ou CPF>'
    E preenche Nome ou Razao Social '<Nome ou Razao Social>'
    E preenche Inscricao Estadual '<Inscricao Estadual>'
    E preenche Codigo do Representante '<Codigo do Representante>'
    E preenche CEP '<CEP>'
    E preenche Endereco '<Endereco>'
    E preenche Numero '<Numero>'
    E preenche Bairro '<Bairro>'
    E preenche Cidade '<Cidade>'
    E preenche Estado '<Estado>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E preenche Email '<Email>'
    E preenche Nome do Contato '<Nome do Contato>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                  | Tipo de Pessoa  | CNPJ ou CPF        | Nome ou Razao Social | Inscricao Estadual | Codigo do Representante | CEP       | Endereco | Numero | Bairro    | Cidade | Estado | Telefone de Contato | Nome do Contato | Email            | Unidade de Faturamento       | Anexo     |
      | Cadastro de Clientes para Doação | Pessoa Física   | 023.562.253-23     | Joao do bar legal    |                    |                  123456 | 60800-000 | Rua X    |    100 | Zé Walter | Fortal | CE     | (85) 99900-0000     | Joazim da Venda | abc@mdias.com.br | 01M-MDB FORTALEZA MASSA/BISC | teste.pdf |
      | Cadastro de Clientes para Doação | Pessoa Jurídica | 00.000.000/0000-00 | Joao do bar legal    |    123456789012345 |                  123456 | 60800-000 | Rua X    |    100 | Zé Walter | Fortal | CE     | (85) 99900-0000     | Joazim da Venda | abc@mdias.com.br | 01M-MDB FORTALEZA MASSA/BISC | teste.png |

  Esquema do Cenário: Formulário Cadastro de Clientes(Trade, Trade Execução e Marketing)
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Tipo de Pessoa '<Tipo de Pessoa>'
    E preenche CPNJ ou CPF '<CNPJ ou CPF>'
    E preenche Nome ou Razao Social '<Nome ou Razao Social>'
    E preenche Inscricao Estadual '<Inscricao Estadual>'
    E preenche Codigo do Representante '<Codigo do Representante>'
    E preenche CEP '<CEP>'
    E preenche Endereco '<Endereco>'
    E preenche Numero '<Numero>'
    E preenche Bairro '<Bairro>'
    E preenche Cidade '<Cidade>'
    E preenche Estado '<Estado>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E preenche Email '<Email>'
    E preenche Nome do Contato '<Nome do Contato>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                                         | Tipo de Pessoa  | CNPJ ou CPF        | Nome ou Razao Social | Inscricao Estadual | Codigo do Representante | CEP       | Endereco | Numero | Bairro    | Cidade | Estado | Telefone de Contato | Nome do Contato | Email            | Unidade de Faturamento       | Anexo      |
      | Cadastro de Clientes(Trade, Trade Execução e Marketing) | Pessoa Física   | 023.562.253-23     | Joao do bar legal    |                    |                  123456 | 60800-000 | Rua X    |    100 | Zé Walter | Fortal | CE     | (85) 99900-0000     | Joazim da Venda | abc@mdias.com.br | 01M-MDB FORTALEZA MASSA/BISC | teste.xlsx |
      | Cadastro de Clientes(Trade, Trade Execução e Marketing) | Pessoa Jurídica | 00.000.000/0000-00 | Joao do bar legal    |    123456789012345 |                  123456 | 60800-000 | Rua X    |    100 | Zé Walter | Fortal | CE     | (85) 99900-0000     | Joazim da Venda | abc@mdias.com.br | 01M-MDB FORTALEZA MASSA/BISC | teste.csv  |

  Esquema do Cenário: Formulário Cadastro de Colaborador como Cliente
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E preenche CPFSolicitar '<CPF>'
    E preenche automaticamente Nome '<Nome>'
    E preenche automaticamente Email '<Email>'
    E preenche automaticamente CEP '<CEP>'
    E preenche automaticamente Endereco '<Endereco>'
    E preenche automaticamente Numero '<Numero>'
    E preenche automaticamente Bairro '<Bairro>'
    E preenche automaticamente Cidade '<Cidade>'
    E preenche automaticamente Estado '<Estado>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E preenche Nome do Contato '<Nome do Contato>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                      | Unidade de Faturamento       | CPF            | Nome                          | Email                             | CEP       | Endereco                   | Numero | Bairro  | Cidade    | Estado | Telefone de Contato | Nome do Contato | Anexo     |
      | Cadastro de Colaborador como Cliente | 01M-MDB FORTALEZA MASSA/BISC | 023.562.253-23 | TARCIANA DE ALBUQUERQUE SOUZA | tarciana.souza@mdiasbranco.com.br | 60416-510 | RUA FREI ICNTE DO SALVADOR |    720 | PARREAO | Fortaleza | CE     | (85) 99900-0000     | Joazim da Venda | teste.csv |

  Esquema do Cenário: Formulário Cadastro de Fornecedor como Cliente
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona Tipo de Pessoa '<Tipo de Pessoa>'
    E preenche CPNJ ou CPF '<CNPJ ou CPF>'
    E preenche automaticamente Nome ou Razao Social '<Nome ou Razao Social>'
    E preenche automaticamente Inscricao Estadual '<Inscricao Estadual>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E preenche automaticamente Email '<Email>'
    E preenche automaticamente CEP '<CEP>'
    E preenche automaticamente Endereco '<Endereco>'
    E preenche automaticamente Numero '<Numero>'
    E preenche automaticamente Bairro '<Bairro>'
    E preenche automaticamente Cidade '<Cidade>'
    E preenche automaticamente Estado '<Estado>'
    E preenche Nome do Contato '<Nome do Contato>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                     | Unidade de Faturamento       | Tipo de Pessoa  | CNPJ ou CPF        | Nome ou Razao Social                     | Inscricao Estadual | Telefone de Contato | Email                        | CEP      | Endereco                | Numero | Bairro     | Cidade    | Estado | Nome do Contato | Anexo     |
      | Cadastro de Fornecedor como Cliente | 01M-MDB FORTALEZA MASSA/BISC | Pessoa Física   | 682.614.035-72     | JOEL MARINS ARAUJO                       |                    | (85) 99900-0000     | THIAGO_GOMESFRE@HOTMAIL.COM  | 40717200 | R  DEZENOVE DE MARCO 56 |     56 | PLATAFORMA | SALVADOR  | BA     | Joazim da Venda | teste.csv |
      | Cadastro de Fornecedor como Cliente | 01M-MDB FORTALEZA MASSA/BISC | Pessoa Jurídica | 00.211.433/1000-18 | GEO MERCANTIL DE DERIVADOS DE PETROLEO L |           47288074 | (85) 99900-0000     | gabriela@postomaioral.com.br | 45820075 | ROD BR                  |    101 | RODOVIA    | EUNAPOLIS | BA     | Joazim da Venda | teste.csv |

  Esquema do Cenário: Formulário Cancelamento de itens
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E preenche Descricao da Solicitacao '<Descricao da Solicitacao>'
    E clica no botao Adicionar Novo
    E preenche Numero do Pedido '<Numero do Pedido>'
    E seleciona Motivo de Cancelamento '<Motivo de Cancelamento>'
    E preenche Codigo do Item '<Codigo do Item>'
    E preenche automaticamente Descricao do Item '<Descricao do Item>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico       | Descricao da Solicitacao | Numero do Pedido | Motivo de Cancelamento   | Codigo do Item | Descricao do Item | Unidade de Faturamento       | Anexo     |
      | Cancelamento de itens | teste testando teste     |        123456789 | DADOS CADASTRAIS ERRADOS |     1234567890 |                   | 01M-MDB FORTALEZA MASSA/BISC | teste.csv |

  Esquema do Cenário: Formulário Cancelamento de Pedidos
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Adicionar Novo
    E preenche Numero do Pedido '<Numero do Pedido>'
    E seleciona Motivo de Cancelamento '<Motivo de Cancelamento>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico         | Unidade de Faturamento       | Numero do Pedido | Motivo de Cancelamento   | Anexo     |
      | Cancelamento de pedidos | 01M-MDB FORTALEZA MASSA/BISC |        123456789 | DADOS CADASTRAIS ERRADOS | teste.csv |

  Esquema do Cenário: Formulário Dúvidas, Sugestões ou Reclamações
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Tipo '<Tipo>'
    E preenche Descricao da Solicitacao '<Descricao da Solicitacao>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                   | Tipo   | Descricao da Solicitacao | Anexo     |
      | Dúvidas, Sugestões ou Reclamações | Dúvida | teste testando testado   | teste.csv |

  Esquema do Cenário: Formulário Geração de relatórios
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E preenche Descricao da Solicitacao '<Descricao da Solicitacao>'
    E preenche Telefone de Contato '<Telefone de Contato>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico       | Descricao da Solicitacao | Telefone de Contato | Anexo     |
      | Geração de relatórios | teste testando testado   | (85) 99999-99999    | teste.csv |

  Esquema do Cenário: Formulário Tratativa de pedidos (Uso exclusivo pela Gestão de Pedidos)
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E preenche Descricao da Solicitacao '<Descricao da Solicitacao>'
    E clica no botao Adicionar Novo
    E preenche Numero do Pedido '<Numero do Pedido>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                                             | Unidade de Faturamento       | CNPJ               | Razao Social         | Descricao da Solicitacao | Numero do Pedido | Anexo     |
      | Tratativa de pedidos (Uso exclusivo pela Gestão de Pedidos) | 01M-MDB FORTALEZA MASSA/BISC | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | teste                    |       1234567890 | teste.csv |

  Esquema do Cenário: Formulário Manutenção de Cadastro de Clientes
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona Tipo de Pessoa '<Tipo de Pessoa>'
    E seleciona Tipo de Cadastro '<Tipo de Cadastro>'
    E sistema valida relacao pessoa x cadastro '<Tipo de Pessoa>' '<Tipo de Cadastro>'
    E preenche CPNJ ou CPF '<CNPJ ou CPF>'
    E preenche Codigo do Cliente '<Codigo do Cliente>'
    E preenche automaticamente Nome ou Razao Social '<Nome ou Razao Social>'
    E preenche Descricao da Alteracao do Cadastro '<Descricao da Alteracao do Cadastro>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                    | Unidade de Faturamento       | Tipo de Pessoa  | Tipo de Cadastro    | CNPJ ou CPF        | Codigo do Cliente | Nome ou Razao Social          | Descricao da Alteracao do Cadastro | Anexo     |
      | Manutenção de Cadastro de Clientes | 01M-MDB FORTALEZA MASSA/BISC | Pessoa Física   | Cliente colaborador | 023.562.253-23     |                   | TARCIANA DE ALBUQUERQUE SOUZA | Joazim da Venda                    | teste.csv |
      | Manutenção de Cadastro de Clientes | 01M-MDB FORTALEZA MASSA/BISC | Pessoa Jurídica | Cliente comercial   | 00.000.000/0000-00 |                   | ABU-GOSCH Y CIA LTDA          | Joazim da Venda                    | teste.csv |
      | Manutenção de Cadastro de Clientes | 01M-MDB FORTALEZA MASSA/BISC | Pessoa Jurídica | Cliente colaborador |                    |                   |                               | Joazim da Venda                    | teste.csv |
      | Manutenção de Cadastro de Clientes | 01M-MDB FORTALEZA MASSA/BISC | Pessoa Jurídica | Cliente exportação  |                    |       10261000100 | REGIONAL SUR S.A              | Joazim da Venda                    | teste.csv |

  Esquema do Cenário: Formulário Parametrização de agendamento
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Tipo '<Tipo>'
    E clica no botao Adicionar Novo
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico               | Tipo     | CNPJ               | Razao Social         | Unidade de Faturamento       | Aprovador | Anexo     |
      | Parametrização de agendamento | Inclusão | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | 01M-MDB FORTALEZA MASSA/BISC | ter01277  | teste.csv |

  Esquema do Cenário: Formulário Parametrização de pedido mínimo
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E seleciona Canal do Cliente '<Canal do Cliente>'
    E preenche Justificativa '<Justificativa>'
    E clica no botao Adicionar Novo
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E seleciona Tipo de Regra '<Tipo de Regra>'
    E sistema valida relacao Tipo de Regra x Vigencia '<Tipo de Regra>'
    E seleciona Vigencia '<Vigencia>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico                 | Unidade de Faturamento       | Canal do Cliente | Justificativa | CNPJ               | Razao Social         | Tipo de Regra | Vigencia   | Aprovador | Anexo     |
      | Parametrização de pedido mínimo | 01M-MDB FORTALEZA MASSA/BISC | Rondelli         | Teste         | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | Temporária    | 12/07/2022 | ter01277  | teste.csv |
      | Parametrização de pedido mínimo | 01M-MDB FORTALEZA MASSA/BISC | Rondelli         | Teste         | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | Definitiva    |            | ter01277  | teste.csv |

  Esquema do Cenário: Formulário Pedidos de amostras
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E preenche Codigo do Representante '<Codigo do Representante>'
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E preenche Operacao Fiscal '<Operacao Fiscal>'
    E preenche Condicao de Pagamento '<Condicao de Pagamento>'
    E preenche Numero da Ordem da Compra '<Numero da Ordem da Compra>'
    E preenche Lista de Preco '<Lista de Preco>'
    E preenche Valor Total do Pedido '<Valor Total do Pedido>'
    E clica no botao Adicionar Novo
    E preenche Codigo do Item '<Codigo do Item>'
    E preenche automaticamente Descricao do Item '<Descricao do Item>'
    E preenche Qtd Itens '<Qtd Itens>'
    E preenche Preco Liquido Unitario '<Preco Liquido Unitario>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico     | Unidade de Faturamento       | Codigo do Representante | CNPJ               | Razao Social         | Operacao Fiscal | Condicao de Pagamento | Numero da Ordem da Compra | Lista de Preco | Valor Total do Pedido | Codigo do Item | Descricao do Item             | Qtd Itens | Preco Liquido Unitario | Aprovador | Anexo     |
      | Pedidos de amostras | 01M-MDB FORTALEZA MASSA/BISC |                  123456 | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA |           12345 | teste                 |           123456789012345 | teste          |           99999999900 |          89205 | BONSABOR CREAM CRACKER 20X400 |       123 | R$ 999.999.999,00      | ter01277  | teste.csv |

  Esquema do Cenário: Formulário Prorrogação de Títulos
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E seleciona Tipo de Prorrogacao '<Tipo de Prorrogacao>'
    E preenche Justificativa '<Justificativa>'
    E clica no botao Adicionar Novo
    E preenche Numero do Titulo '<Numero do Titulo>'
    E preenche Vencimento Prorrogado '<Vencimento Prorrogado>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico        | Unidade de Faturamento       | CNPJ               | Razao Social         | Tipo de Prorrogacao           | Justificativa | Numero do Titulo | Vencimento Prorrogado | Aprovador | Anexo     |
      | Prorrogação de Títulos | 01M-MDB FORTALEZA MASSA/BISC | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | PRORR - CONDICAO DE PAGAMENTO | teste testae  |       1234567890 | 12/07/2022            | ter01277  | teste.csv |

  Esquema do Cenário: Formulário Recolocação de pedidos
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    Quando clica no botao Salvar
    E sistema exibe alerta de campos obrigatorios '<Tipo de Servico>'
    E seleciona Unidade de Faturamento '<Unidade de Faturamento>'
    E preenche CNPJ '<CNPJ>'
    E preenche automaticamente Razao Social '<Razao Social>'
    E preenche Justificativa '<Justificativa>'
    E clica no botao Adicionar Novo
    E preenche Numero do Pedido '<Numero do Pedido>'
    E preenche Valor Total do Pedido '<Valor Total do Pedido>'
    E adiciona Aprovador '<Aprovador>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico        | Unidade de Faturamento       | CNPJ               | Razao Social         | Justificativa | Numero do Pedido | Valor Total do Pedido | Aprovador | Anexo     |
      | Recolocação de pedidos | 01M-MDB FORTALEZA MASSA/BISC | 00.000.000/0000-00 | ABU-GOSCH Y CIA LTDA | teste testae  |        123456789 |                100,00 | ter01277  | teste.csv |

  Esquema do Cenário: Outros Serviços
    Dado seleciona menu Solicitação de Serviços Comerciais
    E seleciona Tipo de Servico '<Tipo de Servico>'
    E preenche Descricao da Solicitacao '<Descricao da Solicitacao>'
    E seleciona anexo '<Anexo>'
    Então clica no botao Salvar
    E clica no botao Confirmar Dialog

    Exemplos: 
      | Tipo de Servico | Descricao da Solicitacao | Anexo      |
      | Outros Serviços | teste automatizado       | teste.docx |

  Esquema do Cenário: Validar formato do anexo
    Dado seleciona menu Solicitação de Serviços Comerciais
    Quando seleciona Tipo de Servico '<Tipo de Servico>'
    E seleciona anexo '<Anexo>'
    Então sistema emite mensagem de extensao nao permitida

    Exemplos: 
      | Tipo de Servico        | Anexo     |
      | Recolocação de pedidos | teste.sql |

  Esquema do Cenário: Anexar mais de 10 arquivos
    Dado seleciona menu Solicitação de Serviços Comerciais
    Quando seleciona Tipo de Servico '<Tipo de Servico>'
    E seleciona anexo dez vezes '<AnexoA>'
    E seleciona anexo '<AnexoB>'
    Então sistema nao adiciona o anexo
    E sair do sistema

    Exemplos: 
      | Tipo de Servico        | AnexoA    | AnexoB    |
      | Recolocação de pedidos | teste.csv | teste.jpg |
