package org.practicaltest.model;

public class Student implements Comparable<Student>{

	private String studentId;
	private String studentName;
	private String dateOfAdd;
	
	


	public Student(String studentId, String studentName, String dateOfAdd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dateOfAdd = dateOfAdd;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getDateOfAdd() {
		return dateOfAdd;
	}


	public void setDateOfAdd(String dateOfAdd) {
		this.dateOfAdd = dateOfAdd;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dateOfAdd=" + dateOfAdd + "]";
	}


	@Override
	public int compareTo(Student o) {
		String str1 = this.getStudentName();
		String str2 = o.getStudentName();
		int comp = str1.compareTo(str2);
		return comp;
	}
    
	

}