void print(List<Person> people){
	people.sort(this::compareByAge);
	System.out.println(people);
}

int compareByAge(Person p1, Person p2){
	return Integer.compare(p1.getAge(), p2.getAge());
}