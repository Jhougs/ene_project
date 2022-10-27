package com.example.aplication2.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private val unableFormat: MutableLiveData<Boolean> = MutableLiveData()
    val unableFormatDone: LiveData<Boolean> = unableFormat

    private val unablePassword: MutableLiveData<Boolean> = MutableLiveData()
    val unablePasswordDone: LiveData<Boolean> = unablePassword


    fun checkFormat(email:String){
        unableFormat.value = !util.checkEmail(email) || email.isEmpty()
    }

    fun checkPassword(password: String){
        unablePassword.value= password.isEmpty()
    }
}