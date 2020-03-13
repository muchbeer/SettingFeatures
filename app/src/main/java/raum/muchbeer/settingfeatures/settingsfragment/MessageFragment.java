package raum.muchbeer.settingfeatures.settingsfragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import raum.muchbeer.settingfeatures.R;
import raum.muchbeer.settingfeatures.SettingsActivity;
import raum.muchbeer.settingfeatures.settingsfragment.model.Messages;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends PreferenceFragmentCompat {

    private Messages messages;

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.pref_notification, rootKey);
        setHasOptionsMenu(true);

        SwitchPreference prefSwitchNotification = findPreference("notifications_new_message_vibrate");

    }


    //Custom back button in frgment
/*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This callback will only be called when MyFragment is at least Started.
        OnBackPressedCallback callback = new OnBackPressedCallback(true */
/* enabled by default *//*
) {
            @Override
            public void handleOnBackPressed() {
                // Handle the back button event
            }
        };
        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);

        // The callback can be enabled or disabled here or in handleOnBackPressed()

    }
*/

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
