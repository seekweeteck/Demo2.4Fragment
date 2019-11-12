package my.edu.tarc.demo24fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val checkBoxFirst: CheckBox = root.findViewById(R.id.checkBoxFirst)
        val checkBoxSecond: CheckBox = root.findViewById(R.id.checkBoxSecond)

        //Access to the hosting activity view
        checkBoxFirst.setOnCheckedChangeListener{ view, isChecked ->
            val buttonFirst: Button? = activity?.findViewById(R.id.buttonFirst)
            buttonFirst?.isEnabled = checkBoxFirst.isChecked
        }
        checkBoxSecond.setOnCheckedChangeListener{ view, isChecked ->
            val buttonSecond: Button? = activity?.findViewById(R.id.buttonSecond)
            buttonSecond?.isEnabled = checkBoxSecond.isChecked
        }
        return root
    }


}
