package com.tdd.exercise

object Problem5 {
    fun oddEven(value: Int): String =
        when {
            value == 2 -> value.toString()
            value % 2 == 0 -> "Even"
            else -> "Odd"
        }
}