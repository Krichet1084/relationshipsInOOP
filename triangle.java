public class triangle extends polygon{
    private int side2;
    private int side3;
    private int height;
    private int base;

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


}