package com.tdd.exercise

object Problem4 {
    fun calcStats(intNums: Array<Int>): Status {
        return if (intNums.isEmpty()) throw IllegalArgumentException("invalid input")
        else Status(
            intNums.minOrNull() ?: 0,
            intNums.maxOrNull() ?: 0,
            intNums.size,
            String.format("%.6f", intNums.average()).toDouble()
        )
    }
}

data class Status(val min: Int, val max: Int, val count: Int, val avg: Double)