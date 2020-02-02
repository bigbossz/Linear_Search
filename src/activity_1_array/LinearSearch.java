package activity_1_array;

import java.util.Scanner;

// @author Brandon
class LinearSearch {

    Scanner sc = new Scanner(System.in);
    int inv[];
    int size;

    void Fill_arr() {
        int b=1;
        while(b!=0){
        System.out.println("Enter value for Math.Rnd multiplier: ");
        int multiplier = sc.nextInt();
        System.out.println("------------");
        if (multiplier==0 || multiplier ==1) {
                System.out.println("Error!!Please enter value >1");
            }
        else {
        int c = 1;
        while (c != 0) {
            int h=1;
            while(h!=0){
            System.out.println("Enter size: ");
            size = sc.nextInt();
            System.out.println("------------");
            
            if (size>multiplier) {
                System.out.println("Error!Please Enter value <="+multiplier);
            }
            else{
               h=0; 
            

            if (size == 0) {
                System.out.println("Error!Bugo ka!");
            }
            if (size == 1) {
                System.out.println("Error!Please Enter more than 1!");
            } else {
                c = 0;
                h=0;
                b=0;
            }}}
        }
        inv = new int[size];
       
        for (int i = 0; i < size; i++) {
            inv[i] = 1 + (int) (Math.random() * multiplier);
            if (i > 0) {
                for (int j = 0; j <= i - 1; j++) {
                    if (inv[j] == inv[i]) {
                        i--;
                    }
                }
            }
        }

    }}}

    

    void display() {

        for (int q = 0; q < size; q++) {
            System.out.println(inv[q]);
            System.out.println("---");

        }
    }

    void Findmin() {
        int min = inv[0];
        for (int i = 0; i < size; i++) {
            if (min > inv[i]) {
                min = inv[i];
            }

        }
        System.out.println("The minimum number is: " + min);
    }

    void Findmax() {
        int max = inv[0];
        for (int i = 0; i < size; i++) {
            if (max < inv[i]) {
                max = inv[i];
            }

        }
        System.out.println("The maximum number is: " + max);
    }

    void Searchall() {
        int g = 1;
        int l = 1;
        do {

            System.out.println("Enter 1 to search for index:\nEnter 2 to search for value:");
            int search = sc.nextInt();
            if (search == 1) {
                do {
                    int u = 1;
                    while (u != 0) {
                        int lookindex = 0;
                        System.out.println("Input index:");
                        int index = sc.nextInt();
                        for (int i = 0; i < size; i++) {
                            if (index == i) {
                                lookindex = inv[i];
                            }
                        }
                        if (index >= size) {
                            System.out.println("Error!!Index is only from " + lookindex + " to " + (size - 1));
                        }
                        if (index < size) {
                            System.out.println("In index " + index + " the value is: " + lookindex);
                            u = 0;
                        }
                    }
                    int o = 1;
                    while (o != 0) {
                        System.out.println("Would you like to search for another number?");
                        System.out.println("Press 1 to search again\nPress 2 to switch search method!");
                        System.out.println("Press 3 to Exit");
                        int ch = sc.nextInt();

                        if (ch == 1) {
                            o = 0;
                        }
                        if (ch == 2) {
                            o = 0;
                            l = 0;

                        }
                        if (ch == 3) {
                            System.out.println("-----------------------------");
                            System.out.println("The " + size + " Random numbers are:");
                            o = 0;
                            g = 0;
                            l = 0;
                            for (int q = 0; q < size; q++) {
                                System.out.print(inv[q] + "--");

                            }
                        }
                        if (ch == 0 || ch > 3) {
                            System.out.println("Error!!Please Enter 1 or 2!!");

                        }
                    }
                } while (l != 0);
            }
            if (search == 2) {
                int r = 1;
                do {

                    int s = 1;
                    while (s != 0) {

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Input value:");

                        int find = sc.nextInt();

                        int findindex = -1;

                        for (int i = 0; i < size; i++) {
                            if (find == inv[i]) {
                                findindex = i;

                            }

                        }
                        if (findindex != -1) {
                            System.out.println("Number " + find + " is in index: " + findindex);
                            System.out.println("--------------------------");
                            s = 0;
                        }

                        if (findindex == -1) {
                            System.out.println("Number " + find + " is not in the array!");

                        }
                    }

                    int t = 1;
                    while (t != 0) {
                        System.out.println("Would you like to search for another number?");
                        System.out.println("Press 1 to search again\nPress 2 to switch search method!");
                        System.out.println("Press 3 to Exit");

                        int choose = sc.nextInt();

                        if (choose == 1) {
                            t = 0;
                        }
                        if (choose == 2) {
                            r = 0;
                            t = 0;
                        }
                        if (choose == 3) {
                            System.out.println("-----------------------------");
                            System.out.println("The " + size + " Random numbers are:");
                            r = 0;
                            t = 0;
                            g = 0;
                            for (int q = 0; q < size; q++) {
                                System.out.print(inv[q] + "--");

                            }
                        }
                    }
                } while (r != 0);
            }
            if (search == 0 || search > 2) {
                System.out.println("Error!!");
            }
        } while (g != 0);
    }

    
    

}
