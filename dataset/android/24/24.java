public NumberPicker(Context context, AttributeSet attrs, int defStyle){
	super(context, attrs);
	this.mRunnable = new C00022();
	this.mSpeed = 300;
	setOrientation(1);
	((LayoutInflater) context.getSystemService("layout_inflater"))
		.inflate(R.layout.number_picker, this, true);
	this.mHandler = new Handler();
	InputFilter inputFilter = new NumberPickerInputFilter();
	this.mNumberInputFilter = new NumberRangeKeyListener();
	this.mIncrementButton = (NumberPickerButton) findViewById(R.id.increment);
	this.mIncrementButton.setOnClickListener(this);
	this.mIncrementButton.setOnLongClickListener(this);
	this.mIncrementButton.setNumberPicker(this);
	this.mDecrementButton = (NumberPickerButton) findViewById(R.id.decrement);
	this.mDecrementButton.setOnClickListener(this);
	this.mDecrementButton.setOnLongClickListener(this);
	this.mDecrementButton.setNumberPicker(this);
	this.mText = (EditText) findViewById(C0000R.id.timepicker_input);
	this.mText.setOnFocusChangeListener(this);
	this.mText.setFilters(new InputFilter[]{inputFilter});
	this.mText.setRawInputType(2);
	if(!isEnabled()){
		setEnabled(false);
	}
	this.mStart = DEFAULT_MIN;
	this.mEnd = DEFAULT_MAX;
}	
