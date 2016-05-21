# Design Pattern Builder

Exemplo de aplicação do pattern **Builder**

Para rodar a classe main SEM a aplicação do pattern basta executar o comando:
```bash
mvn exec:java -Dstart-class=br.com.batistao.command.sembuilder.MainClienteSemBuilder
```

Para rodar a classe main COM a aplicação do pattern basta executar o comando:
```bash
mvn exec:java -Dstart-class=br.com.batistao.command.combuilder.MainClienteComBuilder
```

Os testes podem ser executados com o comando
```bash
mvn clean test
```

Para visualizar o relatório basta acessar a página geranda no diretório:
```bash
$WORKSPACE_HOME/designpattern-builder/build/spock-reports/index.html
```

Para mais detalhes verificar artigo: [Design Pattern: Builder](https://cezbatistao.wordpress.com/2016/05/21/design-pattern-builder)
