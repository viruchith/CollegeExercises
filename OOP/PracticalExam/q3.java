/*

Assume there are N persons and each person needs exactly one cab. For each person, you are given the start time and end time (both inclusive) during which that person will travel. Find the minimum number of cabs required.

Input Format
First line contains an integer, N(1,<=N<=10^5) denoting the number of persons. Next N lines contains 4 integersHH1,MM1,HH2,and MM2, (0<=HH1,HH2<=23) (0<=MM1,MM2<=59), denoting the start time (HH1:MM1) and end time (HH2:MM2). It is guaranteed that start and end time will not span midnight.

Output Format
Print the minimum number of cabs required.

Sample 1 Input
Sample 1 Output
6
1 0 2 0
16 0 21 30
9 30 13 0
21 30 22 30
21 30 22 30
12 0 12 30
3

*/

import java.util.Scanner;

class TestClass {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

int time[] = new int[1440];

int max=0;

for(int i=0;i<n;i++){

int starth = sc.nextInt();

int startm = sc.nextInt();

int endh = sc.nextInt();

int endm = sc.nextInt();

int from = starth*60 + startm;

int to = endh*60 + endm;

for(int j=from;j<=to;j++){

time[j]++;

if(max < time[j])

max = time[j];

}

}

System.out.println(max);

}

}

/*

import java.util.*;

class Interval{
    
    public int start_mins, stop_mins;
    public boolean isAlloted=false;
    Interval(int start_h,int start_min,int stop_h,int stop_min){
        this.start_mins = toMinutes(start_h)+start_min;
        this.stop_mins = toMinutes(stop_h)+stop_min;

    }
    
    private int toMinutes(int h){
        return 60*h;
    }
    

}


class Cab{
    private List<Interval> cab_interval_list = new ArrayList<Interval>();
    
    public void addInterval(Interval i){
        this.cab_interval_list.add(i);
    }
    
    public boolean isAvailable(Interval i){
        if(cab_interval_list.isEmpty()){
            return true;
        }else{
            boolean flag = false;
            for(Interval ci : cab_interval_list){
                if( (i.start_mins>=ci.start_mins && i.start_mins<=ci.stop_mins) || (i.stop_mins<=ci.stop_mins && i.stop_mins>=ci.start_mins)  ){
                    flag=true;
                    break;
                }
            }
            
            if(flag){
                return false;
            }else{
                return true;
            }
        }
    }

    /*public void display(){
        System.out.println("Cab :");
        for(Interval i : cab_interval_list){
            System.out.println("st: "+i.start_mins+" end: "+i.stop_mins);
        }
    }*/    
    
}

class Main{


    public static void main (String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    List<Interval> interval_list = new ArrayList<Interval>();
    
    
    /*interval_list.add(new Interval(1,0,2,0));
    interval_list.add(new Interval(16,0,21,30));
    interval_list.add(new Interval(9,30,13,0));
    interval_list.add(new Interval(21,30,22,30));
    interval_list.add(new Interval(21,30,22,30));
    interval_list.add(new Interval(12,0,12,30));*/
    
    

    List<Cab> cab_list = new ArrayList<Cab>();
    
    int N = sc.nextInt();
    for(int i=0; i<N;i++){
        int sh = sc.nextInt();
        int sm = sc.nextInt();
        int eh = sc.nextInt();
        int em = sc.nextInt();
        
        interval_list.add(new Interval(sh,sm,eh,em));
        
        

    }

int cab_count = 0;
int alloted_count = 0 ;
boolean flag = true;
while(alloted_count<interval_list.size()){
    cab_list.add(new Cab());
    Cab cab = cab_list.get(cab_count);
       for(Interval i : interval_list){
            if(cab.isAvailable(i) && i.isAlloted == false){
                cab.addInterval(i);
                i.isAlloted = true ;
                alloted_count++;
            }
    }
    //cab.display();
    cab_count++;
}

System.out.println("Total No of Cabs needed : "+cab_count);

 
    }
}

*/
