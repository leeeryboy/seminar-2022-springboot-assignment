package com.wafflestudio.seminar.core.user.api.request

data class SignUpRequest(
    val email: String,
    val username: String,
    val password: String,
)