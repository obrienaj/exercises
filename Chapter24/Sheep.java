public class Sheep{
    public static void main(String[] args){

double n = 0;
int t;
double power = 1;

for (t = 0; n < 80; t++){
    n = 220 / (1 + 10*power);
    power = power * .83;
    System.out.println("After " + t + " years, the population of the herd will be " + n);
}
System.out.println("The herd will need to be supervised for " + (t-1) + " years");



    }


}