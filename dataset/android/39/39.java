public BeerStatListAdapter(Activity context){
	super(context, R.layout.chartslist_row);
	for(BeerStat e : Stats.this.stats) {
		add(e);
	}
	this.context = context;
}
