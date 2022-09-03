import com.spring.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Logger log = Logger.getLogger("org.hibernate");
        log.setLevel(Level.OFF);
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hall hall=(Hall)con.getBean("hall");
        List<Event> list=hall.getEventList();
        System.out.println("Enter the hall details in CSV format(length,width,owner)");
        String input=br.readLine();
        String[] split=input.split(",");
        do {
            System.out.println("Select an option from the list");
            System.out.println("1) Add event");
            System.out.println("2) Display events");
            System.out.println("3) Exit");
            System.out.println("Enter the choice");
            int choice=Integer.parseInt(br.readLine());
            if(choice==1)
            {
                Event event=(Event)con.getBean("event");
                System.out.println("Enter the Event details in CSV format(eventName,eventOrganiser)");
                String csv=br.readLine();
                String[] arry=csv.split(",");
                event.setEventName(arry[0]);
                event.setEventOrganiser(arry[1]);
                hall.eventList.add(event);
                event.setId(list.size());
            }
            else if(choice==2)
            {
                if(list.size()==0)
                {
                    System.out.println("There are no events associated with the hall");
                }
                else
                {
                    System.out.println("...Listing events in the hall...");
                    System.out.format("%-5s %-30s %s \n","Id","Event name","Organiser");
                    for(Event e:list)
                    {
                        e.display();
                    }
                }
            }
            else if(choice==3)
            {
                System.exit(0);
            }
        }while(true);
    }
}