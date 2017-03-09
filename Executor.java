package by.epam.tr.lesson12;


public class Executor {

	public static void main(String[] args) {
		SchoolKid schoolKid = new SchoolKid("Ivanov Ivan", 8);
		SchoolKid.SchoolJournal schoolJournal = schoolKid.new SchoolJournal(3.4);
		SchoolKid.ExcellentPupilSchoolJournal excellentPupilSchoolJournal = schoolKid.new ExcellentPupilSchoolJournal("red");
		
		System.out.println("Number of pages in school journal is " + SchoolKid.SchoolJournal.countPages);
		System.out.println("----------------------------------------------------");
		schoolKid.printSchoolKidJournal();
		System.out.println("----------------------------------------------------");
		schoolJournal.printName();
		System.out.println("----------------------------------------------------");		
		System.out.println(excellentPupilSchoolJournal.getColor());
		excellentPupilSchoolJournal.printName();
		System.out.println("----------------------------------------------------");
		schoolKid.printTeacher();		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		SchoolKid.Classroom classroom = new SchoolKid.Classroom("Class A");
		SchoolKid.MusicClassRoom musicClassRoom = new SchoolKid.MusicClassRoom("Class A", "Yamaha");
		
		classroom.printSchoolKid();
		System.out.println("----------------------------------------------------");
		schoolKid.printClassroom();
		System.out.println("----------------------------------------------------");
		musicClassRoom.printSchoolKid();
		System.out.println("----------------------------------------------------");
		SchoolKid.createNewMusicClassroom();
		
		
		
		
		
		

	}

}
