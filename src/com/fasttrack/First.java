package com.fasttrack;

public class First {
    public static void main(String[] args){

      Person X = new Person("Alex",30,true);



      Person X1 = new Person(" Mihai ",25,false);
      Person X2 = new Person(" Mihaela ",28,true);
      Person X3 = new Person(" Oliviu ",35,false);


      System.out.println(X.getName());

      System.out.println(X.getAge());

      System.out.println(X.isMarried());

      System.out.println(X1.getAge()  +  X1.getName()  +  X1.isMarried());
      System.out.println(X2.getAge()  +  X2.getName()  +  X2.isMarried());
      System.out.println(X3.getAge()  +  X3.getName()  +  X3.isMarried());


      Product cafea =new Product("ford",50,20,true,5);


      System.out.println(cafea.getName());
      System.out.println(cafea.getPrice());
      System.out.println(cafea.getQuantity());
      System.out.println((cafea.hasStock()));
      System.out.println((cafea.getCategory()));
      System.out.println((cafea.isCategory()));




    }

}
