
package Part6;
/**
 *
 * @author user
 */
public class Q071 {

    public static void main(String[] args) {
        int[] score = {76, 89, 150, 135, 200, 76, 12, 100, 150, 28, 178, 189, 167, 200, 175, 
                       150, 87, 99, 129, 149, 176, 200, 87, 35, 157, 189};
        int[] scoreranges = {0,0,0,0,0,0,0,0};

       for(int count=0;count<score.length;count++)
       {
            if (score[count] >= 0 && score[count]<= 24)
                scoreranges[0]++;

            else if (score[count] >= 25 && score[count] <= 49)
                scoreranges[1]++;

            else if (score[count] >= 50 && score[count] <= 74)
                scoreranges[2]++;

            else if (score[count] >= 75 && score[count] <= 99)
                scoreranges[3]++;

            else if (score[count] >= 100 && score[count] <= 124)
                scoreranges[4]++;

            else if (score[count] >= 125 && score[count] <= 149)
                scoreranges[5]++;

            else if (score[count] >= 150 && score[count] <= 174)
                scoreranges[6]++;

            else if (score[count] >= 175 && score[count] <= 200)
                scoreranges[7]++;
       }
       System.out.printf("number of students 0-24=%d%n",scoreranges[0]);
       System.out.printf("number of students 25-49=%d%n",scoreranges[1]);
       System.out.printf("number of students 50-74=%d%n",scoreranges[2]);
       System.out.printf("number of students 75-99=%d%n",scoreranges[3]);
       System.out.printf("number of students 100-124=%d%n",scoreranges[4]);
       System.out.printf("number of students 125-149=%d%n",scoreranges[5]);
       System.out.printf("number of students 150-174=%d%n",scoreranges[6]);
       System.out.printf("number of students 175-200=%d%n",scoreranges[7]);
       
    }
}

