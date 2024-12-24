
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int [] z = new int [16];
        double [] x = new double [18];
        double [][] z1= new double [16][18];
        double xj=0;
        int zi=0;

        for (int i=0;i<=15; i++){
            z[i]=i+5;
        }


        for (int i=0; i<x.length; i++)
        {
            x[i]= -11.0 + Math.random()*(12.0-(-11.0));
        }

        for (int i=0;i<16;i++){
            for (int j=0;j<18;j++) {
                xj=x[j];
                zi=z[i];
                z1[i][j]= count(xj, zi);
            }
        }
        print(z1);
        }

    public static double count(double xj,int zi) {
        double count = 0;
        switch (zi) {
            case 10:
                count = log10(pow(sin(pow(E,cbrt(xj))),2));
                break;

            case 5, 6, 7, 8, 12, 14, 15, 20:
                count = asin(1 / (Math.E * sqrt(sqrt(abs(xj)))));
                break;
            default:
                count = (cbrt(cbrt(asin((xj + 0.5) / 23)))) / 2;
        }
        return count;
    }
    public static void print(double [][] z1) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 18; j++) {
                System.out.print(z1[i][j]);
            }
            System.out.println();
        }
    }
    }



