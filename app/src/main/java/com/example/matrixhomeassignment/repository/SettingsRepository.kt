package com.example.matrixhomeassignment.repository

import android.content.Context
import android.content.SharedPreferences
import com.example.matrixhomeassignment.repository.AppSettingsHelper.isDataRetrieved
import com.example.matrixhomeassignment.repository.AppSettingsHelper.setIsDataRetrieved
import com.example.matrixhomeassignment.utils.LoggerUtils

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
// Class to handle shared preferences all over the app
class SettingsRepository(context:Context?): ISettingsRepository {
    private val  TAG = this::class.simpleName.toString()
    private  val _sharedPref: SharedPreferences

    override fun setIsRetrieved(isRetrieved:Boolean) {
        setIsDataRetrieved(_sharedPref, isRetrieved)
    }

    override fun isRetrieved():Boolean {
        return isDataRetrieved(_sharedPref)
    }

    init {
        LoggerUtils.info(TAG, "Initializing Settings repository")
        _sharedPref = AppSettingsHelper.getSharedPref(context!!)!!
    }
}