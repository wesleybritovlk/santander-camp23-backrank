# Reunião de Acionistas

Descrição
---------

Durante uma reunião de acionistas, alguns pontos importantes são discutidos e com isso surge a necessidade do
envolvimento da equipe de desenvolvedores. Com isso, você foi designado para criar uma interface que permitirá aos
acionistas de uma empresa acessarem informações relevantes sobre as análises da organização bancária. Sua tarefa é
implementar uma classe que representa essa interface e que fornece um método para consultar as análises de desempenho e
outros tipos dentro de um determinado período.

**Requisitos:**

A classe deve ter um método chamado `obterAnalisesDesempenho` que recebe como parâmetros uma data inicial e uma data
final.

Entrada
-------

As datas inicial e final, no formato "dd/mm/aaaa", representando o intervalo de tempo desejado para consulta.

Saída
-----

Uma lista contendo as análises de desempenho financeiro realizadas dentro do período especificado.

```json
{
  "input": "01/04/2023\r\n20/05/2023",
  "output": "Analise de Politicas e Regulamentacoes\r\nAnalise de Ativos"
}
```

```json
{
  "input": "05/03/2023\r\n05/04/2023",
  "output": "Analises Comporativas\r\nAnalise de Politicas e Regulamentacoes"
}
```

```json
{
  "input": "05/01/2023\r\n03/03/2023",
  "output": "Analise de Riscos e Exposicoes"
}
```