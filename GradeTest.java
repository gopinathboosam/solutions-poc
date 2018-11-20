package com.learn.test;
/**
 * Grading of students based on critieria
 * Problem Source : Hackerrank
 * @author gopi
 *
 */
public class GradeTest {

	public static void main(String[] args) {
		int arrayGrades[] = {73,67,38,33};
		//System.out.println(73%5);
		getGrades(arrayGrades);
	}

	private static void getGrades(int grades[]) {
		// TODO Auto-generated method stub
		int result[] = new int[grades.length];
		int modulo=0;
		int nextGrade=0;
		for(int i=0; i<grades.length;i++) {
			if(grades[i]<38) {
				result[i]=grades[i];
			} else  {
				nextGrade=calculateNext(grades[i]);
				result[i] = nextGrade-grades[i]<3 ? nextGrade:grades[i];
			}
			System.out.println(result[i]);
		}
	}

	private static int calculateNext(int i) {
		int newGrade=0;
		newGrade= ((i/5)+1)*5;
		return newGrade;
	}
}
