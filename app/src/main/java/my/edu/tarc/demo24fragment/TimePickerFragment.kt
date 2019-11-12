package my.edu.tarc.demo24fragment

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.TextView
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.util.*


class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current time as the default values for the picker       
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val min = c.get(Calendar.MINUTE)
        // Create a new instance of TimePickerDialog and return it       
        return TimePickerDialog(activity, this, hour, min, false)
    }

    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        // Do something with the time chosen by the user 
        val textViewTime: TextView = activity!!.findViewById(R.id.textViewTime)
        textViewTime.text = String.format("%s:%s", hourOfDay.toString(), minute.toString())
    }
}
