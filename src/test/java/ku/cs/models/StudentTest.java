package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;
    @BeforeEach
    void init() {
       s1 = new Student("6610401985", "aock");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 30 และ 10 คะแนนตามลำดับ")
    void testAddScore(){
        s1.addScore(30);
        assertEquals(30, s1.getScore());
        s1.addScore(10);
        assertEquals(40, s1.getScore());
    }

    @Test
    @DisplayName("ทดสอบเกรด A ที่ 80 คะแนน")
    void testCalculateGrade(){
        s1.addScore(80);
        assertEquals("A", s1.grade());
    }

    @Test
    @DisplayName("ทดสอบว่า ID ตรงหรือไม่")
    void testIsId(){
        assertTrue(s1.isId("6610401985"));
    }

    @Test
    @DisplayName("ทดสอบเปลี่ยนชื่อ")
    void testChangeName(){
        s1.changeName("Luffy");
        assertEquals("Luffy", s1.getName());
    }
}