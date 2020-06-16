private Dialog createAlertDialog(int messageId){
	Builder builder = new Builder(this);
	builder.setMessage(messageId).setCancelable(false)
		.setPositiveButton(R.string.dialogPositive, this.dialogClose);
	return builder.create();
}
