package edu.kh.collection.list.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.list.dto.Student;

public class StudentService {

	private List<Student> studentList = new ArrayList<Student>();
	
	public StudentService() {

		studentList.add(new Student("홍길동", 3, 5, 17, "서울시 중구", 'M', 75));
		studentList.add(new Student("김지민", 2, 7, 12, "서울시 서대문구", 'F', 85));
		studentList.add(new Student("한가인", 2, 5, 23, "경기도 안산시", 'F', 60));
		studentList.add(new Student("이강인", 1, 6, 10, "경기도 안산시", 'M', 95));
		studentList.add(new Student("이순신", 3, 6, 15, "경기도 수원시", 'M', 90));
	}
	
	
	/** StudentList에 학생 추가
	 * @param std
	 * @param true
	 */
	public boolean addStudent(Student std) {
		return studentList.add(std);
	}


	/**
	 * @return
	 */
	public List<Student> selectAll() {
		return studentList;
	}

	
	/** 학생 정보 수정 서비스
	 * @param index
	 * @param std
	 * @return s:Student (수정되기 전 학생 정보)
	 */
	public Student updateStudent(int index, Student std) {
		
		// e2 set(int index, E e) : 1) index에 위치하는 요소를 e로 변경
		//							2) 기존에 있던 요소 e2를 반환
		
		return studentList.set(index, std);
	}


	/** 학생 정보 제거 서비스
	 * @param index
	 * @return s:Student (제거된 학생 정보)
	 */
	public Student removeStudent(int index) {
		
		// E remove(int index) : index번째 요소를 List에서 제거하여 반환
		
		// boolean remove(E e) : List에서 E와 일치하는 요소를 찾아서
		//						 있으면 제거하고 true
		//						 없으면 false 반환
		
		return studentList.remove(index);
	}


	
	
	

}
