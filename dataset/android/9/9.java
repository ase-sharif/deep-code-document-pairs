public boolean showAbout(MenuItem item){
    Dialog about = new Dialog(this);
    about.setContentView(R.layout.about);
    about.setTitle(R.string.about);
    about.show();
    return true;
}
