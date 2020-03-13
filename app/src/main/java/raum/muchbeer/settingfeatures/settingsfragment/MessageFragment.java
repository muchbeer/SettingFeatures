package raum.muchbeer.settingfeatures.settingsfragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceFragmentCompat;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import raum.muchbeer.settingfeatures.R;
import raum.muchbeer.settingfeatures.SettingsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_notification, rootKey);
        setHasOptionsMenu(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {
            startActivity(new Intent(getActivity(),  SettingsActivity.class));
            return true;
            // Check first for tabletSize. If true, start MainActivity.
           /* boolean tabletSize = getResources()
                    .getBoolean(R.bool.isTablet);
            if (tabletSize) {
                startActivity(new Intent(getActivity(),
                        MainActivity.class));
            }

             */

        }
        return super.onOptionsItemSelected(item);
    }
}
