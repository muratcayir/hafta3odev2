package com.company;

public class StudentManager {
    public void add(Student student){
        System.out.println(student.getName()+ " adli ogrenci derse eklendi");
    }

    public void uyeOl(Student student)
    {
        System.out.println("Uye Olundu");
    }

    public void girisYap(Student student)
    {
        System.out.println("Giris Yapildi");
    }

    public void odevYap(Student student)
    {
        System.out.println("Odev Yapildi");
    }
}
