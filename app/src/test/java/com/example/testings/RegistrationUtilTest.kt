package com.example.testings


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result= RegistrationUtil.validateRegInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }


    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result= RegistrationUtil.validateRegInput(
            "Shri",
            "123",
            "123"
        )
        assertThat(result).isTrue()

    }


    @Test
    fun `username already exists returns false`(){
        val result= RegistrationUtil.validateRegInput(
            "Ayush",
            "123",
            "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password is empty returns false`(){
        val result= RegistrationUtil.validateRegInput(
            "Ayush",
            "",
            ""
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `password repeated incorrectly returns false`(){
        val result= RegistrationUtil.validateRegInput(
            "Shri",
            "12345",
            "abcdef"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `less than 2 digits in password returns false`(){
        val result= RegistrationUtil.validateRegInput(
            "Ayush",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()

    }

    //empty password
    //password repeated incorrectly
    //contains less than two digits
}