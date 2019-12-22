String clip(String s) throws Exception{
	if(s == null){
		throw new Exception("String null");
	}
	if(s.length() < 2){
		throw new Exception("String too short");
	}
	return s.substring(1, s.length()-1);
}