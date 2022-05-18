package overloading;

public  class WatchesApplication {
    String watch(String name){
        return name;



    }
   String watch(int prize,String colour){

       return prize+colour;

   }

    public static void main(String[] args)
    {
        WatchesApplication wa = new WatchesApplication();
        System.out.println("watch name is :"+"fast track");
        System.out.println("watch prize and colour :" + 4000 +   " "+"pink" );

    }






 }







