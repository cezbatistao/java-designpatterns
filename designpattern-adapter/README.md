# Design Pattern Adapter

Exemplo de aplicação do pattern **Adapter**

Para rodar a classe main SEM a aplicação do pattern basta executar o comando:
```bash
mvn exec:java -Dstart-class=br.com.batistao.MainControleDePonto
```

Para rodar a classe main COM a aplicação do pattern basta executar o comando:
```bash
mvn exec:java -Dstart-class=br.com.batistao.MainControleDePontoAdapter
```

Os testes podem ser executados com o comando
```bash
mvn clean test
```

Para visualizar o relatório basta acessar a página geranda no diretório:
```bash
$WORKSPACE_HOME/java-designpatterns/designpattern-adapter/build/spock-reports/index.html
```

Para mais detalhes verificar artigo: [Design Pattern: Adapter](https://cezbatistao.wordpress.com/2016/05/21/design-pattern-adapter/)
