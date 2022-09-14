package day04_foorLoop;

public class T4_MainCategory {
    public static void main(String[] args) {
        /*
        Task 4 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

			    			"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    									(main category)

						 According to this result print out main category name

						 Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

						 Output:
						 			Main Category name is  toys and games

						 Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 								     (main category)

						 Output:
						 			Main Category name is  toys and entertainment

         */

 /*
            Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
                                                              (main category)

            Output:
                   Main Category name is  toys and entertainment
         */

        String site = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
        int firstIndex = site.indexOf("c/");
        String firstPart = site.substring(firstIndex +2);
        int lastIndex = firstPart.indexOf("?");
        String main = firstPart.substring(0,lastIndex);
        String result = main.replace('-', ' ');
        System.out.println("Main category name is " + result);
    }
}
