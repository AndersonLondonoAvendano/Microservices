package com.microservice.course.controller;
import com.microservice.course.Service.ICourseService;
import com.microservice.course.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/course")
public class CourseController {
    @Autowired()
    private ICourseService iCourseService;

    @PostMapping("/create")
    public void save(@RequestBody Course course) {
        iCourseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(iCourseService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(iCourseService.findById(id));
    }


    @GetMapping("/search-students-by-course/{courseId}")
    public ResponseEntity<?> findStudentByCourseId(@PathVariable Long courseId) {
        return ResponseEntity.ok(iCourseService.findStudentByCourseId(courseId));
    }

}
