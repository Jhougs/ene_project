package com.example.utils

import java.util.regex.Matcher
import java.util.regex.Pattern

public  class utils {


     fun checkEmail(email:String):Boolean{

        val pattern: Pattern
        val matcher: Matcher
        val EMAIL_PATTERN =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        pattern = Pattern.compile(EMAIL_PATTERN)
        matcher = pattern.matcher(email)
        return matcher.matches()
         println(matcher.matches())
    }
}


