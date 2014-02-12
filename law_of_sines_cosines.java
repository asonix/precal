import java.util.Scanner; //I really don't know if this code works, I just edited it in Github's text editor. Try running it or looking for mistakes.

public class law_of_sines_cosines {

	public static void main(String[] args) {
		int repeat = 1;
		int choice_s = 0;
		int choice_c = 0;
		int choice_h = 0;
		int num_a = 0;
		
		char choice = 'e';
		
		double a = 0;
		double b = 0;
		double c = 0;
		double s = 0;
		double area = 0;
		double angle = 0;
		double angle2 = 0;
		Scanner sc = new Scanner(System.in);
		
		while(repeat==1) {
			
			System.out.print("What function would you like to do?\n" +
					         "(c) Law of Cosines      Calculate AREA based on 2 sides and 1 angle\n" +
					         "(h) Heron's Formula     Calculate AREA based on 3 sides\n" +
					         "(s) Law of Sines        Calculate ANGLE or SIDE based on (1-2) sides and (1-2) angles\n" +
					         "(e) to exit\n");
			choice = (sc.next()).charAt(0);
			choice_c = 0;
			choice_h = 0;
			choice_h = 0;
			
			switch(choice) {  //tfw not using case structures
				case 'c':
					choice_c = 1;
					break;
				case 'h':
					choice_h = 1;
					break;
				case 's':
					choice_s = 1;
					break;
				case 'e':
					repeat = 0;
					break;
				default:
					System.out.println("Please type the letter identifier of the choice you would like to make.");
					break;
			}

//			if(choice=='c') {
//				choice_c = 1;
//				choice_h = 0;
//				choice_s = 0;
//			}
//			else if(choice=='h') {
//				choice_c = 0;
//				choice_h = 1;
//				choice_s = 0;
//			}
//			else if(choice=='s') {
//				choice_c = 0;
//				choice_h = 0;
//				choice_s = 1;
//			}
//			else if(choice=='e') {
//				repeat = 0;
//			}
//			else {
//				System.out.println("Please type the letter identifier of the choice you would like to make.");
//			}
				
			while(choice_c==1) {
				//===================//
				//   law of cosines  //
				//===================//

				System.out.print("angle in degrees (ex. 45): ");
				angle = sc.nextDouble();
				System.out.print("side 1: ");
				a = sc.nextDouble();
				System.out.print("side 2: ");
				b = sc.nextDouble();
				
				if(angle == 0) { System.out.println("ERROR: angle = 0"); choice_c = 0; }
				if(a == 0) { System.out.println("ERROR: side 1 = 0"); choice_c = 0; }
				if(b == 0) { System.out.println("ERROR: side 2 = 0"); choice_c = 0; }
				
				c = Math.sqrt( ( a*a + b*b - 2*( a*b*Math.cos(Math.toRadians(angle)) ) ) ); //I may be wrong, but isn't it c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(angle)))
				area = ( (0.5)*a*b*Math.sin(Math.toRadians(angle)) );
				
				System.out.println("side 3 = " + c);
				System.out.println("area = " + area);
				
				//===================//
				//  run again check  //
				//===================//
				System.out.print("Return to main menu?");
					String run_st = sc.next();
					char run_ch = run_st.charAt(0); 
				if(run_ch=='n') { choice_c = 1; }
				else { choice_c = 0; }
			}
			
			while(choice_h==1) {
				//===================//
				//  Heron's Formula  //
				//===================//
				System.out.print("a: ");
				a = sc.nextDouble();
				System.out.print("b: ");
				a = sc.nextDouble();
				System.out.print("c: ");
				a = sc.nextDouble();
				
				s = (a + b + c) / 2;
				area = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
				
				if(area == 0) { System.out.println("ERROR: area = 0"); choice_h = 0; }
				if(s == 0) { System.out.println("ERROR: s = 0"); choice_h = 0; }
				
				System.out.println("s = " + s);
				System.out.println("K = " +area);
				
				//===================//
				//  run again check  //
				//===================//
				System.out.print("Return to main menu?");
					String run_st = sc.next();
					char run_ch = run_st.charAt(0); 
				if(run_ch=='n') { repeat = 1; }
				else { repeat = 0; }
			}
		
			while(choice_s==1) {
				//===================//
				//   Law of Sines    //
				//===================//
				
				System.out.print("Provide the # of angles you know: ");
				num_a = sc.nextInt();
				if(num_a==1) {
					System.out.print("Angle, in degrees: ");
					angle = sc.nextDouble();
					System.out.print("Side 1: ");
					a = sc.nextDouble();
					System.out.print("Side 2: ");
					b = sc.nextDouble();
					
					angle2 = Math.toDegrees( Math.asin( (a*Math.sin(Math.toRadians(angle)))/(b) ) );
					System.out.print("Angle 2 = " + angle2);
				}
				else if(num_a==2) {
					System.out.print("Angle 1: ");
					angle = sc.nextDouble();
					System.out.print("Angle 2: ");
					angle2 = sc.nextDouble();
					System.out.print("Side 1: ");
					a = sc.nextDouble();
					int unknown = 1
					while(unknown == 1) {
						System.out.print("Is Side 1 across from Angle 1? (y/n): ");
						side = (sc.next()).charAt(0);
						switch(side) {
							case 'y':
								b = (a*Math.sin(Math.toRadians(angle2))/Math.sin(Math.toRadians(angle));
								unknown = 0;
								break;
							case 'n':
								b = (a*Math.sin(Math.toRadians(angle))/Math.sin(Math.toRadians(angle2));
								unknown = 0;
								break;
							default:
								System.out.print("Please type the letter identifier of the choice you would like to make.");
								break;
						}
					}
					System.out.print("Side 2 = " + b);
					//System.out.println("This function is not yet implemented, sorry.");
				}
				//IMPLEMENT ME! ^^^^^^^^^
				else if(num_a > 3) { System.out.println("The object is not a triangle, exiting."); choice_s=0; }
				else if(num_a == 3) { System.out.println("The object could be a triangle, but the law of sines does not apply as no side lengths can be gathered knowing only the angles of the triangle, exiting."); choice_s=0; }
				else if(num_a <= 1) { System.out.println("You need at least 1 angle for this to work, exiting."); choice_s=0; }
				else                { System.out.println("I can't parse that, exiting."); choice_s=0; }
				
				//===================//
				//  run again check  //
				//===================//
				System.out.print("Return to main menu?");
					String run_st = sc.next();
					char run_ch = run_st.charAt(0); 
				if(run_ch=='n') { repeat = 1; }
				else { repeat = 0; }
			}
		
		} System.out.println("done!");
		
	}
	
}
