package com.demo.studentdetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class StudentDetailsController {
	private List<StudentDetailsModel> students = new ArrayList<>();

    @GetMapping("/")
    public String getStudents(Model model) {
        model.addAttribute("students", students);
        return "index";
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam String name, @RequestParam int age, @RequestParam String gender) {
        students.add(new StudentDetailsModel(name, age, gender));
        return "redirect:/";
    }
}