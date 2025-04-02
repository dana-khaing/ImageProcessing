#!/bin/sh
javac --module-path /Users/dana_khaing/JavaFX/lib --add-modules javafx.controls -cp .:art.jar ARTValuePlugin.java
java  -Dprism.forceGPU=true --module-path /Users/dana_khaing/JavaFX/lib --add-modules javafx.controls -cp .:art.jar uk.ac.rhul.cs.csle.art.ART Attribute.art !generate actions
javac --module-path /Users/dana_khaing/JavaFX/lib --add-modules javafx.controls -cp .:art.jar ARTGeneratedActions.java
java  -Dprism.forceGPU=true --module-path /Users/dana_khaing/JavaFX/lib --add-modules javafx.controls -cp .:art.jar uk.ac.rhul.cs.csle.art.ARTFX !interpreter attributeAction Attribute.art
