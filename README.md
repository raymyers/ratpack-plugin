# Ratpack

## A Micro Web Framework for Groovy

Ratpack is inspired by the excellent [Sinatra](http://www.sinatrarb.com/) framework for Ruby, and aims to make Groovy web development more classy.

This project is the Ratpack Project Template. If you want to start a new Ratpack application, you are in the right place. You can fork this repo, clone it, or just [download the files](https://github.com/tlberglund/ratpack-template/zipball/master). And use them directly. (When you are starting your own Ratpack application, you may not want to maintain a version history with this template starter project.)

## A Ratpack Project is a Gradle Build

All Ratpack applications are built with Gradle. If you don't have Gradle installed, don't worry. Just run the `gradlew` command, and Gradle will be downloaded and cached for you.
To turn your build into a Ratpack project, apply the plugin as follows:

```
   apply plugin: 'ratpack'
   
   buildscript {
     repositories {
       mavenCentral()
     }
     dependencies {
       classpath 'com.augusttechgroup:ratpack-plugin:0.5'
     }
   }
   
   dependencies {
     groovy 'org.codehaus.groovy:groovy:1.8.6'
   }
```
 
## Using Ratpack

For documentation on Ratpack itself, see the [Ratpack Project Template](http://github.com/tlberglund/ratpack-template).
