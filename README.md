# KotlinNativeTestAndroid
Android app demonstrating consuming a cross platform Kotlin library defined outside of the project [here](https://github.com/bridgeri127/KotlinNativeTestLibrary).

This library was used as part of a talk I gave at the [Mobilize Dublin](https://www.meetup.com/Mobilize-Dublin/) meetup on [22 August 2018](https://www.meetup.com/Mobilize-Dublin/events/lnsxzpyxlbdc/)
Slides from this talk can be found at 

# How to use
1. Download the [Kotlin Native Test Library](https://github.com/bridgeri127/KotlinNativeTestLibrary) project
2. Build that project following the instructions [here](https://github.com/bridgeri127/KotlinNativeTestLibrary/blob/master/README.md)
3. From the root of that project, run the command `./gradlew publishToMavenLocal`
4. Rebuild this project, it should now find the library in the mavenLocal repository
