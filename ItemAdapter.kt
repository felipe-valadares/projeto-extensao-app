package com.example.estoquerezendao

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ItemAdapter(private val context: Context, private val itemList: List<Item>) : BaseAdapter() {

    override fun getCount(): Int = itemList.size

    override fun getItem(position: Int): Any = itemList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = getItem(position) as Item
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.item_view, parent, false)

        val itemNameTextView: TextView = view.findViewById(R.id.itemName)
        val itemQuantityTextView: TextView = view.findViewById(R.id.itemQuantity)

        itemNameTextView.text = item.name
        itemQuantityTextView.text = "Quantidade: ${item.quantity}"

        return view
    }
}
