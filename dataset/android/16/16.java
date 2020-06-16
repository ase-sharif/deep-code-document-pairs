protected void onPause(){
    super.onPause();
    Editor editor = getSharedPreferences("JustSitPreferences", 0).edit();
    editor.putBoolean(JustSit.AIRPLANE_MODE, this.mAirplaneMode.isChecked());
    editor.putBoolean(JustSit.SCREEN_ON, this.mScreenOn.isChecked());
    editor.putBoolean(JustSit.SILENT_MODE, this.mSilentMode.isChecked());
    editor.putBoolean(JustSit.MAXIMIZE_VOLUME, this.mMaximizeVolume.isChecked());
    editor.commit();
}
