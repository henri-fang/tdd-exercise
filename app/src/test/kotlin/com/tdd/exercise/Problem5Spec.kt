package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem5Spec : ShouldSpec({

    should("return Odd when input an odd number") {
        val value = 3
        Problem5.oddEven(value) shouldBe "Odd"
    }
    should("return Even when input a even number") {
        Problem5.oddEven(4) shouldBe "Even"
    }
    should("return 2 when input 2") {
        Problem5.oddEven(2) shouldBe "2"
    }
})
