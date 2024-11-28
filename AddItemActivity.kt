package com.example.estoquerezendao

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AddItemActivity : Activity() {

    private lateinit var itemNameEditText: EditText
    private lateinit var itemQuantityEditText: EditText
    private lateinit var addItemButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        itemNameEditText = findViewById(R.id.itemNameEditText)
        itemQuantityEditText = findViewById(R.id.itemQuantityEditText)
        addItemButton = findViewById(R.id.addItemButton)

        addItemButton.setOnClickListener {
            val itemName = itemNameEditText.text.toString()
            val itemQuantity = itemQuantityEditText.text.toString().toInt()
            val resultIntent = Intent()
            resultIntent.putExtra("ITEM_NAME", itemName)
            resultIntent.putExtra("ITEM_QUANTITY", itemQuantity)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}
