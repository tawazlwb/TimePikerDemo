package easyway2seventh.com.timepikerdemo;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MMD on 19/01/2016.
 */
public class DateSettings implements DatePickerDialog.OnDateSetListener {
    Context context;
    TextView textView;

    public DateSettings(Context context, TextView textView) {
        this.context = context;
        this.textView = textView;
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        textView.setText(dayOfMonth + "/" + year + "/" + monthOfYear);
        textView.setVisibility(View.VISIBLE);
        Toast.makeText(context, dayOfMonth+"/"+year+"/"+monthOfYear,Toast.LENGTH_LONG).show();
    }
}
