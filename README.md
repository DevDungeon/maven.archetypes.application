DevDungeon Library Maven Archetype
==================================

[![Maven metadata URI](https://img.shields.io/maven-metadata/v/http/central.maven.org/maven2/com/devdungeon/maven/archetypes/application/maven-metadata.xml.svg)]()

This archetype is for creating DevDungeon applications.

## Installation

Run `mvn install` on this project to install it to your local repository
and then you can run `mvn archetype:generate` using the following command.

## Generating a new project using this archetype

Minimal options, will prompt for needed values

    mvn archetype:generate                                  \
      -DarchetypeGroupId=com.devdungeon.maven.archetypes    \
      -DarchetypeArtifactId=application                     \
      -DarchetypeVersion=0.1.0
      
Provide all values at once

    mvn archetype:generate                                  \
      -DarchetypeGroupId=com.devdungeon.maven.archetypes    \
      -DarchetypeArtifactId=application                     \
      -DarchetypeVersion=0.1.0                              \
      -DgroupId=com.devdungeon.apps                         \
      -DartifactId=appname                                  \
      -Dversion=1.0.0
