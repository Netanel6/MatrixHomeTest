package com.example.matrixhomeassignment.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.matrixhomeassignment.local_db.AppDatabase
import com.example.matrixhomeassignment.local_db.FruitEntity
import com.example.matrixhomeassignment.network.NetworkManager
import com.example.matrixhomeassignment.pojo.Fruits
import com.example.matrixhomeassignment.utils.LoggerUtils
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
//Class to handle data all over the app
class DataRepository(context: Context, settingsRepository: SettingsRepository) : IDataRepository {
    val TAG = this::class.java.simpleName.toString()
    private var _database: AppDatabase
    private val _settingsRepository: SettingsRepository

    init {
        LoggerUtils.info(TAG, "Initializing DataRepository..")
        _database = AppDatabase.getAppDatabase(context)!!
        _settingsRepository = settingsRepository
    }

    //Getting the data from server and saving it one by one to the db
    override fun getDataFromServer() {
        NetworkManager.getInstance()
            .getData(object : NetworkManager.NetworkManagerCallback<Fruits> {
                override fun onSuccess(response: Fruits) {
                    LoggerUtils.info(TAG, response.toString())
                    for (i in 0 until response.fruits!!.size) {
                        val fruit = response.fruits?.get(i)
                        setData(fruit!!.from(fruit))
                        LoggerUtils.info(TAG, fruit.toString())
                    }
                    _settingsRepository.setIsRetrieved(true)
                }

                override fun onApiFailure(errorBody: String?) {
                    _settingsRepository.setIsRetrieved(false)
                    LoggerUtils.info(TAG, errorBody.toString())
                }

                override fun onNetworkFailure(errorBody: String?) {
                    _settingsRepository.setIsRetrieved(false)
                    LoggerUtils.info(TAG, errorBody.toString())
                }
            })
    }

    override fun setData(data: FruitEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            _database.getDataDao().insert(data)
        }
    }

    override fun getDataFromDb(): LiveData<List<FruitEntity>> {
        return _database.getDataDao().getData()
    }
}