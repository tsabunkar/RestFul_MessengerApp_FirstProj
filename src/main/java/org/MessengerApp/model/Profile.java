package org.MessengerApp.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {

	private int pid;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;

	public Profile() {}

	public Profile(int id, String profileName, String firstName, String lastName, Date created) {
		super();
		this.pid = id;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.created = created;
	}

	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Profile [pid=" + pid + ", profileName=" + profileName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", created=" + created + "]";
	}

}
