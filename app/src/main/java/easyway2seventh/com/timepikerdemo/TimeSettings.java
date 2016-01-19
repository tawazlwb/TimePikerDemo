package easyway2seventh.com.timepikerdemo;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by MMD on 19/01/2016.
 */
public class TimeSettings implements TimePickerDialog.OnTimeSetListener{
    Context context;
    TextView text;

    public TimeSettings(Context context, TextView text) {
        this.context = context;
        this.text = text;
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        text.setText(hourOfDay + ":" + minute);
        text.setVisibility(View.VISIBLE);
        Toast.makeText(context, "Heure : "+hourOfDay+" et Minutes : "+minute, Toast.LENGTH_LONG).show();
    }
}
