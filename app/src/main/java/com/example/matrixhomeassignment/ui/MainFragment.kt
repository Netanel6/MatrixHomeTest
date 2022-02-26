package com.example.matrixhomeassignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.matrixhomeassignment.BaseFragment
import com.example.matrixhomeassignment.R
import com.example.matrixhomeassignment.adapter.DataRecyclerAdapter
import com.example.matrixhomeassignment.databinding.FragmentMainBinding
import com.example.matrixhomeassignment.local_db.FruitEntity


/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
class MainFragment : BaseFragment(),DataRecyclerAdapter.OnItemClicked {
    private val  TAG = this::class.simpleName.toString()
    private lateinit var _binding: FragmentMainBinding
    private lateinit var _recyclerView: RecyclerView
    private lateinit var _progressBar: ProgressBar
    private lateinit var _adapter: DataRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater)
        return _binding.root
    }

    override fun onFragmentReady() {
        observeData()
    }

    override fun initViews() {
        _recyclerView = _binding.dataRv
        val layoutManager = LinearLayoutManager(requireContext())
        _recyclerView.layoutManager = layoutManager
        _progressBar = _binding.progressBar
    }

    override fun initClicks() {
    }

    private fun observeData() {
        mainActivity.getViewModel().getDataFromLocalDb().observe(this) {
            if (it.isNotEmpty() && it!=null) {
                _adapter = DataRecyclerAdapter(it,this)
                _recyclerView.adapter = _adapter
                _recyclerView.visibility = View.VISIBLE
                val anim = AlphaAnimation(0.0f, 1.0f)
                anim.duration = 700
                _recyclerView.startAnimation(anim)
                 _progressBar.visibility= View.GONE
            }
        }
    }

    override fun onFruitClicked(fruit: FruitEntity) {
        mainActivity.getViewModel().setSelectedFruit(fruit)
        mainActivity.addFragment(R.id.from_main_to_item)
    }
}