protected void onDestory(){
    getPreferenceManager
	    .getSharedPreferences()
	    .unregisterOnSharedPreferenceChangeListener(this);
    super.onDestroy();
}
