try(var reader = new BufferedReader(new FileReader("quotes.txt")) {
	String line = reader.readLine();
	while(line != null){
		System.out.println(line);
		line = reader.readLine();
	}
}