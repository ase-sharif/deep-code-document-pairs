protected void onPostExecute(String status){
    if(status.equals("success")){
	Toast.makeText(HashPassActivity.this, "Clipboard has been cleared", 0).show();
	HashPassActivity.this.input.setText("");
	HashPassActivity.this.output.setText("");
	return;
    }
    Toast.makeText(HashPassActivity.this, "Unable to clear clipboard", 0).show();
}
