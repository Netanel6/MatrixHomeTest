package com.example.matrixhomeassignment.network;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/example/matrixhomeassignment/network/ApiService;", "", "getData", "Lretrofit2/Call;", "Lcom/example/matrixhomeassignment/pojo/Fruits;", "app_release"})
public abstract interface ApiService {
    
    /**
     * Method that makes the server call with the endpoint
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "fruitsBT/getFruits")
    public abstract retrofit2.Call<com.example.matrixhomeassignment.pojo.Fruits> getData();
}