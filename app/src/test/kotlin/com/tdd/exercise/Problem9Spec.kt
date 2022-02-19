package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem9Spec : ShouldSpec({
    val username = "test-username"
    val password = "test-password"
    val userStore = listOf(Pair(username, password))

    should("return success when username and password are matched") {
        Problem9(userStore).login(username, password) shouldBe "success"
    }

    should("return fail when username not exist") {
        val nonExistUserName = "non-exist-username"
        Problem9(userStore).login(nonExistUserName, password) shouldBe "fail"
    }

    should("return fail when password is incorrect") {
        val incorrectPassword = "incorrect-password"
        Problem9(userStore).login(username, incorrectPassword) shouldBe "fail"
    }
})
