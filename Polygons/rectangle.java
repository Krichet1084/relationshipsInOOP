public class rectangle extends square{
    int side2;

    public rectangle(){
        super();
        side2=5;
    }

    public rectangle(int s1, int s2){
        super(s1);
        side2=s2;
    }

    public int getArea(){
        return side1*side2;
    }

    public int getPerimeter(){
        return (side1*2)+(side2*2);
    }

    public int getSide2(){
        return side2;
    }

    public void setSide2(int s2){
        side2=s2;
    }

    public String toString(){
        return "Side 1: +"+side1+"\nSide 2: "+side2"+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }
}