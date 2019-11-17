@Override
public int hashCode(){
	return firstName.hashCode()
		+ 31 * lastName.hashCode();