var in = new FileInputStream("myFile.data");	// bestehende Datei zum lesen oeffnen
int value = in.read();
while (value >= 0) {		// -1 => end of file
	byte b = (byte)value;	// gelesenes Byte (wenn positiv)
	// work with b
	value = in.read();
}
in.close();