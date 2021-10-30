package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem4Spec : ShouldSpec({

    should("return 0 when given an empty array") {
        val emptyArray = emptyArray<Int>()
        Problem4.calcStats(emptyArray).min shouldBe 0
        Problem4.calcStats(emptyArray).max shouldBe 0
        Problem4.calcStats(emptyArray).avg shouldBe 0
        Problem4.calcStats(emptyArray).count shouldBe emptyArray.size
    }
    should("return the value when given only 1 element in the array") {
        val element = 8
        val intNums = arrayOf(element)
        Problem4.calcStats(intNums).min shouldBe element
        Problem4.calcStats(intNums).max shouldBe element
        Problem4.calcStats(intNums).avg shouldBe element
        Problem4.calcStats(intNums).count shouldBe intNums.size
    }

    should("return the value when given multiple elements in the array") {
        val intNums = arrayOf(6, 9, 15, -2, 92, 11)
        Problem4.calcStats(intNums).min shouldBe -2
        Problem4.calcStats(intNums).max shouldBe 92
        Problem4.calcStats(intNums).count shouldBe intNums.size
        Problem4.calcStats(intNums).avg shouldBe 21.833333
    }
})
