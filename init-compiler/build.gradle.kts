plugins {
    id("kotlin")
    id("maven-publish")
}

dependencies {
    annotationProcessor("com.google.auto.service:auto-service:1.0")
    implementation("com.squareup:kotlinpoet:1.10.2")
    implementation(project(":init-annotation"))
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["java"])
            }
        }
    }
}
