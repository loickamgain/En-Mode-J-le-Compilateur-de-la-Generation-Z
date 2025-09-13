# Syntaxe et Sémantique des Langages - INFOB314 et IHDCB332
# Template du Projet Compilateur (En-Mode-J)

## Présentation

Développement d’un compilateur complet en Java pour En-Mode-J (EMJ), un langage spécifique basé sur des émojis pour programmer les robots éducatifs Cutebot. Le projet a couvert toutes les étapes de la compilation : conception d’une grammaire ANTLR, analyse lexicale/syntaxique, mise en place d’une table des symboles et d’un visiteur pour les vérifications sémantiques, puis génération de code MicroPython exécutable sur microcontrôleurs Micro:bit. La qualité a été assurée par des tests unitaires (JUnit), une intégration continue (Jenkins) et un suivi collaboratif sur GitHub.

### Compétences : Java · ANTLR · Compilation · JUnit · Jenkins · Maven · GitHub · Travail d’équipe · Communication · Organisation
## Mise en Place du Projet

1. Télécharger IntelliJ IDEA - Community Edition
- Version utilisée : 2023.3.5
- URL : https://www.jetbrains.com/idea/download/other.html

2. Télécharger Maven
- Version utilisée : 3.9.6
- URL : https://maven.apache.org/download.cgi
- Il ne faut pas oublier d'ajouter le folder `bin` de `apache-maven-x.x.x` dans la variable d'environnement `PATH`

3. Télécharger le template du projet de Syntaxe et Sémantique, avec le bon fichier de configuration `pom.xml` (est inclus dans le présent projet)

4. Lorsque tous les téléchargements sont effectués, il faut
- Ouvrir le projet dans IntelliJ IDEA
- Dans IntelliJ IDEA, aller dans `File -> New Projects Setup -> Structure`
- Dans le champ `SDK`, cliquer sur `Download JDK...`
- Dans le champ `Version`, indiquer `1.8` (les champs `Vendor` et `Location` sont au choix) et puis cliquer sur `Download`
- Fermer et revenir au projet ; IntelliJ IDEA proposera de configurer le JDK du projet à celui-ci

5. Toujours dans IntelliJ IDEA, aller dans `File -> Settings -> Plugins` et installer `ANTLR v4` de Terence Parr

6. Mettre en place maven en exécutant les commandes suivantes :

```shell
mvn clean
mvn compile
```

Il se peut que vous ayez des erreurs d'import de EMJLexer/EMJParser. Dans ce cas, exécutez une ou plusieurs des commandes suivantes : `mvn clean install`, `mvn dependency:resolve`, `mvn generate-sources`.

Se cela ne fonctionne toujours pas, utilisez l'interface Maven dans IntelliJ (en haut à droite) et appuyez sur `Generate Sources and Update Folders For All Projects`.

7. Le projet est maintenant mis en place, et est compatible avec les tests en local et sur Jenkins

8. Ne pas oublier de push les changements du projet sur le repository GitHub avant de lancer un build sur Jenkins

### Tests du Projet en Local

Exécuter les commandes suivantes :
```shell
mvn clean
mvn compile
mvn "-Dtest=TEST_1,TEST_2,..." test
```

La console va exécuter les tests spécifiés, et affichera les résultats correspondants.
