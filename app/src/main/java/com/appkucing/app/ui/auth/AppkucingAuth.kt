package com.appkucing.app.ui.auth

import android.content.Context
import com.appkucing.app.data.model.ActionState
import com.appkucing.app.data.repository.AuthRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object AppkucingAuth {
    fun logout(contect: Context, callback: ((ActionState<Boolean>)-> Unit)? = null){
        val repo = AuthRepository(contect)
        CoroutineScope(Dispatchers.IO).launch {
            val resp = repo.logout()
            with(Dispatchers.Main){
                if (callback != null) callback.invoke(resp)
            }
        }
    }
}