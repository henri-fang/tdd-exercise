package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem10Spec : ShouldSpec({

    should("return 0 when taxi runs 0 km and wait 0 mins") {
        Problem10.taxiFare(0, 0) shouldBe 0
    }
})
