package com.example.matrixhomeassignment.local_db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
//dao class to communicate with the room local db
@Dao
interface DataDao {

    @Query("SELECT * FROM fruit")
    fun getData():LiveData<List<FruitEntity>>

    @Insert
    fun insert(data: FruitEntity)
}