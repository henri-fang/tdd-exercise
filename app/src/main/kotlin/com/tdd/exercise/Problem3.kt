package com.tdd.exercise

object Problem3 {
    fun checkPalindrome(text: String): Boolean {
        return text.contentEquals(text.reversed(), true)
    }
}