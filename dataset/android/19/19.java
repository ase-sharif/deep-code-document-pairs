public boolean matchesPasswordHash(String masterPassword){
	if(this.profile.hasPasswordHash()){
		return generatePassword(this.profile.getPasswordSalt(), masterPassword)
			.equals(this.profile.getCurrentPasswordHash());
	}
	return true;
}
