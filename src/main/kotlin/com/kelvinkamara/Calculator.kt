package com.kelvinkamara

class Calculator {
    fun parse(string: String): Int {
        val (a, op, b) = string.split(" ")
        return when (op) {
            "*" -> a.toInt() * b.toInt()
            else -> throw IllegalArgumentException("Invalid operator: $op")
        }
    }

}
