class StringClipException extends Exception{	// muss von einer Exception erben!!!
	StringClipException(){}
	
	StringClipException(String message){
		super(message);
	}
}