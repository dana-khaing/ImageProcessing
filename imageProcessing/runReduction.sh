#!/bin/sh
rm -rf ARTValuePlugin.class
javac                      --module-path /Users/dana_khaing/JavaFX/lib --add-modules javafx.controls -cp .:art.jar ARTValuePlugin.java
java -Dprism.forceGPU=true --module-path /Users/dana_khaing/JavaFX/lib --add-modules javafx.controls -cp .:art.jar uk.ac.rhul.cs.csle.art.ARTFX Reduction.art
