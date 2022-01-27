package JavaAssignments;
import java.io.IOException;
import java.net.*;
import java.util.*;
public class Assignment3 {

    private static long pingTime(String hostName)
    {
        try
        {
            InetAddress address = InetAddress.getByName(hostName) ;
            System.out.println("Now will ping the host with " + address);
            long finish = 0;
            long start = new GregorianCalendar().getTimeInMillis();

            if (address.isReachable(5000)) {
                finish = new GregorianCalendar().getTimeInMillis();
                System.out.println("Ping Value is here : " + (finish - start + "ms"));
                return (finish - start);
            } else
            {
                System.out.println("The host that you wanted to access is NOT REACHABLE !! ");
                return 0;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception Message is " + e.getMessage());
            return -1 ;
        }
    }
    public static void calculateMedian(ArrayList<Double> list)
    {
        double median;
        int listSize=list.size();
        if(listSize==0)
            System.out.println("empty list");
        else
        {
            if(listSize%2==0)
            {
                median=(list.get(listSize/2)+list.get(listSize/2-1))/2;   //formula for median
            }
            else
            {
                median=(list.get(listSize/2));
            }
            System.out.println("median:"+median);
        }
    }
    public static void main(String args[]) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter host name");
        String hostName=scanner.next();
        pingTime(hostName);
    }
}


