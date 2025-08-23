package file_handling;

import java.io.Serializable;

public class Student implements Serializable{

	 private static final long serialVersionUID = 1L; // Recommended for version control
	    private String name;
	    private int id;
	    private String major;
	    private transient String secretInfo; // This field will not be serialized

	    public Student(String name, int id, String major, String secretInfo) {
	        this.name = name;
	        this.id = id;
	        this.major = major;
	        this.secretInfo = secretInfo;
	    }

	    // Getters for accessing student data
	    public String getName() {
	        return name;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getMajor() {
	        return major;
	    }

	    @Override
	    public String toString() {
	        return "Student [Name: " + name + ", ID: " + id + ", Major: " + major + "]";
	    }
	}