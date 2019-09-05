package com.peixing.jetpackdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.navigation.fragment.NavHostFragment
import com.peixing.jetpackdemo.ui.main.MainFragment
import kotlinx.android.synthetic.main.main_activity.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var navHost = NavHostFragment.create(R.navigation.navi_gation)
              if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, navHost)
                .setPrimaryNavigationFragment(navHost)
                .commitNow()
        }

    }

}
