package bottomnav.hitherejoe.com.bottomnavigationsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val favoritesTabIndex = 0
    private val schedulesTabIndex = 1
    private val mineTabIndex = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragments = getFragments()

        vp.adapter = object : FragmentStateAdapter(this) {
            override fun createFragment(position: Int): Fragment {
                return fragments[position]
            }

            override fun getItemCount(): Int {
                return fragments.size
            }
        }
        //禁用左右滑动切换页签
//        vp.isUserInputEnabled = false

    }

    private fun getFragments(): ArrayList<Fragment> {
        val fragments = ArrayList<Fragment>(3)

        val favoritesFragment = BaseFragment()
        var bundle = Bundle()
        bundle.putString("title", getString(R.string.favorites))
        favoritesFragment.arguments = bundle

        val schedulesFragment = BaseFragment()
        bundle = Bundle()
        bundle.putString("title", getString(R.string.schedules))
        schedulesFragment.arguments = bundle

        val mineFragment = BaseFragment()
        bundle = Bundle()
        bundle.putString("title", getString(R.string.mine))
        mineFragment.arguments = bundle

        fragments.add(favoritesFragment)
        fragments.add(schedulesFragment)
        fragments.add(mineFragment)
        return fragments
    }
}
