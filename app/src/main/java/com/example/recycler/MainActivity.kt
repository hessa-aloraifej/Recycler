package com.example.recycler

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fname=findViewById<EditText>(R.id.etname)
        var lname=findViewById<EditText>(R.id.etlastname)
        var phone=findViewById<EditText>(R.id.etphone)
        var location=findViewById<EditText>(R.id.etlocation)
        var showbtn=findViewById<Button>(R.id.button)

        showbtn.setOnClickListener {
            var firstname= fname.text.toString()
            var lastname=lname.text.toString()
            var phone=phone.text.toString().toInt()
            var location=location.text.toString()
            val intent = Intent(this,ShowInfo::class.java)
            intent.putExtra("fname", firstname)
            intent.putExtra("lname", lastname)
            intent.putExtra("phone", phone)
            intent.putExtra("location", location)
            startActivity(intent)


        }
    }
}


