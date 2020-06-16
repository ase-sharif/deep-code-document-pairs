private void showAbout(){
	AlertDialog alertDialog = new AlertDialog.Builder(this).create();
	alertDialog.setTitle("About");
	alertDialog.setMessage("Battery Circle " + getResources()
			.getText(R.string.app_vers) + "\n");
	alertDialog.setButton("OK", new DialogInterface.OnClickListener(){
		public void onClick(DialogInterface dialog, int which){
			return;
		}
	}});
	alertDialog.show();
}
