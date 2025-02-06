package com.microservice.course.http.response;

import com.microservice.course.dto.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class StudentByCourseResponse {

    private String name;
    private String teacher;
    private List<StudentDTO> studentDTOList;


}
