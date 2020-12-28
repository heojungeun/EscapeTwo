package com.example.escape_two.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.escape_two.R
import com.example.escape_two.data.Memo
import kotlinx.android.synthetic.main.main_cell.view.*
import org.w3c.dom.Text

class MainRecyclerAdapter(val itemClick: (Memo) -> Unit, val itemLongClick: (Memo) -> Unit): RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>() {

    private var itemList : List<Memo> = listOf()

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MainRecyclerAdapter.ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainRecyclerAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_cell, parent, false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private var btitle = itemView.findViewById<TextView>(R.id.cell_main_title)
        private var bcontent = itemView.findViewById<TextView>(R.id.cell_main_ctnt)
        private var btime = itemView.findViewById<TextView>(R.id.cell_main_time)

        fun bind(memo: Memo){
            btitle.text = memo.title
            btime.text = memo.time
            bcontent.text = memo.content

            itemView.setOnClickListener {
                itemClick(memo)
            }

            itemView.setOnLongClickListener {
                itemLongClick(memo)
                true
            }
        }
    }

    fun setMemos(itemList : List<Memo>){
        this.itemList = itemList
        notifyDataSetChanged()
    }
}