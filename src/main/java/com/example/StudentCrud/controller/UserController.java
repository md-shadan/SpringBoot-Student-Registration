package com.example.StudentCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.StudentCrud.domain.Student;
import com.example.StudentCrud.services.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService service;

    @GetMapping("/")
    public String viewHomePage(Model model){
        System.out.println("calling");
        List<Student> liststudent = service.getAllStudents();
        model.addAttribute("liststudent" , liststudent);
        System.out.println(model);
        System.out.println("Get /");
        return "index";
    }

    @GetMapping("/new")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "new";
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std){
        service.addStudent(std);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
    try {
        Student std = service.getStudentById(id);
        ModelAndView mav = new ModelAndView("new");
        mav.addObject("student", std);
        return mav;
    } catch (RuntimeException e) {
        ModelAndView mav = new ModelAndView("error");
        mav.addObject("message", e.getMessage());
        return mav;
    }
}


//     @GetMapping("/edit/{id}")
// public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
//     ModelAndView mav = new ModelAndView("new");
//     try {
//         Student std = service.getStudentById(id);
//         mav.addObject("student", std);
//     } catch (RuntimeException e) {
//         mav.addObject("errorMessage", "Student not found for ID: " + id);
//         return new ModelAndView("error");  // Ensure you have an error.html template
//     }
//     return mav;
// }

    // @GetMapping("/edit/{id}")
    // public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id){

    //     ModelAndView mav = new ModelAndView("new");
    //     Student std = service.getStudentById(id);
    //     mav.addObject("student", std);
    //     return mav;
    // }

    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id){
        service.deleteStudent(id);
        return "redirect:/";
    }

}
