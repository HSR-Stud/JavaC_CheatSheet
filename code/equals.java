class Person {
	private String firstName, lastName;
	...
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){	//Pruefe ob von untersch. Klassen erzeugt
			return false;
		}
		Person other = (Person)obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
		