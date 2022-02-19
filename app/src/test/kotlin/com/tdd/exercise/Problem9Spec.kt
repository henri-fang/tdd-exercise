package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem9Spec : ShouldSpec({
    val userStore = listOf(Pair("test-username", "test-password"))

    should("return success when username and password are matched") {
        val username = "test-username"
        val password = "test-password"
        Problem9(userStore).login(username, password) shouldBe "success"
    }

    should("return fail when username not exist") {
        val userName = "non-exist-username"
        val password = "test-password"
        Problem9(userStore).login(userName, password) shouldBe "fail"
    }
})
