private String createHash(String input, String type){
   try{
	try{
		byte[] thedigest = MessageDigest.getInstance(type).digest(input.getBytes("UTF-8"));
		char[] HEX_CHARS = "0123456789abcdef".toCharArray();
		StringBuilder sb = new StringBuilder(thedigest.length * 2);
		for (byte b :thedigest){
			sb.append(HEX_CHARS[(b & 240) >> 4);
			sb.append(HEX_CHARS[b & 15]);
		}
		return sb.toString();
	}catch (NoSuchAlgorithmException nsae){
		nsae.printStackTrace();
		return null;
	}catch (UnsupportedEncodingException uee){
		uee.printStackTrace();
	}

	}
   }
}	
