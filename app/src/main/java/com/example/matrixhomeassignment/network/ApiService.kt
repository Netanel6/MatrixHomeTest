package com.example.matrixhomeassignment.network

import com.example.matrixhomeassignment.pojo.Fruits
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
//interface to implement in Network manager to make the server call and retrieve the data
interface ApiService {

/**
 * Method that makes the server call with the endpoint
 * */
    @GET("fruitsBT/getFruits")
    fun getData(): Call<Fruits>
}