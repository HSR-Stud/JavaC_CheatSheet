public <E> Stack<E> multiPush(E value, int times){
	var result = new Stack<E>();
	for(int i = 0; i < times; i++){
		result.push(value);
	}
	return result;
}