package test;

import java.util.Scanner;

import main.Course;
import main.Student;
import main.StudentList;

public class TestAS2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentList studentList = new StudentList();
		int luaChon =0;
		do {
			System.out.println("---Student Management System--");
			System.out.println("---Choose your interaction---");
			System.out.println(
					 "1.Add Student Into List as numb you want\r\n"
					+ "2.Print list\r\n"
					+ "3.Finding Student infor by ID\r\n"
					+ "4.If you want to pay intuitions\r\n"
					+ "5.Send MailConfirmation \r\n"
					+ "0. Exit	");
			luaChon = input.nextInt();
			input.nextLine();
			if(luaChon ==1) {
				System.out.println("How Many Student you want to add---------------"); int n = input.nextInt();
				for(int i=1;i<=n;i++) {
					System.out.println("Input Student ID No:"+i); int studentID = input.nextInt();
					while(studentID<10000 ||studentID>39999 ) {
						System.out.println("Wrong Student ID, must a 5-digit unique ID,start with year:");
						studentID = input.nextInt();
					}
					input.nextLine();
					System.out.println("Input Student Name:"+i); String studentName = input.nextLine();
					System.out.println("Input Student's Email:"); String studentMail = input.nextLine();
					System.out.printlnSystem.out.println("How Many Student you want to add---------------"); int n = input.nextInt();
				for(int i=1;i<=n;i++) {
					System.out.println("Input Student ID No:"+i); int studentID = input.nextInt();
					while(studentID<10000 ||studentID>39999 ) {
						System.out.println("Wrong Student ID, must a 5-digit unique ID,start with year:");
						studentID = input.nextInt();
					}
					input.nextLine();
					System.out.println("Input Student Name:"+i); String studentName = input.nextLine();
					System.out.println("Input Student's Email:"); String studentMail = input.nextLine();
					System.out.println("Input Student Year:"+i); int year = input.nextInt();
					while (year<1 || year >3) {
						System.out.println("Wrong year, year in range [1,3]. try again:");
						year = input.nextInt();
					}
					Student st = new Student(studentID,studentName,year,studentMail);
					System.out.println("Input so khóa học:"); int k = input.nextInt();
					for(int j=1; j<=k;j++) {
						System.out.println("ID Course No:"+j); int course_ID = input.nextInt();
						while (course_ID < 101 || course_ID > 106) {
			                System.out.print("Error! Course_ID must in range 101-106. Try Again : ");
			                course_ID = input.nextInt();
			            }
						if(course_ID <101 || course_ID >106) {
							System.out.println("Wrong ID Course, Try Again:");
							//int course_ID = input.nextInt(); 
						}else {
							switch(course_ID) {
							case 101:
								Course course1 = new Course(1,101,"Programming Foundations",1200);
								st.getAttendance_Course().add(course1);
								int a= st.getTotalFees();
								a +=1200;
								st.setTotalFees(a);
								st.setRemain(a);
								break;
							case 102:
								Course course2 = new Course(1,102,"User Interface Design ",1800);
								st.getAttendance_Course().add(course2);
								//st.getBallance()+=1800;
								int b= st.getTotalFees();
								b +=1800;
								st.setTotalFees(b);
								st.setRemain(b);
								break;
							case 103:
								Course course3 = new Course(1,103,"User Experience Design",2000);
								st.getAttendance_Course().add(course3);
								//st.getBallance()+=2000;
								int c= st.getTotalFees();
								c +=2000;
								st.setTotalFees(c);
								st.setRemain(c);
								break;
							case 104:
								Course course4 = new Course(1,104,"Database Design and Implementation",1500);
								st.getAttendance_Course().add(course4);
								//st.getBallance()+=1500;
								int d= st.getTotalFees();
								d +=1500;
								st.setTotalFees(d);
								st.setRemain(d);
								break;
							case 105:
								Course course5 = new Course(1,105,"Web Development Foundations",2000);
								st.getAttendance_Course().add(course5);
								//st.getBallance()+=2000;
								int e= st.getTotalFees();
								e +=2000;
								st.setTotalFees(e);
								st.setRemain(e);
								break;
							case 106:
								Course course6 = new Course(1,106,"Capstone Project",2500);
								st.getAttendance_Course().add(course6);
								//st.getBallance()+=2500;
								int f= st.getTotalFees();
								f +=1200;
								st.setTotalFees(f);
								st.setRemain(f);
								break;
							}
						}
					}
					
					studentList.addStudent(st);
				}
				
				}("Input Student Year:"+i); int year = input.nextInt();
					while (year<1 || year >3) {
						System.out.println("Wrong year, year in range [1,3]. try again:");
						year = input.nextInt();
					}
					Student st = new Student(studentID,studentName,year,studentMail);
					System.out.println("Input so khóa học:"); int k = input.nextInt();
					for(int j=1; j<=k;j++) {
						System.out.println("ID Course No:"+j); int course_ID = input.nextInt();
						while (course_ID < 101 || course_ID > 106) {
			                System.out.print("Error! Course_ID must in range 101-106. Try Again : ");
			                course_ID = input.nextInt();
			            }
						if(course_ID <101 || course_ID >106) {
							System.out.println("Wrong ID Course, Try Again:");
							//int course_ID = input.nextInt(); 
						}else {
							switch(course_ID) {
							case 101:
								Course course1 = new Course(1,101,"Programming Foundations",1200);
								st.getAttendance_Course().add(course1);
								int a= st.getTotalFees();
								a +=1200;
								st.setTotalFees(a);
								st.setRemain(a);
								break;
							case 102:
								Course course2 = new Course(1,102,"User Interface Design ",1800);
								st.getAttendance_Course().add(course2);
								//st.getBallance()+=1800;
								int b= st.getTotalFees();
								b +=1800;
								st.setTotalFees(b);
								st.setRemain(b);
								break;
							case 103:
								Course course3 = new Course(1,103,"User Experience Design",2000);
								st.getAttendance_Course().add(course3);
								//st.getBallance()+=2000;
								int c= st.getTotalFees();
								c +=2000;
								st.setTotalFees(c);
								st.setRemain(c);
								break;
							case 104:
								Course course4 = new Course(1,104,"Database Design and Implementation",1500);
								st.getAttendance_Course().add(course4);
								//st.getBallance()+=1500;
								int d= st.getTotalFees();
								d +=1500;
								st.setTotalFees(d);
								st.setRemain(d);
								break;
							case 105:
								Course course5 = new Course(1,105,"Web Development Foundations",2000);
								st.getAttendance_Course().add(course5);
								//st.getBallance()+=2000;
								int e= st.getTotalFees();
								e +=2000;
								st.setTotalFees(e);
								st.setRemain(e);
								break;
							case 106:
								Course course6 = new Course(1,106,"Capstone Project",2500);
								st.getAttendance_Course().add(course6);
								//st.getBallance()+=2500;
								int f= st.getTotalFees();
								f +=1200;
								st.setTotalFees(f);
								st.setRemain(f);
								break;
							}
						}
					}
					
					studentList.addStudent(st);
				}
				
				}
			else if(luaChon ==2) {
				//2.In danh sach sinh vien
				studentList.printStudentInfo();
			}else if(luaChon==3) {
				//3. Tìm thông tin sinh viên
				System.out.println("Input Student ID you want to find:"); int idFind= input.nextInt();
				System.out.println("--------------Result-------------------");
				studentList.findStudentByID(idFind);
			}else if(luaChon==4) {
				//4. Triển khai thanh toán
				System.out.println("Entering Student ID:"); int stID= input.nextInt();
				System.out.println("--------------Student Infor-------------------");
				studentList.findStudentByID(stID);
				System.out.println(
						"Choose Payment Method\r\n"
						+ "1. Charge Partially\r\n"
						+ "2. Charge Full\r\n"
						+ "0. Exit\r\n");
				int paymentMethod = input.nextInt();
				while (paymentMethod<0 || paymentMethod >2) {
					System.out.println("Wrong Method, try again:");
					paymentMethod = input.nextInt();
				}
				switch(paymentMethod) {
				case 1:
					//Thanh toán 1 phần
					System.out.println("Input Amount of Money"); int money = input.nextInt();
					while (money < 0 || money >= studentList.checkRemain(stID)) {
						System.out.println("Wrong money, amount must less than or equal the remain");
						money = input.nextInt();
					}
					studentList.Payment(stID, money);
					System.out.println("---------------Successful payment, new information:----------\n");
					studentList.findStudentByID(stID);
					break;
				case 2:
					//Thanh toán toàn bộ
					System.out.println("Input Amount of Money"); int money2 = input.nextInt();
					while (money2 != studentList.checkRemain(stID)) {
						System.out.println("Wrong money, amount must equal the remain");
						money2 = input.nextInt();
					}
					studentList.Payment(stID, money2);
					System.out.println("---------------Successful payment, new information:----------\n");
					studentList.findStudentByID(stID);
					break;
				default:
					System.out.println("---------Exit Payment---------\r\n");
					break;
				}
			}
			else if(luaChon ==5) {

				studentList.SendMailAll();
				System.out.println("---------email sent successfully-----");
			}
		}while(luaChon!=0);
	}
}
