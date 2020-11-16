package com.pullhq.notes.entities;

import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class User {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@NotBlank
	@Size(min = 2, max = 60)
	@Column(length = 60, nullable = false)
	private String name;
	
	@Email
	@NotBlank
	@Column(nullable = false)
	private String email;
	
	@NotBlank
	@Size(min = 8, max = 60)
	@Column(length = 60, nullable = false)
	private String password;
	
	@NotNull
	@Column(nullable = false)
	private OffsetDateTime createdAt;
	
	@NotNull
	@Column(nullable = false)
	private OffsetDateTime modifiedAt;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(OffsetDateTime modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

}
