Scanner s = new Scanner(System.in);
try{
	...//work with s
}finally{
	if(s != null) {s.close();}
}