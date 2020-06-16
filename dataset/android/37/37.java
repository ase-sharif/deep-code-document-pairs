public void onAttach(Activity activity){
	super.onAttach(activity);
	if(!(activity instanceof Callbacks)){
		throw new IllegalStateException("Activity must implement fragment's callbacks.");
		mCallbacks = (Callbacks) activity;
		if(loadedAccount != null){
			Account acc = loadedAccount;
			loadedAccount = null;
			mCallbacks.onItemView(acc);
		}
	}
}
