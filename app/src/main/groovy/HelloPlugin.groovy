package com.neo

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project>
{

    @Override
    void apply(Project project) {
        project.task('helloPluginTask') {
            group 'neo'
            doLast {
                println 'hell i am a task in plugin'
            }
        }
        project.extensions.add("personExt", com.neo.PersonExt)

        project.task('printPerson') {
            group 'neo'

            doLast{
                com.neo.PersonExt ext = project.personExt

                println ext
            }
        }
    }
}
