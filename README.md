markdown
# Tondeuse Simulation avec Spring Batch

Ce projet est une simulation de tondeuse à gazon utilisant Spring Batch. La tondeuse se déplace sur une grille en suivant des instructions prédéfinies.

## Prérequis

- Java 17 
- Maven 3.6 ou supérieur

## Installation

1. Clonez le dépôt GitHub :
   https://github.com/amenikilani2/tondeuse.git
2. Construisez le projet avec Maven :
   mvn clean install
## Utilisation

Pour exécuter l'application, utilisez la commande suivante :

sh
java -jar target/tondeuse-0.0.1-SNAPSHOT.jar


## Configuration

La configuration du batch est définie dans la classe `BatchConfig`.

- `TondeuseItemReader` : lit les données de la tondeuse.
- `TondeuseItemProcessor` : traite les commandes de la tondeuse.
- `TondeuseItemWriter` : écrit l'état final de la tondeuse.

## Structure du Projet

- `com.example.tondeuse.model` : contient le modèle de données pour la tondeuse.
- `com.example.tondeuse.reader` : contient le lecteur pour les données de la tondeuse.
- `com.example.tondeuse.processor` : contient le processeur pour les commandes de la tondeuse.
- `com.example.tondeuse.writer` : contient l'écrivain pour l'état final de la tondeuse.
- `com.example.tondeuse.batch` : contient la configuration du batch.

## Tests

Les tests unitaires sont écrits en utilisant JUnit. Vous pouvez exécuter les tests avec Maven :

mvn test


## Déploiement

Pour déployer l'application, vous pouvez construire un fichier JAR exécutable :

mvn clean package


Puis, exécutez le fichier JAR sur votre serveur ou machine cible :

java -jar target/tondeuse-0.0.1-SNAPSHOT.jar

## Auteur
Ameni Kilani (https://github.com/amenikilani2)