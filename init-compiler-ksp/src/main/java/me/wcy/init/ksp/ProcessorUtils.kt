package me.wcy.init.ksp

object ProcessorUtils {
    const val PARAM_NAME = "taskList"
    const val METHOD_NAME = "register"
    const val PACKAGE_NAME = "me.wcy.init.apt.taskregister"
    const val JAVADOC = "DO NOT EDIT THIS FILE! IT WAS GENERATED BY INIT.\n"

    fun formatModuleName(moduleName: String): String {
        return moduleName.replace('-', '_')
    }

    fun formatArray(array: Array<String>): String {
        val sb = StringBuilder()
        array.forEach {
            sb.append("\"$it\"").append(",")
        }
        if (sb.isNotEmpty()) {
            sb.deleteAt(sb.length - 1)
        }
        return "arrayOf($sb)"
    }
}