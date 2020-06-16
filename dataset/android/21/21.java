public void onActivityResult(int requestCode, int resultCode, Intent intent){
	if(requestCode == 0 && resultCode == -1){
		String contents = intent.getStringExtra("SCAN_RESULT");
		Log.d("barcode returned", "contents = " + contents + ", format = " +
				intent.getStringExtra("SCAN_RESULT_FORMAT"));
		this.upcLookupProgress
			.setTitle(getText(R.string.barcode_inprogress_title));
		this.upcLookupProgress
			.setMessage(getText(R.string.barcode_inprogress_message));
		this.upcLookupProgress.setIndeterminate(true);
		this.upcLookupProgress.show();
		new UpcHelper().getUpcProductName(contents, this.upcResultHandler);
	}
}
