// import javax.swing.RowFilter;

// import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Abs;
// import java.math.MathContext;

public class patterns {
    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        // pattern11();
        // pattern12();
        // pattern13();
        // pattern14();
        // pattern15();
        // pattern16();
        // pattern18();
        // pattern19();
        // pattern20();
        // pattern21();
        // pattern22();
        // pattern23();
        // pattern24();
        // pattern25();
        // pattern26();
        // pattern27();
        // pattern28();
        // pattern29();
        // pattern30();
        pattern31();
        // pattern32();
        // pattern33();
        // pattern34();


    }

    static void pattern1(){
        System.out.println("\n\t\t\tPATTERN 1");
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        System.out.println("\n\t\t\tPATTERN 2");
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5-row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        System.out.println("\n\t\t\tPATTERN 3");
        for (int row = 5; row > 0; row--) {
            for (int column = 0; column < 5-row+1; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(){
        System.out.println("\n\t\t\tPATTERN 4");
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < row+1; column++) {
                System.out.print((column+1)+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(){
        System.out.println("\n\t\t\tPATTERN 5");
        for (int row = 5; row>0; row--) {
            for (int column = 0; column < 5; column++) {
                if (column<row-1) {
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern6(){
        System.out.println("\n\t\t\tPATTERN 6");
        for (int row = 5; row>0; row--) {
            for (int column = 0; column < 5; column++) {
                if (column<(5-row)) {  // 0>5-5,0>5-4,
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(){
        System.out.println("\n\t\t\tPATTERN 7");
        for (int row = 5*2; row>0; row-=2) {
            for (int column = 0; column < 5; column++) {
                if (column<(row/2)-1) {
                    System.out.print(" ");
                }//10/2-1=4,10/2-2=3,10/2-3=2,1
                //4
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern8(){
        System.out.println("\n\t\t\tPATTERN 8");
        for (int row = 5*2; row>0; row-=2) {
            for (int column = 5; column > 0; column--) {
                if (column<=(row/2)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern9(){
        System.out.println("\n\t\t\tPATTERN 9"); 
        for (int row = 5*2; row > 5; row-=1) { 
            for (int column = 0; column < row-1; column++) {
                // 1,3,5,7,
                // 0<10-10=0,(0,1)<10-8=2,(0,1,2,3)<10-6=4
                if(column < 10-(row)){
                    System.out.print("  ");
                 }else {
                    System.out.print("* ");
                }//10/2-1=4,10/2-2=3,10/2-3=2,1
            }
            System.out.println();
        }
    }

    static void pattern10(){
        System.out.println("\n\t\t\tPATTERN 10");
         
            for (int column = 5; column > 0; column--) {
                for (int row = 5*2; row > column; row-=1) { //5+1<10,9,8,7|7<10,9,8
                // 1,3,5,7,9 5,
                // (0,1,2,3)<((10/2)-1)=4,(0,1,2)<((8/2)-1)=3,(0,1)<((6/2)-1)=2...
                // 4,3,2,1,0....5,4,3,2,1.....1,3,5,7,9=>.....4 
                // 10,9,8,7,6 < 0,1,2,3,4,....10-10,10-9,..4,3,2,1
                // 0<1,2,3,4,...10,0,1,2,3,4
                if(10-column+1 < row){ //6 < 10,9,8,7 | 10-4+1< 10,9,8,7,6
                    System.out.print("  ");
                }else{
                // if(column < 10-(row/2)){
                    System.out.print("* ");//1,3,5,7,9
                }//else {
                //     System.out.print("  ");
                // }//10/2-1=4,10/2-2=3,10/2-3=2,1
            }
            System.out.println();
        }
    }
    // Pattern 11
    static void pattern11(){
        System.out.println("\n\t\t\tPATTERN 11");
        for (int row = 5*2; row > 0; row-=1) { 
            for (int column = 0; column < row-1; column++) {
                if(column < (5*2)-(row)+1){
                    System.out.print("* ");
                 }
            }
            System.out.println();
        }
    }
    // PATTERN 12
    static void pattern12(){
        System.out.println("\n\t\t\tPATTERN 12");
        for (int row = 5; row > 0; row--) {
            for (int column = 5*2; column > row; column-=1) { //5+1<10,9,8,7|7<10,9,8
            // 1,3,5,7,9 5,
            // (0,1,2,3)<((10/2)-1)=4,(0,1,2)<((8/2)-1)=3,(0,1)<((6/2)-1)=2...
            // 4,3,2,1,0....5,4,3,2,1.....1,3,5,7,9=>.....4 
            // 10,9,8,7,6 < 0,1,2,3,4,....10-10,10-9,..4,3,2,1
            // 0<1,2,3,4,...10,0,1,2,3,4
            
            if(10-row+1 < column){ //1 < 10,9,8,7,6,5,4,3,2,1 | 10-4+1< 10,9,8,7,6
                System.out.print("  ");
            }else{
            // if(column < 10-(row/2)){
                System.out.print("* ");//1,3,5,7,9
            }//else {
            // }//10/2-1=4,10/2-2=3,10/2-3=2,1
        }
        System.out.println();
        }
        for (int row = 5*2-1; row > 5; row-=1) { 
            for (int column = 0; column < row-1; column++) {
                // 1,3,5,7,
                // 0<10-10=0,(0,1)<10-8=2,(0,1,2,3)<10-6=4
                if(column < 10-(row)){
                    System.out.print("  ");
                 }else {
                    // System.out.print("* ");
                    System.out.print("* ");
                }//10/2-1=4,10/2-2=3,10/2-3=2,1
            }
            System.out.println();
        }
    }

    static void pattern13(){
        System.out.println("\n\t\t\tPATTERN 13");
        for (int row = 5*2; row > 5; row-=1) { 
            for (int column = 0; column < row-1; column++) {
                // 1,3,5,7,
                // 0<10-10=0,(0,1)<10-8=2,(0,1,2,3)<10-6=4
                if(column < 10-(row)){
                    System.out.print("  ");
                 }else {
                    System.out.print("* ");
                }//10/2-1=4,10/2-2=3,10/2-3=2,1
            }
            System.out.println();
        }
        for (int row = 5; row > 0; row--) {
            for (int column = 5*2; column > row; column-=1) { //5+1<10,9,8,7|7<10,9,8
            // 1,3,5,7,9 5,
            // (0,1,2,3)<((10/2)-1)=4,(0,1,2)<((8/2)-1)=3,(0,1)<((6/2)-1)=2...
            // 4,3,2,1,0....5,4,3,2,1.....1,3,5,7,9=>.....4 
            // 10,9,8,7,6 < 0,1,2,3,4,....10-10,10-9,..4,3,2,1
            // 0<1,2,3,4,...10,0,1,2,3,4
            
            if(10-row+1 < column){ //1 < 10,9,8,7,6,5,4,3,2,1 | 10-4+1< 10,9,8,7,6
                System.out.print("  ");
            }else{
            // if(column < 10-(row/2)){
                System.out.print("* ");//1,3,5,7,9
            }//else {
            // }//10/2-1=4,10/2-2=3,10/2-3=2,1
        }
        System.out.println();
        }
        
    }

    static void pattern14(){
        System.out.println("\n\t\t\tPATTERN 14");
        for (int row = 0; row < 5*2; row++) {
        int columnNo = row>5?(5*2-row):row;
        for (int colum = 0; colum < 5*2; colum++) {//4,5...10-columnNo=9<
            if(colum<columnNo)
                System.out.print("* ");
        }
        
            System.out.println();
        }
    }

    static void pattern15(){
        System.out.println("\n\t\t\tPATTERN 15");
        for (int row = 0; row < 5*2; row++) {
        int columnNo = row>5?(5*2-row):row;
        int rowSpace = 5-columnNo;
        for (int space = 0; space < rowSpace; space++) {
            System.out.print(" ");
        }
        for (int colum = 0; colum < columnNo; colum++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }

    static void pattern16(){
        System.out.println("\n\t\t\tPATTERN 16");
        for (int row = 5*2; row > 5; row-=1) { 
            for (int column = 0; column < row-1; column++) {
                if(column < 10-(row)){
                    System.out.print("  ");
                 }else {
                    System.out.print(10-row+1+" ");
                }
            }
            System.out.println();
        }
        for (int row = 5; row > 0; row--) {
            for (int column = 5*2; column > row; column-=1) { 
            if(10-row+1 < column){ 
                System.out.print("  ");
            }else{
                System.out.print(row+" ");
            }
        }
        System.out.println();
        }
    }

    static void pattern17(){
        System.out.println("\n\t\t\tPATTERN 17");
        for (int row = 0; row < 5*2+1; row++) {
            int columnNo = row>5?(5*2-row):row;
            int rowSpace = 5-columnNo;
            for (int space = 0; space < rowSpace+1; space++) {
                System.out.print("-");
            }
            for (int colum = 0; colum < columnNo; colum++) {
                System.out.print("  ");
            }
            for (int space = 0; space < rowSpace+1; space++) {
                System.out.print("-");
            }
                System.out.println();
            }
    }

    static void pattern18(){
        System.out.println("\n\t\t\tPATTERN 18");
                for (int column = 5; column > 0; column--) {
                    for (int row = 5*2; row > column; row-=1) { 
                    if(5*2-column+1 < row){ 
                        System.out.print("  ");
                    }else{
                        System.out.print((row<6?5-row+2:row-5)+" ");
                    }
                }
                System.out.println();
            }
    }
    // PATTERN 19
    static void pattern19(){
        System.out.println("\n\t\t\tPATTERN 19");
        for (int row = 5; row > 0; row--) {
            for (int column = 5*2; column > row; column-=1) { //5+1<10,9,8,7|7<10,9,8
            if(10-row+1 < column){ //1 < 10,9,8,7,6,5,4,3,2,1 | 10-4+1< 10,9,8,7,6
                System.out.print("  ");
            }else{
                System.out.print((column<6?5-column+2:column-5)+" ");
            }//else {
        }
        System.out.println();
        }
        for (int row = 5*2-1; row > 5; row-=1) { 
            for (int column = 0; column < row-1; column++) {
                // 1,3,5,7,
                // 0<10-10=0,(0,1)<10-8=2,(0,1,2,3)<10-6=4
                if(column < 10-(row)){
                    System.out.print("  ");
                 }else {
                    // System.out.print(column+" ");
                    System.out.print((column<5?5-column:column-5+2)+" ");
                }//10/2-1=4,10/2-2=3,10/2-3=2,1
            }
            System.out.println();
        }
    }
    // Pattern 20
    static void pattern20(){
        System.out.println("\n\t\t\tPATTERN 20");
        for (int row = 1; row < 5*2; row++) {
        int columnNo = row>5?(5*2-row):row;
        for (int colum = 0; colum < 5*2; colum++) {//4,5...10-columnNo=9<
            if(colum<columnNo || (10-colum<=row && row <= 5) || (10-columnNo<colum+1 && row > 5))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
            System.out.println();
        }
    }

    static void pattern21(){
        System.out.println("\n\t\t\tPATTERN 21");
        int n=3;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= n; column ++) {
                // Distance => distance between element => right,left,up,down
                // right = col
                // left = N - col
                // up = row
                // down = N - row
                int res= (n/2+1)-Math.min(Math.min(row,column),Math.min((n-row), (n-column)));
                System.out.print(res);
            }System.out.println();
        }
    }

    static void pattern22(){
        System.out.println("\n\t\t\tPATTERN 22");
        int n=5;
        n = n-1;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= n+row; column ++) {
                if(n-row == column || n+row == column || n == row)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    static void pattern23(){
        System.out.println("\n\t\t\tPATTERN 23");
        int n=5;
        n = n-1;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= n*2-row; column ++) {
                if( row == 0 || row == column || (n*2)-row == column)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    static void pattern24(){
        System.out.println("\n\t\t\tPATTERN 24");
        int n=5;
        n = n-1;
        for (int row = 0; row <= n*2; row++) {
            for (int column = 0; column <= n*2; column ++) {
                if(Math.abs(n-row) == column || Math.abs((n*2+1)-Math.abs(n-row))-1 == column)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    static void pattern25(){
        System.out.println("\n\t\t\tPATTERN 25");
        int n=5;
        n = n-1;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= n; column ++) {
                if(column == 0 || row == 0 || column == n || row == n)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    static void pattern26(){
        System.out.println("\n\t\t\tPATTERN 26");
        int n=5;
        n = n-1;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= (n*2+1)-row; column ++) {
                if(column == (n-row) || column == (n*2+1)-row || (0 == row && n <= column) || (n == row && n >= column))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    static void pattern27(){
        System.out.println("\n\t\t\tPATTERN 27");
        int n=5;
        n = n/2;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= ((n+1)*2)+row; column ++) {
                if(column == (n-row) || column == n+row || column == ((n+1)*2)-row || column == ((n+1)*2)+row )//|| (0 == row && n <= column) || (n == row && n >= column))
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }

    static void pattern28(){
        System.out.println("\n\t\t\tPATTERN 28");
        int n=5-1;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print((char)('A'+n-row+column)+" ");
            }
            System.out.println();
        }
    }

    static void pattern29(){
        System.out.println("\n\t\t\tPATTERN 29");
        int n=5-1,temp=0;
        boolean isUpper= false;
        for (int row = 0; row <= n; row++) {
            for (int column = 0; column <= row; column++) {
                if(isUpper){
                    System.out.print((char)('A'+temp++)+" ");
                    isUpper= false;
                }else{
                System.out.print((char)('a'+temp++)+" ");
                isUpper= true;
                }
            }
            System.out.println();
        }
    }

    static void pattern30(){
        System.out.println("\n\t\t\tPATTERN 30");
        int n=5-1;
        for (int row = n; row >= 0; row--) {
            for (int column = 0; column <= row; column++) {
                    System.out.print((char)('A'+row-column)+" ");
            }
            System.out.println();
        }
    }

    static void pattern31(){
        System.out.println("\n\t\t\tPATTERN 31");
        int n=5-1,left=0,right=0;
        
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n*2-row; column++) {
                if(column < row){}else{
                    ++right;
                }
            }
        }
        int temp;
        temp=right;

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n*2-row; column++) {
                if(column == n){
                    temp-=column;
                }
                if(column < row){
                    System.out.print("  ");
                }
                else if(column < n){
                    System.out.print(++left+" ");
                }else{
                    temp=temp+1;
                System.out.println(temp+" ");

                right=right-1;
                System.out.println("  read: "+right);
                }
            }
            temp=right;
            System.out.println();
        }
    }
}
