package com.company;

public class InstructorManager {

    public void add(Instructor instructor)
   {
    System.out.println(instructor.getName()+ " adli kullanici sisteme kayit oldu");
    }

    public  void egitimEkle(Instructor instructor)
    {
        System.out.println(instructor.getName()+" Egitimi ekledi");
    }

    public void odevEkle(Instructor instructor)
    {
        System.out.println(instructor.getName()+" Yeni bir odevi ekledi");
    }

}
