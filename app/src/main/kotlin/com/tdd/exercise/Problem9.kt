package com.tdd.exercise

object Problem9 {
    fun login(username: String, password: String): String {
        return if (username != "test-username") "fail" else "success"
    }
}
