package com.example.testings

object RegistrationUtil {

    private val existingUsers= listOf("Shri","Ayush")

    fun validateRegInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean{
        if(username.isEmpty()||password.isEmpty()){
            return false
        }
        if(username in existingUsers){
            return false
        }
        if(password!=confirmPassword){
            return false
        }
        if(password.count{it.isDigit()}<2){
            return false
        }
        return true
    }
}