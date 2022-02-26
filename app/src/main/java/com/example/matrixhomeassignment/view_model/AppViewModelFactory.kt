package com.example.matrixhomeassignment.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory
import com.example.matrixhomeassignment.repository.IDataRepository
import com.example.matrixhomeassignment.repository.ISettingsRepository


/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
class AppViewModelFactory(
    private val iDataRepository: IDataRepository,
    private val iSettingsRepository: ISettingsRepository,
) :
    NewInstanceFactory() {
    private val TAG = this.javaClass.simpleName
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return AppViewModel(iDataRepository, iSettingsRepository) as T
    }
}
