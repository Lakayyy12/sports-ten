package com.application.earnmoneyhome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.application.Navigator
import com.application.Navigator.Companion.showInfoDialog
import com.application.tablayout.adapters.ViewPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var exit = 0
    private var fab: FloatingActionButton? = null
    private var tabLayout: TabLayout? = null
    private var viewPager2: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListener()
    }

    private fun initComponents(){
        fab=findViewById(R.id.fab)
        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager_2)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager2?.adapter = adapter
    }

    private fun initListener(){
        fab?.setOnClickListener(this)

        TabLayoutMediator(tabLayout!!, viewPager2!!){ tab,position->
            when(position){
                0-> tab.text="CÁCH"
                1-> tab.text = "LỜI KHUYÊN"
                2-> tab.text="HƯỚNG DẪN"
            }
        }.attach()
    }

    override fun onBackPressed() {
        if (exit==0){
            exit = 1
            Toast.makeText(this,"nhấp lại để thoát", Toast.LENGTH_SHORT).show()
        }
        else{
            super.finishAffinity()
        }
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.fab -> showInfoDialog(this)
        }
    }
}