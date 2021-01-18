package com.pullhq.notes.entities;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Tag {
	@Id
	private UUID id;
	
	@NotBlank
	@Size(min=1,max=60)
	@Column(length=60, nullable=false)
	private String name;
	
	@ManyToMany(mappedBy="tags")
	private Set<Note> notes;
	
}
