package de.marcusvetter.migrainediary;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import de.marcusvetter.migrainediary.model.Entry;
import de.marcusvetter.migrainediary.persistence.CSVExporter;
import de.marcusvetter.migrainediary.persistence.ICSVProvider;

public class StartActivity extends Activity {

    private DatePicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configure DatePicker
        picker = (DatePicker) findViewById(R.id.datePicker);
        picker.setCalendarViewShown(false);

        // Configure SeekBar
        final TextView stressLevelTv = (TextView) findViewById(R.id.tv_stresslevel_display);
        final SeekBar sk = (SeekBar) findViewById(R.id.sb_stresslevel);
        stressLevelTv.setText(String.valueOf(sk.getProgress()));
        sk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // no need
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // no need
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                stressLevelTv.setText(String.valueOf(progress));
            }
        });

        // Add Save-button-functionality
        final Button saveButton = (Button) findViewById(R.id.btn_save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Entry entry = createEntryObject();
                ICSVProvider csvProvider = new CSVExporter();
                csvProvider.saveEntry(entry);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private Entry createEntryObject() {
        Entry entry = new Entry();
        entry.setDate(getDateFromDatePicker());
        entry.setGetUp(((RadioButton) findViewById(R.id.rg_getup_rb_less7)).isChecked() ? "<7" : ((RadioButton) findViewById(R.id.rg_getup_rb_7to9)).isChecked() ? "7-9" : ">9");
        entry.setBedtime(((RadioButton) findViewById(R.id.rg_bedtime_rb_less21)).isChecked() ? "<21" : ((RadioButton) findViewById(R.id.rg_bedtime_rb_21to23)).isChecked() ? "21-23" : ">23");
        entry.setActivity(((Spinner) findViewById(R.id.sp_activity)).getSelectedItem().toString());
        entry.setStressLevel(((SeekBar) findViewById(R.id.sb_stresslevel)).getProgress());
        entry.setHeadpain(((RadioButton) findViewById(R.id.rg_headpain_rb_none)).isChecked() ? "none" : ((RadioButton) findViewById(R.id.rg_headpain_rb_little)).isChecked() ? "little" : ((RadioButton) findViewById(R.id.rg_headpain_rb_medium)).isChecked() ? "medium" : "massive");
        entry.setPainkiller(((CheckBox) findViewById(R.id.cb_painkiller)).isChecked());
        entry.setSurplusCarb(((CheckBox) findViewById(R.id.cb_carb)).isChecked());
        entry.setSurplusFat(((CheckBox) findViewById(R.id.cb_fat)).isChecked());
        entry.setSurplusProtein(((CheckBox) findViewById(R.id.cb_protein)).isChecked());
        entry.setLackWater(((CheckBox) findViewById(R.id.cb_water)).isChecked());
        entry.setLackMeat(((CheckBox) findViewById(R.id.cb_meat)).isChecked());
        entry.setDrinksCoffee(((CheckBox) findViewById(R.id.cb_coffee)).isChecked());
        entry.setDrinksAlc(((CheckBox) findViewById(R.id.cb_alc)).isChecked());
        entry.setWeather(((RadioButton) findViewById(R.id.rg_weather_rb_sunny)).isChecked() ? "sunny" : ((RadioButton) findViewById(R.id.rg_weather_rb_cloudy)).isChecked() ? "cloudy" : "rainy");
        entry.setTemp(((EditText) findViewById(R.id.input_temperature)).getText().toString());
        entry.setSportsEndurance(((CheckBox) findViewById(R.id.cb_sports_endurance)).isChecked());
        entry.setSportsPower(((CheckBox) findViewById(R.id.cb_sports_power)).isChecked());
        entry.setComments(((EditText)findViewById(R.id.input_comments)).getText().toString());
        return entry;
    }

    public String getDateFromDatePicker() {
        int day = picker.getDayOfMonth();
        int month = picker.getMonth() + 1;
        int year = picker.getYear();

        return year + "-" + month + "-" + day;
    }


}
