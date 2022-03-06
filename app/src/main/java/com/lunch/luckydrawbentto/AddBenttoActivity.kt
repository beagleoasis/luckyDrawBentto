package com.lunch.luckydrawbentto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lunch.luckydrawbentto.databinding.ActivityAddBenttoBinding
import com.lunch.luckydrawbentto.databinding.ActivityMainBinding

class AddBenttoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBenttoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_bentto)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_add_bentto)

        //뒤로가기 클릭
        binding.finish.setOnClickListener {
            finish();
        }

        //메인 리스트 구현 Recycler View
        val items =mutableListOf<String>()
        items.add("음식점1")
        items.add("음식점2")
        items.add("음식점3")
        items.add("음식점4")
        items.add("음식점5")
        items.add("음식점6")
        items.add("음식점7")
        items.add("음식점8")
        items.add("음식점9")
        items.add("음식점10")
        val bl = findViewById<RecyclerView>(R.id.benttoList)
        val abAdapter = AddBenttoListAdapter(items)
        bl.adapter = abAdapter
        bl.layoutManager = LinearLayoutManager(this)
    }
}