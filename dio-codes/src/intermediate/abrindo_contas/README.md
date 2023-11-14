# Abrindo Contas

Desafio
-------

Você é um desenvolvedor em início de carreira e foi contratado por um banco para criar um sistema básico de abertura de
contas. Sua tarefa é implementar uma classe chamada "ContaBancaria" que represente uma conta bancária com as seguintes
informações: número da conta, nome do titular e saldo.

Entrada
-------

O programa deve solicitar ao usuário as informações necessárias para abrir uma conta bancária. A entrada deve ser feita
via console (linha de comando) e deve incluir o número da conta (um valor inteiro), o nome do titular (uma sequência de
caracteres) e o saldo inicial da conta (um valor decimal).

Saída
-----

Após receber as informações da conta, o programa deve criar um objeto do tipo "ContaBancaria" e exibir na tela as
informações dessa conta, incluindo o número da conta, o nome do titular e o saldo atual. A saída deve ser formatada de
forma clara e legível para o usuário.

Exemplos
--------

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de
testar seu programa com esses exemplos e com outros casos possíveis.

```json
{
  "input": "010101\r\nCaio Carlos\r\n98.0",
  "output": "Informacoes:\r\nConta: 101010\r\nTitular: Caio Carlos\r\nSaldo: R$ 98.0"
}
```

```json
{
  "input": "212223\r\nCarla Paiva\r\n500.0",
  "output": "Informacoes:\r\nConta: 212223\r\nTitular: Carla Paiva\r\nSaldo: R$ 500.0"
}
```

```json
{
  "input": "123456\r\nJoao Silva\r\n1000.0",
  "output": "Informacoes:\r\nConta: 123456\r\nTitular: Joao Silva\r\nSaldo: R$ 1000.0"
}
```