package com.company;
import java.util.ArrayList;
import java.util.Collections;

/*
 *  Program that will allows a robot to assemble 25 burritos. Uses a random generator for each burrito option and
 *  builds a list of 25 burrito customizations:
 *
 */
public class Main {

    public static void main(String[] args) {

        // Build 25 unique burrittos
        ArrayList<Burritto> burrittoList = buildBurrito();

        // Print the 25 burrittos created
        printBurrittoList(burrittoList);
    }

    /*
     * buildBurritto()
     * @returns : ArrayList<Burritto> burrittoList
     * @input   : void
     * Function : To build/instantiate 25 unique burritto objects, populates them and returns the list of 25 burrittos
      *           to caller
     */
    public static ArrayList<Burritto> buildBurrito() {
        ArrayList<String> riceOptions = new <String>ArrayList();
        riceOptions.add("white rice");
        riceOptions.add("brown rice");
        riceOptions.add("none");

        ArrayList<String> beanOptions = new <String>ArrayList();
        beanOptions.add("black beans");
        beanOptions.add("pinto beans");
        beanOptions.add("none");

        ArrayList<String> meatOptions = new <String>ArrayList();
        meatOptions.add("chicken");
        meatOptions.add("steak");
        meatOptions.add("carnidas");
        meatOptions.add("chorizo");
        meatOptions.add("sofritas");
        meatOptions.add("none");


        ArrayList<String> salsaOptions = new <String>ArrayList();
        salsaOptions.add("mild salsa");
        salsaOptions.add("medium salsa");
        salsaOptions.add("hot salsa");
        salsaOptions.add("none");
        salsaOptions.add("all salsa");

        ArrayList<String> veggieOptions = new <String>ArrayList();
        veggieOptions.add("lettuce");
        veggieOptions.add("fajita veggies");
        veggieOptions.add("none");
        veggieOptions.add("all");

        ArrayList<String> extras = new <String>ArrayList();
        extras.add("cheese");
        extras.add("guac");
        extras.add("queso");
        extras.add("sourCream");

        ArrayList<Burritto> burrittoList = new ArrayList<Burritto>();

                //loop through 25 times and create 25 unique burritos
        for (int i = 0; i < 25; i++) {
            ArrayList<String> e = new ArrayList<String>();
            //Create a new burritto
            Burritto b = new Burritto();

            //Set the rice option
            Collections.shuffle(riceOptions);
            b.setRice(riceOptions.get(1));

            //Set the beans option
            Collections.shuffle(beanOptions);
            b.setBeans(beanOptions.get(1));

            //Set the meat option
            Collections.shuffle(meatOptions);
            b.setMeat(meatOptions.get(1));

            //Set the veggie option
            Collections.shuffle(veggieOptions);
            b.setVeggie(veggieOptions.get(1));

            //Set the salsa option
            Collections.shuffle(salsaOptions);
            b.setSalsa(salsaOptions.get(1));

            //Set the extras randomly
            if(i%2 == 0) {
                Collections.shuffle(extras);
                e.add(extras.get(1));
                e.add(extras.get(2));
            }
            else if (i%3 == 0) {
                Collections.shuffle(extras);
                e.add(extras.get(1));

            }
            else if(i % 5 == 0){
                Collections.shuffle(extras);
                e.add(extras.get(1));
                e.add(extras.get(2));
                e.add(extras.get(3));
            } else {
            }
            b.setExtras(e);
            //Add to Arraylist of Burrittos
            burrittoList.add(b);
        }
        return burrittoList;
    }
     /*
      * printBurritto()
      * @input   : ArrayList<Burritto> burrittoList with ingredients, extras and pricing information
      * @returns : void
      * Function : To print the burrito list passed by caller
      *            Sample Output:
      *            Burrito 1: brown rice, carnidas, pinto beans, none, none
                   Extras	 : sourCream queso
                   Price	 : $5.50

      */
     public static void printBurrittoList(ArrayList<Burritto> bList) {
         int iterator = 1;
         for(Burritto b:bList) {
             System.out.println("Burrito " +iterator +": "
             +b.getRice() +", " +b.getMeat() +", "+b.getBeans() +", "+b.getSalsa()+", "+ b.getVeggie());
             System.out.print("Extras\t : ");
             for(String s:b.getExtras()) {
                 System.out.print(""+s +" ");
             }
             System.out.println();
             System.out.printf("Price\t : $%.02f\n", +b.getPriceOfBurritto(b));
             System.out.println();
             iterator++;
         }
     }
}



