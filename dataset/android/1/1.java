protected void onCreate(Bundle savedState) {
    super.onCreate(savedState);
    requestWindowFeature(5);
    setContentView(R.layout.list);
    getListView(R.layout.list);
    getListView().setTextFilterEnabled(true);
    this.mPackageManager = getPackageManger();
    new LoadingTask().execute();

}
