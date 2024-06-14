# Trabalho Final: Programação de Soluções Computacionais
## Proposta de Problema 
Desenvolva um sistema de gerenciamento de biblioteca que auxiliará os funcionários a gerenciar o acervo de livros e a realizar operações como cadastro, busca, empréstimo, devolução e listagem de livros.
## Requisitos Funcionais
Para resolver o problema proposto, o sistema de gerenciamento de biblioteca deve incluir as seguintes funcionalidades:
### 1. Cadastrar Livros
 Permitir o cadastro de novos livros na biblioteca.  
* Solicitar informações do livro: título, autor, ano de publicação, ISBN e quantidade em estoque.
* Armazenar os livros em uma lista (array).
* Validar o ISBN ("International Standard Book Number") para garantir que seja único.
### 2. Buscar Livros
 Permitir a busca de livros no acervo.
* Permitir busca por título, autor ou ISBN.
* Exibir os detalhes dos livros encontrados com base nos critérios de busca.
* Utilizar condicionais para filtrar os resultados.
### 3. Realizar Empréstimo
 Permitir o empréstimo de livros aos usuários.
* Solicitar o ISBN do livro a ser emprestado.
* Verificar a disponibilidade do livro (estoque maior que zero).
* Reduzir a quantidade em estoque do livro emprestado.
* Exibir uma mensagem de sucesso ou erro.
 ### 5. Listar Livros Disponíveis
Listar todos os livros disponíveis para empréstimo.
* Exibir todos os livros com quantidade em estoque maior que zero.
* Mostrar os detalhes dos livros disponíveis.
* Utilizar loops para iterar sobre a coleção de livros.
### 6. Persistência de Dados
Garantir que os dados dos livros sejam mantidos entre sessões do programa.:
* Carregar os dados dos livros de um arquivo ao iniciar o sistema.
* Salvar os dados dos livros em um arquivo ao finalizar o sistema.
* Utilizar manipulação de arquivos para leitura e escrita dos dados.
### 7. Tratamento de Exceção
Lidar com possíveis erros durante a execução do programa.
* Implementar tratamento de exceção para erros como:
* Arquivo de dados não encontrado.
* Entrada inválida do usuário.
* Erros de leitura/escrita de arquivos.
### 8. Interface de Usuário
Prover uma interface amigável para interação com o usuário.
* Exibir um menu de opções para que o usuário possa selecionar a operação desejada.
* Menu de opções:
* Cadastrar livro.
* Buscar livros (por título, autor ou ISBN).
* Realizar empréstimo.
* Devolver livro.
* Listar livros disponíveis.
* Sair e salvar dados.
* Gerenciar o fluxo do programa com base nas escolhas do usuário utilizando condicionais e loops.
### 9. Validações
Garantir a integridade dos dados inseridos pelo usuário.
* Validar entradas do usuário, como:
* Garantir que o ano de publicação seja um número válido.
* Garantir que a quantidade em estoque seja positiva.
* Garantir que o ISBN seja único ao cadastrar novos livros.
## Críticas à IA  
Analisando as sugestões feitas pela IA, pude identificar dois pontos que podem ser melhorados:   
No livro "Estruturas de Dados e Seus Algoritmos" de Markenzon (2010) é comentado sobre algoritmos eficientes para lidar com operações repetitivas e tarefas programadas. Portanto o primeiro ponto seria a melhoria relacionado à funcionalidade de repetição no sistema de gerenciamento da biblioteca, pois apesar da proposta inicial mencionar funcionalidades como cadastro, busca, empréstimo e devolução de livros, não é explorado completamente como o sistema poderia automatizar processos que precisam ser realizados regularmente, como verificação de prazos de empréstimo vencidos e atualização de registros de inventário.  
No livro "Algoritmos: Lógica para Desenvolvimento de Programação de Computadores" (2011), no Capítulo específico sobre Tratamento de Exceções,é recomendado incluir a utilização de mensagens de erro detalhadas e orientações claras para o usuário, proporcionando uma melhor experiência de uso e aumentando a confiabilidade do sistema como um todo.
## Diagrama de Classes
### 1. Classe Livro
Propriedades:
* id: Identificador único do livro.
* titulo: Título do livro.
* autor: Autor(es) do livro.
* isbn: Número ISBN do livro.
* anoPublicacao: Ano de publicação do livro.
* quantidade: Quantidade disponível no acervo.  

Métodos:
* verificarDisponibilidade(): Verifica se o livro está disponível para empréstimo.
* atualizarQuantidade(int quantidade): Atualiza a quantidade disponível do livro no acervo.
* calcularPrazoDevolucao(): Calcula o prazo para devolução do livro.
### 2. Classe Usuario
Propriedades:
* id: Identificador único do usuário.
* nome: Nome completo do usuário.
* tipo: Tipo de usuário (estudante, professor, membro da comunidade, etc.).  

Métodos:
* realizarEmprestimo(Livro livro): Registra o empréstimo de um livro para o usuário.
* realizarDevolucao(Livro livro): Registra a devolução de um livro pelo usuário.
* verificarHistoricoEmprestimos(): Retorna o histórico de empréstimos do usuário.
### 3. Classe Biblioteca

Propriedades:
* livros: Lista de todos os livros disponíveis na biblioteca.
* usuarios: Lista de todos os usuários registrados na biblioteca.  

  Métodos:
* cadastrarLivro(Livro livro): Adiciona um novo livro ao acervo da biblioteca.
* removerLivro(Livro livro): Remove um livro do acervo da biblioteca.
* buscarLivroPorTitulo(String titulo): Retorna uma lista de livros com base no título fornecido.
 * buscarLivroPorAutor(String autor): Retorna uma lista de livros escritos pelo autor fornecido.
 * verificarPrazosDevolucao(): Verifica os prazos de devolução de todos os livros emprestados e envia lembretes aos usuários com prazos próximos.
### 4. Classe ExcecaoLivroIndisponivel (extends Exception)
Método:
* mensagemErro(): Retorna uma mensagem de erro detalhada informando que o livro não está disponível para empréstimo.
### 5. Classe Principal
Método:
* main(String[] args): Ponto de entrada do sistema, onde são inicializadas as instâncias necessárias e as interações com o usuário são iniciadas.
 ## Estratégia de Programação com IA
A estratégia utilizada será a de programação em pares incluindo a IA, trabalhando em conjunto codificando, discutindo alternativas de implementação e explorando diferentes abordagens para a solução de desafios específicos.
## Codificação do Programa

