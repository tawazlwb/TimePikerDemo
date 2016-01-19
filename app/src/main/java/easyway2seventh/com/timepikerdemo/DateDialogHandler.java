package easyway2seventh.com.timepikerdemo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by MMD on 19/01/2016.
 */
public class DateDialogHandler extends DialogFragment{

    TextView textView;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dialog;
        DateSettings dateSettings = new DateSettings(getActivity(), textView);
        dialog = new DatePickerDialog(getActivity(), dateSettings, year, month, day);
        return dialog;
    }
}
