package com.jivan.memorygame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class MemoryBoardAdapter(private val context: Context, private val numOfPieces: Int) :
    RecyclerView.Adapter<MemoryBoardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardWidth = parent.width / 2
        val cardHeight = parent.height / 4
        val cardLength = min(cardHeight, cardWidth)
        val view = LayoutInflater.from(context).inflate(R.layout.memory_card, parent, false);
        val layoutParams = view.findViewById<CardView>(R.id.cardView).layoutParams
        layoutParams.width = cardLength
        layoutParams.height = cardLength
        return ViewHolder(view)
    }

    override fun getItemCount() = numOfPieces

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int) {
            // TODO
        }
    }
}
