package com.os.operando.gradle.zondokokiyoshi

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ZungokokiyoshiTask extends DefaultTask {

    @TaskAction
    def zundoko() {
        int zun = 0
        while (true) {
            int random = (int) (Math.random() * 2)
            print random == 0 ? 'ズン' : 'ドコ'
            print ' '
            switch (random) {
                case 0:
                    zun++
                    break
                case 1:
                    if (zun > 4) {
                        kiyoshi()
                        return
                    }
                    zun = 0
            }
        }
    }

    def kiyoshi() {
        println 'キ・ヨ・シ！'
    }
}
