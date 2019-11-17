interface Iterator<E> {
	boolean hasNext();
	E next();
}

interface Iterable<T> {
	Iterator<T> iterator();
}