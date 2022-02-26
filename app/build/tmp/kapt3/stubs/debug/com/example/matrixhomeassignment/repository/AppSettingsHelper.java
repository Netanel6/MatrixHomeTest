package com.example.matrixhomeassignment.repository;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/matrixhomeassignment/repository/AppSettingsHelper;", "", "()V", "IS_DATA_RETRIEVED_DEFAULT", "", "PREFS_NAME", "", "PREF_IS_DATA_RETRIEVED", "TAG", "kotlin.jvm.PlatformType", "getSharedPref", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "isDataRetrieved", "prefs", "setIsDataRetrieved", "", "isRetrieved", "app_debug"})
public final class AppSettingsHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.matrixhomeassignment.repository.AppSettingsHelper INSTANCE = null;
    private static final java.lang.String TAG = null;
    private static final java.lang.String PREFS_NAME = null;
    private static final java.lang.String PREF_IS_DATA_RETRIEVED = null;
    
    /**
     * Defaults
     */
    private static final boolean IS_DATA_RETRIEVED_DEFAULT = false;
    
    private AppSettingsHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean isDataRetrieved(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        return false;
    }
    
    public final void setIsDataRetrieved(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs, boolean isRetrieved) {
    }
}