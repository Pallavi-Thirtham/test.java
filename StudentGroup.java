import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
	}
		

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		
		int i;
		
		for(i=1;i<student.length;i++)
		{
			Student[i] = Student[i+1]; 
		}
		Student[0]  = student;
	}
		
	
			

	@Override
	public void addLast(Student student) {
		int [] a = new int[student.length+1];
		
		try
		{
			a[students.length] = student;
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		int i;
		try
		{
			for(i=index;i<students.length;i++)
			{
				students[index] = students[index+1];
			}
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void remove(Student student) {
		int i,p;
		try
		{
			for(i=0;i<students.length;i++)
			{
				if(Students[i] == student)
					p=i;
				break;
			}
			
			for(i=p;i<students.length;i++)
			{
				Students[i+1] = Students[i];
				
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}

	@Override
	public void removeFromIndex(int index) {
		
	
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
