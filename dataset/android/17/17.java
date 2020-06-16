protected void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	addPreferencesFromResource(R.xml.preferences);
	getPreferenceScreen()
		.findPreference("maxlevelPreference")
		.setOnPreferenceChangeListener(this.levelListener);

}
