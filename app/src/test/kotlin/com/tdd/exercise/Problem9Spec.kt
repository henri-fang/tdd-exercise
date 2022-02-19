package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem9Spec : ShouldSpec({
    should("return success when username and password are matched") {
        val username = "test-username"
        val password = "test-password"
        Problem9.login(username, password) shouldBe "success"
    }

    should("return fail when username not exist") {
        val userName = "non-exist-username"
        val password = "test-password"
        Problem9.login(userName, password) shouldBe "fail"
    }
})
