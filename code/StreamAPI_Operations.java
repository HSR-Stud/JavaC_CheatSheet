filter(Predicate)	// Rauspicken gemaess Predicate-Funktionsobjekt/Lambda
map(Function)		// Projizieren gemaess Funktionsobjekt/Lambda
mapToInt(Function)	// Projizieren auf int, long double (primitiver Datentyp)
sorted()			// sortieren, mit oder ohne Comparator
distinct()			// keine gleichen Elemente gemaessss Equals()
limit(long n)		// erste n Elemente liefern, danach ignorieren
skip(long n)		// erste n Elemente ignorieren, danach weiterliefern