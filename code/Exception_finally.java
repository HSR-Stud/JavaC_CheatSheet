try{
	String s = ...;
	String c = clip(s);
}catch(StringClipException e){
	System.out.println("cannot clip");
}finally{
	System.out.println("finished");
}