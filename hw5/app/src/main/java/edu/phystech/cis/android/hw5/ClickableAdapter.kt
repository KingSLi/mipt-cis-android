package edu.phystech.cis.android.hw5

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ClickableAdapter : RecyclerView.Adapter<ClickableViewHolder>() {

    val arrayOfItems = arrayOf(
        "s1mple",
        "boombl4",
        "electronic",
        "perfecto",
        "b1t",
        "flamie",
        "hobbit",
        "ax1le",
        "nafany",
        "interz",
        "sh1ro"
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClickableViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ClickableViewHolder(
            inflater.inflate(R.layout.clickable_item, parent, false),
            ::onItemClick)
    }

    override fun getItemCount(): Int = arrayOfItems.size

    override fun onBindViewHolder(holder: ClickableViewHolder, position: Int) {
        holder.setText(arrayOfItems[position])
    }

    fun onItemClick(view: View, position: Int) {
        val intent = Intent(view.context, DetailActivity::class.java)
        intent.putExtra("myvalue", arrayOfItems[position])
        view.context.startActivity(intent)
    }
}

class ClickableViewHolder(view : View,
                          private val clickListener : (View, Int) -> Unit ) : RecyclerView.ViewHolder(view) {
    private val text: TextView = view.findViewById(R.id.text)

    init {
        view.setOnClickListener {
            clickListener(it, adapterPosition)
        }
    }

    fun setText(text : String) {
        this.text.text = text
    }
}