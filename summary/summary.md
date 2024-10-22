<a id="top"></a>

<p style="font-size: 24px;"><img src="./qct-icons/transform-logo.svg" style="margin-right: 15px; vertical-align: middle;"></img><b>Code Transformation Summary by Amazon Q </b></p>
<p><img src="./qct-icons/transform-variables-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Lines of code in your application: 267359 <p>
<p><img src="./qct-icons/transform-clock-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Transformation duration: 147 min(s) <p>
<p><img src="./qct-icons/transform-dependencies-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned dependencies replaced: 0 of 0 <p>
<p><img src="./qct-icons/transform-dependencyAnalyzer-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Additional dependencies added: 222 <p>
<p><img src="./qct-icons/transform-smartStepInto-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned deprecated code instances replaced: 43 of 99 <p>
<p><img src="./qct-icons/transform-listFiles-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Files changed: 1032 <p>
<p><img src="./qct-icons/transform-build-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Build status in Java 17: <span style="color: #CCCC00">PARTIALLY_SUCCEEDED</span> <p>

### Table of Contents

1. <a href="#build-log-summary">Build log summary</a> 
1. <a href="#planned-dependencies-replaced">Planned dependencies replaced</a> 
1. <a href="#additional-dependencies-added">Additional dependencies added</a> 
1. <a href="#deprecated-code-replaced">Deprecated code replaced</a> 
1. <a href="#other-changes">Other changes</a> 
1. <a href="#all-files-changed">All files changed</a> 
1. <a href="#next-steps">Next steps</a> 


### Build log summary <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="build-log-summary"></a>

Amazon Q could not build the upgraded code in Java 17. The following build log snippet that shows the errors Amazon Q encountered during the build log. To view the full build log, open [`buildCommandOutput.log`](./buildCommandOutput.log)

```
The Maven build failed due to a missing dependency version for javax.xml.bind:jaxb-api in the POM file at line 143. There was an error processing 1 project due to this missing dependency version. The full stack trace and debug logging can be viewed by re-running Maven with the -e and -X switches.
```


### Planned dependencies replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="planned-dependencies-replaced"></a>

Amazon Q updated the following dependencies that it identified in the transformation plan

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|


### Additional dependencies added <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="additional-dependencies-added"></a>

Amazon Q updated the following additional dependencies during the upgrade

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `aopalliance:aopalliance` | Removed | 1.0 | - |
| `asm:asm-all` | Updated | 3.2 | 20070324 |
| `be.ceau:chart` | Updated | 2.2.0 | 2.7.0 |
| `ch.qos.logback:logback-classic` | Updated | 1.3.14 | 1.5.6 |
| `ch.qos.logback:logback-core` | Updated | 1.3.14 | 1.5.6 |
| `ch.qos.reload4j:reload4j` | Updated | 1.2.19 | 1.2.25 |
| `com.amazonaws:aws-java-sdk-kms` | Updated | 1.12.765 | 1.12.757 |
| `com.amazonaws:aws-java-sdk-logs` | Updated | 1.12.765 | 1.12.757 |
| `com.carrotsearch:hppc` | Updated | 0.8.0 | 0.10.0 |
| `com.fasterxml.jackson.core:jackson-annotations` | Updated | 2.11.3 | 2.17.2 |
| `com.fasterxml.jackson.core:jackson-core` | Updated | 2.11.3 | 2.17.2 |
| `com.fasterxml.jackson.core:jackson-databind` | Updated | 2.11.3 | 2.17.2 |
| `com.fasterxml.jackson.jakarta.rs:jackson-jakarta-rs-base` | Added | - | 2.17.2 |
| `com.fasterxml.jackson.jakarta.rs:jackson-jakarta-rs-json-provider` | Added | - | 2.17.2 |
| `com.fasterxml.jackson.jaxrs:jackson-jaxrs-base` | Removed | 2.11.3 | - |
| `com.fasterxml.jackson.jaxrs:jackson-jaxrs-json-provider` | Removed | 2.17.2 | - |
| `com.fasterxml.woodstox:woodstox-core` | Updated | 5.4.0 | 7.0.0 |
| `com.github.eirslett:frontend-maven-plugin` | Updated | 1.12.1 | 1.15.0 |
| `com.github.spotbugs:spotbugs-maven-plugin` | Updated | 4.7.3.5 | 4.8.6.2 |
| `com.google.cloud:google-cloud-kms` | Updated | 2.3.0 | 2.49.0 |
| `com.google.code.findbugs:jsr305` | Updated | 1.3.9 | 3.0.2 |
| `com.google.code.gson:gson` | Updated | - | 2.11.0 |
| `com.google.inject:guice` | Updated | 4.2.2 | 7.0.0 |
| `com.google.protobuf:protobuf-java` | Updated | 3.19.6 | 4.27.2 |
| `com.google.protobuf:protobuf-java-util` | Updated | 3.19.6 | 4.27.2 |
| `com.googlecode.owasp-java-html-sanitizer:owasp-java-html-sanitizer` | Updated | 20211018.2 | 20240325.1 |
| `com.hortonworks.registries:common-auth` | Updated | 0.9.1 | 1.0.0 |
| `com.hortonworks.registries:schema-registry-client` | Updated | 0.9.1 | 1.0.0 |
| `com.hortonworks.registries:schema-registry-webservice` | Updated | 0.9.1 | 1.0.0 |
| `com.microsoft.azure:adal4j` | Updated | 1.6.4 | 1.6.7 |
| `com.microsoft.azure:azure` | Updated | 1.22.0 | 1.41.4 |
| `com.microsoft.azure:azure-client-runtime` | Updated | 1.6.7 | 1.7.14 |
| `com.microsoft.azure:azure-keyvault` | Updated | 1.2.1 | 1.2.6 |
| `com.microsoft.azure:azure-mgmt-keyvault` | Updated | 1.22.0 | 1.41.4 |
| `com.microsoft.rest:client-runtime` | Updated | 1.6.7 | 1.7.14 |
| `com.mysql:mysql-connector-j` | Added | - | 9.0.0 |
| `com.nimbusds:nimbus-jose-jwt` | Updated | 9.31 | 9.40 |
| `com.sun.jersey.contribs:jersey-multipart` | Updated | 1.19 | 1.19.4 |
| `com.sun.xml.bind:jaxb-impl` | Removed | 2.3.3 | - |
| `com.tencentcloudapi:tencentcloud-sdk-java-kms` | Updated | 3.1.322 | 3.1.977 |
| `com.webcohesion.enunciate:enunciate-core-annotations` | Updated | 2.13.2 | - |
| `com.zaxxer:HikariCP` | Updated | 4.0.3 | 5.1.0 |
| `commons-cli:commons-cli` | Updated | 1.3.1 | 1.6.0 |
| `commons-codec:commons-codec` | Updated | 1.15 | 1.16.1 |
| `commons-io:commons-io` | Updated | 2.11.0 | 2.16.1 |
| `commons-lang:commons-lang` | Updated | 2.6 | 20030203.000129 |
| `commons-logging:commons-logging` | Updated | 1.2 | 1.3.3 |
| `commons-net:commons-net` | Updated | 3.9.0 | 3.11.1 |
| `dnsjava:dnsjava` | Updated | 2.1.7 | 3.5.3 |
| `io.airlift:bootstrap` | Updated | 0.192 | 249 |
| `io.airlift:configuration` | Updated | 0.192 | 249 |
| `io.airlift:log` | Updated | 0.192 | 249 |
| `io.netty:netty-all` | Updated | 4.1.100.Final | 4.1.106.Final |
| `io.opentelemetry:opentelemetry-semconv` | Updated | 1.26.0-alpha | 0.14.1 |
| `io.prestosql:presto-jdbc` | Updated | 333 | 350 |
| `io.prestosql:presto-spi` | Updated | 333 | 350 |
| `io.rest-assured:rest-assured` | Updated | 3.0.3 | 5.5.0 |
| `jakarta.annotation:jakarta.annotation-api` | Added | - | 3.0.0 |
| `jakarta.inject:jakarta.inject-api` | Added | - | 2.0.1 |
| `jakarta.persistence:jakarta.persistence-api` | Added | - | 3.2.0 |
| `jakarta.servlet:jakarta.servlet-api` | Added | - | 6.1.0 |
| `jakarta.validation:jakarta.validation-api` | Added | - | 3.1.0 |
| `jakarta.ws.rs:jakarta.ws.rs-api` | Added | - | 4.0.0 |
| `jakarta.xml.bind:jakarta.xml.bind-api` | Added | - | 4.0.2 |
| `javax.persistence:javax.persistence-api` | Added | - | 2.2 |
| `javax.servlet:javax.servlet-api` | Updated | 3.1.0 | 4.0.1 |
| `javax.validation:validation-api` | Removed | 2.0.1.Final | - |
| `javax.ws.rs:javax.ws.rs-api` | Added | - | 2.1.1 |
| `jline:jline` | Updated | 0.9.94 | 2.14.6 |
| `joda-time:joda-time` | Updated | 2.10.6 | 2.12.7 |
| `mysql:mysql-connector-java` | Removed | 5.1.49 | - |
| `net.htmlparser.jericho:jericho-html` | Updated | 3.3 | 3.4 |
| `net.java.dev.jna:jna` | Updated | 5.7.0 | 5.14.0 |
| `net.java.dev.jna:jna-platform` | Updated | 5.7.0 | 5.14.0 |
| `net.minidev:json-smart` | Updated | 2.4.10 | 2.5.1 |
| `net.sf.jopt-simple:jopt-simple` | Updated | 3.2 | 5.0.4 |
| `org.antlr:antlr-runtime` | Updated | 3.5.2 | 3.5.3 |
| `org.apache.atlas:atlas-authorization` | Updated | 2.2.0 | 2.3.0 |
| `org.apache.atlas:atlas-client-v1` | Updated | 2.2.0 | 2.3.0 |
| `org.apache.atlas:atlas-client-v2` | Updated | 2.2.0 | 2.3.0 |
| `org.apache.atlas:atlas-common` | Updated | 2.2.0 | 2.3.0 |
| `org.apache.atlas:atlas-intg` | Updated | 2.2.0 | 2.3.0 |
| `org.apache.atlas:atlas-notification` | Updated | 2.2.0 | 2.3.0 |
| `org.apache.bval:bval-jsr` | Updated | 2.0.0 | 3.0.0 |
| `org.apache.calcite:calcite-linq4j` | Updated | 1.16.0 | 1.37.0 |
| `org.apache.commons:commons-collections4` | Added | - | 4.4 |
| `org.apache.commons:commons-configuration2` | Updated | 2.8.0 | 2.11.0 |
| `org.apache.commons:commons-csv` | Updated | 1.0 | 1.11.0 |
| `org.apache.commons:commons-lang3` | Updated | 3.3.2 | 3.14.0 |
| `org.apache.commons:commons-math` | Removed | 2.2 | - |
| `org.apache.commons:commons-math3` | Added | - | 3.6.1 |
| `org.apache.commons:commons-text` | Updated | 1.10.0 | 1.12.0 |
| `org.apache.curator:curator-client` | Updated | 5.4.0 | 5.7.0 |
| `org.apache.curator:curator-framework` | Updated | 5.4.0 | 5.7.0 |
| `org.apache.curator:curator-recipes` | Updated | 5.4.0 | 5.7.0 |
| `org.apache.curator:curator-test` | Updated | 5.4.0 | 5.7.0 |
| `org.apache.derby:derby` | Updated | 10.14.2.0 | 10.17.1.0 |
| `org.apache.directory.api:api-i18n` | Updated | 1.0.3 | 2.1.6 |
| `org.apache.directory.server:apacheds-core-annotations` | Updated | 2.0.0-M22 | 1.5.7 |
| `org.apache.directory.server:apacheds-core-integ` | Updated | 2.0.0-M22 | 1.5.7 |
| `org.apache.hadoop:hadoop-annotations` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-auth` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-client` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-common` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-hdfs` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-mapreduce-client-core` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-minicluster` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-yarn-api` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hadoop:hadoop-yarn-common` | Updated | 3.3.6 | 3.4.0 |
| `org.apache.hive:hive-common` | Updated | 3.1.3 | 4.0.0 |
| `org.apache.hive:hive-exec` | Updated | 3.1.3 | 4.0.0 |
| `org.apache.hive:hive-jdbc` | Updated | 3.1.3 | 4.0.0 |
| `org.apache.hive:hive-metastore` | Updated | 3.1.3 | 4.0.0 |
| `org.apache.hive:hive-service` | Updated | 3.1.3 | 4.0.0 |
| `org.apache.hive:hive-storage-api` | Updated | 2.7.2 | 4.0.0 |
| `org.apache.httpcomponents.client5:httpclient5` | Added | - | 5.3.1 |
| `org.apache.httpcomponents.core5:httpcore5` | Added | - | 5.3.1 |
| `org.apache.httpcomponents:httpasyncclient` | Updated | 4.1.4 | 4.1.5 |
| `org.apache.httpcomponents:httpclient` | Removed | 4.5.13 | - |
| `org.apache.httpcomponents:httpcore` | Updated | 4.4.14 | 4.4.16 |
| `org.apache.httpcomponents:httpcore-nio` | Updated | 4.4.14 | 4.4.16 |
| `org.apache.httpcomponents:httpmime` | Updated | 4.5.13 | 4.5.14 |
| `org.apache.kafka:kafka-clients` | Updated | 2.8.2 | 3.7.1 |
| `org.apache.kafka:kafka_${scala.binary.version}` | Updated | 2.8.2 | 3.7.1 |
| `org.apache.logging.log4j:log4j-api` | Updated | 2.17.2 | 2.23.1 |
| `org.apache.logging.log4j:log4j-core` | Added | - | 2.24.1 |
| `org.apache.logging.log4j:log4j-to-slf4j` | Updated | 2.17.2 | 2.23.1 |
| `org.apache.lucene:lucene-backward-codecs` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-core` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-grouping` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-highlighter` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-join` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-memory` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-misc` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-queries` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-queryparser` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-sandbox` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-spatial` | Updated | 8.4.0 | 8.4.1 |
| `org.apache.lucene:lucene-spatial-extras` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-spatial3d` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.lucene:lucene-suggest` | Updated | 8.11.3 | 9.11.1 |
| `org.apache.maven.plugins:maven-antrun-plugin` | Updated | 1.7 | - |
| `org.apache.maven.plugins:maven-assembly-plugin` | Updated | 2.6 | 3.7.1 |
| `org.apache.maven.plugins:maven-checkstyle-plugin` | Updated | 3.1.0 | 3.4.0 |
| `org.apache.maven.plugins:maven-clean-plugin` | Updated | 2.6.1 | 3.4.0 |
| `org.apache.maven.plugins:maven-compiler-plugin` | Updated | 3.3 | 3.13.0 |
| `org.apache.maven.plugins:maven-enforcer-plugin` | Updated | 1.4.1 | - |
| `org.apache.maven.plugins:maven-jar-plugin` | Updated | 2.6 | 3.4.2 |
| `org.apache.maven.plugins:maven-pmd-plugin` | Updated | 3.14.0 | 3.23.0 |
| `org.apache.maven.plugins:maven-resources-plugin` | Updated | 2.7 | 3.3.1 |
| `org.apache.maven.plugins:maven-surefire-plugin` | Updated | - | 3.3.0 |
| `org.apache.orc:orc-core` | Updated | 1.5.8 | 2.0.1 |
| `org.apache.orc:orc-shims` | Updated | 1.5.8 | 2.0.1 |
| `org.apache.poi:poi` | Updated | 5.2.2 | 5.3.0 |
| `org.apache.poi:poi-ooxml` | Updated | 5.2.2 | 5.3.0 |
| `org.apache.rat:apache-rat-plugin` | Updated | 0.11 | - |
| `org.apache.solr:solr-core` | Updated | 8.11.3 | 9.6.1 |
| `org.apache.solr:solr-solrj` | Updated | 8.11.3 | 9.6.1 |
| `org.apache.storm:storm-core` | Updated | 1.2.4 | 2.6.2 |
| `org.apache.tez:tez-dag` | Updated | 0.9.1 | 0.10.3 |
| `org.apache.thrift:libthrift` | Updated | 0.14.0 | 0.20.0 |
| `org.apache.tomcat.embed:tomcat-embed-core` | Updated | 8.5.94 | 10.1.25 |
| `org.apache.tomcat.embed:tomcat-embed-el` | Updated | 8.5.94 | 10.1.25 |
| `org.apache.tomcat.embed:tomcat-embed-jasper` | Updated | 8.5.94 | 10.1.25 |
| `org.apache.tomcat.embed:tomcat-embed-websocket` | Updated | 8.5.94 | 10.1.25 |
| `org.apache.tomcat:tomcat-annotations-api` | Updated | 8.5.94 | 10.1.25 |
| `org.apache.tomcat:tomcat-jasper-el` | Updated | 8.5.94 | 10.1.26 |
| `org.apache:apache` | Updated | 20 | 33 |
| `org.codehaus.mojo:exec-maven-plugin` | Updated | 1.6.0 | 3.3.0 |
| `org.codehaus.mojo:native-maven-plugin` | Updated | 1.0-alpha-11 | 1.0-alpha-8 |
| `org.codehaus.woodstox:stax2-api` | Updated | 4.2.1 | 4.2.2 |
| `org.eclipse.jdt.core.compiler:ecj` | Updated | P20140317-1600 | 4.6.1 |
| `org.eclipse.jetty:jetty-client` | Updated | 9.4.49.v20220914 | 12.0.11 |
| `org.eclipse.jetty:jetty-http` | Updated | 9.4.51.v20230217 | 12.0.11 |
| `org.eclipse.jetty:jetty-server` | Updated | 9.4.51.v20230217 | 12.0.11 |
| `org.eclipse.jetty:jetty-util` | Updated | 9.4.51.v20230217 | 12.0.11 |
| `org.eclipse.persistence:eclipselink` | Updated | 2.7.12 | 4.0.3 |
| `org.eclipse.persistence:javax.persistence` | Removed | 2.1.0 | - |
| `org.elasticsearch.client:elasticsearch-rest-client` | Updated | 7.10.2 | 8.14.2 |
| `org.elasticsearch.client:elasticsearch-rest-high-level-client` | Updated | 7.10.2 | 7.17.22 |
| `org.elasticsearch.plugin:aggs-matrix-stats-client` | Updated | 7.10.2 | 7.17.22 |
| `org.elasticsearch.plugin:lang-mustache-client` | Updated | 7.10.2 | 7.17.22 |
| `org.elasticsearch.plugin:parent-join-client` | Updated | 7.10.2 | 7.17.22 |
| `org.elasticsearch.plugin:rank-eval-client` | Updated | 7.10.2 | 7.17.22 |
| `org.elasticsearch:elasticsearch` | Updated | 7.10.2 | 8.14.2 |
| `org.elasticsearch:elasticsearch-core` | Updated | 7.10.2 | 8.14.2 |
| `org.elasticsearch:elasticsearch-secure-sm` | Updated | 7.10.2 | 8.14.2 |
| `org.elasticsearch:elasticsearch-x-content` | Updated | 7.10.2 | 8.14.2 |
| `org.glassfish.hk2.external:cglib` | Updated | 2.2.0-b23 | 2.1.96 |
| `org.glassfish.jaxb:jaxb-runtime` | Updated | 2.3.1 | 4.0.5 |
| `org.glassfish.jersey.core:jersey-client` | Updated | 2.35 | - |
| `org.glassfish:javax.el` | Updated | 3.0.1-b12 | 3.0.0 |
| `org.hamcrest:hamcrest` | Updated | - | 2.2 |
| `org.jacoco:jacoco-maven-plugin` | Updated | 0.8.7 | 0.8.12 |
| `org.junit.jupiter:junit-jupiter` | Added | - | 5.11.3 |
| `org.junit.jupiter:junit-jupiter-api` | Updated | 5.10.0 | 5.10.3 |
| `org.junit.vintage:junit-vintage-engine` | Updated | 5.10.0 | 5.10.3 |
| `org.kohsuke:libpam4j` | Updated | 1.10 | 1.11 |
| `org.mockito:mockito-all` | Removed | 1.10.19 | - |
| `org.mockito:mockito-core` | Updated | 3.0.0 | 5.12.0 |
| `org.mockito:mockito-junit-jupiter` | Updated | 3.0.0 | 5.12.0 |
| `org.scala-lang:scala-library` | Updated | 2.12.10 | 2.13.14 |
| `org.springframework.boot:spring-boot-starter-validation` | Added | - | 3.3.1 |
| `org.springframework.ldap:spring-ldap-core` | Updated | 2.4.1 | 3.2.4 |
| `org.springframework.security:spring-security-acl` | Updated | 5.7.12 | 6.3.1 |
| `org.springframework.security:spring-security-config` | Updated | 5.7.12 | 6.3.1 |
| `org.springframework.security:spring-security-core` | Updated | 5.7.12 | 6.3.1 |
| `org.springframework.security:spring-security-ldap` | Updated | 5.7.12 | 6.3.1 |
| `org.springframework.security:spring-security-test` | Updated | 5.7.12 | 6.3.1 |
| `org.springframework.security:spring-security-web` | Updated | 5.7.12 | 6.3.1 |
| `org.springframework:spring-aop` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-beans` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-context` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-context-support` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-core` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-expression` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-jdbc` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-orm` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-test` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-tx` | Updated | 5.3.39 | 6.1.10 |
| `org.springframework:spring-web` | Updated | 5.3.39 | 6.1.10 |
| `org.testng:testng` | Updated | 7.5.1 | 7.10.2 |

### Deprecated code replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="deprecated-code-replaced"></a>


Amazon Q replaced the following instances of deprecated code. An instance with 0 files changed
indicates Amazon Q wasn't able to replace the deprecated code.

| Deprecated code | Files changed |
|----------------|----------------|
| `java.lang.Class.newInstance()` | 23 |
| `java.lang.reflect.AccessibleObject.isAccessible()` | 1 |
| `java.util.Date.Date(String)` | 0 |
| `java.util.Date.Date(int,int,int)` | 0 |
| `java.util.Date.getDate()` | 1 |
| `java.util.Date.getDay()` | 0 |
| `java.util.Date.getHours()` | 1 |
| `java.util.Date.getMinutes()` | 1 |
| `java.util.Date.getMonth()` | 0 |
| `java.util.Date.getSeconds()` | 0 |
| `java.util.Date.getYear()` | 0 |
| `java.util.Date.setYear(int)` | 1 |



### Other changes <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="other-changes"></a>



### All files changed <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="all-files-changed"></a>

| File | Action |
|----------------|--------|
| [.github/workflows/maven.yml](../.github/workflows/maven.yml) | Updated |
| [.mvn/wrapper/maven-wrapper.properties](../.mvn/wrapper/maven-wrapper.properties) | Updated |
| [agents-audit/pom.xml](../agents-audit/pom.xml) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/destination/AmazonCloudWatchAuditDestination.java](../agents-audit/src/main/java/org/apache/ranger/audit/destination/AmazonCloudWatchAuditDestination.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/destination/ElasticSearchAuditDestination.java](../agents-audit/src/main/java/org/apache/ranger/audit/destination/ElasticSearchAuditDestination.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/destination/SolrAuditDestination.java](../agents-audit/src/main/java/org/apache/ranger/audit/destination/SolrAuditDestination.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/model/AuthzAuditEvent.java](../agents-audit/src/main/java/org/apache/ranger/audit/model/AuthzAuditEvent.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/AsyncAuditProvider.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/AsyncAuditProvider.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/AuditProviderFactory.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/AuditProviderFactory.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/AuditWriterFactory.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/AuditWriterFactory.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/BaseAuditHandler.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/BaseAuditHandler.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/BufferedAuditProvider.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/BufferedAuditProvider.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/MiscUtil.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/MiscUtil.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/MultiDestAuditProvider.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/MultiDestAuditProvider.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/hdfs/HdfsLogDestination.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/hdfs/HdfsLogDestination.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/provider/kafka/KafkaAuditProvider.java](../agents-audit/src/main/java/org/apache/ranger/audit/provider/kafka/KafkaAuditProvider.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditFileCacheProviderSpool.java](../agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditFileCacheProviderSpool.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditFileQueueSpool.java](../agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditFileQueueSpool.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditFileSpool.java](../agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditFileSpool.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditQueue.java](../agents-audit/src/main/java/org/apache/ranger/audit/queue/AuditQueue.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/utils/AbstractRangerAuditWriter.java](../agents-audit/src/main/java/org/apache/ranger/audit/utils/AbstractRangerAuditWriter.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/utils/InMemoryJAASConfiguration.java](../agents-audit/src/main/java/org/apache/ranger/audit/utils/InMemoryJAASConfiguration.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/utils/ORCFileUtil.java](../agents-audit/src/main/java/org/apache/ranger/audit/utils/ORCFileUtil.java) | Updated |
| [agents-audit/src/main/java/org/apache/ranger/audit/utils/RollingTimeUtil.java](../agents-audit/src/main/java/org/apache/ranger/audit/utils/RollingTimeUtil.java) | Updated |
| [agents-audit/src/main/resources/META-INF/persistence.xml](../agents-audit/src/main/resources/META-INF/persistence.xml) | Updated |
| [agents-audit/src/test/java/org/apache/ranger/audit/utils/RangerJSONAuditWriterTest.java](../agents-audit/src/test/java/org/apache/ranger/audit/utils/RangerJSONAuditWriterTest.java) | Updated |
| [agents-common/pom.xml](../agents-common/pom.xml) | Updated |
| [agents-common/src/main/java/org/apache/ranger/admin/client/RangerAdminRESTClient.java](../agents-common/src/main/java/org/apache/ranger/admin/client/RangerAdminRESTClient.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerAdminConfig.java](../agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerAdminConfig.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerChainedPluginConfig.java](../agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerChainedPluginConfig.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerConfiguration.java](../agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerConfiguration.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerPluginConfig.java](../agents-common/src/main/java/org/apache/ranger/authorization/hadoop/config/RangerPluginConfig.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/authorization/utils/JsonUtils.java](../agents-common/src/main/java/org/apache/ranger/authorization/utils/JsonUtils.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/authorization/utils/StringUtil.java](../agents-common/src/main/java/org/apache/ranger/authorization/utils/StringUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/audit/RangerDefaultAuditHandler.java](../agents-common/src/main/java/org/apache/ranger/plugin/audit/RangerDefaultAuditHandler.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/client/BaseClient.java](../agents-common/src/main/java/org/apache/ranger/plugin/client/BaseClient.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/client/HadoopConfigHolder.java](../agents-common/src/main/java/org/apache/ranger/plugin/client/HadoopConfigHolder.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/client/HadoopException.java](../agents-common/src/main/java/org/apache/ranger/plugin/client/HadoopException.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedFromClusterCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedFromClusterCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedFromClusterTypeCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedFromClusterTypeCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedNotFromClusterCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedNotFromClusterCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedNotFromClusterTypeCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerAccessedNotFromClusterTypeCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerContextAttributeValueInCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerContextAttributeValueInCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerContextAttributeValueNotInCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerContextAttributeValueNotInCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerHiveResourcesAccessedTogetherCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerHiveResourcesAccessedTogetherCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerHiveResourcesNotAccessedTogetherCondition.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerHiveResourcesNotAccessedTogetherCondition.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerIpMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerIpMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerScriptConditionEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerScriptConditionEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerScriptTemplateConditionEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerScriptTemplateConditionEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerTagsAllPresentConditionEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerTagsAllPresentConditionEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerTimeOfDayMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerTimeOfDayMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAbstractContextEnricher.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAbstractContextEnricher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAbstractGeolocationProvider.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAbstractGeolocationProvider.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAdminGdsInfoRetriever.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAdminGdsInfoRetriever.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAdminTagRetriever.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAdminTagRetriever.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAdminUserStoreRetriever.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerAdminUserStoreRetriever.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerFileBasedTagRetriever.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerFileBasedTagRetriever.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerGdsEnricher.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerGdsEnricher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerServiceResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerServiceResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerTagEnricher.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerTagEnricher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerTagForEval.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerTagForEval.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerUserStoreEnricher.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerUserStoreEnricher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerUserStoreRefresher.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/RangerUserStoreRefresher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/externalretrievers/GetFromURL.java](../agents-common/src/main/java/org/apache/ranger/plugin/contextenricher/externalretrievers/GetFromURL.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/errors/ValidationErrorCode.java](../agents-common/src/main/java/org/apache/ranger/plugin/errors/ValidationErrorCode.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/geo/GeolocationMetadata.java](../agents-common/src/main/java/org/apache/ranger/plugin/geo/GeolocationMetadata.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/geo/RangerGeolocationData.java](../agents-common/src/main/java/org/apache/ranger/plugin/geo/RangerGeolocationData.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/geo/RangerGeolocationDatabase.java](../agents-common/src/main/java/org/apache/ranger/plugin/geo/RangerGeolocationDatabase.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/geo/ValuePrinter.java](../agents-common/src/main/java/org/apache/ranger/plugin/geo/ValuePrinter.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerDatasetHeader.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerDatasetHeader.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerGds.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerGds.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPluginInfo.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPluginInfo.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPolicy.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPolicy.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPolicyResourceSignature.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPolicyResourceSignature.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPrincipal.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerPrincipal.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerRole.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerRole.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerServerHealth.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerServerHealth.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/RangerService.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/RangerService.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerPolicyValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerPolicyValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerRoleValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerRoleValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerSecurityZoneValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerSecurityZoneValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerServiceDefHelper.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerServiceDefHelper.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerServiceDefValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerServiceDefValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerServiceValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerServiceValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerValidityScheduleValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerValidityScheduleValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerZoneResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/RangerZoneResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/model/validation/ValidationFailureDetails.java](../agents-common/src/main/java/org/apache/ranger/plugin/model/validation/ValidationFailureDetails.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/PolicyEngine.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/PolicyEngine.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessRequestImpl.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessRequestImpl.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessRequestWrapper.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessRequestWrapper.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessResourceImpl.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessResourceImpl.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessResourceReadOnly.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessResourceReadOnly.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessResult.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerAccessResult.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPluginContext.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPluginContext.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPolicyEngineImpl.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPolicyEngineImpl.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPolicyEngineOptions.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPolicyEngineOptions.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPolicyRepository.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerPolicyRepository.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerRequestScriptEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerRequestScriptEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerResourceACLs.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerResourceACLs.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerResourceTrie.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerResourceTrie.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerSecurityZoneMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerSecurityZoneMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerTagAccessRequest.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/RangerTagAccessRequest.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsDataShareEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsDataShareEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsDatasetEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsDatasetEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsPolicyEngine.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsPolicyEngine.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsProjectEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsProjectEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsSharedResourceEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyengine/gds/GdsSharedResourceEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerAbstractPolicyEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerAbstractPolicyEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerAbstractPolicyItemEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerAbstractPolicyItemEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerAuditPolicyEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerAuditPolicyEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerCustomConditionEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerCustomConditionEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultDataMaskPolicyItemEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultDataMaskPolicyItemEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultPolicyEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultPolicyEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultPolicyItemEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultPolicyItemEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerOptimizedPolicyEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerOptimizedPolicyEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerPolicyEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerPolicyEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerValidityScheduleEvaluator.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyevaluator/RangerValidityScheduleEvaluator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/policyresourcematcher/RangerDefaultPolicyResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/policyresourcematcher/RangerDefaultPolicyResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerAbstractResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerAbstractResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerDefaultResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerDefaultResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerPathResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerPathResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerURLResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/RangerURLResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/ResourceMatcher.java](../agents-common/src/main/java/org/apache/ranger/plugin/resourcematcher/ResourceMatcher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/service/RangerAuthContext.java](../agents-common/src/main/java/org/apache/ranger/plugin/service/RangerAuthContext.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/service/RangerBasePlugin.java](../agents-common/src/main/java/org/apache/ranger/plugin/service/RangerBasePlugin.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/service/RangerBaseService.java](../agents-common/src/main/java/org/apache/ranger/plugin/service/RangerBaseService.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/service/RangerDefaultRequestProcessor.java](../agents-common/src/main/java/org/apache/ranger/plugin/service/RangerDefaultRequestProcessor.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/service/RangerDefaultService.java](../agents-common/src/main/java/org/apache/ranger/plugin/service/RangerDefaultService.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/service/ResourceLookupContext.java](../agents-common/src/main/java/org/apache/ranger/plugin/service/ResourceLookupContext.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/AbstractPredicateUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/AbstractPredicateUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/AbstractServiceStore.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/AbstractServiceStore.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/EmbeddedServiceDefsUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/EmbeddedServiceDefsUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/RangerServiceResourceSignature.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/RangerServiceResourceSignature.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/RolePredicateUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/RolePredicateUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/SecurityZonePredicateUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/SecurityZonePredicateUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/ServicePredicateUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/ServicePredicateUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/TagPredicateUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/TagPredicateUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/TagValidator.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/TagValidator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/store/file/GeolocationFileStore.java](../agents-common/src/main/java/org/apache/ranger/plugin/store/file/GeolocationFileStore.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/GraalScriptEngineCreator.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/GraalScriptEngineCreator.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/JavaScriptEdits.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/JavaScriptEdits.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/KeySearchFilter.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/KeySearchFilter.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/PerfDataRecorder.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/PerfDataRecorder.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/PolicyRefresher.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/PolicyRefresher.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerAccessRequestUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerAccessRequestUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerCommonConstants.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerCommonConstants.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerMetricsUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerMetricsUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerPerfTracer.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerPerfTracer.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerPolicyDeltaUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerPolicyDeltaUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRESTClient.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRESTClient.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRESTUtils.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRESTUtils.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRequestedResources.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRequestedResources.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerResourceEvaluatorsRetriever.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerResourceEvaluatorsRetriever.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRolesProvider.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRolesProvider.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRolesUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerRolesUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerServiceNotFoundException.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerServiceNotFoundException.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerServiceTagsDeltaUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerServiceTagsDeltaUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerTimeRangeChecker.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerTimeRangeChecker.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerUserStore.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerUserStore.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/RangerUserStoreUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/RangerUserStoreUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/SearchFilter.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/SearchFilter.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/ServiceDefUtil.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/ServiceDefUtil.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/plugin/util/ServicePolicies.java](../agents-common/src/main/java/org/apache/ranger/plugin/util/ServicePolicies.java) | Updated |
| [agents-common/src/main/java/org/apache/ranger/services/tag/RangerServiceTag.java](../agents-common/src/main/java/org/apache/ranger/services/tag/RangerServiceTag.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/authorization/utils/TestStringUtil.java](../agents-common/src/test/java/org/apache/ranger/authorization/utils/TestStringUtil.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerCustomConditionMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerCustomConditionMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerIpMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerIpMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerRequestScriptEvaluatorTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerRequestScriptEvaluatorTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerSimpleMatcher.java](../agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerSimpleMatcher.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerTimeOfDayMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/conditionevaluator/RangerTimeOfDayMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/contextenricher/TestTagEnricher.java](../agents-common/src/test/java/org/apache/ranger/plugin/contextenricher/TestTagEnricher.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/errors/TestValidationErrorCode.java](../agents-common/src/test/java/org/apache/ranger/plugin/errors/TestValidationErrorCode.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerHealth.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerHealth.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerPolicy.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerPolicy.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerPolicyResourceSignature.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerPolicyResourceSignature.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerService.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/TestRangerService.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/RangerSecurityZoneValidatorTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/RangerSecurityZoneValidatorTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestDirectedGraph.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestDirectedGraph.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerPolicyValidator.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerPolicyValidator.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerServiceDefHelper.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerServiceDefHelper.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerServiceDefValidator.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerServiceDefValidator.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerServiceValidator.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerServiceValidator.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerValidator.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/TestRangerValidator.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/model/validation/ValidationTestUtils.java](../agents-common/src/test/java/org/apache/ranger/plugin/model/validation/ValidationTestUtils.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestCacheMap.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestCacheMap.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPathResourceTrie.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPathResourceTrie.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyACLs.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyACLs.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyEngine.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyEngine.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyEngineComparison.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyEngineComparison.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyEngineForDeltas.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestPolicyEngineForDeltas.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestProjectProvider.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestProjectProvider.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestRangerAuthContext.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestRangerAuthContext.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestRangerPluginCapability.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestRangerPluginCapability.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestRangerSecurityZoneMatcher.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/TestRangerSecurityZoneMatcher.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyengine/gds/TestGdsPolicyEngine.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyengine/gds/TestGdsPolicyEngine.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultPolicyEvaluatorTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/policyevaluator/RangerDefaultPolicyEvaluatorTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerAbstractResourceMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerAbstractResourceMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerDefaultResourceMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerDefaultResourceMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerPathResourceMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerPathResourceMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerURLResourceMatcherTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/RangerURLResourceMatcherTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/TestDefaultPolicyResourceMatcher.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/TestDefaultPolicyResourceMatcher.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/TestDefaultPolicyResourceMatcherForPolicy.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/TestDefaultPolicyResourceMatcherForPolicy.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/TestResourceMatcher.java](../agents-common/src/test/java/org/apache/ranger/plugin/resourcematcher/TestResourceMatcher.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/service/TestRangerBasePlugin.java](../agents-common/src/test/java/org/apache/ranger/plugin/service/TestRangerBasePlugin.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/JavaScriptEditsTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/JavaScriptEditsTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/MacroProcessorTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/MacroProcessorTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/PasswordUtilsTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/PasswordUtilsTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/RangerCacheTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/RangerCacheTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/RangerRequestExprResolverTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/RangerRequestExprResolverTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/RangerTimeRangeCheckerTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/RangerTimeRangeCheckerTest.java) | Updated |
| [agents-common/src/test/java/org/apache/ranger/plugin/util/ServiceDefUtilTest.java](../agents-common/src/test/java/org/apache/ranger/plugin/util/ServiceDefUtilTest.java) | Updated |
| [agents-cred/pom.xml](../agents-cred/pom.xml) | Updated |
| [agents-cred/src/main/java/org/apache/ranger/authorization/credutils/CredentialsProviderUtil.java](../agents-cred/src/main/java/org/apache/ranger/authorization/credutils/CredentialsProviderUtil.java) | Updated |
| [agents-cred/src/main/java/org/apache/ranger/authorization/credutils/kerberos/KerberosCredentialsProvider.java](../agents-cred/src/main/java/org/apache/ranger/authorization/credutils/kerberos/KerberosCredentialsProvider.java) | Updated |
| [agents-cred/src/test/java/org/apache/ranger/authorization/hadoop/utils/RangerCredentialProviderTest.java](../agents-cred/src/test/java/org/apache/ranger/authorization/hadoop/utils/RangerCredentialProviderTest.java) | Updated |
| [agents-installer/pom.xml](../agents-installer/pom.xml) | Updated |
| [credentialbuilder/pom.xml](../credentialbuilder/pom.xml) | Updated |
| [distro/pom.xml](../distro/pom.xml) | Updated |
| [docs/pom.xml](../docs/pom.xml) | Updated |
| [embeddedwebserver/pom.xml](../embeddedwebserver/pom.xml) | Updated |
| [embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/ElasticSearchIndexBootStrapper.java](../embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/ElasticSearchIndexBootStrapper.java) | Updated |
| [embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/EmbeddedServer.java](../embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/EmbeddedServer.java) | Updated |
| [embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/EmbeddedServerMetricsCollector.java](../embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/EmbeddedServerMetricsCollector.java) | Updated |
| [embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/EmbeddedServerUtil.java](../embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/EmbeddedServerUtil.java) | Updated |
| [embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/SolrCollectionBootstrapper.java](../embeddedwebserver/src/main/java/org/apache/ranger/server/tomcat/SolrCollectionBootstrapper.java) | Updated |
| [hbase-agent/pom.xml](../hbase-agent/pom.xml) | Updated |
| [hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/AuthorizationSession.java](../hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/AuthorizationSession.java) | Updated |
| [hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/HbaseAuthUtilsImpl.java](../hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/HbaseAuthUtilsImpl.java) | Updated |
| [hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/RangerAuthorizationCoprocessor.java](../hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/RangerAuthorizationCoprocessor.java) | Updated |
| [hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/RangerHBaseResource.java](../hbase-agent/src/main/java/org/apache/ranger/authorization/hbase/RangerHBaseResource.java) | Updated |
| [hbase-agent/src/main/java/org/apache/ranger/services/hbase/RangerServiceHBase.java](../hbase-agent/src/main/java/org/apache/ranger/services/hbase/RangerServiceHBase.java) | Updated |
| [hbase-agent/src/main/java/org/apache/ranger/services/hbase/client/HBaseClient.java](../hbase-agent/src/main/java/org/apache/ranger/services/hbase/client/HBaseClient.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/AuthorizationSessionTest.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/AuthorizationSessionTest.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/ColumnIteratorTest.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/ColumnIteratorTest.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/HBaseRangerAuthorizationTest.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/HBaseRangerAuthorizationTest.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/HbaseAuthUtilsImplTest.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/HbaseAuthUtilsImplTest.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/RangerAuthorizationCoprocessorTest.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/RangerAuthorizationCoprocessorTest.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/RangerAuthorizationFilterTest.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/RangerAuthorizationFilterTest.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/TestPolicyEngine.java](../hbase-agent/src/test/java/org/apache/ranger/authorization/hbase/TestPolicyEngine.java) | Updated |
| [hbase-agent/src/test/java/org/apache/ranger/services/hbase/TestRangerServiceHBase.java](../hbase-agent/src/test/java/org/apache/ranger/services/hbase/TestRangerServiceHBase.java) | Updated |
| [hdfs-agent/pom.xml](../hdfs-agent/pom.xml) | Updated |
| [hdfs-agent/src/main/java/org/apache/ranger/authorization/hadoop/RangerHdfsAuthorizer.java](../hdfs-agent/src/main/java/org/apache/ranger/authorization/hadoop/RangerHdfsAuthorizer.java) | Updated |
| [hdfs-agent/src/main/java/org/apache/ranger/services/hdfs/RangerServiceHdfs.java](../hdfs-agent/src/main/java/org/apache/ranger/services/hdfs/RangerServiceHdfs.java) | Updated |
| [hdfs-agent/src/main/java/org/apache/ranger/services/hdfs/client/HdfsClient.java](../hdfs-agent/src/main/java/org/apache/ranger/services/hdfs/client/HdfsClient.java) | Updated |
| [hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/HDFSRangerTest.java](../hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/HDFSRangerTest.java) | Updated |
| [hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/RangerAdminClientImpl.java](../hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/RangerAdminClientImpl.java) | Updated |
| [hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/RangerHdfsAuthorizerTest.java](../hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/RangerHdfsAuthorizerTest.java) | Updated |
| [hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/client/HdfsClientTest.java](../hdfs-agent/src/test/java/org/apache/ranger/services/hdfs/client/HdfsClientTest.java) | Updated |
| [hive-agent/pom.xml](../hive-agent/pom.xml) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAccessRequest.java](../hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAccessRequest.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuditHandler.java](../hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuditHandler.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuthorizer.java](../hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuthorizer.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuthorizerBase.java](../hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuthorizerBase.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHivePolicyProvider.java](../hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHivePolicyProvider.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveResource.java](../hive-agent/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveResource.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/services/hive/RangerServiceHive.java](../hive-agent/src/main/java/org/apache/ranger/services/hive/RangerServiceHive.java) | Updated |
| [hive-agent/src/main/java/org/apache/ranger/services/hive/client/HiveClient.java](../hive-agent/src/main/java/org/apache/ranger/services/hive/client/HiveClient.java) | Updated |
| [hive-agent/src/test/java/org/apache/ranger/services/hive/HIVERangerAuthorizerTest.java](../hive-agent/src/test/java/org/apache/ranger/services/hive/HIVERangerAuthorizerTest.java) | Updated |
| [intg/pom.xml](../intg/pom.xml) | Updated |
| [intg/src/main/java/org/apache/ranger/RangerClient.java](../intg/src/main/java/org/apache/ranger/RangerClient.java) | Updated |
| [intg/src/test/java/org/apache/ranger/TestRangerClient.java](../intg/src/test/java/org/apache/ranger/TestRangerClient.java) | Updated |
| [jisql/pom.xml](../jisql/pom.xml) | Updated |
| [kms/pom.xml](../kms/pom.xml) | Updated |
| [kms/src/main/java/jakarta/ws/rs/core/NoContentException.java](../kms/src/main/java/jakarta/ws/rs/core/NoContentException.java) | Added |
| [kms/src/main/java/org/apache/hadoop/crypto/key/AzureKeyVaultClientAuthenticator.java](../kms/src/main/java/org/apache/hadoop/crypto/key/AzureKeyVaultClientAuthenticator.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/DBToAzureKeyVault.java](../kms/src/main/java/org/apache/hadoop/crypto/key/DBToAzureKeyVault.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/JKS2RangerUtil.java](../kms/src/main/java/org/apache/hadoop/crypto/key/JKS2RangerUtil.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/Ranger2JKSUtil.java](../kms/src/main/java/org/apache/hadoop/crypto/key/Ranger2JKSUtil.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerAWSKMSProvider.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerAWSKMSProvider.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerAzureKeyVaultKeyGenerator.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerAzureKeyVaultKeyGenerator.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerGoogleCloudHSMProvider.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerGoogleCloudHSMProvider.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerHSM.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerHSM.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerKMSDB.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerKMSDB.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerKeyStore.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerKeyStore.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerMasterKey.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerMasterKey.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/RangerTencentKMSProvider.java](../kms/src/main/java/org/apache/hadoop/crypto/key/RangerTencentKMSProvider.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMS.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMS.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSACLs.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSACLs.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSAuthenticationFilter.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSAuthenticationFilter.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSExceptionsProvider.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSExceptionsProvider.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSJMXServlet.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSJMXServlet.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSJSONReader.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSJSONReader.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSJSONWriter.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSJSONWriter.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSMDCFilter.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSMDCFilter.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSWebApp.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KMSWebApp.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KeyAuthorizationKeyProvider.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/KeyAuthorizationKeyProvider.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/MetricREST.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/MetricREST.java) | Updated |
| [kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/RangerKMSRestApi.java](../kms/src/main/java/org/apache/hadoop/crypto/key/kms/server/RangerKMSRestApi.java) | Updated |
| [kms/src/main/java/org/apache/ranger/common/RangerJsonProvider.java](../kms/src/main/java/org/apache/ranger/common/RangerJsonProvider.java) | Updated |
| [kms/src/main/java/org/apache/ranger/entity/XXDBBase.java](../kms/src/main/java/org/apache/ranger/entity/XXDBBase.java) | Updated |
| [kms/src/main/java/org/apache/ranger/entity/XXRangerKeyStore.java](../kms/src/main/java/org/apache/ranger/entity/XXRangerKeyStore.java) | Updated |
| [kms/src/main/java/org/apache/ranger/entity/XXRangerMasterKey.java](../kms/src/main/java/org/apache/ranger/entity/XXRangerMasterKey.java) | Updated |
| [kms/src/main/java/org/apache/ranger/kms/biz/RangerKMSStartUp.java](../kms/src/main/java/org/apache/ranger/kms/biz/RangerKMSStartUp.java) | Updated |
| [kms/src/main/java/org/apache/ranger/kms/dao/BaseDao.java](../kms/src/main/java/org/apache/ranger/kms/dao/BaseDao.java) | Updated |
| [kms/src/main/java/org/apache/ranger/kms/dao/DaoManager.java](../kms/src/main/java/org/apache/ranger/kms/dao/DaoManager.java) | Updated |
| [kms/src/main/java/org/apache/ranger/kms/dao/DaoManagerBase.java](../kms/src/main/java/org/apache/ranger/kms/dao/DaoManagerBase.java) | Updated |
| [kms/src/main/java/org/apache/ranger/kms/dao/RangerKMSDao.java](../kms/src/main/java/org/apache/ranger/kms/dao/RangerKMSDao.java) | Updated |
| [kms/src/main/resources/META-INF/kms_jpa_named_queries.xml](../kms/src/main/resources/META-INF/kms_jpa_named_queries.xml) | Updated |
| [kms/src/main/resources/META-INF/persistence.xml](../kms/src/main/resources/META-INF/persistence.xml) | Updated |
| [kms/src/main/webapp/WEB-INF/web.xml](../kms/src/main/webapp/WEB-INF/web.xml) | Updated |
| [kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/DerbyTestUtils.java](../kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/DerbyTestUtils.java) | Updated |
| [kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/RangerMasterKeyTest.java](../kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/RangerMasterKeyTest.java) | Updated |
| [kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/TestKMSAudit.java](../kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/TestKMSAudit.java) | Updated |
| [kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/TestKeyAuthorizationKeyProvider.java](../kms/src/test/java/org/apache/hadoop/crypto/key/kms/server/TestKeyAuthorizationKeyProvider.java) | Updated |
| [knox-agent/pom.xml](../knox-agent/pom.xml) | Updated |
| [knox-agent/src/main/java/org/apache/ranger/admin/client/RangerAdminJersey2RESTClient.java](../knox-agent/src/main/java/org/apache/ranger/admin/client/RangerAdminJersey2RESTClient.java) | Updated |
| [knox-agent/src/main/java/org/apache/ranger/authorization/knox/RangerPDPKnoxFilter.java](../knox-agent/src/main/java/org/apache/ranger/authorization/knox/RangerPDPKnoxFilter.java) | Updated |
| [knox-agent/src/main/java/org/apache/ranger/services/knox/RangerServiceKnox.java](../knox-agent/src/main/java/org/apache/ranger/services/knox/RangerServiceKnox.java) | Updated |
| [knox-agent/src/main/java/org/apache/ranger/services/knox/client/KnoxClient.java](../knox-agent/src/main/java/org/apache/ranger/services/knox/client/KnoxClient.java) | Updated |
| [knox-agent/src/test/java/org/apache/ranger/services/knox/KnoxRangerTest.java](../knox-agent/src/test/java/org/apache/ranger/services/knox/KnoxRangerTest.java) | Updated |
| [mvnw](../mvnw) | Updated |
| [mvnw.cmd](../mvnw.cmd) | Updated |
| [plugin-atlas/pom.xml](../plugin-atlas/pom.xml) | Updated |
| [plugin-atlas/src/main/java/org/apache/ranger/authorization/atlas/authorizer/RangerAtlasAuthorizer.java](../plugin-atlas/src/main/java/org/apache/ranger/authorization/atlas/authorizer/RangerAtlasAuthorizer.java) | Updated |
| [plugin-atlas/src/main/java/org/apache/ranger/services/atlas/RangerServiceAtlas.java](../plugin-atlas/src/main/java/org/apache/ranger/services/atlas/RangerServiceAtlas.java) | Updated |
| [plugin-elasticsearch/pom.xml](../plugin-elasticsearch/pom.xml) | Updated |
| [plugin-elasticsearch/src/main/java/org/apache/ranger/authorization/elasticsearch/authorizer/RangerElasticsearchAuthorizer.java](../plugin-elasticsearch/src/main/java/org/apache/ranger/authorization/elasticsearch/authorizer/RangerElasticsearchAuthorizer.java) | Updated |
| [plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/RangerServiceElasticsearch.java](../plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/RangerServiceElasticsearch.java) | Updated |
| [plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/client/ElasticsearchClient.java](../plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/client/ElasticsearchClient.java) | Updated |
| [plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/client/ElasticsearchResourceMgr.java](../plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/client/ElasticsearchResourceMgr.java) | Updated |
| [plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/privilege/IndexPrivilegeUtils.java](../plugin-elasticsearch/src/main/java/org/apache/ranger/services/elasticsearch/privilege/IndexPrivilegeUtils.java) | Updated |
| [plugin-kafka/pom.xml](../plugin-kafka/pom.xml) | Updated |
| [plugin-kafka/src/main/java/org/apache/ranger/authorization/kafka/authorizer/RangerKafkaAuthorizer.java](../plugin-kafka/src/main/java/org/apache/ranger/authorization/kafka/authorizer/RangerKafkaAuthorizer.java) | Updated |
| [plugin-kafka/src/main/java/org/apache/ranger/services/kafka/RangerServiceKafka.java](../plugin-kafka/src/main/java/org/apache/ranger/services/kafka/RangerServiceKafka.java) | Updated |
| [plugin-kafka/src/main/java/org/apache/ranger/services/kafka/client/ServiceKafkaClient.java](../plugin-kafka/src/main/java/org/apache/ranger/services/kafka/client/ServiceKafkaClient.java) | Updated |
| [plugin-kafka/src/main/java/org/apache/ranger/services/kafka/client/ServiceKafkaConnectionMgr.java](../plugin-kafka/src/main/java/org/apache/ranger/services/kafka/client/ServiceKafkaConnectionMgr.java) | Updated |
| [plugin-kms/pom.xml](../plugin-kms/pom.xml) | Updated |
| [plugin-kms/src/main/java/org/apache/ranger/authorization/kms/authorizer/RangerKmsAuthorizer.java](../plugin-kms/src/main/java/org/apache/ranger/authorization/kms/authorizer/RangerKmsAuthorizer.java) | Updated |
| [plugin-kms/src/main/java/org/apache/ranger/services/kms/RangerServiceKMS.java](../plugin-kms/src/main/java/org/apache/ranger/services/kms/RangerServiceKMS.java) | Updated |
| [plugin-kms/src/main/java/org/apache/ranger/services/kms/client/KMSClient.java](../plugin-kms/src/main/java/org/apache/ranger/services/kms/client/KMSClient.java) | Updated |
| [plugin-kms/src/main/java/org/apache/ranger/services/kms/client/KMSConnectionMgr.java](../plugin-kms/src/main/java/org/apache/ranger/services/kms/client/KMSConnectionMgr.java) | Updated |
| [plugin-kms/src/test/java/org/apache/ranger/authorization/kms/authorizer/DerbyTestUtils.java](../plugin-kms/src/test/java/org/apache/ranger/authorization/kms/authorizer/DerbyTestUtils.java) | Updated |
| [plugin-kms/src/test/java/org/apache/ranger/authorization/kms/authorizer/RangerKmsAuthorizerTest.java](../plugin-kms/src/test/java/org/apache/ranger/authorization/kms/authorizer/RangerKmsAuthorizerTest.java) | Updated |
| [plugin-kudu/pom.xml](../plugin-kudu/pom.xml) | Updated |
| [plugin-kylin/pom.xml](../plugin-kylin/pom.xml) | Updated |
| [plugin-kylin/src/main/java/org/apache/ranger/authorization/kylin/authorizer/RangerKylinAuthorizer.java](../plugin-kylin/src/main/java/org/apache/ranger/authorization/kylin/authorizer/RangerKylinAuthorizer.java) | Updated |
| [plugin-kylin/src/main/java/org/apache/ranger/services/kylin/client/KylinClient.java](../plugin-kylin/src/main/java/org/apache/ranger/services/kylin/client/KylinClient.java) | Updated |
| [plugin-kylin/src/main/java/org/apache/ranger/services/kylin/client/KylinResourceMgr.java](../plugin-kylin/src/main/java/org/apache/ranger/services/kylin/client/KylinResourceMgr.java) | Updated |
| [plugin-kylin/src/test/java/org/apache/ranger/authorization/kylin/authorizer/RangerKylinAuthorizerTest.java](../plugin-kylin/src/test/java/org/apache/ranger/authorization/kylin/authorizer/RangerKylinAuthorizerTest.java) | Updated |
| [plugin-nestedstructure/pom.xml](../plugin-nestedstructure/pom.xml) | Updated |
| [plugin-nestedstructure/src/main/java/org/apache/ranger/authorization/nestedstructure/authorizer/DataMasker.java](../plugin-nestedstructure/src/main/java/org/apache/ranger/authorization/nestedstructure/authorizer/DataMasker.java) | Updated |
| [plugin-nifi-registry/pom.xml](../plugin-nifi-registry/pom.xml) | Updated |
| [plugin-nifi-registry/src/main/java/org/apache/ranger/services/nifi/registry/client/NiFiRegistryClient.java](../plugin-nifi-registry/src/main/java/org/apache/ranger/services/nifi/registry/client/NiFiRegistryClient.java) | Updated |
| [plugin-nifi-registry/src/main/java/org/apache/ranger/services/nifi/registry/client/NiFiRegistryConnectionMgr.java](../plugin-nifi-registry/src/main/java/org/apache/ranger/services/nifi/registry/client/NiFiRegistryConnectionMgr.java) | Updated |
| [plugin-nifi-registry/src/test/java/org/apache/ranger/services/nifi/registry/client/TestNiFiRegistryClient.java](../plugin-nifi-registry/src/test/java/org/apache/ranger/services/nifi/registry/client/TestNiFiRegistryClient.java) | Updated |
| [plugin-nifi-registry/src/test/java/org/apache/ranger/services/nifi/registry/client/TestNiFiRegistryConnectionMgr.java](../plugin-nifi-registry/src/test/java/org/apache/ranger/services/nifi/registry/client/TestNiFiRegistryConnectionMgr.java) | Updated |
| [plugin-nifi/pom.xml](../plugin-nifi/pom.xml) | Updated |
| [plugin-nifi/src/main/java/org/apache/ranger/services/nifi/client/NiFiClient.java](../plugin-nifi/src/main/java/org/apache/ranger/services/nifi/client/NiFiClient.java) | Updated |
| [plugin-nifi/src/main/java/org/apache/ranger/services/nifi/client/NiFiConnectionMgr.java](../plugin-nifi/src/main/java/org/apache/ranger/services/nifi/client/NiFiConnectionMgr.java) | Updated |
| [plugin-nifi/src/test/java/org/apache/ranger/services/nifi/client/TestNiFiClient.java](../plugin-nifi/src/test/java/org/apache/ranger/services/nifi/client/TestNiFiClient.java) | Updated |
| [plugin-nifi/src/test/java/org/apache/ranger/services/nifi/client/TestNiFiConnectionMgr.java](../plugin-nifi/src/test/java/org/apache/ranger/services/nifi/client/TestNiFiConnectionMgr.java) | Updated |
| [plugin-ozone/pom.xml](../plugin-ozone/pom.xml) | Updated |
| [plugin-ozone/src/main/java/org/apache/ranger/services/ozone/RangerServiceOzone.java](../plugin-ozone/src/main/java/org/apache/ranger/services/ozone/RangerServiceOzone.java) | Updated |
| [plugin-ozone/src/main/java/org/apache/ranger/services/ozone/client/OzoneClient.java](../plugin-ozone/src/main/java/org/apache/ranger/services/ozone/client/OzoneClient.java) | Updated |
| [plugin-presto/pom.xml](../plugin-presto/pom.xml) | Updated |
| [plugin-presto/src/main/java/org/apache/ranger/authorization/presto/authorizer/RangerSystemAccessControl.java](../plugin-presto/src/main/java/org/apache/ranger/authorization/presto/authorizer/RangerSystemAccessControl.java) | Updated |
| [plugin-presto/src/main/java/org/apache/ranger/services/presto/RangerServicePresto.java](../plugin-presto/src/main/java/org/apache/ranger/services/presto/RangerServicePresto.java) | Updated |
| [plugin-presto/src/main/java/org/apache/ranger/services/presto/client/PrestoClient.java](../plugin-presto/src/main/java/org/apache/ranger/services/presto/client/PrestoClient.java) | Updated |
| [plugin-presto/src/test/java/org/apache/ranger/authorization/presto/authorizer/RangerSystemAccessControlTest.java](../plugin-presto/src/test/java/org/apache/ranger/authorization/presto/authorizer/RangerSystemAccessControlTest.java) | Updated |
| [plugin-schema-registry/pom.xml](../plugin-schema-registry/pom.xml) | Updated |
| [plugin-schema-registry/src/main/java/org/apache/ranger/services/schema/registry/client/AutocompletionAgent.java](../plugin-schema-registry/src/main/java/org/apache/ranger/services/schema/registry/client/AutocompletionAgent.java) | Updated |
| [plugin-schema-registry/src/main/java/org/apache/ranger/services/schema/registry/client/connection/DefaultSchemaRegistryClient.java](../plugin-schema-registry/src/main/java/org/apache/ranger/services/schema/registry/client/connection/DefaultSchemaRegistryClient.java) | Updated |
| [plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/AutocompletionAgentTest.java](../plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/AutocompletionAgentTest.java) | Updated |
| [plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/SchemaRegistryResourceMgrTest.java](../plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/SchemaRegistryResourceMgrTest.java) | Updated |
| [plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/connection/DefaultSchemaRegistryClientTest.java](../plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/connection/DefaultSchemaRegistryClientTest.java) | Updated |
| [plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/connection/util/SecurityUtilsTest.java](../plugin-schema-registry/src/test/java/org/apache/ranger/services/schema/registry/client/connection/util/SecurityUtilsTest.java) | Updated |
| [plugin-solr/pom.xml](../plugin-solr/pom.xml) | Updated |
| [plugin-solr/src/main/java/org/apache/ranger/authorization/solr/authorizer/RangerSolrAuthorizer.java](../plugin-solr/src/main/java/org/apache/ranger/authorization/solr/authorizer/RangerSolrAuthorizer.java) | Updated |
| [plugin-solr/src/main/java/org/apache/ranger/authorization/solr/authorizer/SolrAuthzUtil.java](../plugin-solr/src/main/java/org/apache/ranger/authorization/solr/authorizer/SolrAuthzUtil.java) | Updated |
| [plugin-solr/src/main/java/org/apache/ranger/services/solr/RangerServiceSolr.java](../plugin-solr/src/main/java/org/apache/ranger/services/solr/RangerServiceSolr.java) | Updated |
| [plugin-solr/src/main/java/org/apache/ranger/services/solr/RangerSolrConstants.java](../plugin-solr/src/main/java/org/apache/ranger/services/solr/RangerSolrConstants.java) | Updated |
| [plugin-solr/src/main/java/org/apache/ranger/services/solr/client/ServiceSolrClient.java](../plugin-solr/src/main/java/org/apache/ranger/services/solr/client/ServiceSolrClient.java) | Updated |
| [plugin-solr/src/main/java/org/apache/ranger/services/solr/client/ServiceSolrConnectionMgr.java](../plugin-solr/src/main/java/org/apache/ranger/services/solr/client/ServiceSolrConnectionMgr.java) | Updated |
| [plugin-sqoop/pom.xml](../plugin-sqoop/pom.xml) | Updated |
| [plugin-sqoop/src/main/java/org/apache/ranger/authorization/sqoop/authorizer/RangerSqoopAuthorizer.java](../plugin-sqoop/src/main/java/org/apache/ranger/authorization/sqoop/authorizer/RangerSqoopAuthorizer.java) | Updated |
| [plugin-sqoop/src/main/java/org/apache/ranger/services/sqoop/client/SqoopClient.java](../plugin-sqoop/src/main/java/org/apache/ranger/services/sqoop/client/SqoopClient.java) | Updated |
| [plugin-sqoop/src/main/java/org/apache/ranger/services/sqoop/client/SqoopResourceMgr.java](../plugin-sqoop/src/main/java/org/apache/ranger/services/sqoop/client/SqoopResourceMgr.java) | Updated |
| [plugin-sqoop/src/test/java/org/apache/ranger/authorization/sqoop/authorizer/RangerSqoopAuthorizerTest.java](../plugin-sqoop/src/test/java/org/apache/ranger/authorization/sqoop/authorizer/RangerSqoopAuthorizerTest.java) | Updated |
| [plugin-trino/pom.xml](../plugin-trino/pom.xml) | Updated |
| [plugin-trino/src/main/java/org/apache/ranger/services/trino/RangerServiceTrino.java](../plugin-trino/src/main/java/org/apache/ranger/services/trino/RangerServiceTrino.java) | Updated |
| [plugin-trino/src/main/java/org/apache/ranger/services/trino/client/TrinoClient.java](../plugin-trino/src/main/java/org/apache/ranger/services/trino/client/TrinoClient.java) | Updated |
| [plugin-yarn/pom.xml](../plugin-yarn/pom.xml) | Updated |
| [plugin-yarn/src/main/java/org/apache/ranger/authorization/yarn/authorizer/RangerYarnAuthorizer.java](../plugin-yarn/src/main/java/org/apache/ranger/authorization/yarn/authorizer/RangerYarnAuthorizer.java) | Updated |
| [plugin-yarn/src/main/java/org/apache/ranger/services/yarn/RangerServiceYarn.java](../plugin-yarn/src/main/java/org/apache/ranger/services/yarn/RangerServiceYarn.java) | Updated |
| [plugin-yarn/src/main/java/org/apache/ranger/services/yarn/client/YarnClient.java](../plugin-yarn/src/main/java/org/apache/ranger/services/yarn/client/YarnClient.java) | Updated |
| [pom.xml](../pom.xml) | Updated |
| [ranger-atlas-plugin-shim/pom.xml](../ranger-atlas-plugin-shim/pom.xml) | Updated |
| [ranger-atlas-plugin-shim/src/main/java/org/apache/ranger/authorization/atlas/authorizer/RangerAtlasAuthorizer.java](../ranger-atlas-plugin-shim/src/main/java/org/apache/ranger/authorization/atlas/authorizer/RangerAtlasAuthorizer.java) | Updated |
| [ranger-authn/pom.xml](../ranger-authn/pom.xml) | Updated |
| [ranger-authn/src/main/java/org/apache/ranger/authz/handler/RangerAuthHandler.java](../ranger-authn/src/main/java/org/apache/ranger/authz/handler/RangerAuthHandler.java) | Updated |
| [ranger-authn/src/main/java/org/apache/ranger/authz/handler/jwt/RangerDefaultJwtAuthHandler.java](../ranger-authn/src/main/java/org/apache/ranger/authz/handler/jwt/RangerDefaultJwtAuthHandler.java) | Updated |
| [ranger-authn/src/main/java/org/apache/ranger/authz/handler/jwt/RangerJwtAuthHandler.java](../ranger-authn/src/main/java/org/apache/ranger/authz/handler/jwt/RangerJwtAuthHandler.java) | Updated |
| [ranger-common-ha/pom.xml](../ranger-common-ha/pom.xml) | Updated |
| [ranger-common-ha/src/main/java/org/apache/ranger/ha/ActiveInstanceState.java](../ranger-common-ha/src/main/java/org/apache/ranger/ha/ActiveInstanceState.java) | Updated |
| [ranger-common-ha/src/main/java/org/apache/ranger/ha/HAConfiguration.java](../ranger-common-ha/src/main/java/org/apache/ranger/ha/HAConfiguration.java) | Updated |
| [ranger-common-ha/src/main/java/org/apache/ranger/ha/RangerServiceServerIdSelector.java](../ranger-common-ha/src/main/java/org/apache/ranger/ha/RangerServiceServerIdSelector.java) | Updated |
| [ranger-common-ha/src/main/java/org/apache/ranger/ha/ZookeeperSecurityProperties.java](../ranger-common-ha/src/main/java/org/apache/ranger/ha/ZookeeperSecurityProperties.java) | Updated |
| [ranger-common-ha/src/main/java/org/apache/ranger/ha/service/ServiceManager.java](../ranger-common-ha/src/main/java/org/apache/ranger/ha/service/ServiceManager.java) | Updated |
| [ranger-elasticsearch-plugin-shim/pom.xml](../ranger-elasticsearch-plugin-shim/pom.xml) | Updated |
| [ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/RangerElasticsearchPlugin.java](../ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/RangerElasticsearchPlugin.java) | Updated |
| [ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/action/filter/RangerSecurityActionFilter.java](../ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/action/filter/RangerSecurityActionFilter.java) | Updated |
| [ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/authc/user/UsernamePasswordToken.java](../ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/authc/user/UsernamePasswordToken.java) | Updated |
| [ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/rest/filter/RangerSecurityRestFilter.java](../ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/rest/filter/RangerSecurityRestFilter.java) | Updated |
| [ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/utils/RequestUtils.java](../ranger-elasticsearch-plugin-shim/src/main/java/org/apache/ranger/authorization/elasticsearch/plugin/utils/RequestUtils.java) | Updated |
| [ranger-examples/conditions-enrichers/pom.xml](../ranger-examples/conditions-enrichers/pom.xml) | Updated |
| [ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerPolicyConditionSampleSimpleMatcher.java](../ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerPolicyConditionSampleSimpleMatcher.java) | Updated |
| [ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerSampleSimpleMatcher.java](../ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/conditionevaluator/RangerSampleSimpleMatcher.java) | Updated |
| [ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/contextenricher/RangerSampleCountryProvider.java](../ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/contextenricher/RangerSampleCountryProvider.java) | Updated |
| [ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/contextenricher/RangerSampleProjectProvider.java](../ranger-examples/conditions-enrichers/src/main/java/org/apache/ranger/plugin/contextenricher/RangerSampleProjectProvider.java) | Updated |
| [ranger-examples/conditions-enrichers/target/.plxarc](../ranger-examples/conditions-enrichers/target/.plxarc) | Added |
| [ranger-examples/conditions-enrichers/target/antrun/build-main.xml](../ranger-examples/conditions-enrichers/target/antrun/build-main.xml) | Added |
| [ranger-examples/conditions-enrichers/target/classes/META-INF/DEPENDENCIES](../ranger-examples/conditions-enrichers/target/classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/conditions-enrichers/target/classes/META-INF/LICENSE](../ranger-examples/conditions-enrichers/target/classes/META-INF/LICENSE) | Added |
| [ranger-examples/conditions-enrichers/target/classes/META-INF/NOTICE](../ranger-examples/conditions-enrichers/target/classes/META-INF/NOTICE) | Added |
| [ranger-examples/conditions-enrichers/target/maven-shared-archive-resources/META-INF/DEPENDENCIES](../ranger-examples/conditions-enrichers/target/maven-shared-archive-resources/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/conditions-enrichers/target/maven-shared-archive-resources/META-INF/LICENSE](../ranger-examples/conditions-enrichers/target/maven-shared-archive-resources/META-INF/LICENSE) | Added |
| [ranger-examples/conditions-enrichers/target/maven-shared-archive-resources/META-INF/NOTICE](../ranger-examples/conditions-enrichers/target/maven-shared-archive-resources/META-INF/NOTICE) | Added |
| [ranger-examples/conditions-enrichers/target/test-classes/META-INF/DEPENDENCIES](../ranger-examples/conditions-enrichers/target/test-classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/conditions-enrichers/target/test-classes/META-INF/LICENSE](../ranger-examples/conditions-enrichers/target/test-classes/META-INF/LICENSE) | Added |
| [ranger-examples/conditions-enrichers/target/test-classes/META-INF/NOTICE](../ranger-examples/conditions-enrichers/target/test-classes/META-INF/NOTICE) | Added |
| [ranger-examples/conditions-enrichers/target/test-classes/logback.xml](../ranger-examples/conditions-enrichers/target/test-classes/logback.xml) | Added |
| [ranger-examples/conditions-enrichers/target/version](../ranger-examples/conditions-enrichers/target/version) | Added |
| [ranger-examples/distro/pom.xml](../ranger-examples/distro/pom.xml) | Updated |
| [ranger-examples/distro/target/.plxarc](../ranger-examples/distro/target/.plxarc) | Added |
| [ranger-examples/distro/target/antrun/build-main.xml](../ranger-examples/distro/target/antrun/build-main.xml) | Added |
| [ranger-examples/distro/target/classes/META-INF/DEPENDENCIES](../ranger-examples/distro/target/classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/distro/target/classes/META-INF/LICENSE](../ranger-examples/distro/target/classes/META-INF/LICENSE) | Added |
| [ranger-examples/distro/target/classes/META-INF/NOTICE](../ranger-examples/distro/target/classes/META-INF/NOTICE) | Added |
| [ranger-examples/distro/target/maven-shared-archive-resources/META-INF/DEPENDENCIES](../ranger-examples/distro/target/maven-shared-archive-resources/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/distro/target/maven-shared-archive-resources/META-INF/LICENSE](../ranger-examples/distro/target/maven-shared-archive-resources/META-INF/LICENSE) | Added |
| [ranger-examples/distro/target/maven-shared-archive-resources/META-INF/NOTICE](../ranger-examples/distro/target/maven-shared-archive-resources/META-INF/NOTICE) | Added |
| [ranger-examples/distro/target/test-classes/META-INF/DEPENDENCIES](../ranger-examples/distro/target/test-classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/distro/target/test-classes/META-INF/LICENSE](../ranger-examples/distro/target/test-classes/META-INF/LICENSE) | Added |
| [ranger-examples/distro/target/test-classes/META-INF/NOTICE](../ranger-examples/distro/target/test-classes/META-INF/NOTICE) | Added |
| [ranger-examples/distro/target/version](../ranger-examples/distro/target/version) | Added |
| [ranger-examples/plugin-sampleapp/pom.xml](../ranger-examples/plugin-sampleapp/pom.xml) | Updated |
| [ranger-examples/plugin-sampleapp/target/.plxarc](../ranger-examples/plugin-sampleapp/target/.plxarc) | Added |
| [ranger-examples/plugin-sampleapp/target/antrun/build-main.xml](../ranger-examples/plugin-sampleapp/target/antrun/build-main.xml) | Added |
| [ranger-examples/plugin-sampleapp/target/classes/META-INF/DEPENDENCIES](../ranger-examples/plugin-sampleapp/target/classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/plugin-sampleapp/target/classes/META-INF/LICENSE](../ranger-examples/plugin-sampleapp/target/classes/META-INF/LICENSE) | Added |
| [ranger-examples/plugin-sampleapp/target/classes/META-INF/NOTICE](../ranger-examples/plugin-sampleapp/target/classes/META-INF/NOTICE) | Added |
| [ranger-examples/plugin-sampleapp/target/maven-shared-archive-resources/META-INF/DEPENDENCIES](../ranger-examples/plugin-sampleapp/target/maven-shared-archive-resources/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/plugin-sampleapp/target/maven-shared-archive-resources/META-INF/LICENSE](../ranger-examples/plugin-sampleapp/target/maven-shared-archive-resources/META-INF/LICENSE) | Added |
| [ranger-examples/plugin-sampleapp/target/maven-shared-archive-resources/META-INF/NOTICE](../ranger-examples/plugin-sampleapp/target/maven-shared-archive-resources/META-INF/NOTICE) | Added |
| [ranger-examples/plugin-sampleapp/target/test-classes/META-INF/DEPENDENCIES](../ranger-examples/plugin-sampleapp/target/test-classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/plugin-sampleapp/target/test-classes/META-INF/LICENSE](../ranger-examples/plugin-sampleapp/target/test-classes/META-INF/LICENSE) | Added |
| [ranger-examples/plugin-sampleapp/target/test-classes/META-INF/NOTICE](../ranger-examples/plugin-sampleapp/target/test-classes/META-INF/NOTICE) | Added |
| [ranger-examples/plugin-sampleapp/target/version](../ranger-examples/plugin-sampleapp/target/version) | Added |
| [ranger-examples/pom.xml](../ranger-examples/pom.xml) | Updated |
| [ranger-examples/sample-client/pom.xml](../ranger-examples/sample-client/pom.xml) | Updated |
| [ranger-examples/sample-client/target/.plxarc](../ranger-examples/sample-client/target/.plxarc) | Added |
| [ranger-examples/sample-client/target/antrun/build-main.xml](../ranger-examples/sample-client/target/antrun/build-main.xml) | Added |
| [ranger-examples/sample-client/target/classes/META-INF/DEPENDENCIES](../ranger-examples/sample-client/target/classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/sample-client/target/classes/META-INF/LICENSE](../ranger-examples/sample-client/target/classes/META-INF/LICENSE) | Added |
| [ranger-examples/sample-client/target/classes/META-INF/NOTICE](../ranger-examples/sample-client/target/classes/META-INF/NOTICE) | Added |
| [ranger-examples/sample-client/target/classes/logback.xml](../ranger-examples/sample-client/target/classes/logback.xml) | Added |
| [ranger-examples/sample-client/target/classes/logging.conf](../ranger-examples/sample-client/target/classes/logging.conf) | Added |
| [ranger-examples/sample-client/target/maven-shared-archive-resources/META-INF/DEPENDENCIES](../ranger-examples/sample-client/target/maven-shared-archive-resources/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/sample-client/target/maven-shared-archive-resources/META-INF/LICENSE](../ranger-examples/sample-client/target/maven-shared-archive-resources/META-INF/LICENSE) | Added |
| [ranger-examples/sample-client/target/maven-shared-archive-resources/META-INF/NOTICE](../ranger-examples/sample-client/target/maven-shared-archive-resources/META-INF/NOTICE) | Added |
| [ranger-examples/sample-client/target/test-classes/META-INF/DEPENDENCIES](../ranger-examples/sample-client/target/test-classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/sample-client/target/test-classes/META-INF/LICENSE](../ranger-examples/sample-client/target/test-classes/META-INF/LICENSE) | Added |
| [ranger-examples/sample-client/target/test-classes/META-INF/NOTICE](../ranger-examples/sample-client/target/test-classes/META-INF/NOTICE) | Added |
| [ranger-examples/sample-client/target/version](../ranger-examples/sample-client/target/version) | Added |
| [ranger-examples/sampleapp/pom.xml](../ranger-examples/sampleapp/pom.xml) | Updated |
| [ranger-examples/sampleapp/src/main/java/org/apache/ranger/examples/sampleapp/SampleApp.java](../ranger-examples/sampleapp/src/main/java/org/apache/ranger/examples/sampleapp/SampleApp.java) | Updated |
| [ranger-examples/sampleapp/target/.plxarc](../ranger-examples/sampleapp/target/.plxarc) | Added |
| [ranger-examples/sampleapp/target/antrun/build-main.xml](../ranger-examples/sampleapp/target/antrun/build-main.xml) | Added |
| [ranger-examples/sampleapp/target/classes/META-INF/DEPENDENCIES](../ranger-examples/sampleapp/target/classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/sampleapp/target/classes/META-INF/LICENSE](../ranger-examples/sampleapp/target/classes/META-INF/LICENSE) | Added |
| [ranger-examples/sampleapp/target/classes/META-INF/NOTICE](../ranger-examples/sampleapp/target/classes/META-INF/NOTICE) | Added |
| [ranger-examples/sampleapp/target/maven-shared-archive-resources/META-INF/DEPENDENCIES](../ranger-examples/sampleapp/target/maven-shared-archive-resources/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/sampleapp/target/maven-shared-archive-resources/META-INF/LICENSE](../ranger-examples/sampleapp/target/maven-shared-archive-resources/META-INF/LICENSE) | Added |
| [ranger-examples/sampleapp/target/maven-shared-archive-resources/META-INF/NOTICE](../ranger-examples/sampleapp/target/maven-shared-archive-resources/META-INF/NOTICE) | Added |
| [ranger-examples/sampleapp/target/test-classes/META-INF/DEPENDENCIES](../ranger-examples/sampleapp/target/test-classes/META-INF/DEPENDENCIES) | Added |
| [ranger-examples/sampleapp/target/test-classes/META-INF/LICENSE](../ranger-examples/sampleapp/target/test-classes/META-INF/LICENSE) | Added |
| [ranger-examples/sampleapp/target/test-classes/META-INF/NOTICE](../ranger-examples/sampleapp/target/test-classes/META-INF/NOTICE) | Added |
| [ranger-examples/sampleapp/target/version](../ranger-examples/sampleapp/target/version) | Added |
| [ranger-hbase-plugin-shim/pom.xml](../ranger-hbase-plugin-shim/pom.xml) | Updated |
| [ranger-hbase-plugin-shim/src/main/test/org/apache/hadoop/hbase/security/access/RangerAccessControlListsTest.java](../ranger-hbase-plugin-shim/src/main/test/org/apache/hadoop/hbase/security/access/RangerAccessControlListsTest.java) | Updated |
| [ranger-hdfs-plugin-shim/pom.xml](../ranger-hdfs-plugin-shim/pom.xml) | Updated |
| [ranger-hdfs-plugin-shim/src/main/java/org/apache/ranger/authorization/hadoop/RangerHdfsAuthorizer.java](../ranger-hdfs-plugin-shim/src/main/java/org/apache/ranger/authorization/hadoop/RangerHdfsAuthorizer.java) | Updated |
| [ranger-hive-plugin-shim/pom.xml](../ranger-hive-plugin-shim/pom.xml) | Updated |
| [ranger-hive-plugin-shim/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuthorizerFactory.java](../ranger-hive-plugin-shim/src/main/java/org/apache/ranger/authorization/hive/authorizer/RangerHiveAuthorizerFactory.java) | Updated |
| [ranger-kafka-plugin-shim/pom.xml](../ranger-kafka-plugin-shim/pom.xml) | Updated |
| [ranger-kafka-plugin-shim/src/main/java/org/apache/ranger/authorization/kafka/authorizer/RangerKafkaAuthorizer.java](../ranger-kafka-plugin-shim/src/main/java/org/apache/ranger/authorization/kafka/authorizer/RangerKafkaAuthorizer.java) | Updated |
| [ranger-kms-plugin-shim/pom.xml](../ranger-kms-plugin-shim/pom.xml) | Updated |
| [ranger-kms-plugin-shim/src/main/java/org/apache/ranger/authorization/kms/authorizer/RangerKmsAuthorizer.java](../ranger-kms-plugin-shim/src/main/java/org/apache/ranger/authorization/kms/authorizer/RangerKmsAuthorizer.java) | Updated |
| [ranger-knox-plugin-shim/pom.xml](../ranger-knox-plugin-shim/pom.xml) | Updated |
| [ranger-knox-plugin-shim/src/main/java/org/apache/ranger/authorization/knox/RangerPDPKnoxFilter.java](../ranger-knox-plugin-shim/src/main/java/org/apache/ranger/authorization/knox/RangerPDPKnoxFilter.java) | Updated |
| [ranger-kylin-plugin-shim/pom.xml](../ranger-kylin-plugin-shim/pom.xml) | Updated |
| [ranger-kylin-plugin-shim/src/main/java/org/apache/ranger/authorization/kylin/authorizer/RangerKylinAuthorizer.java](../ranger-kylin-plugin-shim/src/main/java/org/apache/ranger/authorization/kylin/authorizer/RangerKylinAuthorizer.java) | Updated |
| [ranger-metrics/pom.xml](../ranger-metrics/pom.xml) | Updated |
| [ranger-metrics/src/test/java/org/apache/ranger/metrics/source/TestRangerMetricsContainerSource.java](../ranger-metrics/src/test/java/org/apache/ranger/metrics/source/TestRangerMetricsContainerSource.java) | Updated |
| [ranger-ozone-plugin-shim/pom.xml](../ranger-ozone-plugin-shim/pom.xml) | Updated |
| [ranger-ozone-plugin-shim/src/main/java/org/apache/ranger/authorization/ozone/authorizer/RangerOzoneAuthorizer.java](../ranger-ozone-plugin-shim/src/main/java/org/apache/ranger/authorization/ozone/authorizer/RangerOzoneAuthorizer.java) | Updated |
| [ranger-plugin-classloader/pom.xml](../ranger-plugin-classloader/pom.xml) | Updated |
| [ranger-presto-plugin-shim/pom.xml](../ranger-presto-plugin-shim/pom.xml) | Updated |
| [ranger-presto-plugin-shim/src/main/java/org/apache/ranger/authorization/presto/authorizer/RangerSystemAccessControl.java](../ranger-presto-plugin-shim/src/main/java/org/apache/ranger/authorization/presto/authorizer/RangerSystemAccessControl.java) | Updated |
| [ranger-solr-plugin-shim/pom.xml](../ranger-solr-plugin-shim/pom.xml) | Updated |
| [ranger-solr-plugin-shim/src/main/java/org/apache/ranger/authorization/solr/authorizer/RangerSolrAuthorizer.java](../ranger-solr-plugin-shim/src/main/java/org/apache/ranger/authorization/solr/authorizer/RangerSolrAuthorizer.java) | Updated |
| [ranger-sqoop-plugin-shim/pom.xml](../ranger-sqoop-plugin-shim/pom.xml) | Updated |
| [ranger-sqoop-plugin-shim/src/main/java/org/apache/ranger/authorization/sqoop/authorizer/RangerSqoopAuthorizer.java](../ranger-sqoop-plugin-shim/src/main/java/org/apache/ranger/authorization/sqoop/authorizer/RangerSqoopAuthorizer.java) | Updated |
| [ranger-storm-plugin-shim/pom.xml](../ranger-storm-plugin-shim/pom.xml) | Updated |
| [ranger-storm-plugin-shim/src/main/java/org/apache/ranger/authorization/storm/authorizer/RangerStormAuthorizer.java](../ranger-storm-plugin-shim/src/main/java/org/apache/ranger/authorization/storm/authorizer/RangerStormAuthorizer.java) | Updated |
| [ranger-tools/pom.xml](../ranger-tools/pom.xml) | Updated |
| [ranger-tools/src/main/java/org/apache/ranger/policyengine/CommandLineParser.java](../ranger-tools/src/main/java/org/apache/ranger/policyengine/CommandLineParser.java) | Updated |
| [ranger-tools/src/main/java/org/apache/ranger/policyengine/RangerPluginPerfTester.java](../ranger-tools/src/main/java/org/apache/ranger/policyengine/RangerPluginPerfTester.java) | Updated |
| [ranger-tools/src/main/java/org/apache/ranger/policyengine/perftest/v2/RangerPolicyFactory.java](../ranger-tools/src/main/java/org/apache/ranger/policyengine/perftest/v2/RangerPolicyFactory.java) | Updated |
| [ranger-tools/src/main/java/org/apache/ranger/sizing/RangerMemSizing.java](../ranger-tools/src/main/java/org/apache/ranger/sizing/RangerMemSizing.java) | Updated |
| [ranger-tools/src/test/java/org/apache/ranger/policyengine/PerfTesterTest.java](../ranger-tools/src/test/java/org/apache/ranger/policyengine/PerfTesterTest.java) | Updated |
| [ranger-tools/src/test/java/org/apache/ranger/policyengine/RangerPolicyEnginePerformanceTest.java](../ranger-tools/src/test/java/org/apache/ranger/policyengine/RangerPolicyEnginePerformanceTest.java) | Updated |
| [ranger-util/pom.xml](../ranger-util/pom.xml) | Updated |
| [ranger-yarn-plugin-shim/pom.xml](../ranger-yarn-plugin-shim/pom.xml) | Updated |
| [ranger-yarn-plugin-shim/src/main/java/org/apache/ranger/authorization/yarn/authorizer/RangerYarnAuthorizer.java](../ranger-yarn-plugin-shim/src/main/java/org/apache/ranger/authorization/yarn/authorizer/RangerYarnAuthorizer.java) | Updated |
| [security-admin/pom.xml](../security-admin/pom.xml) | Updated |
| [security-admin/src/main/java/jakarta/ws/rs/core/NoContentException.java](../security-admin/src/main/java/jakarta/ws/rs/core/NoContentException.java) | Added |
| [security-admin/src/main/java/org/apache/ranger/AccessAuditsService.java](../security-admin/src/main/java/org/apache/ranger/AccessAuditsService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/amazon/cloudwatch/CloudWatchAccessAuditsService.java](../security-admin/src/main/java/org/apache/ranger/amazon/cloudwatch/CloudWatchAccessAuditsService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/amazon/cloudwatch/CloudWatchMgr.java](../security-admin/src/main/java/org/apache/ranger/amazon/cloudwatch/CloudWatchMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/amazon/cloudwatch/CloudWatchUtil.java](../security-admin/src/main/java/org/apache/ranger/amazon/cloudwatch/CloudWatchUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/AssetMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/AssetMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/GdsDBStore.java](../security-admin/src/main/java/org/apache/ranger/biz/GdsDBStore.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/GdsPolicyAdminCache.java](../security-admin/src/main/java/org/apache/ranger/biz/GdsPolicyAdminCache.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/KmsKeyMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/KmsKeyMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/PolicyRefUpdater.java](../security-admin/src/main/java/org/apache/ranger/biz/PolicyRefUpdater.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/RangerBizUtil.java](../security-admin/src/main/java/org/apache/ranger/biz/RangerBizUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/RangerPolicyAdminImpl.java](../security-admin/src/main/java/org/apache/ranger/biz/RangerPolicyAdminImpl.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/RangerPolicyRetriever.java](../security-admin/src/main/java/org/apache/ranger/biz/RangerPolicyRetriever.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/RangerTagDBRetriever.java](../security-admin/src/main/java/org/apache/ranger/biz/RangerTagDBRetriever.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/RoleDBStore.java](../security-admin/src/main/java/org/apache/ranger/biz/RoleDBStore.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/RoleRefUpdater.java](../security-admin/src/main/java/org/apache/ranger/biz/RoleRefUpdater.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/SecurityZoneDBStore.java](../security-admin/src/main/java/org/apache/ranger/biz/SecurityZoneDBStore.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/SecurityZoneRefUpdater.java](../security-admin/src/main/java/org/apache/ranger/biz/SecurityZoneRefUpdater.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/ServiceDBStore.java](../security-admin/src/main/java/org/apache/ranger/biz/ServiceDBStore.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/ServiceMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/ServiceMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/SessionMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/SessionMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/TagDBStore.java](../security-admin/src/main/java/org/apache/ranger/biz/TagDBStore.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/UserMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/UserMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/XAuditMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/XAuditMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/biz/XUserMgr.java](../security-admin/src/main/java/org/apache/ranger/biz/XUserMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/DateUtil.java](../security-admin/src/main/java/org/apache/ranger/common/DateUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/HTTPUtil.java](../security-admin/src/main/java/org/apache/ranger/common/HTTPUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/PropertiesUtil.java](../security-admin/src/main/java/org/apache/ranger/common/PropertiesUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RESTErrorUtil.java](../security-admin/src/main/java/org/apache/ranger/common/RESTErrorUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerJAXBContextResolver.java](../security-admin/src/main/java/org/apache/ranger/common/RangerJAXBContextResolver.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerJsonMappingExceptionMapper.java](../security-admin/src/main/java/org/apache/ranger/common/RangerJsonMappingExceptionMapper.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerJsonParserExceptionMapper.java](../security-admin/src/main/java/org/apache/ranger/common/RangerJsonParserExceptionMapper.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerJsonProvider.java](../security-admin/src/main/java/org/apache/ranger/common/RangerJsonProvider.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerSearchUtil.java](../security-admin/src/main/java/org/apache/ranger/common/RangerSearchUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerServicePoliciesCache.java](../security-admin/src/main/java/org/apache/ranger/common/RangerServicePoliciesCache.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/RangerServiceTagsCache.java](../security-admin/src/main/java/org/apache/ranger/common/RangerServiceTagsCache.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/SearchGroup.java](../security-admin/src/main/java/org/apache/ranger/common/SearchGroup.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/SearchUtil.java](../security-admin/src/main/java/org/apache/ranger/common/SearchUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/ServiceGdsInfoCache.java](../security-admin/src/main/java/org/apache/ranger/common/ServiceGdsInfoCache.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/ServiceUtil.java](../security-admin/src/main/java/org/apache/ranger/common/ServiceUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/TimedExecutor.java](../security-admin/src/main/java/org/apache/ranger/common/TimedExecutor.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/TimedExecutorConfigurator.java](../security-admin/src/main/java/org/apache/ranger/common/TimedExecutorConfigurator.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/db/BaseDao.java](../security-admin/src/main/java/org/apache/ranger/common/db/BaseDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/db/JPABeanCallbacks.java](../security-admin/src/main/java/org/apache/ranger/common/db/JPABeanCallbacks.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/db/RangerTransactionSynchronizationAdapter.java](../security-admin/src/main/java/org/apache/ranger/common/db/RangerTransactionSynchronizationAdapter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/common/view/VTrxLogAttr.java](../security-admin/src/main/java/org/apache/ranger/common/view/VTrxLogAttr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/credentialapi/CredentialReader.java](../security-admin/src/main/java/org/apache/ranger/credentialapi/CredentialReader.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/RangerDaoManager.java](../security-admin/src/main/java/org/apache/ranger/db/RangerDaoManager.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/RangerDaoManagerBase.java](../security-admin/src/main/java/org/apache/ranger/db/RangerDaoManagerBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXAccessAuditDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXAccessAuditDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXAccessTypeDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXAccessTypeDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXAccessTypeDefGrantsDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXAccessTypeDefGrantsDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXAssetDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXAssetDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXAuditMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXAuditMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXAuthSessionDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXAuthSessionDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXContextEnricherDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXContextEnricherDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXDataHistDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXDataHistDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXDataMaskTypeDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXDataMaskTypeDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXEnumDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXEnumDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXEnumElementDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXEnumElementDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsDataShareDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsDataShareDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsDataShareInDatasetDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsDataShareInDatasetDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsDatasetDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsDatasetDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsDatasetInProjectDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsDatasetInProjectDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsDatasetPolicyMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsDatasetPolicyMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsProjectDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsProjectDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsProjectPolicyMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsProjectPolicyMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGdsSharedResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGdsSharedResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGlobalStateDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGlobalStateDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGroupDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGroupDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGroupGroupDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGroupGroupDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGroupPermissionDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGroupPermissionDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXGroupUserDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXGroupUserDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXModuleDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXModuleDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPermMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPermMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPluginInfoDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPluginInfoDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyChangeLogDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyChangeLogDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyConditionDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyConditionDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemAccessDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemAccessDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemConditionDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemConditionDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemDataMaskInfoDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemDataMaskInfoDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemGroupPermDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemGroupPermDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemRowFilterInfoDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemRowFilterInfoDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemUserPermDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyItemUserPermDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyLabelDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyLabelDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyLabelMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyLabelMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefAccessTypeDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefAccessTypeDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefConditionDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefConditionDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefDataMaskTypeDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefDataMaskTypeDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefGroupDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefGroupDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefRoleDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefRoleDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefUserDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyRefUserDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPolicyResourceMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPolicyResourceMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPortalUserDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPortalUserDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXPortalUserRoleDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXPortalUserRoleDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRMSMappingProviderDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRMSMappingProviderDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRMSNotificationDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRMSNotificationDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRMSResourceMappingDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRMSResourceMappingDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRMSServiceResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRMSServiceResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXResourceDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXResourceDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRoleDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRoleDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRoleRefGroupDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRoleRefGroupDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRoleRefRoleDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRoleRefRoleDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXRoleRefUserDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXRoleRefUserDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefGroupDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefGroupDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefRoleDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefRoleDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefServiceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefServiceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefTagServiceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefTagServiceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefUserDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXSecurityZoneRefUserDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceConfigDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceConfigDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceConfigMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceConfigMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceResourceDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceResourceDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceResourceElementDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceResourceElementDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceResourceElementValueDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceResourceElementValueDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXServiceVersionInfoDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXServiceVersionInfoDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTagAttributeDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTagAttributeDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTagAttributeDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTagAttributeDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTagChangeLogDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTagChangeLogDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTagDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTagDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTagDefDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTagDefDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTagResourceMapDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTagResourceMapDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXTrxLogV2Dao.java](../security-admin/src/main/java/org/apache/ranger/db/XXTrxLogV2Dao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXUgsyncAuditInfoDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXUgsyncAuditInfoDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXUserDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXUserDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/db/XXUserPermissionDao.java](../security-admin/src/main/java/org/apache/ranger/db/XXUserPermissionDao.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/elasticsearch/ElasticSearchAccessAuditsService.java](../security-admin/src/main/java/org/apache/ranger/elasticsearch/ElasticSearchAccessAuditsService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/elasticsearch/ElasticSearchMgr.java](../security-admin/src/main/java/org/apache/ranger/elasticsearch/ElasticSearchMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/elasticsearch/ElasticSearchUtil.java](../security-admin/src/main/java/org/apache/ranger/elasticsearch/ElasticSearchUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAccessAudit.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAccessAudit.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAccessAuditBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAccessAuditBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAccessAuditV4.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAccessAuditV4.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAccessAuditV5.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAccessAuditV5.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAccessTypeDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAccessTypeDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAccessTypeDefGrants.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAccessTypeDefGrants.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAsset.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAsset.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAuditMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAuditMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXAuthSession.java](../security-admin/src/main/java/org/apache/ranger/entity/XXAuthSession.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXContextEnricherDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXContextEnricherDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXCredentialStore.java](../security-admin/src/main/java/org/apache/ranger/entity/XXCredentialStore.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXDBBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXDBBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXDataHist.java](../security-admin/src/main/java/org/apache/ranger/entity/XXDataHist.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXDataMaskTypeDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXDataMaskTypeDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXEnumDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXEnumDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXEnumElementDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXEnumElementDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsDataShare.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsDataShare.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsDataShareInDataset.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsDataShareInDataset.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsDataset.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsDataset.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsDatasetInProject.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsDatasetInProject.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsDatasetPolicyMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsDatasetPolicyMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsProject.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsProject.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsProjectPolicyMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsProjectPolicyMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGdsSharedResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGdsSharedResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGlobalState.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGlobalState.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGlobalStateBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGlobalStateBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGroup.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGroup.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGroupGroup.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGroupGroup.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGroupPermission.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGroupPermission.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXGroupUser.java](../security-admin/src/main/java/org/apache/ranger/entity/XXGroupUser.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXModuleDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXModuleDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPermMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPermMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPluginInfo.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPluginInfo.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicy.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicy.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyChangeLog.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyChangeLog.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyConditionDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyConditionDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyExportAudit.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyExportAudit.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItem.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItem.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemAccess.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemAccess.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemCondition.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemCondition.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemDataMaskInfo.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemDataMaskInfo.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemGroupPerm.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemGroupPerm.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemRowFilterInfo.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemRowFilterInfo.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemUserPerm.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyItemUserPerm.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyLabel.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyLabel.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyLabelMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyLabelMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefAccessType.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefAccessType.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefCondition.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefCondition.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefDataMaskType.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefDataMaskType.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefGroup.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefGroup.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefRole.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefRole.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefUser.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyRefUser.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyResourceMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyResourceMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPolicyWithAssignedId.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPolicyWithAssignedId.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPortalUser.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPortalUser.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXPortalUserRole.java](../security-admin/src/main/java/org/apache/ranger/entity/XXPortalUserRole.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRMSMappingProvider.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRMSMappingProvider.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRMSNotification.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRMSNotification.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRMSResourceMapping.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRMSResourceMapping.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRMSServiceResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRMSServiceResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXResourceDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXResourceDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRole.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRole.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRoleBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRoleBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRoleRefGroup.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRoleRefGroup.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRoleRefRole.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRoleRefRole.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXRoleRefUser.java](../security-admin/src/main/java/org/apache/ranger/entity/XXRoleRefUser.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZone.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZone.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefGroup.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefGroup.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefRole.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefRole.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefService.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefTagService.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefTagService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefUser.java](../security-admin/src/main/java/org/apache/ranger/entity/XXSecurityZoneRefUser.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXService.java](../security-admin/src/main/java/org/apache/ranger/entity/XXService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceConfigDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceConfigDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceConfigMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceConfigMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceDefBase.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceDefBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceDefWithAssignedId.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceDefWithAssignedId.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceResource.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceResource.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceResourceElement.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceResourceElement.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceResourceElementValue.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceResourceElementValue.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceVersionInfo.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceVersionInfo.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXServiceWithAssignedId.java](../security-admin/src/main/java/org/apache/ranger/entity/XXServiceWithAssignedId.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTag.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTag.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTagAttribute.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTagAttribute.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTagAttributeDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTagAttributeDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTagChangeLog.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTagChangeLog.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTagDef.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTagDef.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTagResourceMap.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTagResourceMap.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTrxLog.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTrxLog.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXTrxLogV2.java](../security-admin/src/main/java/org/apache/ranger/entity/XXTrxLogV2.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXUgsyncAuditInfo.java](../security-admin/src/main/java/org/apache/ranger/entity/XXUgsyncAuditInfo.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXUser.java](../security-admin/src/main/java/org/apache/ranger/entity/XXUser.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/XXUserPermission.java](../security-admin/src/main/java/org/apache/ranger/entity/XXUserPermission.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/entity/view/VXXPrincipal.java](../security-admin/src/main/java/org/apache/ranger/entity/view/VXXPrincipal.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/metrics/RangerAdminMetricsWrapper.java](../security-admin/src/main/java/org/apache/ranger/metrics/RangerAdminMetricsWrapper.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchAssignSecurityZonePersmissionToAdmin_J10026.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchAssignSecurityZonePersmissionToAdmin_J10026.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForAllServiceDefForPolicyConditionUpdate_J10060.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForAllServiceDefForPolicyConditionUpdate_J10060.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForAllServiceDefUpdateForDefaultAuditFilters_J10049.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForAllServiceDefUpdateForDefaultAuditFilters_J10049.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForAllServiceDefUpdateForResourceSpecificAccesses_J10012.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForAllServiceDefUpdateForResourceSpecificAccesses_J10012.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForAtlasResourceAndAccessTypeUpdate_J10016.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForAtlasResourceAndAccessTypeUpdate_J10016.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForAtlasServiceDefUpdate_J10013.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForAtlasServiceDefUpdate_J10013.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForDefaultAuidtFilters_J10050.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForDefaultAuidtFilters_J10050.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForExternalUserStatusUpdate_J10056.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForExternalUserStatusUpdate_J10056.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHBaseDefaultPolicyUpdate_J10045.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHBaseDefaultPolicyUpdate_J10045.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHBaseServiceDefUpdate_J10035.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHBaseServiceDefUpdate_J10035.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10006.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10006.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10007.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10007.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10009.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10009.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10010.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10010.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10017.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10017.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10027.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10027.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10030.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForHiveServiceDefUpdate_J10030.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForKafkaServiceDefUpdate_J10015.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForKafkaServiceDefUpdate_J10015.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForKafkaServiceDefUpdate_J10025.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForKafkaServiceDefUpdate_J10025.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForKafkaServiceDefUpdate_J10033.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForKafkaServiceDefUpdate_J10033.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForMigratingOldRegimePolicyJson_J10046.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForMigratingOldRegimePolicyJson_J10046.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForMigratingRangerServiceResource_J10037.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForMigratingRangerServiceResource_J10037.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForNifiResourceUpdateExclude_J10011.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForNifiResourceUpdateExclude_J10011.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForOzoneDefaultPoliciesUpdate_J10044.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForOzoneDefaultPoliciesUpdate_J10044.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForOzoneServiceDefConfigUpdate_J10051.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForOzoneServiceDefConfigUpdate_J10051.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForOzoneServiceDefUpdate_J10041.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForOzoneServiceDefUpdate_J10041.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForSolrSvcDefAndPoliciesUpdate_J10055.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForSolrSvcDefAndPoliciesUpdate_J10055.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForSyncSourceUpdate_J10054.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForSyncSourceUpdate_J10054.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForTagServiceDefUpdate_J10008.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForTagServiceDefUpdate_J10008.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForTagServiceDefUpdate_J10028.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForTagServiceDefUpdate_J10028.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForTrinoSvcDefUpdate_J10062.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForTrinoSvcDefUpdate_J10062.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForUpdatingAtlasSvcDefAndTagPolicies_J10063.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForUpdatingAtlasSvcDefAndTagPolicies_J10063.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForUpdatingPolicyJson_J10019.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForUpdatingPolicyJson_J10019.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForUpdatingTagsJson_J10020.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForUpdatingTagsJson_J10020.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchForXGlobalState_J10036.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchForXGlobalState_J10036.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchGrantAuditPermissionToKeyRoleUser_J10014.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchGrantAuditPermissionToKeyRoleUser_J10014.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchMigration_J10002.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchMigration_J10002.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchPermissionModel_J10003.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchPermissionModel_J10003.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchPreSql_057_ForUpdateToUniqueGUID_J10052.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchPreSql_057_ForUpdateToUniqueGUID_J10052.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchPreSql_058_ForUpdateToUniqueResoureceSignature_J10053.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchPreSql_058_ForUpdateToUniqueResoureceSignature_J10053.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchSetAccessTypeCategory_J10061.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchSetAccessTypeCategory_J10061.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/PatchTagModulePermission_J10005.java](../security-admin/src/main/java/org/apache/ranger/patch/PatchTagModulePermission_J10005.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/cliutil/ChangePasswordUtil.java](../security-admin/src/main/java/org/apache/ranger/patch/cliutil/ChangePasswordUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/cliutil/ChangeUserNameUtil.java](../security-admin/src/main/java/org/apache/ranger/patch/cliutil/ChangeUserNameUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/cliutil/MetricUtil.java](../security-admin/src/main/java/org/apache/ranger/patch/cliutil/MetricUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/cliutil/RoleBasedUserSearchUtil.java](../security-admin/src/main/java/org/apache/ranger/patch/cliutil/RoleBasedUserSearchUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/cliutil/TrxLogV2MigrationUtil.java](../security-admin/src/main/java/org/apache/ranger/patch/cliutil/TrxLogV2MigrationUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/patch/cliutil/UpdateUserAndGroupNamesInJson.java](../security-admin/src/main/java/org/apache/ranger/patch/cliutil/UpdateUserAndGroupNamesInJson.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/AssetREST.java](../security-admin/src/main/java/org/apache/ranger/rest/AssetREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/GdsREST.java](../security-admin/src/main/java/org/apache/ranger/rest/GdsREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/MetricsREST.java](../security-admin/src/main/java/org/apache/ranger/rest/MetricsREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/PublicAPIs.java](../security-admin/src/main/java/org/apache/ranger/rest/PublicAPIs.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/PublicAPIsv2.java](../security-admin/src/main/java/org/apache/ranger/rest/PublicAPIsv2.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/RangerHealthREST.java](../security-admin/src/main/java/org/apache/ranger/rest/RangerHealthREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/RoleREST.java](../security-admin/src/main/java/org/apache/ranger/rest/RoleREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/SecurityZoneREST.java](../security-admin/src/main/java/org/apache/ranger/rest/SecurityZoneREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/ServiceREST.java](../security-admin/src/main/java/org/apache/ranger/rest/ServiceREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/ServiceRESTUtil.java](../security-admin/src/main/java/org/apache/ranger/rest/ServiceRESTUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/ServiceTagsProcessor.java](../security-admin/src/main/java/org/apache/ranger/rest/ServiceTagsProcessor.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/TagREST.java](../security-admin/src/main/java/org/apache/ranger/rest/TagREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/UserREST.java](../security-admin/src/main/java/org/apache/ranger/rest/UserREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/XAuditREST.java](../security-admin/src/main/java/org/apache/ranger/rest/XAuditREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/XKeyREST.java](../security-admin/src/main/java/org/apache/ranger/rest/XKeyREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/rest/XUserREST.java](../security-admin/src/main/java/org/apache/ranger/rest/XUserREST.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/context/RangerAPIMapping.java](../security-admin/src/main/java/org/apache/ranger/security/context/RangerAPIMapping.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/context/RangerPreAuthSecurityHandler.java](../security-admin/src/main/java/org/apache/ranger/security/context/RangerPreAuthSecurityHandler.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/listener/RangerHttpSessionListener.java](../security-admin/src/main/java/org/apache/ranger/security/listener/RangerHttpSessionListener.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/listener/SpringEventListener.java](../security-admin/src/main/java/org/apache/ranger/security/listener/SpringEventListener.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/authentication/CustomLogoutSuccessHandler.java](../security-admin/src/main/java/org/apache/ranger/security/web/authentication/CustomLogoutSuccessHandler.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerAuthFailureHandler.java](../security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerAuthFailureHandler.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerAuthSuccessHandler.java](../security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerAuthSuccessHandler.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerAuthenticationEntryPoint.java](../security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerAuthenticationEntryPoint.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerSessionFixationProtectionStrategy.java](../security-admin/src/main/java/org/apache/ranger/security/web/authentication/RangerSessionFixationProtectionStrategy.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/MyRememberMeFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/MyRememberMeFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerCSRFPreventionFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerCSRFPreventionFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerJwtAuthFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerJwtAuthFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerJwtAuthWrapper.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerJwtAuthWrapper.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerKRBAuthenticationFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerKRBAuthenticationFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerKrbFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerKrbFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerMDCFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerMDCFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerSSOAuthenticationFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerSSOAuthenticationFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerSecurityContextFormationFilter.java](../security-admin/src/main/java/org/apache/ranger/security/web/filter/RangerSecurityContextFormationFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/AbstractAuditedResourceService.java](../security-admin/src/main/java/org/apache/ranger/service/AbstractAuditedResourceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/AbstractBaseResourceService.java](../security-admin/src/main/java/org/apache/ranger/service/AbstractBaseResourceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerAuditedModelService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerAuditedModelService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerBaseModelService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerBaseModelService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerDataHistService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerDataHistService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerGdsDataShareInDatasetService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerGdsDataShareInDatasetService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerGdsDataShareService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerGdsDataShareService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerGdsDatasetInProjectService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerGdsDatasetInProjectService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerGdsDatasetService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerGdsDatasetService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerGdsProjectService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerGdsProjectService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerGdsSharedResourceService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerGdsSharedResourceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerPluginInfoService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerPluginInfoService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerPolicyServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerPolicyServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerRoleService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerRoleService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerSecurityZoneServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerSecurityZoneServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerSecurityZoneServiceService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerSecurityZoneServiceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceDefService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceDefService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceDefServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceDefServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceResourceService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceResourceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceResourceServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceResourceServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceResourceWithTagsService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceResourceWithTagsService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerServiceServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerServiceServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTagDefService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTagDefService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTagDefServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTagDefServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTagResourceMapService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTagResourceMapService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTagResourceMapServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTagResourceMapServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTagService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTagService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTagServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTagServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTransactionService.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTransactionService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/RangerTrxLogV2Service.java](../security-admin/src/main/java/org/apache/ranger/service/RangerTrxLogV2Service.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XAccessAuditService.java](../security-admin/src/main/java/org/apache/ranger/service/XAccessAuditService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XGroupServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/XGroupServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XGroupUserService.java](../security-admin/src/main/java/org/apache/ranger/service/XGroupUserService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XPolicyService.java](../security-admin/src/main/java/org/apache/ranger/service/XPolicyService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XRepositoryService.java](../security-admin/src/main/java/org/apache/ranger/service/XRepositoryService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XResourceService.java](../security-admin/src/main/java/org/apache/ranger/service/XResourceService.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/XUserServiceBase.java](../security-admin/src/main/java/org/apache/ranger/service/XUserServiceBase.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/service/filter/RangerRESTAPIFilter.java](../security-admin/src/main/java/org/apache/ranger/service/filter/RangerRESTAPIFilter.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/solr/SolrMgr.java](../security-admin/src/main/java/org/apache/ranger/solr/SolrMgr.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/solr/SolrUtil.java](../security-admin/src/main/java/org/apache/ranger/solr/SolrUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/solr/krb/InMemoryJAASConfiguration.java](../security-admin/src/main/java/org/apache/ranger/solr/krb/InMemoryJAASConfiguration.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/util/CLIUtil.java](../security-admin/src/main/java/org/apache/ranger/util/CLIUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/util/RangerAdminCache.java](../security-admin/src/main/java/org/apache/ranger/util/RangerAdminCache.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/util/RangerMetricsUtil.java](../security-admin/src/main/java/org/apache/ranger/util/RangerMetricsUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/util/RangerServerHealthUtil.java](../security-admin/src/main/java/org/apache/ranger/util/RangerServerHealthUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/util/RestUtil.java](../security-admin/src/main/java/org/apache/ranger/util/RestUtil.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/validation/RangerGdsValidationDBProvider.java](../security-admin/src/main/java/org/apache/ranger/validation/RangerGdsValidationDBProvider.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/validation/RangerGdsValidator.java](../security-admin/src/main/java/org/apache/ranger/validation/RangerGdsValidator.java) | Updated |
| [security-admin/src/main/java/org/apache/ranger/view/RangerGdsVList.java](../security-admin/src/main/java/org/apache/ranger/view/RangerGdsVList.java) | Updated |
| [security-admin/src/main/resources/META-INF/jpa_named_queries.xml](../security-admin/src/main/resources/META-INF/jpa_named_queries.xml) | Updated |
| [security-admin/src/main/resources/META-INF/persistence.xml](../security-admin/src/main/resources/META-INF/persistence.xml) | Updated |
| [security-admin/src/main/webapp/WEB-INF/web.xml](../security-admin/src/main/webapp/WEB-INF/web.xml) | Updated |
| [security-admin/src/test/java/org/apache/ranger/audit/TestAuditQueue.java](../security-admin/src/test/java/org/apache/ranger/audit/TestAuditQueue.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/audit/TestConsumer.java](../security-admin/src/test/java/org/apache/ranger/audit/TestConsumer.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/audit/destination/AmazonCloudWatchAuditDestinationTest.java](../security-admin/src/test/java/org/apache/ranger/audit/destination/AmazonCloudWatchAuditDestinationTest.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestPolicyAdmin.java](../security-admin/src/test/java/org/apache/ranger/biz/TestPolicyAdmin.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestPolicyDb.java](../security-admin/src/test/java/org/apache/ranger/biz/TestPolicyDb.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestRangerBizUtil.java](../security-admin/src/test/java/org/apache/ranger/biz/TestRangerBizUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestRoleDBStore.java](../security-admin/src/test/java/org/apache/ranger/biz/TestRoleDBStore.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestSecurityZoneDBStore.java](../security-admin/src/test/java/org/apache/ranger/biz/TestSecurityZoneDBStore.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestServiceDBStore.java](../security-admin/src/test/java/org/apache/ranger/biz/TestServiceDBStore.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestTagDBStore.java](../security-admin/src/test/java/org/apache/ranger/biz/TestTagDBStore.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestUserMgr.java](../security-admin/src/test/java/org/apache/ranger/biz/TestUserMgr.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/biz/TestXUserMgr.java](../security-admin/src/test/java/org/apache/ranger/biz/TestXUserMgr.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestContextUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestContextUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestDateUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestDateUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestJSONUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestJSONUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestPropertiesUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestPropertiesUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestRangerConfigUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestRangerConfigUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestRangerSearchUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestRangerSearchUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestServiceUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestServiceUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestStringUtil.java](../security-admin/src/test/java/org/apache/ranger/common/TestStringUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/TestTimedExecutor.java](../security-admin/src/test/java/org/apache/ranger/common/TestTimedExecutor.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/common/db/TestRangerTransactionSynchronizationAdapter.java](../security-admin/src/test/java/org/apache/ranger/common/db/TestRangerTransactionSynchronizationAdapter.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/elasticsearch/ElasticSearchAccessAuditsServiceTest.java](../security-admin/src/test/java/org/apache/ranger/elasticsearch/ElasticSearchAccessAuditsServiceTest.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/patch/cliutil/TestRoleBasedUserSearchUtil.java](../security-admin/src/test/java/org/apache/ranger/patch/cliutil/TestRoleBasedUserSearchUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestAssetREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestAssetREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestMetricsREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestMetricsREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestPublicAPIs.java](../security-admin/src/test/java/org/apache/ranger/rest/TestPublicAPIs.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestPublicAPIsv2.java](../security-admin/src/test/java/org/apache/ranger/rest/TestPublicAPIsv2.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestRangerHealthREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestRangerHealthREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestRoleREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestRoleREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestSecurityZoneREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestSecurityZoneREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestServiceREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestServiceREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestServiceTagProcessor.java](../security-admin/src/test/java/org/apache/ranger/rest/TestServiceTagProcessor.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestTagREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestTagREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestUserREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestUserREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestXAuditREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestXAuditREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestXKeyREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestXKeyREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/rest/TestXUserREST.java](../security-admin/src/test/java/org/apache/ranger/rest/TestXUserREST.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/security/web/filter/TestRangerCSRFPreventionFilter.java](../security-admin/src/test/java/org/apache/ranger/security/web/filter/TestRangerCSRFPreventionFilter.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/security/web/filter/TestRangerMDCFilter.java](../security-admin/src/test/java/org/apache/ranger/security/web/filter/TestRangerMDCFilter.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestAuthSessionService.java](../security-admin/src/test/java/org/apache/ranger/service/TestAuthSessionService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerAuditFields.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerAuditFields.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerDataHistService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerDataHistService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerPolicyService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerPolicyService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerPolicyServiceBase.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerPolicyServiceBase.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceDefService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceDefService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceDefServiceBase.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceDefServiceBase.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceServiceBase.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceServiceBase.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceWithAssignedIdService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerServiceWithAssignedIdService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerTagDefService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerTagDefService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerTagDefServiceBase.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerTagDefServiceBase.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerTagResourceMapService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerTagResourceMapService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerTagService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerTagService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestRangerTransactionService.java](../security-admin/src/test/java/org/apache/ranger/service/TestRangerTransactionService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestUserService.java](../security-admin/src/test/java/org/apache/ranger/service/TestUserService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXAccessAuditService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXAccessAuditService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXAssetService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXAssetService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXAuditMapService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXAuditMapService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXGroupPermissionService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXGroupPermissionService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXGroupService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXGroupService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXGroupUserService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXGroupUserService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/TestXPermMapService.java](../security-admin/src/test/java/org/apache/ranger/service/TestXPermMapService.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/service/filter/TestRangerRESTAPIFilter.java](../security-admin/src/test/java/org/apache/ranger/service/filter/TestRangerRESTAPIFilter.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/util/BaseTest.java](../security-admin/src/test/java/org/apache/ranger/util/BaseTest.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/util/TestRangerEnumUtil.java](../security-admin/src/test/java/org/apache/ranger/util/TestRangerEnumUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/util/TestRangerMetricsUtil.java](../security-admin/src/test/java/org/apache/ranger/util/TestRangerMetricsUtil.java) | Updated |
| [security-admin/src/test/java/org/apache/ranger/util/TestRangerServerHealthUtil.java](../security-admin/src/test/java/org/apache/ranger/util/TestRangerServerHealthUtil.java) | Updated |
| [storm-agent/pom.xml](../storm-agent/pom.xml) | Updated |
| [storm-agent/src/main/java/org/apache/ranger/services/storm/RangerServiceStorm.java](../storm-agent/src/main/java/org/apache/ranger/services/storm/RangerServiceStorm.java) | Updated |
| [storm-agent/src/main/java/org/apache/ranger/services/storm/client/StormClient.java](../storm-agent/src/main/java/org/apache/ranger/services/storm/client/StormClient.java) | Updated |
| [storm-agent/src/main/java/org/apache/ranger/services/storm/client/StormConnectionMgr.java](../storm-agent/src/main/java/org/apache/ranger/services/storm/client/StormConnectionMgr.java) | Updated |
| [storm-agent/src/test/java/org/apache/ranger/authorization/storm/StormRangerAuthorizerTest.java](../storm-agent/src/test/java/org/apache/ranger/authorization/storm/StormRangerAuthorizerTest.java) | Updated |
| [tagsync/pom.xml](../tagsync/pom.xml) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/ha/TagSyncHAInitializerImpl.java](../tagsync/src/main/java/org/apache/ranger/tagsync/ha/TagSyncHAInitializerImpl.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/nestedstructureplugin/AtlasNestedStructureResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/nestedstructureplugin/AtlasNestedStructureResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/process/TagSyncConfig.java](../tagsync/src/main/java/org/apache/ranger/tagsync/process/TagSyncConfig.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/process/TagSynchronizer.java](../tagsync/src/main/java/org/apache/ranger/tagsync/process/TagSynchronizer.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/sink/tagadmin/TagAdminRESTSink.java](../tagsync/src/main/java/org/apache/ranger/tagsync/sink/tagadmin/TagAdminRESTSink.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasAdlsResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasAdlsResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasHbaseResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasHbaseResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasHdfsResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasHdfsResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasHiveResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasHiveResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasKafkaResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasKafkaResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasNotificationMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasNotificationMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasOzoneResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasOzoneResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasResourceMapperUtil.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasResourceMapperUtil.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasStormResourceMapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasStormResourceMapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasTagSource.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/AtlasTagSource.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/EntityNotificationWrapper.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlas/EntityNotificationWrapper.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlasrest/AtlasRESTTagSource.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlasrest/AtlasRESTTagSource.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/atlasrest/RangerAtlasEntityWithTags.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/atlasrest/RangerAtlasEntityWithTags.java) | Updated |
| [tagsync/src/main/java/org/apache/ranger/tagsync/source/file/FileTagSource.java](../tagsync/src/main/java/org/apache/ranger/tagsync/source/file/FileTagSource.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/nestedstructureplugin/ResourceTests.java](../tagsync/src/test/java/org/apache/ranger/tagsync/nestedstructureplugin/ResourceTests.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestAdlsResourceMapper.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestAdlsResourceMapper.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestHbaseResourceMapper.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestHbaseResourceMapper.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestHdfsResourceMapper.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestHdfsResourceMapper.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestHiveResourceMapper.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestHiveResourceMapper.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestKafkaResourceMapper.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestKafkaResourceMapper.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestOzoneResourceMapper.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestOzoneResourceMapper.java) | Updated |
| [tagsync/src/test/java/org/apache/ranger/tagsync/process/TestTagSynchronizer.java](../tagsync/src/test/java/org/apache/ranger/tagsync/process/TestTagSynchronizer.java) | Updated |
| [ugsync-util/pom.xml](../ugsync-util/pom.xml) | Updated |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/pom.xml](../ugsync/ldapconfigchecktool/ldapconfigcheck/pom.xml) | Updated |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/AuthenticationCheck.java](../ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/AuthenticationCheck.java) | Updated |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/LdapConfig.java](../ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/LdapConfig.java) | Updated |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/LdapConfigCheckMain.java](../ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/LdapConfigCheckMain.java) | Updated |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/UserSync.java](../ugsync/ldapconfigchecktool/ldapconfigcheck/src/main/java/org/apache/ranger/ldapconfigcheck/UserSync.java) | Updated |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/.plxarc](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/.plxarc) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/antrun/build-main.xml](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/antrun/build-main.xml) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/classes/META-INF/DEPENDENCIES](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/classes/META-INF/DEPENDENCIES) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/classes/META-INF/LICENSE](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/classes/META-INF/LICENSE) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/classes/META-INF/NOTICE](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/classes/META-INF/NOTICE) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/maven-shared-archive-resources/META-INF/DEPENDENCIES](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/maven-shared-archive-resources/META-INF/DEPENDENCIES) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/maven-shared-archive-resources/META-INF/LICENSE](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/maven-shared-archive-resources/META-INF/LICENSE) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/maven-shared-archive-resources/META-INF/NOTICE](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/maven-shared-archive-resources/META-INF/NOTICE) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/test-classes/META-INF/DEPENDENCIES](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/test-classes/META-INF/DEPENDENCIES) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/test-classes/META-INF/LICENSE](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/test-classes/META-INF/LICENSE) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/test-classes/META-INF/NOTICE](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/test-classes/META-INF/NOTICE) | Added |
| [ugsync/ldapconfigchecktool/ldapconfigcheck/target/version](../ugsync/ldapconfigchecktool/ldapconfigcheck/target/version) | Added |
| [ugsync/pom.xml](../ugsync/pom.xml) | Updated |
| [ugsync/src/main/java/org/apache/ranger/ldapusersync/process/LdapUserGroupBuilder.java](../ugsync/src/main/java/org/apache/ranger/ldapusersync/process/LdapUserGroupBuilder.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/unixusersync/config/UserGroupSyncConfig.java](../ugsync/src/main/java/org/apache/ranger/unixusersync/config/UserGroupSyncConfig.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/unixusersync/process/FileSourceUserGroupBuilder.java](../ugsync/src/main/java/org/apache/ranger/unixusersync/process/FileSourceUserGroupBuilder.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/unixusersync/process/PolicyMgrUserGroupBuilder.java](../ugsync/src/main/java/org/apache/ranger/unixusersync/process/PolicyMgrUserGroupBuilder.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/unixusersync/process/RangerUgSyncRESTClient.java](../ugsync/src/main/java/org/apache/ranger/unixusersync/process/RangerUgSyncRESTClient.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/unixusersync/process/UnixUserGroupBuilder.java](../ugsync/src/main/java/org/apache/ranger/unixusersync/process/UnixUserGroupBuilder.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/usergroupsync/AbstractUserGroupSource.java](../ugsync/src/main/java/org/apache/ranger/usergroupsync/AbstractUserGroupSource.java) | Updated |
| [ugsync/src/main/java/org/apache/ranger/usergroupsync/RegEx.java](../ugsync/src/main/java/org/apache/ranger/usergroupsync/RegEx.java) | Updated |
| [ugsync/src/test/java/org/apache/ranger/unixusersync/process/TestFileSourceUserGroupBuilder.java](../ugsync/src/test/java/org/apache/ranger/unixusersync/process/TestFileSourceUserGroupBuilder.java) | Updated |
| [ugsync/src/test/java/org/apache/ranger/unixusersync/process/TestUnixUserGroupBuilder.java](../ugsync/src/test/java/org/apache/ranger/unixusersync/process/TestUnixUserGroupBuilder.java) | Updated |
| [ugsync/src/test/java/org/apache/ranger/usergroupsync/PolicyMgrUserGroupBuilderTest.java](../ugsync/src/test/java/org/apache/ranger/usergroupsync/PolicyMgrUserGroupBuilderTest.java) | Updated |
| [ugsync/src/test/java/org/apache/ranger/usergroupsync/TestLdapUserGroup.java](../ugsync/src/test/java/org/apache/ranger/usergroupsync/TestLdapUserGroup.java) | Updated |
| [ugsync/src/test/java/org/apache/ranger/usergroupsync/TestRegEx.java](../ugsync/src/test/java/org/apache/ranger/usergroupsync/TestRegEx.java) | Updated |
| [unixauthclient/pom.xml](../unixauthclient/pom.xml) | Updated |
| [unixauthclient/src/main/java/org/apache/ranger/authentication/unix/jaas/ConsolePromptCallbackHandler.java](../unixauthclient/src/main/java/org/apache/ranger/authentication/unix/jaas/ConsolePromptCallbackHandler.java) | Updated |
| [unixauthclient/src/main/java/org/apache/ranger/authentication/unix/jaas/UsernamePasswordCallbackHandler.java](../unixauthclient/src/main/java/org/apache/ranger/authentication/unix/jaas/UsernamePasswordCallbackHandler.java) | Updated |
| [unixauthnative/pom.xml](../unixauthnative/pom.xml) | Updated |
| [unixauthpam/pom.xml](../unixauthpam/pom.xml) | Updated |
| [unixauthservice/pom.xml](../unixauthservice/pom.xml) | Updated |

### Next steps <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="next-steps"></a>

1. Please review and accept the code changes using the diff viewer.If you are using a Private Repository, please ensure that updated dependencies are available.
1. 
1. In order to successfully verify these changes on your machine, you will need to change your project to Java 17. We verified the changes using [Amazon Corretto Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/what-is-corretto-17.html
) build environment.
1. If this project uses Maven CheckStyle, Enforcer, FindBugs or SpotBugs plugins, Q Code Transformation will disable those plugins when we build the project to verify proposed upgrades.