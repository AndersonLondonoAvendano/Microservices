package com.microservice.course.Service;

import com.microservice.course.client.StudenClient;
import com.microservice.course.dto.StudentDTO;
import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.persistence.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRepository iCourseRepository;

    @Autowired
    private StudenClient studenClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) iCourseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return iCourseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        iCourseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByCourseId(Long idCourse) {

        Course course = iCourseRepository.findById(idCourse).orElse(new Course());
        List<StudentDTO> studentDTOList = studenClient.findAllStudentByCourseId(idCourse);
        return  StudentByCourseResponse.builder()
                .name(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();

    }
}
