// single level inharitance

class shape{
    public void area(){
        System.out.println("display area");
    }
}

class triangle extends shape{
    public void area(int l,int h){
        System.out.println(l/2*l*h);
    }
}


class equilateraltriangle extends triangle{
    public void area(int l,int h){
       System.out.println(l/2*l*h); 
    }
}



public class opssix {
    
}
