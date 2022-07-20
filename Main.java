package level1;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student("John", "Wedey", 18, 2);
		Student st2 = new Student("John", "Vazovsky", 18, 2);
		Student st3 = new Student("John", "Bobul", 18, 2);
		Student st4 = new Student("John", "Kirichenko", 18, 2);

		Group gr = new Group();

//		Add student
		try {
			gr.addStudent(st1);
			gr.addStudent(st2);
			gr.addStudent(st3);
			gr.addStudent(st4);

			Student[] stList = gr.getGroupOfStudent();

			for (Student student : stList) {
				System.out.println(student);
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

//		Sort student
		gr.sortStudentByLastname();
		Student[] stList = gr.getGroupOfStudent();

		for (Student student : stList) {
			System.out.println(student);
		}

//		Create and add student to group

		Student newStudent = StudentCreate.createStudent();

		try {
			gr.addStudent(newStudent);

			Student[] stListNew = gr.getGroupOfStudent();

			for (Student student : stListNew) {
				System.out.println(student);
			}
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
//		Realize CSVConverter
		String stStr = st1.toCSVString();
		System.out.println(stStr);
		
		String newStudentStr = "Lolik;Orlov;21;3";
		Student newStudentFromStr = st1.fromCSVString(newStudentStr);
		System.out.println(newStudentFromStr);
		
	}

}
