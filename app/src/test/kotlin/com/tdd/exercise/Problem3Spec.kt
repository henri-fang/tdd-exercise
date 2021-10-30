package com.tdd.exercise

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe

class Problem3Spec : ShouldSpec({

    should("return true when check palindrome given an empty string") {

        Problem3.checkPalindrome("") shouldBe true
    }

    should("return true when check palindrome given input is mom") {

        Problem3.checkPalindrome("mom") shouldBe true
    }

    should("return false when check palindrome given input is bill") {

        Problem3.checkPalindrome("bill") shouldBe false
    }

    should("return true when check palindrome given input is Mom") {

        Problem3.checkPalindrome("Mom") shouldBe true
    }

    should("return true when check palindrome given input is `This is a si siht`") {

        Problem3.checkPalindrome("This is a si siht") shouldBe true
    }
})
