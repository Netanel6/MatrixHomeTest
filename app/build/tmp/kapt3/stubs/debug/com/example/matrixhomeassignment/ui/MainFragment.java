package com.example.matrixhomeassignment.ui;

import java.lang.System;

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/matrixhomeassignment/ui/MainFragment;", "Lcom/example/matrixhomeassignment/BaseFragment;", "Lcom/example/matrixhomeassignment/adapter/DataRecyclerAdapter$OnItemClicked;", "()V", "TAG", "", "_adapter", "Lcom/example/matrixhomeassignment/adapter/DataRecyclerAdapter;", "_binding", "Lcom/example/matrixhomeassignment/databinding/FragmentMainBinding;", "_progressBar", "Landroid/widget/ProgressBar;", "_recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "initClicks", "", "initViews", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentReady", "onFruitClicked", "fruit", "Lcom/example/matrixhomeassignment/local_db/FruitEntity;", "app_debug"})
public final class MainFragment extends com.example.matrixhomeassignment.BaseFragment implements com.example.matrixhomeassignment.adapter.DataRecyclerAdapter.OnItemClicked {
    private final java.lang.String TAG = null;
    private com.example.matrixhomeassignment.databinding.FragmentMainBinding _binding;
    private androidx.recyclerview.widget.RecyclerView _recyclerView;
    private android.widget.ProgressBar _progressBar;
    private com.example.matrixhomeassignment.adapter.DataRecyclerAdapter _adapter;
    
    public MainFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onFragmentReady() {
    }
    
    @java.lang.Override()
    public void initViews() {
    }
    
    @java.lang.Override()
    public void initClicks() {
    }
    
    private final void observeData() {
    }
    
    @java.lang.Override()
    public void onFruitClicked(@org.jetbrains.annotations.NotNull()
    com.example.matrixhomeassignment.local_db.FruitEntity fruit) {
    }
}