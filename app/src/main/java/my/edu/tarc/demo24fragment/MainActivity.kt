package my.edu.tarc.demo24fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragment = HomeFragment()
        fragmentTransaction.add(R.id.container, fragment)
        fragmentTransaction.commit()

        buttonHome.setOnClickListener(this)
        buttonFirst.setOnClickListener(this)
        buttonSecond.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val fragment = when(v){
            buttonFirst -> FirstFragment()
            buttonSecond -> SecondFragment()
            else -> HomeFragment()
        }

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        fragmentTransaction.replace(R.id.container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
