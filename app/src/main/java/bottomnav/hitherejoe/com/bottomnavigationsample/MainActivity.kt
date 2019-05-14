package bottomnav.hitherejoe.com.bottomnavigationsample

import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textFavorites: TextView? = null
    private var textSchedules: TextView? = null
    private var textMusic: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textFavorites = findViewById<View>(R.id.text_favorites) as TextView
        textSchedules = findViewById<View>(R.id.text_schedules) as TextView
        textMusic = findViewById<View>(R.id.text_music) as TextView

        val bottomNavigationView = findViewById<View>(R.id.bottom_navigation) as BottomNavigationView

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_favorites -> {
                    textFavorites!!.visibility = View.VISIBLE
                    textSchedules!!.visibility = View.GONE
                    textMusic!!.visibility = View.GONE
                }
                R.id.action_schedules -> {
                    textFavorites!!.visibility = View.GONE
                    textSchedules!!.visibility = View.VISIBLE
                    textMusic!!.visibility = View.GONE
                }
                R.id.action_music -> {
                    textFavorites!!.visibility = View.GONE
                    textSchedules!!.visibility = View.GONE
                    textMusic!!.visibility = View.VISIBLE
                }
            }
            false
        }
    }
}
