package com.example.matrixhomeassignment.repository;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/matrixhomeassignment/repository/DataRepository;", "Lcom/example/matrixhomeassignment/repository/IDataRepository;", "context", "Landroid/content/Context;", "settingsRepository", "Lcom/example/matrixhomeassignment/repository/SettingsRepository;", "(Landroid/content/Context;Lcom/example/matrixhomeassignment/repository/SettingsRepository;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "_database", "Lcom/example/matrixhomeassignment/local_db/AppDatabase;", "_settingsRepository", "getDataFromDb", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/matrixhomeassignment/local_db/FruitEntity;", "getDataFromServer", "", "setData", "data", "app_release"})
public final class DataRepository implements com.example.matrixhomeassignment.repository.IDataRepository {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = null;
    private com.example.matrixhomeassignment.local_db.AppDatabase _database;
    private final com.example.matrixhomeassignment.repository.SettingsRepository _settingsRepository = null;
    
    public DataRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.repository.SettingsRepository settingsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    public void getDataFromServer() {
    }
    
    @java.lang.Override()
    public void setData(@org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.local_db.FruitEntity data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.example.matrixhomeassignment.local_db.FruitEntity>> getDataFromDb() {
        return null;
    }
}