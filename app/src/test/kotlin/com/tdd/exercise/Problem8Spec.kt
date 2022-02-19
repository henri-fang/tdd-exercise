package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem8Spec : ShouldSpec({

    should("return empty list when no element used recently") {
        Problem6.add().recentlyUsedList() shouldBe listOf()
    }

})
