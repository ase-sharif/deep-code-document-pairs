public void onReceive(Context context, Intent intent){
    new AutoAnswer
	    .Notifier(context)
	    .updateNotification();
}
