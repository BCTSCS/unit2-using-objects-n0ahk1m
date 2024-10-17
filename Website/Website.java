import java.io.*;
import java.net.*;

public class Website {


 // Put your code here
    private String domain;
    private String topLevelDomain;
    private int numUsers;

//Default constructor
public Website(){
    domain="codehs";
    topLevelDomain="com";
    numUsers=0;
}

// Specify website URL
// Register a new website
public Website(String domainName, String topDomain){
    domain=domainName;
    topLevelDomain=topDomain;
    numUsers=0;
}
public Website(String domainName, String topDomain, int numPeople){
    domain=domainName;
    topLevelDomain=topDomain;
    numUsers=numPeople;
}

// Specify website URL
// Register an old website


    // Method to fetch data 
    public void fetchData(String api)
 {
        String urlString=toString()+ "/"+api;

        try {
            // Create the URL from the provided string
         
            URL url = new URL(urlString);
            
            // Open a connection to the API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            // Read the response and print each line
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;

            System.out.println("Response from the API:");

            // Print each line of the response directly
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   // String representation for printing
    // Do not modify this method
    public String toString()
    {
        
        String res =  "http://" + domain + "." + topLevelDomain;
       // res += " has " + numUsers + " users";
        
        return res;
    }

    // Main method to test the API call
    public static void main(String[] args) {
        Website website = new Website("ip-api.com/json", "com"); // Create an instance of Website
        website.fetchData("api"); // Call the instance method
        
        // NEVER USE access modifier inside methods
        // here every variable is local
        // local variable use Type only
        // reference variables Class type

        Website website2 = new Website();
        System.out.println(website2);
        
        Website website3 = new Website("google", "com", 1000000);
        System.out.println(website3);
    }
}