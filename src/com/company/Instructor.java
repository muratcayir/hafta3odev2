package com.company;

public class Instructor extends User{


    private String certificate;
    private String identityNumber;
    public Instructor()
    {

    }
    public Instructor(String certificate,String identityNumber)
    {
        super();
        this.identityNumber=identityNumber;
        this.certificate=certificate;

    }


    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
