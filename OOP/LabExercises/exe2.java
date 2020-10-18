/*

Question : 

Create a new class called “City” that can be used to keep track of location information for a given city.  Your class should include the following

    String name
    double lon (for longitude)
    double lat (for latitude)
    A constructor that accepts a name, lon and lat value and stores them in the instance variables for the object
    A method that reports the current position of a city.  Here’s a method header to get you started:

                    public void report()

      6. A method that computes the distance from the lon and lat of one city to the lon and lat of another city.  Use the standard distance formula to compute               this value.  Here’s a method header to get you started:

                   public double distanceFrom(lon1, lat1, lon2, lat2)
Distance between two cities can be calculated using the following formula

This uses the ‘haversine’ formula to calculate the great-circle distance between two points – that is, the shortest distance over the earth’s surface – giving an ‘as-the-crow-flies’ distance between the points (ignoring any hills they fly over, of course!).
Haversine
formula:	a = sin²(Δφ/2) + cos φ1 ⋅ cos φ2 ⋅ sin²(Δλ/2)
c = 2 ⋅ atan2( √a, √(1−a) )
d = R ⋅ c
where	φ is latitude, λ is longitude, R is earth’s radius (mean radius = 6,371km);
note that angles need to be in radians to pass to trig functions!
psudeocode:	

var R = 6371e3; // metres
var φ1 = lat1.toRadians();
var φ2 = lat2.toRadians();
var Δφ = (lat2-lat1).toRadians();
var Δλ = (lon2-lon1).toRadians();

var a = Math.sin(Δφ/2) * Math.sin(Δφ/2) +
        Math.cos(φ1) * Math.cos(φ2) *
        Math.sin(Δλ/2) * Math.sin(Δλ/2);
var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

var d = R * c;

  

To use “sin” and “cos” functions follow the rules given below:

                    1. import “java.lang.Math” package in your program

                    2. all the degree values should be converted to radian values using “Math.toRadians(degree_value)” method

                    3. To raise a number ‘a’ to the power of ‘n’ use “Math.pow(a,n)” method

                    4. To find the square root of a number ‘n’ “use Math.sqrt(n)” method

                    5. To find the “sin”, “cos” and “tan” value use “Math.sin(radian)”, “Math.cos(radian)” and “Math.tan(radian)” methods respectively.

                        An example usage is given below

                        a=Math.pow((Math.sin(Math.toRadians(dlat)/2)),2)

  Create a new class called “Ex1_2”.  Do the following in this class:

    Include the “main” function
    Create two objects for the two cities with name, longitude and latitude values
    Calculate the distance between these two cities
    Here’s a sample running of your program     

Samle Main Method:

public static void main(String args[]){

		    City ob1=new City("SLM",11.6643,78.1460);

		    City ob2=new City("CBR",11.0168,76.9558);

		    System.out.println("City #1");

		    System.out.println("Name: "+ob1.name);

	            System.out.println("Longitude: "+(int)ob1.lon);

	            System.out.println("Latitude: "+(int)ob1.lat);

	            System.out.println();

	            System.out.println("City #2");

	            System.out.println("Name: "+ob2.name);

	            System.out.println("Longitude: "+(int)ob2.lon);

	           System.out.println("Latitude: "+(int)ob2.lat);

	            System.out.println();

		    ob1.report();

		    ob2.report();

		    int distance=(int)ob2.distancefrom(ob1.lon,ob1.lat,ob2.lon,ob2.lat);

		    System.out.println(ob1.name+" is " +distance+" kms away from "+ob2.name);

	}


Sample Output:

City #1
Name: NYC
Longitude: 50
Latitude: 75

City #2
Name: Chicago
Longitude: 25
Latitude: 10

City: NYC is at: 50.0, 75.0

City: Chicago is at: 25.0, 10.0

NYC is 7394 kms away from Chicago

*/

import java.lang.Math;

class City{
    final double R = 6371;
    protected double lat,lon;
    protected String name ;
    

    City(String name,double lon ,double lat){
        this.name = name ;
        this.lat = lat ;
        this.lon = lon ;
    }
    
    public void report(){
        System.out.println("City:"+this.name+" is at: "+this.lon+","+this.lat);
    }
    
    public double distanceFrom(double lon1,double lat1,double lon2,double lat2){
        double lonR1,latR1,lonR2,latR2,latDiff,lonDiff,a,c,d;
        
        lonR1 = Math.toRadians(lon1);
        latR1 = Math.toRadians(lat1);
        
        lonR2 = Math.toRadians(lon2);
        latR2 = Math.toRadians(lat2);
        
        latDiff = Math.toRadians(lat1 - lat2) ;
        lonDiff = Math.toRadians(lon1 - lon2) ;
        
        a = Math.pow(Math.sin(latDiff/2),2) + ( Math.cos(latR1) * Math.cos(latR2) * Math.pow(Math.sin(lonDiff/2),2)  ) ;
        
        c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a)) ;
        
        d = R * c ;
        
        return d ;
        
        
    }

}

class Dist{
    
    public static void main(String args[]){
        
        City ob1 = new City("SLM",11.6643,78.1460);
        City ob2 = new City("CBR",11.0168,76.9558);
        
        System.out.println("City #1");
        System.out.println("Name:"+ob1.name);
        System.out.println("Longitude: "+(int)ob1.lon);
        System.out.println("Latitude: "+(int)ob1.lat);

        System.out.println();

        
        System.out.println("City #2");
        System.out.println("Name:"+ob2.name);
        System.out.println("Longitude: "+(int)ob2.lon);
        System.out.println("Latitude: "+(int)ob2.lat);
        
        System.out.println();
        
        ob1.report();
        ob2.report();
        
        int dist = (int)ob2.distanceFrom(ob1.lon,ob1.lat,ob2.lon,ob2.lat) ;
        
        System.out.println(ob1.name+" is "+dist+" kms away from "+ob2.name);
      
        
    }
}
