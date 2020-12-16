package com.github.cgimenes.intellijdbml.services

import com.intellij.openapi.project.Project
import com.github.cgimenes.intellijdbml.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
