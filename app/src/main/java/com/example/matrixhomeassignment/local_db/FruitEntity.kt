package com.example.matrixhomeassignment.local_db

import androidx.room.Entity
import com.example.matrixhomeassignment.pojo.Fruit
import com.google.gson.annotations.SerializedName

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@Entity(tableName = "fruit", primaryKeys = ["fruitName", "fruitImage"])
data class FruitEntity(
    @field:SerializedName("fruit_name")
    var fruitName: String,
    @field:SerializedName("fruit_image")
    var fruitImage: String,
    @field:SerializedName("fruit_desc")
    var fruitDesc: String,
    @field:SerializedName("fruit_price")
    var fruitPrice: Int,
) {

    override fun toString(): String {
        return "Fruit(fruitName=$fruitName, fruitImage=$fruitImage, fruitDesc=$fruitDesc, fruitPrice=$fruitPrice)"
    }
}