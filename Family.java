package com.learn.test;
/**
 * Supports FamilyDetails
 * @author gopi
 *
 */
public class Family {
		String firstName;
		String lastName;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public Family(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		@Override
		public String toString() {
			return lastName;
		}
		
		

}
