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
int i,j;
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
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students)throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{
			throw new  IllegalArgumentException();
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if((index<0)||(index>=students.length) )
		{
			throw new  IllegalArgumentException();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index)throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{
			throw new  IllegalArgumentException();
		}
		if((index<0)||(index>=students.length) )
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<=students.length;i++)
		{
			if(i==index)
			{
				students[i]=student;
				
			}
		}
	}

	@Override
	public void addFirst(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<=students.length;i++)
		{
			students[i+1]=students[i];
		}
		students[0]=student;
		
	
		
	}

	@Override
	public void addLast(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<=students.length;i++);
		students[i]=student;
		
	}

	@Override
	public void add(Student student, int index)throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{
			throw new  IllegalArgumentException();
		}
		if((index<0)||(index>=students.length) )
		{
			throw new  IllegalArgumentException();
		}
		for(i=students.length-1;i>=index-1;i--)
		{
			students[i+1]=students[i];
		}
		students[index]=student;
		
	}

	@Override
	public void remove(int index)throws IllegalArgumentException{
		// Add your implementation here
		if((index<0)||(index>=students.length) )
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<-students.length;i++)
		{
			if(i==index)
			{
				students[i]=null;
			}
			
		}
	}

	@Override
	public void remove(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(students==null)
		{
			throw new  IllegalArgumentException();
		}
		if(i==students.length)
		{
			System.out.println("student not exist");
		}
		if(student==null)
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<=students.length;i++)
		{
			if(students[i]==student)
			{
				students[i]=null;
			}
			
		}
	}

	@Override
	public void removeFromIndex(int index)throws IllegalArgumentException {
		// Add your implementation here
		if((index<0)||(index>=students.length) )
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<=students.length;i++)
		{
			if(i==index)
			{
				for(i=index+1;i<=students.length;i++)
				{
					students[i]=null;
				}
			}
		}
		
	}

	@Override
	public void removeFromElement(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(student==null)
		{
			throw new  IllegalArgumentException();
		}
		
		for(i=0;i<=students.length;i++)
		{
			if(students[i]==student)
			{
				while(i<=students.length)
				{
					students[i]=null;
					i++;
				}
				
			}
		}
		
	}

	@Override
	public void removeToIndex(int index)throws IllegalArgumentException {
		// Add your implementation here
		if((index<0)||(index>=students.length) )
		{
			throw new  IllegalArgumentException();
		}
		for(i=0;i<=students.length;i++)
		{
			students[i]=null;
			if(i==index)
			break;
		}
	}

	@Override
	public void removeToElement(Student student)throws IllegalArgumentException {
		// Add your implementation here
		if(student==null)
		{
			throw new  IllegalArgumentException();
		}
		
		for(i=0;i<=students.length;i++)
		{
			students[i]=null;
			if(students[i]==student)
			break;
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(i=0;i<=students.length;i++)
			for(j=0;j<students.length-i-1;j++)
			{
				
				{
					
				}
			}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		for(i=0;i<=students.length;i++)
		{
			//if(students[i].birthDate==date)
			{
				//return Student[i];
			}
			
		}
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
