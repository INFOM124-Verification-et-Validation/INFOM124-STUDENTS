# Some useful commands for the terminal

## Reports
To generate all the analysis reports (Checkstyle, PMD, SpotBugs, JaCoCo, PIT), execute the following command (with `./mvnw`, `mvnw.cmd` or `mvn`):

`./mvnw clean test org.pitest:pitest-maven:mutationCoverage site`

