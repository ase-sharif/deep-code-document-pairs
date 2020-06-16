protected void onStop(){
    super.onStop();
    Editor editor = getSharedPreferences(PREFS_NAME, 0).edit();
    Spinner aperture = (Spinner) findViewById(R.id.aperture);
    Spinner focalLength = (Spinner) findViewById(R.id.focalLength);
    editor.putInt("sensor", ((Spinner) findViewById(R.id.sensor)).getSelectedItemPosition());
    editor.putInt("aperture", aperture.getSelectedItemPosition());
    editor.putInt("focalLength", focalLength.getSelectedItemPosition());
    editor.commit();
}
