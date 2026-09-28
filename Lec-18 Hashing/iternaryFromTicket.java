// "mumbai","delhi"
// "goa","chennai"
// "delhi","goa"
// "chennai","bengluru"
// ans -> mumbai > delhi > goa > chennai > bengluru

import java.util.*;
public class iternaryFromTicket{
    static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }
        for(String key: tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> ticket = new HashMap<>();
        ticket.put("mumbai","delhi");
        ticket.put("goa","chennai");
        ticket.put("delhi","goa");
        ticket.put("chennai","bengluru");

        String start = getStart(ticket);
        
        while(ticket.containsKey(start)){
            System.out.println(start);
            start = ticket.get(start);
        }
        System.out.println(start);
    }
}