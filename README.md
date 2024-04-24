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

## Assignments

### 01: Merge Sort Files

#### Problem Statement

Inside the folder [/files](./files) there are 2 files
- [in1.txt](./files/in1.txt)
- [in2.txt](./files/in2.txt)

They both contain some numbers (separate numbers in each line).

You have to read both files, merge all the numbers into one sorted array
and then print that into a third file [out.txt](./files/out.txt)

#### Example

Contents of `in1.txt`
```agsl
4
7
2
```
Contents of `in2.txt`
```agsl
45
8
9
```

#### Output
Contents of `out.txt`
```agsl
2
4
7
8
9
45
```

#### Bonus
- Level 1: Make the program work for any number of files.
- Level 2: Make sure that the file read and write operations are on a separate thread
- Level 3: Make sure that the read operations can be all done in parallel (i.e. we are not waiting for file 1 to be read before we read file 2)