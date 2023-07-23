//applying multi thrading to this



class A{
    public void say(){
        for (int i = 0; i <=10; i++){
            System.out.println("Hello");
        }
    }
}

class B{
    public void say(){
        for (int i = 0; i <=10; i++){
            System.out.println("Welcome");
        }
    }
}

public class Main{
    public static void main (String[] args){
        A a = new A();
        B b = new B();
        a.say();
        b.say();
    }
}

//using thread class extend

class A extends Thread {
    public void run(){
        for (int i = 0; i <=10; i++){
            System.out.println("Hello");
            
            try{
                Thread.sleep (500);
                
            }catch (Exception e){}
            
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i <=10; i++){
            System.out.println("Welcome");
             try{
                Thread.sleep (500);
                
            }catch (Exception e){}
            
        }
    }
}

public class Main{
    public static void main (String[] args){
        
        
        
        A a = new A();
        
        
        B b = new B();
        
        a.start();
		
		try{
                Thread.sleep (50);
                
            }catch (Exception e){}
        b.start();
    }
    
    
    
}

//using runnable interface

class A implements Runnable {
    public void run(){
        for (int i = 0; i <=10; i++){
            System.out.println("Hello");
            
            try{
                Thread.sleep (500);
                
            }catch (Exception e){}
            
        }
    }
}

class B implements Runnable{
    public void run(){
        for (int i = 0; i <=10; i++){
            System.out.println("Welcome");
             try{
                Thread.sleep (500);
                
            }catch (Exception e){}
            
        }
    }
}

public class Main{
    public static void main (String[] args){
        
         A a = new A();
        Thread obj1 = new Thread(a);
       
        
        obj1.start();
        
        try{
                Thread.sleep (50);
                
            }catch (Exception e){}
        B b = new B();
        Thread obj2 = new Thread(b);
       
        
        
        obj2.start();
    }
    
    
    
}