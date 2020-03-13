package raum.muchbeer.settingfeatures.settingsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.preference.PreferenceFragmentCompat;

import raum.muchbeer.settingfeatures.MainActivity;
import raum.muchbeer.settingfeatures.R;
import raum.muchbeer.settingfeatures.SettingsActivity;

public class SettingGeneralFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_general, rootKey);
        setHasOptionsMenu(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            startActivity(new Intent(getActivity(),  MainActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
