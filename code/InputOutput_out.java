var out = new FileOutputStream("test.data");// Datei neu anlegen bzw. ueberschreiben
while (...) {
	byte b = ...;
	out.write(b);
}
out.close();	// Wichtig! Herunterschreiben ("Flush") des Rests beim Schliessen

new FileOutputStream("test.data", true)		// Anhaengen an File, falls existiert