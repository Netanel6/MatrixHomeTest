package com.example.matrixhomeassignment

import android.os.Bundle
import androidx.fragment.app.Fragment

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
abstract class BaseFragment : Fragment() {
    private val  TAG = this::class.simpleName.toString()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initViews()
        initClicks()
        onFragmentReady()
    }

    abstract fun onFragmentReady()
    abstract fun initViews()
    abstract fun initClicks()
    val mainActivity: MainActivity
        get() = this.activity as MainActivity

}