try (var reader = new FileReader("quotes.txt")) {	// Systemabhaengige Charcter Set
	int value = reader.read();
	while (value >= 0) {	// -1 => end of line
		char c = (char)value;	// 16-bit char
		// use character
		value = reader.read();
	}
}