package com.os.operando.gradle.zondokokiyoshi

import com.android.build.gradle.api.BaseVariant
import org.gradle.api.DomainObjectCollection
import org.gradle.api.Plugin
import org.gradle.api.Project

class ZondokoKiyoshiPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        if (project.plugins.hasPlugin('com.android.application')) {
            applyAndroid(project, (DomainObjectCollection<BaseVariant>) project.android.applicationVariants);
        } else if (project.plugins.hasPlugin('com.android.library')) {
            applyAndroid(project, (DomainObjectCollection<BaseVariant>) project.android.libraryVariants);
        } else {
            project.tasks.create('zungokokiyoshi', ZungokokiyoshiTask)
        }
    }

    private static void applyAndroid(Project project, DomainObjectCollection<BaseVariant> variants) {
        variants.all { variant ->
            variant.outputs.each { output ->
                def slug = variant.name.capitalize()
                def task = project.tasks.create("zungokokiyoshi${slug}", ZungokokiyoshiTask)
                // TODO setting description and group
//                task.description = " ${variant.name}."
//                task.group = ''
                variant.assemble.doLast { task.execute() }
            }
        }
    }
}
