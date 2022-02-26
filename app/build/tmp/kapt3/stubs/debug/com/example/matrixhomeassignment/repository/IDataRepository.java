package com.example.matrixhomeassignment.repository;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/example/matrixhomeassignment/repository/IDataRepository;", "", "getDataFromDb", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/matrixhomeassignment/local_db/FruitEntity;", "getDataFromServer", "", "setData", "data", "app_debug"})
public abstract interface IDataRepository {
    
    public abstract void getDataFromServer();
    
    public abstract void setData(@org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.local_db.FruitEntity data);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.matrixhomeassignment.local_db.FruitEntity>> getDataFromDb();
}