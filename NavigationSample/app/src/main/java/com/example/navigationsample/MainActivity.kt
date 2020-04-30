package com.example.navigationsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // MainActivityで使用するレイアウトファイルを指定する
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.container)
        // 下部メニュータブをフラグメントと紐づける
        setupWithNavController(bottom_navigation, navController)
    }
}
