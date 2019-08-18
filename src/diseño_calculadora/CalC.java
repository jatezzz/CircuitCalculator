package diseño_calculadora;

public class CalC {
    Complejo g;
    public Complejo suma(Complejo n1,Complejo n2){
        g=new Complejo(n1.getReal()+n2.getReal(),n1.getImg()+n2.getImg(),1);
        return g;
    }
    public Complejo resta(Complejo n1,Complejo n2){
        g=new Complejo(n1.getReal()-n2.getReal(),n1.getImg()-n2.getImg(),1);
        return g;
    }
    public Complejo producto(Complejo n1,Complejo n2){
        double rel=n1.getReal()*n2.getReal()-n1.getImg()*n2.getImg();
        double img=n1.getReal()*n2.getImg()+n2.getReal()*n1.getImg();
       // System.out.println(rel);
        g=new Complejo(rel,img,1);
        return g;
    }
    public Complejo Division(Complejo n1,Complejo n2){
        double rel1=n1.getReal()*n2.getReal()+n1.getImg()*n2.getImg();
        double img1=n2.getReal()*n1.getImg()-n1.getReal()*n2.getImg();
        double mod1=Math.pow(n2.getReal(), 2)+Math.pow(n2.getImg(), 2);
        g=new Complejo(rel1/mod1,img1/mod1,1);
        return g;
    }
}