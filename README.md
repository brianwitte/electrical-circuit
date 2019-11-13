# electrical-circuit

1. Install maven here -> https://maven.apache.org/install.html


2. Run Maven
```
mvn compile exec:java
```

3. Expected output:
```
buoy49 @ machine ~/work/electrical-circuit
└─ $ ▶ mvn compile exec:java
[INFO] Scanning for projects...
[WARNING]
[WARNING] Some problems were encountered while building the effective model for com.technik.circuit:electrical-circuit:jar:1.0-SNAPSHOT
[WARNING] 'build.plugins.plugin.(groupId:artifactId)' must be unique but found duplicate declaration of plugin org.apache.maven.plugins:maven-compiler-plugin @ line 117, column 21
[WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-jar-plugin is missing. @ line 128, column 21
[WARNING]
[WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
[WARNING]
[WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
[WARNING]
[INFO]
[INFO] ---------------< com.technik.circuit:electrical-circuit >---------------
[INFO] Building electrical-circuit 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- build-helper-maven-plugin:1.7:add-source (add-source) @ electrical-circuit ---
[INFO] Source directory: /Users/buoy49/work/electrical-circuit/src/main/generated-sources added.
[INFO]
[INFO] --- antlr4-maven-plugin:4.1:antlr4 (default) @ electrical-circuit ---
[INFO] ANTLR 4: Processing source directory /Users/buoy49/work/electrical-circuit/src/main/java
[INFO] Processing grammar: com/technik/circuit/Calculate.g4
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ electrical-circuit ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/buoy49/work/electrical-circuit/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:2.3.2:compile (default-compile) @ electrical-circuit ---
[INFO] Compiling 8 source files to /Users/buoy49/work/electrical-circuit/target/classes
[INFO]
[INFO] >>> exec-maven-plugin:1.2.1:java (default-cli) > validate @ electrical-circuit >>>
[INFO]
[INFO] <<< exec-maven-plugin:1.2.1:java (default-cli) < validate @ electrical-circuit <<<
[INFO]
[INFO]
[INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ electrical-circuit ---

********************
Flat Tree structure:
********************

(expression (multiplyingExpression (powExpression (signedAtom (atom (variable R1))))) + (multiplyingExpression (powExpression (signedAtom (atom (variable L1))))) + (multiplyingExpression (powExpression (signedAtom (atom (variable C1))))) + (multiplyingExpression (powExpression (signedAtom (atom ( (expression (multiplyingExpression (powExpression (signedAtom (atom ( (expression (multiplyingExpression (powExpression (signedAtom (atom ( (expression (multiplyingExpression (powExpression (signedAtom (atom (variable R2)))) * (powExpression (signedAtom (atom (variable L2)))))) ))))) + (multiplyingExpression (powExpression (signedAtom (atom (variable C2))))) + (multiplyingExpression (powExpression (signedAtom (atom (variable R3)))))) )))) * (powExpression (signedAtom (atom (variable R4)))))) ))))) + (multiplyingExpression (powExpression (signedAtom (atom (variable L3))))) + (multiplyingExpression (powExpression (signedAtom (atom (variable C3))))))

**********************
Nested Tree structure:
**********************

expression:
  multiplyingExpression:
    powExpression:
      signedAtom:
        atom:
          variable: R1
  +
  multiplyingExpression:
    powExpression:
      signedAtom:
        atom:
          variable: L1
  +
  multiplyingExpression:
    powExpression:
      signedAtom:
        atom:
          variable: C1
  +
  multiplyingExpression:
    powExpression:
      signedAtom:
        atom: (
          expression:
            multiplyingExpression:
              powExpression:
                signedAtom:
                  atom: (
                    expression:
                      multiplyingExpression:
                        powExpression:
                          signedAtom:
                            atom: (
                              expression:
                                multiplyingExpression:
                                  powExpression:
                                    signedAtom:
                                      atom:
                                        variable: R2
                                  *
                                  powExpression:
                                    signedAtom:
                                      atom:
                                        variable: L2
                              )
                      +
                      multiplyingExpression:
                        powExpression:
                          signedAtom:
                            atom:
                              variable: C2
                      +
                      multiplyingExpression:
                        powExpression:
                          signedAtom:
                            atom:
                              variable: R3
                    )
              *
              powExpression:
                signedAtom:
                  atom:
                    variable: R4
          )
  +
  multiplyingExpression:
    powExpression:
      signedAtom:
        atom:
          variable: L3
  +
  multiplyingExpression:
    powExpression:
      signedAtom:
        atom:
          variable: C3

```