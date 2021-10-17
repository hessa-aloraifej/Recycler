package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShowInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_info)


        var info= arrayListOf<Information>()
        val rvmain = findViewById<RecyclerView>(R.id.rvmain)
        rvmain.adapter = RVAdapter(info)
        rvmain.layoutManager = LinearLayoutManager(this)

        val fname= intent.extras?.getString("fname").toString()
        val lastname=intent.extras?.getString("lname").toString()
        val phone= intent.extras?.getInt("phone").toString().toInt()
        val location=intent.extras?.getString("location").toString()
        info.add(Information(fname,lastname,phone,location))
        rvmain.adapter?.notifyDataSetChanged()
    }
}