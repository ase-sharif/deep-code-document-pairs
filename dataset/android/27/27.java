protected void onSaveInstanceState(Bundle outState){
	super.onSaveInstanceState(outState);
	outState.putBoolean(KEY_HAS_PASSED_PIN, this.mHasPassedPin.booleanValue());
	outState.putLong(KEY_SELECTED_TOKEN_ID, this.mSelectedTokenId.longValue());
}
