


/*

* 
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*


same pattern but here logic is different.

outer for loop will run the no of  rows time

how many rows ?
9
so
here suppose the no of row  n =5 
so we can say that it will be  2*n-1 which is 9

how many columns ?
so the no of columns is increasing till the row number  =5 (which is mid point we actully decreasing from mid )


if row no > n : 
col =     2* n    -  (row -n+1)

else

col = row 


int totalColsInRow = row > n ? 2 * n - row: row;

*/

    public class pattern6 {
        public static void main (String[] args) {
            p6(5);
        }

    static void p6(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

    







    

