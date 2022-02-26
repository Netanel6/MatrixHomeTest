package com.example.matrixhomeassignment.repository

import androidx.lifecycle.LiveData
import com.example.matrixhomeassignment.local_db.FruitEntity

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
//Interface that implemented in the data repository
interface IDataRepository {
    fun getDataFromServer()
    fun setData(data: FruitEntity)
    fun getDataFromDb(): LiveData<List<FruitEntity>>
}