people
	.stream()
	.filter(p -> p.getAge() >= 18)
	.map(p -> p.getLastName())
	.sorted()
	.forEach(System.out::println);