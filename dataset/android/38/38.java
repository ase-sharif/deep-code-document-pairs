public void onSaveInstanceState(Bundle outState){
	super.onSaveInstanceState(outState);
	outState.putInt(KEY_LEVEL, this.level);
	outState.putInt(KEY_GEAR_LEVEL, this.gear_level);
}
