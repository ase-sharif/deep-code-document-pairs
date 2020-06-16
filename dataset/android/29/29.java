private Bitmap getPhoneActionIcon(Resources r, int resId) {
	Drawable phoneIcon = r.getDrawable(resId);
	if(phoneIcon instanceof BitmapDrawable){
		BitmapDrawable bd = (BitmapDrawable) phoneIcon;
		return bd.getBitmap();
	}else{
		return null;
	}
}
