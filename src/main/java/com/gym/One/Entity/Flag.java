package com.gym.One.Entity;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name="one")
public class Flag implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_one")
	private long Id;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	@Column(name = "idone")
	private long IdOne;
	
	public long getIdOne() {
		return IdOne;
	}

	
}
