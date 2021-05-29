/**
 * 
 */
package com.springcavaj.springjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author AC083101
 *
 */
@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "first_name", nullable = false)
	private String firstName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "last_name", nullable = false)
	private String lastName;
	@Column(name = "mobile_no", nullable = false)
	private String mobileNo;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "pan_no", nullable = false)
	private String panNo;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((panNo == null) ? 0 : panNo.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (middleName == null) {
			if (other.middleName != null) {
				return false;
			}
		} else if (!middleName.equals(other.middleName)) {
			return false;
		}
		if (mobileNo == null) {
			if (other.mobileNo != null) {
				return false;
			}
		} else if (!mobileNo.equals(other.mobileNo)) {
			return false;
		}
		if (panNo == null) {
			if (other.panNo != null) {
				return false;
			}
		} else if (!panNo.equals(other.panNo)) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", mobileNo=");
		builder.append(mobileNo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", panNo=");
		builder.append(panNo);
		builder.append("]");
		return builder.toString();
	}
}
