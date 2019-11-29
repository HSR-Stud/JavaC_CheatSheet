void test(){
	try{
		String s = null;
		String c = clip(s);
		System.out.println(c);
	} catch(Exception e){
		System.out.println("Error occurred. Test failed.");
	}
}