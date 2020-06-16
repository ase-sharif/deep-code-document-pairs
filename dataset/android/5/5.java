public void updateThemeDialog(){
    int current_theme = this.bconfig.GetThemeId();
    int i = 0;
    while(i <= 6){
	ImageView imv = (ImageView) findViewById(R.id.theme + fi);
	imv.setBackgroundResource(current_theme == i? R.drawable.selected: R.drawable.notselected);
	imv.setOnClickListener(new View.OnClickListener()){
	    public void onClick(View v){
		BlinklightBattery.this.bconfig.SetThemeId(fi);
		BlinklightBattery.this.bb_service_connection.bbsvc.updateNotifyIcon();
		BlinklightBattery.this.updateThemeDialog();
	    }
	}

    }

}
