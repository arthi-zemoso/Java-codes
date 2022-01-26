package JavaAssignments;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
public class Assignment3 {

    public static void ping(String hostname,int numberOfPackets) throws IOException {
        ArrayList<Double> timeList=new ArrayList<Double>();
        ProcessBuilder builder=new ProcessBuilder();
        builder.command("cmd.exe", "/c", "ping -n "+numberOfPackets+" "+hostname);
        Process process=builder.start();
        BufferedReader inputStream = new BufferedReader(
                new InputStreamReader(process.getInputStream()));
        String content;
        System.out.println("time in ms");
        while((content=inputStream.readLine())!=null)
        {
            double time;
            int index=content.indexOf("time=");
            if(index!=-1) {
                time=Double.parseDouble(content.substring(index + 5, content.length() - 9));
                System.out.println(time);
                timeList.add(time);
            }

        }
        inputStream = new BufferedReader(
                new InputStreamReader(process.getErrorStream()));
        while((content=inputStream.readLine())!=null)
        {
            System.out.println(content);
        }
        calculateMedian(timeList);
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
        System.out.println("Enter Number of packets");
        int packets=scanner.nextInt();
        ping(hostName,packets);
    }
}


