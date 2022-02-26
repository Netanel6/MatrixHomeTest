package com.example.matrixhomeassignment.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView
import com.example.matrixhomeassignment.databinding.FruitSingleCellBinding
import com.example.matrixhomeassignment.local_db.FruitEntity
import com.squareup.picasso.Picasso

/**
 * Created by Netanel Amar on 24/02/2022.
 * NetanelCA2@gmail.com
 */
// recycler adapter to handle data from server / local db
class DataRecyclerAdapter(
    private val values: List<FruitEntity>,
    private val onItemClicked: OnItemClicked,
) : RecyclerView.Adapter<DataRecyclerAdapter.ViewHolder>() {
    val TAG = this::class.java.simpleName.toString()
    var _context: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        _context = parent.context
        return ViewHolder(FruitSingleCellBinding.inflate(LayoutInflater.from(_context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataAtPosition = values[position]
        holder.itemSingleCellContainer.setOnClickListener {
            onItemClicked.onFruitClicked(dataAtPosition)
        }
        holder.fruitName.text = dataAtPosition.fruitName
        Picasso.get().load(dataAtPosition.fruitImage.toUri()).into(holder.fruitImage)
    }

    override fun getItemCount(): Int {
        return values.size
    }

    class ViewHolder(binding: FruitSingleCellBinding) : RecyclerView.ViewHolder(binding.root) {
        val fruitName: TextView = binding.fruitNameText
        val fruitImage: ImageView = binding.fruitImageView
        val itemSingleCellContainer: ConstraintLayout = binding.itemSingleCell
    }

    interface OnItemClicked {
        fun onFruitClicked(fruit: FruitEntity)
    }
}