# TRABALHO 2 ARQUITETURA DE SOFTWARE

 Desenvolvimento baseado em componente e desenvolvimento baseado em serviços
 
 ## ✒️ Autores

* **Rodrigo Souza Tassoni** - *tazzsoni@gmail.com* - [TazzSoni](https://github.com/TazzSoni)

## 🚀 Atividades a serem implementadas

* Criar uma api rest para inserir o cliente;
* A validação do cpf deve ser realizada usando o componente desenvolvido na aula do
09/12 2 16/12;
* O cliente deve informar o cep e deve buscar as demais informações automaticamente.
O site do https://viacep.com.br/ fornece exemplos de implementação;
* Antes de enviar o cadastro deve ser desenvolvido um webservice SOA para validar se o
usuário está apto para realizar o empréstimo. Para ser apto deve ser considerado que o
valor de cada parcela não deve ser superior a 30% da renda.
* O aluno deverá enviar o fonte com todas as dependências para o git, e postar na tarefa
o endereço do repositório

### 🔧 Descrição da estrutura

O trabalho foi executado com uma ResApi baseada em java com o framework Spring Boot, tendo nele a implementação de um componente
de verivicação de CPF (ValidaCPF.Jar), afim de verificar a veracidade do CPF informado, este adicionado como uma dependência.
Também foi implementado o WEbService "WsSOAP", a fim de verificar se o cliente é apto a receber o emprestimo.


## 🛠️ Construído com

* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [Html] - Crud em aplicação web java.
