package com.example.matrixhomeassignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import com.example.matrixhomeassignment.BaseFragment
import com.example.matrixhomeassignment.R
import com.example.matrixhomeassignment.databinding.FragmentItemBinding
import com.example.matrixhomeassignment.local_db.FruitEntity
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView

class ItemFragment : BaseFragment() {
    private val TAG = this::class.simpleName.toString()
    private lateinit var _binding: FragmentItemBinding
    private lateinit var backBtn: CircleImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentItemBinding.inflate(layoutInflater)
        return _binding.root
    }

    override fun onFragmentReady() {
        observeData()
    }

    private fun observeData() {
        mainActivity.getViewModel().getSelectedFruit().observe(this) {
            if (it != null) {
                handleData(it)
            }
        }
    }

    private fun handleData(item: FruitEntity) {
        Picasso.get().load(item.fruitImage.toUri()).into(_binding.itemPicture)
        _binding.itemName.text = item.fruitName
        _binding.itemDesc.text = item.fruitDesc
        _binding.itemPrice.text = item.fruitPrice.toString()
    }

    override fun initViews() {
        backBtn = _binding.backBtn
        backBtn.setOnClickListener {
            mainActivity.addFragment(R.id.from_item_to_main)
        }
    }

    override fun initClicks() {
    }
}