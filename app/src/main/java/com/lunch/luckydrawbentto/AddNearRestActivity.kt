package com.lunch.luckydrawbentto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import com.lunch.luckydrawbentto.databinding.ActivityMainBinding

class AddNearRestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_near_rest)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        // 이 Activity에서 Toolbar를 사용하겠다 선언
        setSupportActionBar(toolbar)

        val ab = supportActionBar!!
        // 타이틀 안보이게 하기
        ab.setDisplayShowTitleEnabled(false)
        // 뒤로가기 버튼 세팅
        ab.setDisplayHomeAsUpEnabled(true)
        toolbar.title = ""

    }

    // 툴바 메뉴 버튼을 설정
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        // 클릭된 메뉴 아이템의 아이디 마다 when 구절로 클릭시 동작을 설정한다.
        when(item!!.itemId){

            android.R.id.home->{ // 메뉴 버튼
                // 메인페이지 이동 처리
                val mainActivityIntent = Intent(this, MainActivity::class.java)

                    startActivity(mainActivityIntent)
                // Snackbar.make(toolbar,"Menu pressed",Snackbar.LENGTH_SHORT).show()
            }

            R.id.action_search->{ // 검색 버튼
                Snackbar.make(toolbar,"Search menu pressed",Snackbar.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}