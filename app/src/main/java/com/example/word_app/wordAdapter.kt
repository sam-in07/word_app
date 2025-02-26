package com.example.word_app

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.word_app.databinding.ItemWordBinding

class WordAdapter (var context : Context , var letter:String) : RecyclerView.Adapter<WordAdapter.WordViewHolder>(){
    var wordList = mutableListOf<String>()
    class WordViewHolder(var binding: ItemWordBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
       return  WordViewHolder(ItemWordBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }


    override fun getItemCount(): Int {
        return  wordList.size
    }


    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
       var  word = wordList[position]
        holder.binding.itemTV.text = word
    }
    init {
      var words = context.resources.getStringArray(R.array.words).toList()
      wordList = words.filter {
          it.startsWith(letter,ignoreCase = true)
      }.sorted().toMutableList()
    }
}