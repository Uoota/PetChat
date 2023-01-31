package com.example.petchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import com.example.petchat.databinding.ActivityMainBinding
import com.mikepenz.materialdrawer.util.DrawerNavigationUI
import com.mikepenz.materialdrawer.widget.AccountHeaderView

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mDriver: DrawerNavigationUI
    private lateinit var mHeader: AccountHeaderView
    private lateinit var mToolbar: androidx.appcompat.widget.Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        initFields()
    }

    private fun initFields() {

    }
}