package bottomnav.hitherejoe.com.bottomnavigationsample

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<View>(R.id.bottom_navigation) as BottomNavigationView

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_favorites -> {
                    textFavorites.visibility = View.VISIBLE
                    textSchedules.visibility = View.GONE
                    textMusic.visibility = View.GONE
                }
                R.id.action_schedules -> {
                    textFavorites.visibility = View.GONE
                    textSchedules.visibility = View.VISIBLE
                    textMusic.visibility = View.GONE
                }
                R.id.action_music -> {
                    textFavorites.visibility = View.GONE
                    textSchedules.visibility = View.GONE
                    textMusic!!.visibility = View.VISIBLE
                }
            }
            false
        }
    }
}
