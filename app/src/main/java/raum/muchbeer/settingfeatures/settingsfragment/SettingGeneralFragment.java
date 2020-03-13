package raum.muchbeer.settingfeatures.settingsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.preference.EditTextPreference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

import raum.muchbeer.settingfeatures.MainActivity;
import raum.muchbeer.settingfeatures.R;
import raum.muchbeer.settingfeatures.SettingsActivity;
import raum.muchbeer.settingfeatures.settingsfragment.model.Messages;

public class SettingGeneralFragment extends PreferenceFragmentCompat {

    private static final String LOG_TAG = SettingGeneralFragment.class.getSimpleName();
    private Messages messages;
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_general, rootKey);
               setHasOptionsMenu(true);
        EditTextPreference inputText = findPreference("example_text");
       // messages.setMessages(inputText.getText());
        Log.d(LOG_TAG, "tHE input from the EditText is : "  + inputText.getText());

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
