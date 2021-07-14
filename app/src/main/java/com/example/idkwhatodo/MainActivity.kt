package com.example.recyclerviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<DataList>()
        list.add(DataList(R.drawable.mcdonald, "Suwon", "031-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Ansan", "031-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Anyang", "031-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Gangnam", "02-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Jongno", "02-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Seongnam", "031-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Guri", "031-ooo-oooo"))
        list.add(DataList(R.drawable.mcdonald, "Uijeongbu", "031-ooo-oooo"))


        val adapter = RecyclerAdapter(list)
        recycler.adapter = adapter
    }

}