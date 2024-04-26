public class square extends polygon{
    
    public square(){
        super();
    }
    public square(int s1){
        super(s1);
    }
    
    public int getArea(){
        return s1*s1;
    }

    public int getPerimeter(){
        return s1*4;
    }
}