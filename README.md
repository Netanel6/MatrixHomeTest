# MatrixHomeAssignment


This repository includes 
keystore.properties file in the root path,
you can generate apk as release or debug mode.

NetworkManager is the only class is JAVA. I admit I had some problems with the T generic type and the Any type with Kotlin
so I've decided to write this class in JAVA so you will see my writing skills in JAVA too

If you are having trouble configuring SDK or build the app, just go to the root hidden .idea file a and delete 
.idea/gradle.xml
.idea/workspace.xml

then, go to File -> Invalidate caches/restart.
this should do the trick.

if still having build issues with the gradle.properties try to place your own gradle-wrapper.properties
inside root/gradle/wrapper file location
