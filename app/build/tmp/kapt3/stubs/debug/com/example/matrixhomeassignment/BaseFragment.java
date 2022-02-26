package com.example.matrixhomeassignment;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/example/matrixhomeassignment/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "mainActivity", "Lcom/example/matrixhomeassignment/MainActivity;", "getMainActivity", "()Lcom/example/matrixhomeassignment/MainActivity;", "initClicks", "", "initViews", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentReady", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = null;
    
    public BaseFragment() {
        super();
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void onFragmentReady();
    
    public abstract void initViews();
    
    public abstract void initClicks();
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.matrixhomeassignment.MainActivity getMainActivity() {
        return null;
    }
}