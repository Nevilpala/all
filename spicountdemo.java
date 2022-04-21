// Declare a class called student having following data members:id_no,
// no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi.
// Define constructor and calculate_spi methods.Define main to instantiate an array for
// objects of class student to process data of n students to be given as command line
// arguments.

// 91–100 A+(10 point)

// 81–90. A(9 point)

// 71–80. B+(8 point)

// 61–70. B(7 point)

// 51–60. C+(6 point)

// 41–50. C(5 point)

import java.util.Scanner;
class spicount{
	long id_no;
	int no_of_subjects_registered;
	String[] subject_code;
	int[] subject_credits;
	String[] grade_obtained;
	int len;
	double creditsum=0.000;
	int point;
	int total=0;
	double spi;
	double per;

	static int k=0;

	spicount(){

		System.out.println("\n\n\nFor Student :" + (k=k+1) + " --------------------------------------------- \n");

		Scanner s_int = new Scanner(System.in);
		Scanner s_string = new Scanner(System.in);

		System.out.print("\nEnter Student ID Number : ");
		id_no = s_int.nextLong();


		System.out.print("\nEnter Student Number of Subjects Registered : ");
		no_of_subjects_registered = s_int.nextInt();

		len=no_of_subjects_registered;

		subject_code= new String[len];
		subject_credits= new int[len] ;
		grade_obtained= new String[len] ;

		for (int i=0; i<len; i++) {

			System.out.println("\nFor Subject " +(i+1));


			System.out.print("Enter Student Subject Code : ");
			subject_code[i] = s_string.nextLine();

			System.out.print("Enter Student Subject Credits : ");
			subject_credits[i] = s_int.nextInt();
			creditsum=creditsum+subject_credits[i];

			System.out.print("Enter Student GRADE OBTAINED : ");
			grade_obtained[i] = s_string.nextLine();
			grade_obtained[i] = grade_obtained[i].toUpperCase();

			// ====================		COUNT SPI 	 ==========================

			switch(grade_obtained[i]){

				case "A+": point= 10;	break;
				case "A" : point= 9;	break;
				case "B+": point= 8;	break;
				case "B" : point= 7;	break;
				case "C+": point= 6;	break;
				case "C" : point= 5;	break;

			}
			total = total + (point * subject_credits[i]);

		}

		spi = total/creditsum ;
		per = (spi*10)-0.5;

		System.out.println("\ncredit total : " + creditsum);

	}
	void displaydata(){

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("\nStudent ID Number : " + id_no);

		System.out.println("\nStudent Number of Subjects Registered : " + no_of_subjects_registered);

		for (int i=0; i<len; i++) {

			System.out.println("\nFor Subject " +(i+1));

			System.out.println(	"\n > Subject Code : " + subject_code[i] + 
								"\n > Credits : " + subject_credits[i] +
								"\n > GRADE OBTAINED : " + grade_obtained[i]
							  );

		}

		System.out.println("\nStudent SPI : " + spi);
		System.out.println("\nPER : " + per);
	}
}
class spicountdemo{
	public static void main(String[] args) {
		spicount s1 = new spicount();
		s1.displaydata();
	}
}