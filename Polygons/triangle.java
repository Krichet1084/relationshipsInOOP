public class triangle extends polygon{
    int side2;
    int side3;
    int height;
    int base;

    public triangle(){
        side1=3;
        side2=5;
        side3=4;
        height=3;
        base=4;
    }
    
    public triangle(int s1, int s2, int s3, int h, int b){
        super(s1);
        side2=s2;
        side3=s3;
        height=h;
        base=b;
    }

    public int getArea(){
        return base*height/2;
    }

    public int getPerimeter(){
        return side1+side2+side3;
    }

    public String toString(){
        return "Side 1: +"+side1+"\nSide 2: "+side2+"\nSide 3: "+side3+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }
}