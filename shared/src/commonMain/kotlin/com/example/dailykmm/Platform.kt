package com.example.dailykmm

expect class Platform { // No declaration for the member variables in expect class
    val osName: String
    val osVersion: String
    val deviceModel: String
    val density: Int

    fun getDeviceInfo() // No implementation for the method
}
