package beans;

public class Student {
private int id;
private String name,email,address;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Student(){
	
}

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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


}

