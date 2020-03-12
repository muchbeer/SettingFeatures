package raum.muchbeer.settingfeatures;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import raum.muchbeer.settingfeatures.settingsfragment.SettingGeneralFragment;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.action_settings, new SettingGeneralFragment())
                    .commit();
    }
}
