package com.demo

import org.apache.commons.lang3.StringUtils

enum class EnumTest(val str: String) {
    HELLO_WORLD(StringUtils.upperCase("hello world"))
}
