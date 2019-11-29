String clip(String s) throws Exception{
	if(s == null){
		throw new Exception("String is null");
	}
	if(s.length() < 2){
		throw new Exception("String is too short");
	}
	return s.substring(1, s.length()-1);
}