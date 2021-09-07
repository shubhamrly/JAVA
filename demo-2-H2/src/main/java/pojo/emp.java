package pojo;

import javax.persistence.*;

@Entity
@Table(name="EMP")
public class emp {
@Id
@Column(name="id")
	int id;

@Column(name="name")
String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
