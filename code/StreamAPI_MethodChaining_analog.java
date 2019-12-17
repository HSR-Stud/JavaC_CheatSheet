Stream<Person> stream1 = people.stream();
Stream<Person> stream2 = stream1.filter(p -> p.getAge() >= 18);
Stream<Person> stream3 = stream2.map(p -> p.getLastName());
Stream<Person> stream4 = stream3.sorted();
stream4.forEeach(s -> System.out.println(s));