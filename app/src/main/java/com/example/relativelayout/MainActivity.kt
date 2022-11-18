package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter
import com.example.relativelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListViewSimple()
    }

    private fun setupListViewSimple(){
        val list = listOf(
            mapOf(
                KEY_TITLE to "111111",
                KEY_DESCRIPTION to "111222"
            ),
            mapOf(
                KEY_TITLE to "222111",
                KEY_DESCRIPTION to "2222222"
            ),
            mapOf(
                KEY_TITLE to "333111",
                KEY_DESCRIPTION to "333222"
            ),
        )
        val adapter = SimpleAdapter(
            this,
            list,
            R.layout.simple_list_item,
            arrayOf(KEY_TITLE, KEY_DESCRIPTION),
            intArrayOf(R.id.tvOne, R.id.tvTwo)
        )
        binding.listView.adapter = adapter
    }

    companion object {
        val KEY_TITLE = "title"
        val KEY_DESCRIPTION = "description"
    }


}