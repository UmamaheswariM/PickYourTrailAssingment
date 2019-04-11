/*
  First we have to find the x axis lowest range and y axis highest range to find the area
  then the area will be the square of the number of units resides between x min point and y max point.
*/

//java imports
import java.util.*;

public class MinimumArea
{
        public static int findArea(int x,int y)
        {
                int area = 0;
                if(x < 0)
                {
                        area = (x*-1)+y; //for negative x axis points
                }
                else
                {
                        area = y-x;       //for positive x axis points
                }

                return (area * area);
        }

        public static void main(String args[])
        {
                int x,y,xPoint,yPoint,i,k;
                Scanner scanner = new Scanner(System.in);

                int xmin = Integer.MAX_VALUE;
                x = scanner.nextInt();
                
                //find the minimum x axis point to fix the square lowest range
                for(i=0;i<x;i++)
                {
                        xPoint = scanner.nextInt();
                        xmin = xPoint<xmin?xPoint:xmin;
                }

                int ymax = Integer.MIN_VALUE;
                y = scanner.nextInt();
                
                //find the maximum y axis point to fix the square highest range
                for(i=0;i<y;i++)
                {
                        yPoint = scanner.nextInt();
                        ymax = yPoint>ymax?yPoint:ymax;
                }

                k = scanner.nextInt();
                System.out.println(findArea(xmin-1,ymax+1));
        }
}
