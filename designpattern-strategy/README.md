# Design Pattern Strategy

Exemplo de aplicação do pattern **Strategy**

Para rodar a classe main SEM a aplicação do pattern basta executar o comando:
```bash
mvn exec:java -Dstart-class=br.com.batistao.strategy.MainPromocaoSemStrategy
```

Para rodar a classe main COM a aplicação do pattern basta executar o comando:
```bash
mvn exec:java -Dstart-class=br.com.batistao.strategy.MainPromocaoComStrategy
```


Os testes podem ser executados com o comando
```bash
mvn clean test
```

Para visualizar o relatório basta acessar a página geranda no diretório:
```bash
$WORKSPACE_HOME/java-designpatterns/designpattern-strategy/build/spock-reports/index.html
```

Para mais detalhes verificar artigo: [Design Pattern: Strategy](https://cezbatistao.wordpress.com/2016/05/22/design-pattern-strategy)
