package org.example.ClassWork.ExceptionHandling;

public class example2 {
    public static void main(String[] args) {
    int[] array={1,2,3,4,5};
    try{
    System.out.println(array[10]);
    String name=null;
    System.out.println(name.length());
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index is out of bounds.");
        System.out.println(e.getMessage());
    }
    catch(NullPointerException e){
        System.out.println("Null pointer exception occurred.");
        System.out.println(e.getMessage());
    }
    finally{
        System.out.println("Sucessfully handled array index exception.");
    }
}
}