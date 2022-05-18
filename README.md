# PABAM
Privacy Analysis for Biometric API Usage (PABAU).

Description
------------
PABAM adopted [SWAN](https://github.com/secure-software-engineering/swan), a machine-learning approach for detection of methods of interest for security in Java libraries to automatically categorise methods in biometric APIs based on their actions


Main contributors:
* Feiyang Tang (feiyang@nr.no)
* Amina Bassit (a.bassit@utwente.nl)

How do I get started with SWAN?
-------------
The easiest way to get started with SWAN is to use the pre-built binary from the newest Release. After downloading the necessary files, we can run the JAR file with this command: 

<code>java -jar swan-pipeline/target/swan-<version>-jar-with-dependencies.jar -output <output-directory></code>

This command runs the application and stores the application's output in the specified output directory. Below are some of the most common command line options. The complete list of command line options can be viewed by providing the <code>-h</code> or <code>-help</code> command line option.


| Parameter        | Description    |
| -------------------------- |:---------------------------------------|
| <code>-train</code> or <code>-train-data</code>       | Path to training JAR/class files. Default: Path to [/input/train-data](./swan-pipeline/src/main/resources/input/train-data)| 
| <code>-d</code> or <code>-dataset</code>       | Path to JSON file that contains training examples. Default: Path to [swan-dataset.json](./swan-pipeline/src/main/resources/input/swan-dataset.json) |
| <code>-s</code> or <code>-srm</code>       | List of security-relevant types that should be classified. Options: <code>all</code>, <code>source</code>, <code>sink</code>, <code>sanitizer</code>, <code>authentication</code>. Default: <code>all</code> | 
| <code>-c</code> or <code>-cwe</code>       | List of CWE types that should be classified. Options: <code>cwe078</code>, <code>cwe079</code>, s<code>cwe089</code>, <code>cwe306</code>, <code>cwe601</code>, <code>cwe862</code> and <code>cwe863</code>. Default: <code>all</code> | 


How do I build SWAN?
-------------
If you downloaded SWAN as a compressed release (e.g. .zip or .tar.gz), you can use <code>mvn package</code> to package the project. Alternatively, you can import the project directly into your IDE from the repository and package the project via the terminal or the Maven plugin in your IDE. 


