package com.example.matrixhomeassignment.view_model;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u0011J\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/matrixhomeassignment/view_model/AppViewModel;", "Landroidx/lifecycle/ViewModel;", "dataRepository", "Lcom/example/matrixhomeassignment/repository/IDataRepository;", "settingsRepository", "Lcom/example/matrixhomeassignment/repository/ISettingsRepository;", "(Lcom/example/matrixhomeassignment/repository/IDataRepository;Lcom/example/matrixhomeassignment/repository/ISettingsRepository;)V", "TAG", "", "_fruit", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/matrixhomeassignment/local_db/FruitEntity;", "getDataRepository", "()Lcom/example/matrixhomeassignment/repository/IDataRepository;", "setDataRepository", "(Lcom/example/matrixhomeassignment/repository/IDataRepository;)V", "getDataFromLocalDb", "Landroidx/lifecycle/LiveData;", "", "getDataFromServer", "", "getSelectedFruit", "setSelectedFruit", "fruit", "app_debug"})
public final class AppViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.matrixhomeassignment.repository.IDataRepository dataRepository;
    private final java.lang.String TAG = null;
    private androidx.lifecycle.MutableLiveData<com.example.matrixhomeassignment.local_db.FruitEntity> _fruit;
    
    public AppViewModel(@org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.repository.IDataRepository dataRepository, @org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.repository.ISettingsRepository settingsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.matrixhomeassignment.repository.IDataRepository getDataRepository() {
        return null;
    }
    
    public final void setDataRepository(@org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.repository.IDataRepository p0) {
    }
    
    public final void getDataFromServer() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.matrixhomeassignment.local_db.FruitEntity>> getDataFromLocalDb() {
        return null;
    }
    
    public final void setSelectedFruit(@org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.local_db.FruitEntity fruit) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.matrixhomeassignment.local_db.FruitEntity> getSelectedFruit() {
        return null;
    }
}