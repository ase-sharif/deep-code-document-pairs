public void lockScreenOn(){
	this.mScreenOn = getSharedPreferences("JustSitPreferences", 0).getBoolean(JustSit.SCREEN_ON, false);
	if(this.mScreenOn){
		getWindow().addFlags(128);
	}
}
