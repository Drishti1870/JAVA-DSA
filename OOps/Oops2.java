package OOps;

public class Oops2 {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(73);
        System.out.println(p1.getTip());
       
    }
}
// concept of getter and setter
class Pen{
   private String Color;
   private int Tip;

    String getColor(){
        return this.Color;
    }
    int getTip(){
        return this.Tip;
    }
    void setColor(String newColor){
        this.Color=newColor;
    }
    void setTip(int newTip){
        this.Tip=newTip;
    }
}
