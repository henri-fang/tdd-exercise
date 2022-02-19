package com.tdd.exercise

object Problem10 {
    fun taxiFare(mileage: Int, waitingTime: Int): Float {
        val waitingPrice = 0.25f
        val kilometerPrice = 0.8f
        val kilometerPriceLongJourney = 1.2f
        val waitingFee = waitingTime * waitingPrice
        val mileageFee = if (mileage > 8) mileage * kilometerPriceLongJourney else mileage * kilometerPrice
        return mileageFee + waitingFee
    }
}
