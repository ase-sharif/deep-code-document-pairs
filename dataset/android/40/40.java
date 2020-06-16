public boolean onOptionsItemSelected(MenuItem item){
	switch(item.getItemId()){
		case R.id.settings:
			startActivity(new Intent(this, Settings.class));
			return true;
		default:
			return false;
	}
}
