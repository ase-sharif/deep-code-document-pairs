public boolean onKey(View v, int keyCode, KeyEvent event){
	switch(v.getId()){
		case R.id.txtAmount:
		case R.id.txtPeople:
			TipsterActivity.this.btnCalculate.setEnabled(true);
			break;
		case R.id.txtTipOther:
			TipsterActivity.this.btnCalculate.setEnabled(true);
			break;
	}
	return false;
}
