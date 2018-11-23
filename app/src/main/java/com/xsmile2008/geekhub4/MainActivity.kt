package com.xsmile2008.geekhub4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val ACTION = "MY_SUPER_ACTION"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentById: Fragment? = supportFragmentManager.findFragmentById(R.id.fragment1)

        supportFragmentManager.beginTransaction()
            .add(R.id.taco, Fragment2.newInstance())
            .commit()

        fragmentById?.view?.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.taco, Fragment1())
                .commit()
        }
    }
}
