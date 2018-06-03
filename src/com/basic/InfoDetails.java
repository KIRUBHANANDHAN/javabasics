	public class InfoDetails{
		public String firstname,lastname;
		public int id;
		public String department;
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
	
	public String toString()
	{
		return " Firstname is "+firstname+" Lastname is "+lastname+" Department is " +department+" Id is " +id;
	}

}
	