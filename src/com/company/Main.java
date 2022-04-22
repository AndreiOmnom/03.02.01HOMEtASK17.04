package com.company;



import com.company.Arrayservice.ArrayService;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] nums = new int[len];
      //  int[] myArray = new int[];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        ArrayService.AriphmeticMean(nums, len);

        ArrayService.Dublicat(nums, len);
   //     System.out.println(Arrays.toString(myArray));
//        ArrayService.PositiveNumber(nums, len);
//        for (int num : nums) {     //For each num- это текущий элемент
//            System.out.println(num + "");

//            ArrayService.sortByChet(nums, len);
            //       ArrayService.findShortestLongest(nums, len);
            //  ArrayService.sortByHighest(nums, len);

        }
    }





//            ArrayService.thirdArray(nums,nums2, len);
     //   }
//        int max = MagicMath.max(45,67);
//        System.out.println(max);
//        int powa = MagicMath.pow (2, 5);
//        System.out.println(powa);
//        int abs = MagicMath.abs (18);
//        System.out.println(abs);
//        int round = MagicMath.round (23.34);
//        System.out.println(round);


//        Pet jack =  new Pet(  "Jack",  "Buldog", true, 'M', 10  );
//
//
//        jack.age  = 10;
//        jack.name = "Jack";
//        jack.pol = 'M';
//        jack.breed = "Buldog";
//        jack.isAngry = true;
//
//        System.out.println(jack);
//        jack.growPet();
//        System.out.println(jack.age);
//
//        Food meat = new Food(10);
//        Food junk = new Food(0);
//        jack.feed(meat);
//        System.out.println(jack);
//
//
//
//    }
 //   }
