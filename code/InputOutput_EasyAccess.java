// Ganze Text-Datei einlesen
List<String> lines = Files.readAllLines(Path.of("in.txt"), StandardCharsets.UTF_8);

// Alle Zeilen als StreamAPI:
Stream<String> lines = Files.lines(Path.of("in.txt"), StandardCharsets.UTF_8);

// Ganze Text-Datei schreiben
Files.write(Path.of("out.txt"), lines, StandardCharsets.UTF_8);