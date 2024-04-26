public class rectangle extends square{
    private int side2;

    public rectangle(){
        super(s1);
        side2=5;
    }

    public rectangle(int s1, int s2){
        super(s1);
        side2=s2;
    }

    public getArea(){
        return s1*s2;
    }

    public getPerimeter(){
        return (s1*2)+(s2*2);
    }

    public int getSide2(){
        return side2;
    }

    public void setSide2(int s2){
        side2=s2;
    }

}