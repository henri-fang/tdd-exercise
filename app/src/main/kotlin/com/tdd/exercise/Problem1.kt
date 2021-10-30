package com.tdd.exercise

object Problem1 {
    fun sumOf3Or5Multiples(limit: Int): Int =
        (1 until limit).filter { isMultiplyOfThree(it) || isMultiplyOfFive(it) }.sum()

    private fun isMultiplyOfThree(value: Int) = value % 3 == 0
    private fun isMultiplyOfFive(value: Int) = value % 5 == 0
}