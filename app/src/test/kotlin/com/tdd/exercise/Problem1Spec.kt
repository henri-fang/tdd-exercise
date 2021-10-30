package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 */
class Problem1Spec : ShouldSpec({

    should("should return 3 when getting numbers of multiples of 3 or 5 given the max number is 4") {
        Problem1.sumOf3Or5Multiples(4) shouldBe 3
    }

    should("should return 8 when getting numbers of multiples of 3 or 5 given the max number is 6") {
        Problem1.sumOf3Or5Multiples(6) shouldBe 8
    }

    should("should return 14 when getting numbers of multiples of 3 or 5 given the max number is 7") {
        Problem1.sumOf3Or5Multiples(7) shouldBe 14
    }

    should("should return 23 when getting numbers of multiples of 3 or 5 given the max number is 10") {
        Problem1.sumOf3Or5Multiples(10) shouldBe 23
    }

    should("should return 233168 when getting numbers of multiples of 3 or 5 given the max number is 1000") {
        Problem1.sumOf3Or5Multiples(1000) shouldBe 233168
    }
})
