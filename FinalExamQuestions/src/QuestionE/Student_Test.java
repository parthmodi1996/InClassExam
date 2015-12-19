package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Modi", "fffac", "Parth", dBirthDate, "246 Labrador Lane", "642-456-3454", "parth@udel.edu", "ME");
		Student stu3 = new Student("ssgg", "Santa", "Clause", dBirthDate, "246 Labrador Lane", "642-456-3454", "SClause@udel.edu", "SC");
		Student stu4 = new Student("cbcb", "Santa", "Clause", dBirthDate, "246 Labrador Lane", "642-456-3454", "SClause@udel.edu", "SC");
		Student stu5 = new Student("fddh", "Santa", "Clause", dBirthDate, "246 Labrador Lane", "642-456-3454", "SClause@udel.edu", "SC");
		
		HashMap<UUID, Student> hm = new HashMap<UUID, Student>();
		hm.put(stu1.getPersonID(), stu1);
		hm.put(stu2.getPersonID(), stu2);
		hm.put(stu3.getPersonID(), stu3);
		hm.put(stu4.getPersonID(), stu4);
		hm.put(stu5.getPersonID(), stu5);

		assertTrue(hm.size()==5);
	}

}
