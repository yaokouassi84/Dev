package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQuery(name="findAllEmails",query="SELECT ems FROM Email ems")
public class Email implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateEmail;
	

	public Email() {
		super();
	}  


	public Email(Long id, String email, Date dateEmail) {
		super();
		this.id = id;
		this.email = email;
		this.dateEmail = dateEmail;
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public Date getDateEmail() {
		return dateEmail;
	}


	public void setDateEmail(Date dateEmail) {
		this.dateEmail = dateEmail;
	}


	@Override
	public String toString() {
		return "Email [id=" + id + ", email=" + email + ", dateEmail=" + dateEmail + "]";
	}

}
