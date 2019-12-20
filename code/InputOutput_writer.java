try (var writer = new FileWriter("test.txt", true)) {	// true => Append
	writer.write("Hello!");		// String schreiben
	writer.wrtie('\n');			// Einzelner char schreiben
}