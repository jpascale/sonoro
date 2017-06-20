rm TPE-POO-Dungeon-1.0-SNAPSHOT-jar-with-dependencies.jar
mvn clean compile assembly:single
mv ./target/TPE-POO-Dungeon-1.0-SNAPSHOT-jar-with-dependencies.jar ./game.jar
