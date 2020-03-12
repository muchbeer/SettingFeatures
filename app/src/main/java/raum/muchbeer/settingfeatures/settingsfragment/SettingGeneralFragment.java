package raum.muchbeer.settingfeatures.settingsfragment;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import raum.muchbeer.settingfeatures.R;

public class SettingGeneralFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_general, rootKey);

    }
}
