package com.tdd.exercise

import arrow.core.getOrElse
import arrow.core.toOption

class Problem9(private val userStore: List<Pair<String, String>>) {
    fun login(username: String, password: String): String =
        userStore.find { username == it.first && password == it.second }.toOption()
            .map { "success" }
            .getOrElse { "fail" }
}
