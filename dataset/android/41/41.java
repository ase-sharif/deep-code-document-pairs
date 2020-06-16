private void reset(){
	this.txtTipAmount.setText("");
	this.txtTotalToPay.setText("");
	this.txtTipPerPerson.setText("");
	this.txtAmount.setText("");
	this.txtPeople.setText(Integer.toString(DEFUALT_NUM_PEOPLE));
	this.txtTipOther.setText("");
	this.rdoGroupTips.clearCheck();
	this.rdoGroupTips.check(R.id.radioFifteen);
	this.txtAmount.requestFocus();
}
