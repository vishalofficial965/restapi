package controller;

public class Studentcontroller {
@Autowired

private StudentRepository sr;
@PostMapping("/students")

public String createStudent(@RequestBody Student s) {
	System.out.println(s);
	sr.save(s);
	return "success";
}

@GetMapping
public List<Student> getAllStudent(){
	List<Student> s=sr.findAll();
	return s;
	
}

@GetMapping("/students/{studentid}")
public Student getStudentById(@PathVariable("studentId")String studentId) {
	int id=Integer.parseInt(studentId);
	Optional<Student> obj=sr.findById(id);
	return obj.get();
}
@GetMapping("/student/{studentId}")
public Student updateStudent(@PathVariable("studentId") String studentId,@RequestBody student s) {
	Optional<Student> obj=sr.findById(id);
	s.setId(obj.get().getId());
	sr.save();
	return s;
	
}
}
