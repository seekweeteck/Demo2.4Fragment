package my.edu.tarc.demo24fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_first, container, false)

        val editTextName: EditText = root.findViewById(R.id.editTextName)
        val buttonShowName: Button = root.findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener{
            Toast.makeText(context, editTextName.text.toString(), Toast.LENGTH_LONG).show()
        }
        return root
    }


}
