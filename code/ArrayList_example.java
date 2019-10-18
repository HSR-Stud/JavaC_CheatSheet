var stringList = new ArrayList<String>();

stringList.add("one");			// add at the end
stringList.add(0, "two");		// insert at pos 0
// add -> umkopieren in doppelt so grosses Array (gibt leere plaetze)
String x = stringList.get(1);	// get at pos 1
stringList.set(0, "three");		// replace at pos 0
stringList.remove("two");		// removes the FIRST "two" in List
stringList.remove(1);			// remove at pos 1
// remove -> alles dahinter wird nach vorne geschoben
stringList.contains("three");	// true -> "three" is in List, else -> falselong
long size = stringList.size();	// get size (number of Elements)
