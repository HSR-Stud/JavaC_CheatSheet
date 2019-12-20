Collectors.toList()		// in Liste abbilden
Collectors.toCollection(TreeSet::new)	// in beliebige Collection abbilden 
										//			(Konstruktorreferenz)
Collectors.groupingBy(key, aggregator)	// Gruppierung mit optionalem Aggregator
										// Aggregator: averaging, summing, counting