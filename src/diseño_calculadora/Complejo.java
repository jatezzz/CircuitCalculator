package diseño_calculadora;

public class Complejo {
    
    private double real,img,arg,modulo,argg;
  
    public Complejo(double n1, double n2,int m) {
            if(m==1){
            this.real = n1;
            this.img = n2;
            lPolar();
        }else if(m==0){
            if(n1!=0){
                this.modulo = n1;
                this.arg = n2;
                lBinario();
            }else{
                arg=0;
            }
            
        }else{
            System.out.println("Numero no creado: no se define si es polar o binario");
        }
        
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
        lPolar();
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
        lPolar();
    }

    public double getArg() {
        return arg;
    }

    public void setArg(double arg) {
        this.arg = arg;
        lBinario();
    }

    public double getModulo() {
        return modulo;
    }

    public void setModulo(double modulo) {
        this.modulo = modulo;
        lBinario();
    }
    public void lPolar(){
        this.arg=Math.atan(img/real);
        if(img==0 & real<0)this.arg=Math.PI;
        this.modulo=Math.sqrt(Math.pow(real, 2)+Math.pow(img, 2));
    }
    public void lBinario(){
        this.img=Math.sin(arg)*modulo;
        if(arg!=Math.PI/2)this.real=modulo/Math.cos(arg); else real=0;
    }
    public String mostrar(int c){
        if(c==1){
            return real+" + "+img+"j";
        }else{
            return modulo+" [ "+arg+"]";
        }
        
    }
    
    
}
    

