package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem6Spec : ShouldSpec({

    should("return empty list when no element used recently") {
        Problem6.add().recentlyUsedList() shouldBe listOf()
    }

    should("return list with same item when adding different items") {
        Problem6.add("1", "2").recentlyUsedList() shouldBe listOf("2", "1")
    }

    should("return list with unique items when add duplicate items") {
        Problem6.add("1", "2", "1", "3").recentlyUsedList() shouldBe listOf("3", "1", "2")
    }
})
