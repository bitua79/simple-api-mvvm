package com.example.apisample.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.apisample.data.entity.AnimeEntity
import com.example.apisample.databinding.ItemAnimeBinding

class AnimeListAdapter(

) : ListAdapter<AnimeEntity, AnimeListAdapter.CryptocurrencyViewHolder>(

    object : DiffUtil.ItemCallback<AnimeEntity>() {
        // Id should be unique
        override fun areItemsTheSame(
            oldItem: AnimeEntity,
            newItem: AnimeEntity
        ): Boolean {
            // TODO : replace with id
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(
            oldItem: AnimeEntity,
            newItem: AnimeEntity
        ): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }
    }
) {

    // view holder class
    inner class CryptocurrencyViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        //bind data and handle rate color
        fun bind(animeEntity: AnimeEntity) {
            with(binding) {
                anime = animeEntity
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptocurrencyViewHolder {
        val binding = ItemAnimeBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CryptocurrencyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CryptocurrencyViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    public override fun getItem(position: Int): AnimeEntity {
        return currentList[position]
    }
}