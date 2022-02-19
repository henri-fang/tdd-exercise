package com.tdd.exercise

class Problem9(private val userStore: List<Pair<String, String>>) {
    fun login(username: String, password: String): String =
        userStore.find {
            username == it.first && password == it.second
        }?.let { "success" }
            ?: let { "fail" }
}
