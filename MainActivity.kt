package com.example.estoquerezendao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var itemListView: ListView
    private lateinit var addItemButton: Button
    private val itemList = mutableListOf<Item>()
    private lateinit var itemAdapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemListView = findViewById(R.id.itemListView)
        addItemButton = findViewById(R.id.addItemButton)

        // Adaptador para exibir a lista de itens
        itemAdapter = ItemAdapter(this, itemList)
        itemListView.adapter = itemAdapter

        // Adiciona item ao estoque
        addItemButton.setOnClickListener {
            val intent = Intent(this, AddItemActivity::class.java)
            startActivityForResult(intent, ADD_ITEM_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ADD_ITEM_REQUEST && resultCode == RESULT_OK) {
            val itemName = data?.getStringExtra("ITEM_NAME") ?: ""
            val itemQuantity = data?.getIntExtra("ITEM_QUANTITY", 0) ?: 0
            itemList.add(Item(itemName, itemQuantity))
            itemAdapter.notifyDataSetChanged()
        }
    }

    companion object {
        const val ADD_ITEM_REQUEST = 1
    }
}
