package bottomnav.hitherejoe.com.bottomnavigationsample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
