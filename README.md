# Syntax and Semantics of Programming Languages – INFOB314
# Compiler Project Template (En-Mode-J)

## Presentation

Development of a complete compiler in Java for En-Mode-J (EMJ), a domain-specific language based on emojis for programming Cutebot educational robots. The project covered all stages of compilation: ANTLR grammar design, lexical/syntactic analysis, implementation of a symbol table and a visitor for semantic checks, followed by code generation in MicroPython executable on Micro:bit microcontrollers. Quality assurance was ensured through unit testing (JUnit), continuous integration (Jenkins), and collaborative version control on GitHub.

### Skills: Java · ANTLR · Compilation · JUnit · Jenkins · Maven · GitHub · Teamwork · Communication · Organization

## Project Setup

1. Download IntelliJ IDEA – Community Edition
- Version used: 2023.3.5
- URL: https://www.jetbrains.com/idea/download/other.html

2. Download Maven
- Version used: 3.9.6
- URL: https://maven.apache.org/download.cgi
- Do not forget to add the `bin` folder of `apache-maven-x.x.x` to the `PATH` environment variable

3. Download the Syntax and Semantics project template, including the proper `pom.xml` configuration file (already included in this project)

4. Once all downloads are completed:
- Open the project in IntelliJ IDEA
- In IntelliJ IDEA, go to `File -> New Projects Setup -> Structure`
- In the `SDK` field, click on `Download JDK...`
- In the `Version` field, enter `1.8` (the `Vendor` and `Location` fields are optional), then click `Download`
- Close and return to the project; IntelliJ IDEA will suggest configuring the project JDK with the downloaded one

5. Still in IntelliJ IDEA, go to `File -> Settings -> Plugins` and install `ANTLR v4` by Terence Parr

6. Set up Maven by running the following commands:
```shell
mvn clean
mvn compile
mvn "-Dtest=TEST_1,TEST_2,..." test
```

The console will run the specified tests, and display the corresponding results.
