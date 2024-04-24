# Basic Java Project

## Build

### Create Jar

```
bash ./gradlew build
```

The jar would be generated in build/libs folder

### Creating fat Jars

A fat jar is jar file that includes all the required libraries inside it.
Fat jars are easy to distribute and deploy as they do not require anything other
than a working Java Runtime Environment to run.

Add this to `build.gradle`

```
jar {
    duplicatesStrategy(DuplicatesStrategy.EXCLUDE)
    manifest {
        attributes(
                'Main-Class': 'com.dinesh.Main'
        )
    }
    from {
        configurations.runtimeClasspath.collect { it.isDirectory() ? it : zipTree(it) }
    }
}
```

Build and run jar file

```agsl
./gradlew build
java -jar build/libs/java-refresher-1.0-SNAPSHOT.jar
```