package com.example.matrixhomeassignment.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.matrixhomeassignment.local_db.FruitEntity
import com.example.matrixhomeassignment.repository.IDataRepository
import com.example.matrixhomeassignment.repository.ISettingsRepository

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
//app viewModel
class AppViewModel(var dataRepository: IDataRepository, settingsRepository: ISettingsRepository) :
    ViewModel() {
    private val TAG = this::class.simpleName.toString()
    private var _fruit = MutableLiveData<FruitEntity>()

    //Method to retrieve data from Server
    fun getDataFromServer() {
        dataRepository.getDataFromServer()
    }

    //Method to retrieve data from local db
    fun getDataFromLocalDb(): LiveData<List<FruitEntity>> {
        return dataRepository.getDataFromDb()
    }

    //Method to set the selected fruit to ItemFragment
    fun setSelectedFruit(fruit: FruitEntity) {
        this._fruit.value = fruit
    }

    //Method to get the selected fruit to ItemFragment
    fun getSelectedFruit(): MutableLiveData<FruitEntity> {
        return _fruit
    }
}