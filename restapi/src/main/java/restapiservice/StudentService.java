package restapiservice;

public interface StudentService {

	public List<Student> getallStudent();
	public Student getStudentById(String studentId);
	public List<Course> getCourses(String studentId);
	public Course getStudentCourse(String studentId,String course);
	public Course addCourse(String studentId,Course course);
	
}
