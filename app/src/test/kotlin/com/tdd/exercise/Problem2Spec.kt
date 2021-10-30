package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
class Problem2Spec : ShouldSpec({

    should("should return 6 when find the minimal number that can be divided from 1 to 3") {
        Problem2.findMinimalDividedNumber(1, 3) shouldBe 6
    }

    should("should return 12 when find the minimal number that can be divided from 1 to 4") {
        Problem2.findMinimalDividedNumber(1, 4) shouldBe 12
    }

    should("should return 60 when find the minimal number that can be divided from 1 to 5") {
        Problem2.findMinimalDividedNumber(1, 5) shouldBe 60
    }

    should("should return 60 when find the minimal number that can be divided from 1 to 6") {
        Problem2.findMinimalDividedNumber(1, 6) shouldBe 60
    }

    should("should return 420 when find the minimal number that can be divided from 1 to 7") {
        Problem2.findMinimalDividedNumber(1, 7) shouldBe 420
    }

    should("should return 840 when find the minimal number that can be divided from 1 to 8") {
        Problem2.findMinimalDividedNumber(1, 8) shouldBe 840
    }

    should("should return 2520 when find the minimal number that can be divided from 1 to 9") {
        Problem2.findMinimalDividedNumber(1, 9) shouldBe 2520
    }

    should("should return 2520 when find the minimal number that can be divided from 1 to 10") {
        Problem2.findMinimalDividedNumber(1, 10) shouldBe 2520
    }

    should("should return 232792560 when find the minimal number that can be divided from 1 to 20") {
        Problem2.findMinimalDividedNumber(1, 20) shouldBe 232792560
    }

})
