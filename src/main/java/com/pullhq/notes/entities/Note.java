package com.pullhq.notes.entities;

import java.time.OffsetDateTime;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Note {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@NotBlank
	private String title;
	
	@Lob
	private String text;
	
	@NotNull
	@Column(nullable = false)
	private OffsetDateTime createdAt;
	
	@NotNull
	@Column(nullable = false)
	private OffsetDateTime modifiedAt;
	
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(name="note_tag", joinColumns = @JoinColumn(name="note_id"),
				inverseJoinColumns = @JoinColumn(name="tag_id")
			)
	private Set<Tag> tags;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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
