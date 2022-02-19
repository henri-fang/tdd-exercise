package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem10Spec : ShouldSpec({

    should("return 0 when taxi runs 0 km and wait 0 mins") {
        Problem10.taxiFare(0, 0) shouldBe 0f
    }

    should("return 2.5 when taxi runs 0 km and wait 10 mins") {
        Problem10.taxiFare(0, 10) shouldBe 2.5f
    }

    should("return 4 when taxi runs 5 km and wait 0 min") {
        Problem10.taxiFare(5, 0) shouldBe 4f
    }

    should("return 4 when taxi runs 5 km and wait 10 min") {
        Problem10.taxiFare(5, 10) shouldBe 6.5f
    }

    should("return 6.4 when taxi runs 8 km and wait 0 min") {
        Problem10.taxiFare(8, 0) shouldBe 6.4f
    }

    should("return 6.4 when taxi runs 8 km and wait 10 mins") {
        Problem10.taxiFare(8, 10) shouldBe 8.9f
    }

    should("return 12 when taxi runs 10 km and wait 0 min") {
        Problem10.taxiFare(10, 0) shouldBe 12f
    }
})
