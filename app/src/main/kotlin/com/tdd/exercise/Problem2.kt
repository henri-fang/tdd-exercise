package com.tdd.exercise

object Problem2 {
    fun findMinimalDividedNumber(divisorFrom: Int, divisorTo: Int): Int =
        (divisorTo..Int.MAX_VALUE).first { canBeDivided(it, divisorFrom, divisorTo) }

    private fun canBeDivided(value: Int, divisorFrom: Int, divisorTo: Int): Boolean =
        (divisorFrom..divisorTo).all { value % it == 0 }

}