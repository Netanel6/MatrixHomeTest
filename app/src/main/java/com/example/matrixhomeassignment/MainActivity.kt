package com.example.matrixhomeassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import com.example.matrixhomeassignment.databinding.ActivityMainBinding
import com.example.matrixhomeassignment.repository.DataRepository
import com.example.matrixhomeassignment.repository.SettingsRepository
import com.example.matrixhomeassignment.utils.LoggerUtils
import com.example.matrixhomeassignment.view_model.AppViewModel
import com.example.matrixhomeassignment.view_model.AppViewModelFactory

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
class MainActivity : AppCompatActivity() {
    private val TAG = this::class.simpleName.toString()
    private lateinit var _binding: ActivityMainBinding
    private lateinit var _dataRepository: DataRepository
    private lateinit var _settingsRepository: SettingsRepository
    private lateinit var _appViewModel: AppViewModel
    private lateinit var _navigationController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
        initAppSettings()
        initNavController()
        handleData()
    }

    private fun initAppSettings() {
        _settingsRepository = SettingsRepository(this)
        _dataRepository = DataRepository(this, _settingsRepository)
        val factory = AppViewModelFactory(_dataRepository, _settingsRepository)
        _appViewModel = ViewModelProvider(this,
            (factory as ViewModelProvider.Factory))[AppViewModel::class.java]
    }

    // Function to get viewModel to whole over the app with one instance
    fun getViewModel(): AppViewModel {
        return _appViewModel
    }

    // Initialization of the navController
    private fun initNavController() {
        _navigationController = findNavController(this, R.id.nav_host_fragment_activity_main)
    }

    // Function to add fragment with or without bundle
    fun addFragment(navResId: Int) {
        try {
            _navigationController.navigate(navResId, null)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    //Function to handle data if already having the data inside the db showing a toast
    private fun handleData() {
        if (_settingsRepository.isRetrieved()) {
            LoggerUtils.info(TAG, getString(R.string.data_retrieved))
            LoggerUtils.snackBar(this,
                _binding.root,
                getString(R.string.data_retrieved))
        } else {
            _appViewModel.getDataFromServer()
        }
    }

    override fun onBackPressed() {
        //Deleted the super because navigation is through navController
    }
}