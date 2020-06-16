public boolean canStartLineAt(float x, float y){
	return !mShrinkingToFit && mAnimatingLine == null && isPointWithin(x, y);
}
