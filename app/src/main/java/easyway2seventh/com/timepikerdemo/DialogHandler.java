package easyway2seventh.com.timepikerdemo;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by MMD on 19/01/2016.
 */
public class DialogHandler extends DialogFragment {

    TextView time;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog;
        TimeSettings timeSettings = new TimeSettings(getActivity(), time);
        dialog = new TimePickerDialog(getActivity(), timeSettings, hour, minute, DateFormat.is24HourFormat(getActivity()));
        return dialog;

        //return super.onCreateDialog(savedInstanceState);
    }
}
