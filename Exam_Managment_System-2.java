/**
*     Name: 
*     Reg:
*     Semester : 2nd 'B'
*     program : BSCS 
*/




public class Exam_Managment_System {

    
    public static void main(String[] args) {
     paper obj1 = new paper("Computer Science",243,"CS103","Sir Ali Zeb",2,"BSCS","Final","Ma'am Kiran","Ground Floor Hall 2",50, false , new date(3,3,2020), new time(2,30,00) );
     paper obj2 = new paper("Study Skill",243,"CS104","Ma'am Nadia",2,"BSCS","Final","Ma'am palwasha","Ground Floor Hall 3",50, false , new date(3,3,2020), new time(2,30,00) );
     paper obj3 = new paper("Discret math",243,"CS105","Ma'am sana",2,"BSCS","Final","Ma'am Zeenata","Ground Floor Hall 5",50, false , new date(3,3,2020), new time(2,30,00) );
     paper obj4 = new paper("Islamyat",243,"CS106","Ma'am amin",2,"BSCS","Final","Ma'am Gulbano","Ground Floor Hall 6",50, false , new date(3,3,2020), new time(2,30,00) );
     paper obj5 = new paper("Pakitan Study",243,"CS107","Ma'am shabnam",2,"BSCS","Final","Ma'am  Shabano","Ground Floor Hall 7",50, false , new date(3,3,2020), new time(2,30,00) );
    
     System.out.println(obj1.toString()+new course("BSCS" , 243 , " Computer Science "));
     System.out.println(obj2.toString()+new course("BSCS" , 243 , " Study Skill "));
     System.out.println(obj3.toString()+new course("BSCS" , 543 , " Discret math "));
     System.out.println(obj4.toString()+new course("BSCS" , 343 , " Islamyat "));
     System.out.println(obj5.toString()+new course("BSCS" , 241 , " Pakitan Study "));
    }
    
}
