import java.util.Scanner;
class Day{
    public static void main(String[] args){
        int dd, mm, yy;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the date:");
        dd = sc.nextInt();
        System.out.println("enter the month:");
        mm = sc.nextInt();
        System.out.println("enter the year:");
        yy = sc.nextInt();
        int year[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if((yy%4==0 && yy%100!=0)|| yy%400==0){
            System.out.println("leap year");
            year[2]=29;       
         }
         if(dd<1 || dd>year[mm]){
            System.out.println("invalid date:");
         }
         if(mm<1 || mm>12){
            System.out.println("invalid month");
         }
         int total = dd;
         for(int i=1; i<mm; i++){
            total = total + year[i];
         }
         System.out.println("Total days :" + total);
         int oddTotal = (yy-1)*365 + (yy-1)/4 + (yy-1)/100 + (yy-1)/400+ total;
         int weekD = oddTotal % 7;
         switch(weekD){
            case 0:
            System.out.println("Sunday");
            break;
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednsday");
            break;
            case 4:
            System.out.println("thrusday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            default:
            break;
         }

    }
}