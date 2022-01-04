package com.tdd.exercise

object Problem7 {
    private const val MAX = 480
    fun maxBusStop(vararg busRoutes: List<Int>): String {
        val formattedRoutes = busRoutes.map { formatRoutes(it) }
        for (index in 0 until MAX) {
            if (formattedRoutes.map { it[index] }.distinct().size == 1) {
                return (index + 1).toString()
            }
        }
        return "never"
    }

    private fun <T> Sequence<T>.repeat() = sequence { while (true) yieldAll(this@repeat) }

    private fun formatRoutes(routes: List<Int>): List<Int> =
        if (routes.size >= MAX) routes.take(MAX) else routes.asSequence().repeat().take(MAX).toList()

}