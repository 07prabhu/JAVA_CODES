package ARRAY;

class Student{
    String name ;
    int age ;
    int marks;
}

public class arrayObjects {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name = "prabhu" ;
        s1.age= 21;
        s1.marks= 98;

        Student s2= new Student();
        s2.name= "manik" ;
        s2.age= 24;
        s2.marks= 89;

        Student s3= new Student();
        s3.name= "aryan" ;
        s3.age= 22;
        s3.marks= 98;

        Student arr[]=new Student[3];

         arr[0]= s1;
         arr[1]= s2;
         arr[2]= s3;

        for(Student n : arr){
            System.out.println( n.name + ":" + n.age +" :"+ n.marks);

        }
        
    }
    
}
