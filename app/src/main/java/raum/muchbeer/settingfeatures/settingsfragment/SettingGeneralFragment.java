package raum.muchbeer.settingfeatures.settingsfragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreferenceCompat;

import raum.muchbeer.settingfeatures.MainActivity;
import raum.muchbeer.settingfeatures.R;

public class SettingGeneralFragment extends PreferenceFragmentCompat {

    private static final String LOG_TAG = SettingGeneralFragment.class.getSimpleName();
    private ListPreference mListPreference;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mListPreference = (ListPreference)  getPreferenceManager().findPreference("example_list");
        mListPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
               // app.savePublicPreference(Common.PREFERENCE_INT_RECTIME, Integer.valueOf((String)newValue));
                Log.d(LOG_TAG, "tHE value of the checkbox selected is: "+ newValue);
                return true;
            }
        });
        return super.onCreateView(inflater, container, savedInstanceState);
    }

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
