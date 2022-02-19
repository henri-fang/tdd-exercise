package com.tdd.exercise

object Problem10 {
    fun taxiFare(mileage: Int, waitingTime: Int): Float {
        if (mileage > 8) {
            return mileage * 0.8f * (1f + 0.5f) + waitingTime * 0.25f
        }
        return mileage * 0.8f + waitingTime * 0.25f
    }
}
