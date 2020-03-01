package com.example.hamdimoadeb.iampoor;

public class Payment {


    public Payment() {
    }

    public Payment(String method, int image) {
        this.method = method;
        this.image = image;
    }

    private String method;
    private int image;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
