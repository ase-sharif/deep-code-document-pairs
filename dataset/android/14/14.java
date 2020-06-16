public void onReceive(Context context, Intent, intent){
   Pref prefs = new Prefs(context);
   if (prefs.isBoostStart()){
	MonitorScheduler scheduler = new MonitorScheduler(context);
	ArrayList<Monitor> monitors = prefs.getMonitors();
	scheduler.restartAll(monitors);
	if (prefs.isBackgroundNotification()){
		scheduler.addBackgroundNotification(monitors);
	}
   }
}
