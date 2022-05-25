package com.github.kchsherbakov.datasourcer.services

import com.intellij.openapi.project.Project
import com.github.kchsherbakov.datasourcer.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
