package com.tdd.exercise

class Problem9(private val userStore: List<Pair<String, String>>) {
    fun login(username: String, password: String): String {
        val user = userStore.find { username == it.first }
        return if (user != null) "success" else "fail"
    }
}
