@FunctionalInterface // bringt eigentlich überhaupt nichts
public interface Predicate<T> {
	boolean test(T element);
}