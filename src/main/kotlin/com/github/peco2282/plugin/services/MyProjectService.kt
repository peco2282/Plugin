package com.github.peco2282.plugin.services

import com.intellij.openapi.project.Project
import com.github.peco2282.plugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
