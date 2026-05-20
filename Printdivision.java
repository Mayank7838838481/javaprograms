public class Printdivision {
    static void main(String[] args){
        double Hindi=30,Maths=30,Science=30,SST=30,Gk=00,total;
        double per;
        total= Hindi+Maths+Science+SST+Gk;
        System.out.println("total is "+total);
        per=(total/500)*100;
        System.out.println("per is"+per);
       if(per>=75){
            System.out.println("honours");
        } else if (per>=60&&per<75) {
            System.out.println("I st division");
        }
       else if (per>=45&&per<60) {
           System.out.println("2nd division");
       }
       else if (per>=30&&per<45) {
           System.out.println("3rd division");
       }
        else{
            System.out.println("fail");
        }
    }
}
