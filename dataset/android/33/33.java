protected String doInBackground(Integer ... params){
	try{
		Thread.sleep(params[0]);
		ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
		clipboard.setText("");
		return "success";
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	return "failure";
}
