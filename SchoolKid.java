package by.epam.tr.lesson12;


public class SchoolKid {
	private String name;
	private int age;
	private static int countInClassrrom = 20;
	private Journal journal;
	
	public SchoolKid(String name, int age) {
		this.name = name;
		this.age = age;
		journal = new SchoolJournal(4.5);
	}
	
	public void printSchoolKid() {
		System.out.println("My name is " + name + ", I'm " + age + " years old");
	}
	
	public void printSchoolKidJournal() {
		System.out.println("Number of pages in school journal is " + SchoolJournal.countPages);
		journal.printName();
	}
	
	public void printTeacher() {
		class Teacher {
			private String name;
			private int age;
			
			public Teacher(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}

			public void print() {
				System.out.println("Teacher of " + SchoolKid.this.name + " pupil is " + name + ", " + age + " years old");
			}
		}
		
		Teacher teacher = new Teacher("Petr Petrov", 31);
		teacher.print();
	}
	
	public void printClassroom() {
		Classroom.print();
	}
	
	public static void createNewMusicClassroom() {
		MusicClassRoom musicClassRoom = new MusicClassRoom("calss B", "Bechstein") {
			@Override
			public void printSchoolKid() {
				SchoolKid schoolKid = new SchoolKid("Sergei Sergeev", 7);
				System.out.println("Count of pupils in the class is " + countInClassrrom);
				System.out.println("My name is " + schoolKid.name + ", I'm " + schoolKid.age + " years old, I'm study in " + super.className + " classroom, I'm play on " + pianoModel + " piano");
			}			
		};
		
		musicClassRoom.printSchoolKid();
	}

	class SchoolJournal extends Journal {
		public final static int countPages = 25;
		private double avgMark;
		
		public SchoolJournal(double avgMark) {
			super(name);
			this.avgMark = avgMark;
		}

		@Override
		protected void printName() {
			printSchoolKid();
			System.out.println("A school journal of " + name + ", average mark is " + avgMark);
		}
	}
	
	class ExcellentPupilSchoolJournal extends SchoolJournal implements Colored{
		public final static double mark = 10.0;
		private String marksColor;

		public ExcellentPupilSchoolJournal(String color) {
			super(mark);
			this.marksColor = color;
		}

		public String getMarksColor() {
			return marksColor;
		}

		@Override
		protected void printName() {
			System.out.println("A school journal of " + name + ", excellent pupil, average mark is 10.0 of " + marksColor + " color");
		}

		@Override
		public String getColor() {
			return "This excellent pupil school journal is of " + getMarksColor() + " color";
		}		
	}
	
	static class Classroom {
		protected String className;		
		
		public Classroom(String className) {
			this.className = className;
		}

		public void printSchoolKid() {
			SchoolKid schoolKid = new SchoolKid("Sergei Sergeev", 7);
			System.out.println("Count of pupils in the class is " + countInClassrrom);
			System.out.println("My name is " + schoolKid.name + ", I'm " + schoolKid.age + " years old, I'm study in " + className + " classroom");
		}
		
		public static void print() {
			System.out.println("The classroom");
		}
	}
	
	static class MusicClassRoom extends Classroom {
		protected String pianoModel;

		public MusicClassRoom(String className, String pianoModel) {
			super(className);
			this.pianoModel = pianoModel;
		}

		@Override
		public void printSchoolKid() {
			SchoolKid schoolKid = new SchoolKid("Sergei Sergeev", 7);
			System.out.println("Count of pupils in the class is " + countInClassrrom);
			System.out.println("My name is " + schoolKid.name + ", I'm " + schoolKid.age + " years old, I'm study in " + super.className + " classroom, I'm play on " + pianoModel + " piano");
		}		
	}
}
