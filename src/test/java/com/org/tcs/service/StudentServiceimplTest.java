package com.org.tcs.service;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceimplTest {

    @InjectMocks
    private StudentServiceimpl studentServiceimpl;

    @Mock
    StudentRepo studentRepo;

    @Test
    void createStudent() {
        Student student = new Student();
        student.setAddress("blr");
        student.setPno(89889.0);
        student.setName("nani");
        student.setId(101);

        studentServiceimpl.createStudent(student);

    }

    @Test
    void getAllStudent() {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student();
        student1.setAddress("blr");
        student1.setPno(89889.0);
        student1.setName("nani");
        student1.setId(101);
        list.add(student1);
        Student student2 = new Student();
        student2.setAddress("blr");
        student2.setPno(89889.0);
        student2.setName("nani");
        student2.setId(102);
        list.add(student2);
        Mockito.when(studentRepo.findAll()).thenReturn(list);
        List<Student> expectedValues = studentServiceimpl.getAllStudent();
        Assertions.assertEquals(list,expectedValues);

    }

    @Test
    void updateStudent() {
    }

    @Test
    void findById() {
    }

    @Test
    void deleteByAddress() {
    }

    @Test
    void updatePnoBasedOnAddress() {
    }
}