package StrategyPattern;

public class Parent implements Ali {
    public Paystack paystack;
    public Paycom paycom;

    public Paystack getPaystack() {
        return paystack;
    }

    public void setPaystack(Paystack paystack) {
        this.paystack = paystack;
    }

    public Paycom getPaycom() {
        return paycom;
    }

    public void setPaycom(Paycom paycom) {
        this.paycom = paycom;
    }

    public void sayHello(){
        System.out.println("Hello Matthew");
    }

    public void sayHi(){
        System.out.println("Hi Dear Matthew");
    }

}
