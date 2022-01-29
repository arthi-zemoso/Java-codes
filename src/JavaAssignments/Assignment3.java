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
    public static long calculateMedian()
    {
        System.out.println("enter number of pings");
        Scanner sc = new Scanner(System.in) ;
        List<Long> timeList = new ArrayList<>() ;
        long numberOfPings = sc.nextInt() ;

        while(numberOfPings > 0)
        {
            String hostAddress = sc.nextLine() ;
            long currentTime =  pingTime(hostAddress) ;
            timeList.add(currentTime) ;
            numberOfPings-- ;
        }
        int n = timeList.size();
        Collections.sort(timeList);
        if(n % 2 == 1)
            return (timeList.get(n/2)) ;
        else
        {
            int index1  = n/2;
            int index2 = n/2 -1;
            return (timeList.get(index1) + timeList.get(index2))/2 ;
        }
    }
    public static void main(String args[]) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter host name");
        String hostName=scanner.next();
        calculateMedian();
    }
}


