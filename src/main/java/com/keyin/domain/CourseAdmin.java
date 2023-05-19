package com.keyin.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseAdmin {
    private Map<Student, List<Course>> studentToCourses = new HashMap<Student, List<Course>>();

    public void addCourseToStudent(Student student, Course course) {
        List<Course> courseList = studentToCourses.get(student);

        if (courseList == null) {
            courseList = new ArrayList<Course>();
            studentToCourses.put(student, courseList);
        }

        courseList.add(course);
    }

    public List<Course> getCourseListByStudent(Student student) {
        return studentToCourses.get(student);
    }

}
