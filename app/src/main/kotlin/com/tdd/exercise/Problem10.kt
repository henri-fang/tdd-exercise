package com.tdd.exercise

object Problem10 {
    fun taxiFare(mileage: Int, waitingTime: Int): Float {
        return mileage * 0.8f + waitingTime * 0.25f
    }
}
