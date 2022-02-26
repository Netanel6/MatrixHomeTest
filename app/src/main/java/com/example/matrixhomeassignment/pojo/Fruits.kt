package com.example.matrixhomeassignment.pojo

import com.google.gson.annotations.SerializedName

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
class Fruits {
    private val TAG = this.javaClass.simpleName

    @SerializedName("fruits")
    var fruits: List<Fruit>? = null

    override fun toString(): String {
        return "Fruits(fruits=$fruits)"
    }
}