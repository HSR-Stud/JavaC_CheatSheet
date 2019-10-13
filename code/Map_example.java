Map<Integer, Student> map = new HashMap<>();

Student st1 = new Student("Andrea", "Meier");
Student st1 = new Student("Bertha", "Mueller");
Student st1 = new Student("Clara", "Schneider");

map.put(20000, st1);	// Bei gleichem Schluessel 
map.put(70000, st2);	// wird der Wert ueberschrieben
map.put(13000, st3);	// -> nur ein Key pro Map

Student st = map.get(12345);	// Finden nach Schluessel (sehr effizient)

for(Student s : map.values()){	// .values() gibt Collection aller Werte
	System.out.println(s);
}