<div align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-Ff0000?style=for-the-badge&logo=coffeescript&logoColor=white">
  <img alt="selenium" src="https://img.shields.io/badge/Selenium-selenium?style=for-the-badge&logo=selenium&logoColor=white">
  <img alt="selenium" src="https://img.shields.io/badge/Google-EB493B?style=for-the-badge&logo=google&logoColor=white">
</div>

# Vem Ser 13 - Selenium ☕

Repositório para alocar projeto de estudos desenvolvido utilizando a ferramenta Selenium para testes em aplicações web.

## Link
- [Test Store](https://teststore.automationtesting.co.uk/index.php)

## Pré-requisitos ⚙️

- [IntelliJ Idea](https://www.jetbrains.com/idea/)
- [JDK17](https://www.oracle.com/java/technologies/downloads/)
- [Google Chrome](https://www.google.com/intl/pt-BR/chrome/)
- [Allure Report](https://allurereport.org/docs/junit4/)


## Dependências Utilizadas 👀

```pom.xml
 <properties>
        <maven-compiler-plugin.version>3.8.1</maven-compiler-plugin.version>
        <maven-surefire-plugin.version>3.0.0-M5</maven-surefire-plugin.version>
        <java.version>17</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <selenium-java.version>4.18.1</selenium-java.version>
        <junit.version>4.13.2</junit.version>
        <allure-junit4.version>2.19.0</allure-junit4.version>
        <allure-selenide.version>2.18.1</allure-selenide.version>
        <lombok.version>1.18.30</lombok.version>
        <aspectj.version>1.9.4</aspectj.version>
        <jackson.version>2.10.1</jackson.version>
        <jackson-datatype.version>2.17.0</jackson-datatype.version>
        <javafaker.version>1.0.2</javafaker.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium-java.version}</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>${junit.version}</version>
        </dependency>
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-junit4</artifactId>
            <version>${allure-junit4.version}</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
            <version>${jackson-datatype.version}</version>
        </dependency>
        <dependency>
            <groupId>com.github.javafaker</groupId>
            <artifactId>javafaker</artifactId>
            <version>${javafaker.version}</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
        </dependency>
    </dependencies>
```

# Sistema de Teste Automatizado

## Ferramentas e Tecnologias Utilizadas

- **Selenium WebDriver**: Uma ferramenta para automação de testes web.
- Intellij

## Casos de Teste

#### 1. Login com dados válidos

#### 2. Login com dados inválidos

#### 3. Registro de usuário com dados válidos

#### 4. Adição de produto a lista de desejo padrão do site

#### 5. Adição de produto a lista de desejo criada pelo usuário
