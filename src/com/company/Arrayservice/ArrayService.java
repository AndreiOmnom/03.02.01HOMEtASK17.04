package com.company.Arrayservice;




import java.lang.*;


import java.util.Arrays;



public class ArrayService {
     //     упр.2. найти среднее арифметическое. вывести только те которые больше среднего арифм
     public static void AriphmeticMean(int[] nums, int len) {


          float i1 = 0;
          for (int i = 0; i < len; i++) {
               i1 = i1 + nums[i];
          }
          float mean = i1 / len;
          System.out.println("ДЗ.упр.2.среднее арифметическое:" + mean);
          for (int i = 0; i < len; i++) {
               if (nums[i] > mean) {
                    System.out.print(nums[i] + " ");
               }
          }
     }

     public static int Dublicat(int[] nums, int len) {
          System.out.println("ДЗ. упр.3.Проверяем массив : " + Arrays.toString(nums));
             Arrays.sort(nums, 0, len);
             System.out.println("Сортируем массив : " + Arrays.toString(nums));
          int[] array = nums.clone();
          //    int [] array = {Integer.parseInt(Arrays.toString(nums))};
          int i = 0;
          int j ;
          int n = 0;
            int[] myArray = new int[len];

          System.out.print("Выводим массив без дубликатов:");
//           System.out.print(nums[0]);
//          for (i = 0; i <=  len - 1; i++) {
               for (j = 1; j <   len;) {
                    if (nums[i] != array[j]) {
                        myArray[j] = array[j];
 //                        System.out.print(" " + array[j] + " ");
                         i = j;
                         j++;
                    }
                     else
                         j++;
                   System.out.println(Arrays.toString(myArray));
               }
               return j;

//          }
//          return i;

     }
}

//     int [] numbersCopy = new int[10];
//
//       for (int i = 0; i < numbers.length; i++) {
//
//        numbersCopy[i] = numbers[i];
//        }





//  упр.1 в массиве найти количество положительныхэлементов
//    public static void PositiveNumber(int[] nums, int len) {
//        int number = 0;
//        for (int i = 0; i < len; i++) {
//            if (nums[i] > 0) {
//               number = number + 1;
//            }
//
//        }
//        System.out.println("Количество положительных элементов" + number);
//    }
//}
    //         public static void Sortirovka(String[]args) {
//             int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
//
//             System.out.println(Arrays.toString(array));//печатаем массив "правильно"
//             Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
//             System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
//         }



//          public static void findShortestLongest(int[] nums, int len) {
//              int shortestLen = nums[0].length();
//              int longestLen = nums[0].length();
//              String shortest = nums[0];
//              String longest = nums[0];
//              for (int i = 1; i < len; i++) {
//                  if (nums[i].length() < shortestLen) {
//                      shortestLen = nums[i].length();
//                      shortest = nums[i];
//
//                  }
//                  if (nums[i].length() > longestLen) {
//                      longestLen = nums[i].length();
//                      longest = nums[i];
//
//                  }
//              }
//              System.out.println(longest);
//              System.out.println(shortest);
//          }



//    public static void sortByHighest(int[] nums, int len) {
//
//        int max = nums[0];
//
//        for (int i = 0; i < len; i++) {
//
//            if (max < nums[i]) {
//                max = nums[i];
//            }
//        }
//        System.out.print(max);
//    }




//    public static void sortByChet (int []nums, int len){
//   int sum = 0;
//        for ( var num : nums) {
//
//             if ( num % 2 == 0) {
//                 sum= sum +num;
//
//             }
//
//        }
//        System.out.println(sum);
//    }
//



