public void onClick(View view) {
    switch(view.getId()){
	case R.id.newShortcut:
		startActivityForResult(new Intent(this, CreateShortcutActivity.class), REQUEST_SHORTCUT);
		return;
	defualt:
		return;
    }
}
