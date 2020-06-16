public void updateNotification(){
	if(mSharedPreferences.getBoolean("enabled", false)){
		this.enableNotification();
	}
	else {
		this.disableNotification();
	}
}
