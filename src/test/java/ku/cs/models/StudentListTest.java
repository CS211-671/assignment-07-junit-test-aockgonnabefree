package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }


    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียน")
    void testAddStudent(){
        studentList.addNewStudent("6610401985", "aock");
        assertEquals(1, studentList.getStudents().size());
        studentList.addNewStudent("6610402205", "nest");
        assertEquals(2, studentList.getStudents().size());
    }@Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนพร้อมคะแนน")
    void testAddStudentWithScore(){
        studentList.addNewStudent("6610401985", "aock",80);
        assertEquals(1, studentList.getStudents().size());
        studentList.addNewStudent("6610402205", "nest");
        assertEquals(2, studentList.getStudents().size());
    }
    @Test
    @DisplayName("ทดสอบหานักเรียนจาก ID")
    void testFindStudentById(){
        studentList.addNewStudent("6610401985", "aock");
        assertEquals("aock", studentList.findStudentById("6610401985").getName());
    }

    @Test
    @DisplayName("ทดสอบการให้คะแนนรักเรียนจาก ID")
    void testGiveScoreToId(){
        studentList.addNewStudent("6610401985", "aock");
        studentList.giveScoreToId("6610401985",80);
        assertEquals(80, studentList.findStudentById("6610401985").getScore());
    }

    @Test
    @DisplayName("ทดสอบการดูเกรดนักเรียนจาก ID")
    void testViewGradeOfId(){
        studentList.addNewStudent("6610401985", "aock", 80);
        assertEquals("A", studentList.findStudentById("6610401985").grade());
    }
}