void getActivity(Weekday day) {
	switch (day) {
		// Labels ohne Enum-Typ
		case MONDAY:
		case TUESDAY:
		case WEDNESDAY:
			return "consulting";
		case THURSDAY:
		case FRIDAY:
			return "backoffice";
		default:
			return "weekend"
	}
}