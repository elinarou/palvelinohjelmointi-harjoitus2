package s22.Harjoitus2_HandlingLists.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import s22.Harjoitus2_HandlingLists.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/hello")
	public String showStudents(Model model) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Elina", "Rouvinen"));
		students.add(new Student("Maija", "Meikäläinen"));
		students.add(new Student("Matti", "Mattila"));
		
		model.addAttribute("studentsList", students);
		
		return "hello";
	}

}

