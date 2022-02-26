package com.example.matrixhomeassignment.pojo

import com.example.matrixhomeassignment.local_db.FruitEntity
import com.google.gson.annotations.SerializedName

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
class Fruit(fruitName: String, fruitImage: String, fruitDesc: String, fruitPrice: Int) {
    private val TAG = this.javaClass.simpleName

    @SerializedName("name")
    var _fruitName: String? = fruitName

    @SerializedName("image")
    var _fruitImage: String? = fruitImage

    @SerializedName("description")
    var _fruitDesc: String? = fruitDesc

    @SerializedName("price")
    var _fruitPrice: Int? = fruitPrice

    fun from(fruit: Fruit): FruitEntity {
        return FruitEntity(fruit._fruitName!!,fruit._fruitImage!!,fruit._fruitDesc!!,fruit._fruitPrice!!)
    }

    fun toFruit(): Fruit {
        return Fruit(_fruitName!!, _fruitImage!!, _fruitDesc!!, _fruitPrice!!)
    }

    override fun toString(): String {
        return "Fruit(fruitName=$_fruitName, fruitImage=$_fruitImage, fruitDesc=$_fruitDesc, fruitPrice=$_fruitPrice)"
    }

}