package in.sp.beans;

import java.util.List;

public class Subjects {
	public List<String> subjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subjects.toString();
	}
}
