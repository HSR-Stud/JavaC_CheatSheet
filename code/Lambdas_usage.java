public void testAll(Predicate<T> criterion) {
	List<Integer> integerList = 
					Arrays.asList(10, 20, 18, 21);
	for(int elem: integerList){
		if(criterion.test(elem)){
			System.out.println(elem + '\n');
		}
	}
}