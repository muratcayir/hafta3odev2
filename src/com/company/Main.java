package com.company;

public class Main {

    public static void main(String[] args) {

    User user=new User();
        user.setId(23);
        user.setName("Murat ÇAYIR");

    Student student=new Student();
        student.setId(1);
        student.setName("Murat ÇAYIR");
        student.setEmail("mrtcyr12@hotmail.com");
        student.setPassword("password");

    Instructor instructor=new Instructor();
        instructor.setId(2);
        instructor.setName("Engin Demiroğ");
        instructor.setCertificate("MCT,PMP,ITIL");
        instructor.setIdentityNumber("131489498462198");

    UserManager userManager=new UserManager();
        userManager.add(user);

    StudentManager studentManager=new StudentManager() ;
        studentManager.add(student);
        studentManager.uyeOl(student);
        studentManager.girisYap(student);
        studentManager.odevYap(student);


    InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.egitimEkle(instructor);
        instructorManager.odevEkle(instructor);

    User[] users ={student,instructor,user};
         userManager.addMultiple(users);
    }
}
