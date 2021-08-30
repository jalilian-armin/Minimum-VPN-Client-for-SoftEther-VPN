package kittoku.mvc.preference.custom

import android.content.Context
import android.content.SharedPreferences
import android.util.AttributeSet
import androidx.preference.SwitchPreferenceCompat
import kittoku.mvc.preference.MvcPreference
import kittoku.mvc.preference.accessor.getBooleanPrefValue


internal class HomeConnectorPreference(context: Context, attrs: AttributeSet) : SwitchPreferenceCompat(context, attrs) {
    private val mvcPreference = MvcPreference.HOME_CONNECTOR
    private var listener: SharedPreferences.OnSharedPreferenceChangeListener? = null

    override fun onAttached() {
        super.onAttached()

        key = mvcPreference.name

        attachSharedPreferenceListener()
    }

    override fun onDetached() {
        super.onDetached()

        sharedPreferences.unregisterOnSharedPreferenceChangeListener(listener)
        listener = null
    }

    private fun attachSharedPreferenceListener() {
        listener = SharedPreferences.OnSharedPreferenceChangeListener { prefs, key ->
            if (key == mvcPreference.name) {
                isChecked = getBooleanPrefValue(mvcPreference, prefs)
            }
        }

        sharedPreferences.registerOnSharedPreferenceChangeListener(listener)
    }
}
