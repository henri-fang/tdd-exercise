package com.tdd.exercise

class Problem10 {

    companion object {
        const val waitingPrice = 0.25f
        const val kilometerPrice = 0.8f
        const val kilometerPriceLongJourney = 1.2f
        const val longJourneyKilometers = 8
    }

    fun taxiFare(mileage: Int, waitingTime: Int): Float {
        val mileagePrice = if (mileage > longJourneyKilometers) kilometerPriceLongJourney else kilometerPrice
        return mileage * mileagePrice + waitingTime * waitingPrice
    }
}
