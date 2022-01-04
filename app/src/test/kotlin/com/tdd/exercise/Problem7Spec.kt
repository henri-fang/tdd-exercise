package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem7Spec : ShouldSpec({

    should("return never when 2 drivers have 1 different stop") {
        Problem7.maxBusStop(listOf(1), listOf(2)) shouldBe "never"
    }

    should("return 1 when 2 drivers have 1 same stop") {
        Problem7.maxBusStop(listOf(1), listOf(1)) shouldBe "1"
    }

    should("return 2 when 2 drivers have same stop at the 2nd stop") {
        Problem7.maxBusStop(listOf(1, 2), listOf(3, 2)) shouldBe "2"
    }

    should("return 2 when 2 drivers meet at the 2nd stop") {
        Problem7.maxBusStop(listOf(1, 2), listOf(2)) shouldBe "2"
    }

    should("return 3 when 2 drivers meet at the 3rd stop") {
        Problem7.maxBusStop(listOf(1, 2, 3), listOf(3)) shouldBe "3"
    }

    should("return 5 when 2 drivers meet at the 5th stop") {
        Problem7.maxBusStop(listOf(1, 2, 3), listOf(2, 3)) shouldBe "5"
    }

    should("return 1 when 3 drivers meet at the 1st stop") {
        Problem7.maxBusStop(listOf(1), listOf(1), listOf(1)) shouldBe "1"
    }

//    should("return 3 when 3 drivers meet at the 3rd stop") {
//        Problem7.maxBusStop(listOf(1,2), listOf(3,2), listOf(4,1,3)) shouldBe "3"
//    }
})
