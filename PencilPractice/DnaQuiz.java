import java.util.Scanner;

public class DnaQuiz{
    public static void main(String[] args){

Scanner scan = new Scanner(System.in);

String dna = "";
String nucleotide = "A";

while (!nucleotide.equals("q")){
    System.out.println("Enter nucleotide:");
    nucleotide = scan.nextLine();
    if (nucleotide.equals("A") || nucleotide.equals("T") || nucleotide.equals("G") || nucleotide.equals("C") || nucleotide.equals("q")){
        if (!nucleotide.equals("q"))
            dna = dna + nucleotide; }
    else
        System.out.println("Invalid input");
}

System.out.println("Sequence: " + dna);

double A = 0;
double T = 0;
double G = 0;
double C = 0;

String complement = "";
int count = 0;
String nucleotide2 = "";

while (count < dna.length()){
    nucleotide2 = dna.substring(count, count + 1);
    if (nucleotide2.equals("A")){
        complement = complement + "T";
        A = A + 1;
    }
     if (nucleotide2.equals("T")){
        complement = complement + "A";
        T = T + 1;
    }
     if (nucleotide2.equals("G")){
        complement = complement + "C";
        G = G + 1;
    }
     if (nucleotide2.equals("C")){
        complement = complement + "G";
        C = C + 1;
    }
    count++;
}

System.out.println("Complementary sequence: " + complement);

double total = A + T + G + C;
double pctA = A/total;
double pctT = T/total;
double pctG = G/total;
double pctC = C/total;

if (pctA >= .4)
    System.out.println("Increased cancer risk due to A abundance.");
if (pctT >= .4)
    System.out.println("Increased cancer risk due to T abundance.");
if (pctG >= .4)
    System.out.println("Increased cancer risk due to G abundance.");
if (pctC >= .4)
    System.out.println("Increased cancer risk due to C abundance.");
if (pctA < .4 && pctT < .4 && pctG < .4 && pctC < .4)
    System.out.println("No increased risk");




    }


}