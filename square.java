public class square extends polygon{
    
    public square(){
        super();
    }
    public square(int s1){
        super(s1);
    }
    
    public int getArea(){
        return side1*side1;
    }

    public int getPerimeter(){
        return side1*4;
    }
}