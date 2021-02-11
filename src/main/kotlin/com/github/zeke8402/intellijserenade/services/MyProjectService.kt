package com.github.zeke8402.intellijserenade.services

import com.github.zeke8402.intellijserenade.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
