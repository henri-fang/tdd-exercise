package com.tdd.exercise

object Problem6 {
    private val usedStrings = mutableListOf<String>()

    fun add(vararg values: String): Problem6 {
        for (value in values) {
            val index = usedStrings.indexOf(value)
            if (index > -1) {
                usedStrings.removeAt(index)
            }
            usedStrings.add(0, value)
        }
        return this
    }

    fun recentlyUsedList(): List<String> {
        return usedStrings
    }
}