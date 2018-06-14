package com.mile1.service;
import java.lang.Exception;
import com.mile1.exception.*;
import com.mile1.bean.Student;

public class StudentReport {
	public String findGrade(Student studentObject) {
		int sum = 0;
		int m[] = studentObject.getMarks();
		for(int i=0; i<m.length; i++) {
			if(m[i]<35) {
				return "F";
			}
			else {
				sum+=m[i];
				if(sum<=150) {
					return "D";
				}else if((sum > 150)&&(sum <= 200)){
					return "C";
				}
				else if((sum > 200)&&(sum <= 250)) {
					return "B";
				}
				else if((sum>250)&&(sum<=300)){
					return "A";
				}
			}
		}
		return null;
	}
	public String validate(Student studentObject) {
		String S1 = studentObject.getName();
		int m[] = studentObject.getMarks();
		if(studentObject == null) {
			throw new NullStudentException();
		}
		else if(S1 == null) {
				throw new NullNameException();
			}
		else if(m.length == null) {
			throw new NullMarksArrayException();
			
		}
	}

}
