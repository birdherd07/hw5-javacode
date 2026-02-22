import java.time.LocalDate;

public class User {

	private int id;
	private int lastFourSocial;
	private int birthday;
	private int role;
	private String name;

	public void setName() {
		// TODO - implement User.setName
		throw new UnsupportedOperationException();
	}

	public void setLastFourSocial() {
		// TODO - implement User.setLastFourSocial
		throw new UnsupportedOperationException();
	}

	public void setBirthday(int newBirthday) {

        if (validateBirthday(newBirthday))
			birthday = newBirthday;
		else
			 throw new IllegalArgumentException("Invalid birthday: must be a positive date before today's date.");
    }

	public void getName() {
		// TODO - implement User.getName
		throw new UnsupportedOperationException();
	}

	public void getLastFourSocial() {
		// TODO - implement User.getLastFourSocial
		throw new UnsupportedOperationException();
	}

	public int getBirthday() {
		return birthday;
	}

	public void getAccount() {
		// TODO - implement User.getAccount
		throw new UnsupportedOperationException();
	}

	public void getId() {
		// TODO - implement User.getId
		throw new UnsupportedOperationException();
	}

	public int getRole() {
          // TODO - implement User.getRole
          throw new UnsupportedOperationException();
        }

	public void setRole() {
		// TODO - implement User.setRole
		throw new UnsupportedOperationException();
	}

	//Validate a birthday in the form YYYYMMDD
	private boolean validateBirthday(int date) {
		LocalDate localDate = LocalDate.now();

		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();

		int todaysDate = year * 10000 + month * 100 + day;
		if (date > 0 && date < todaysDate) return true;
		return false;
	}

	public User(int id, int role, String name, int birthday, int lastFourSocial) {
		this.id = id;
		this.role = role;
		this.name = name;
		this.birthday = (validateBirthday(birthday)) ? birthday : 0;
		this.lastFourSocial = (lastFourSocial > 0 && lastFourSocial < 10000) ? lastFourSocial : 0;
	}
}