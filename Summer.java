import java.util.*;
abstract public class Summer {
    public static void Rice() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while(true) {
            System.out.println("\n\t\t\t\t\t\t***** Which information do you need? ******");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Hybrid Rice seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Summer.Rice_detail(); break;
                case 2: Summer.Hybrid_Rice_Seeds(); break;
                case 3: Summer.Rice_pesticides(); break;
                case 4: project.Sum(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
    
    public static void Rice_detail() {
        
        /*Introduction to Rice*/
        
        System.out.println("\n\t\t\t\t\t\t************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Rice *");
        System.out.println("\t\t\t\t\t\t************************");
        
        System.out.println("\n\t\t\t\t\t\t~ Rice is the staple crop of India, and every day millions of Indians find comfort in it.");
        System.out.println("\n\t\t\t\t\t\t~ There are various type of rice varieties that are consumed in our country \n\t\t\t\t\t\t  – Basmati, White, Brown, Red, Jasmine, Parboiled and Sticky Rice.");
        System.out.println("\t\t\t\t\t\t~ Rice is an adaptable crop and can be cultivated in a variety of climates, \n\t\t\t\t\t\t  be it plains, or the mountains and hence it can be grown as a Kharif crop or even as Rabi crop!");
        System.out.println("\t\t\t\t\t\t~ The primary season is Kharif and hence most of the Rice sowing is done during \n\t\t\t\t\t\t  June to July, and for the Rabi, the sowing time is November to February");
        System.out.println("\t\t\t\t\t\t~ In India, rice is grown in almost half the states, with West Bengal leading the way in \n\t\t\t\t\t\t  terms of production with 14.71 million tonnes, followed by Uttar Pradesh \n\t\t\t\t\t\t  (12.22 million tonnes) and Andhra Pradesh (11.57 million tonnes) as per the Agricultural Statistics \n\t\t\t\t\t\t  2014-15, Ministry of Agriculture & Farmers Welfare of the Government of India. ");
    }
    
    public static void Hybrid_Rice_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t***** Select Type of Rice ******");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Basmati Rice Seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Black KALABATI RICE ");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Summer.Basmati_Rice(); break;
                case 2: Summer.KALABATI_RICE(); break;
                case 3: Summer.Rice(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
    
    public static void Rice_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t**** Select Brand for pesticides of Rice *****");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Dupont");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Virtako");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Summer.Dupont(); break;
                case 2: Summer.Virtako(); break;
                case 3: Summer.Rice(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
    
    public static void Basmati_Rice() {
        System.out.println("\n\t\t\t\t\t\tName                   : Basmati Rice Seeds");
        System.out.println("\t\t\t\t\t\tPrice                  : Rs. 120 / Kg");
        System.out.println("\t\t\t\t\t\tPack type              : PP Bag");
        System.out.println("\t\t\t\t\t\tMinimum Order Quantity : 100 Kilogram");
    }
    public static void KALABATI_RICE() {
        System.out.println("\n\t\t\t\t\t\tName              : Natural Black KALABATI RICE");
        System.out.println("\t\t\t\t\t\tColour            : Black");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 300 / Kg");
        System.out.println("\t\t\t\t\t\tPackage Type      : Bag");
    }
    
    public static void Dupont() {
        System.out.println("\n\t\t\t\t\t\tName          : Dupont Pexalon");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 13,500 / Litre");
        System.out.println("\t\t\t\t\t\tPachaging Size: 950 ml");
        System.out.println("\t\t\t\t\t\tDosage        : 94ml/acre");
        
    }
    
    public static void Virtako() {
        System.out.println("\n\t\t\t\t\t\tName          : VIRTAKO");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 360 / Kg");
        System.out.println("\t\t\t\t\t\tPachaging Size: 1Kg");
        System.out.println("\t\t\t\t\t\tDosage        : For sucking pests- 40g/100ltr of water ; For stem borer and leaf folder 2.5 kg/acre.");
    }
    
    abstract  void Cotton();
    abstract  void Cotton_detail();
    abstract  void Hybrid_Cotton_Seeds();    
    abstract  void Nagraj();
    abstract  void Narmada();
    abstract  void Alpha();
    abstract  void Amrut();
    abstract  void Cotton_pesticides();
}
class Cotton extends Summer{
    
    void Cotton_detail() {

    	System.out.println("\n\t\t\t\t\t\t********************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Sweet cotton *");
        System.out.println("\t\t\t\t\t\t********************************");
        
        System.out.println("\n\t\t\t\t\t\t~ Cotton is one of the most important fibre and cash crop of India as well as of entire world. ");
        System.out.println("\t\t\t\t\t\t~ It can be grown on all type of soil having pH ranges in-between 6 and 8");
        System.out.println("\t\t\t\t\t\t~ Deep, friable, well drained and fertile soil are good for crop cultivation.");       
        System.out.println("\t\t\t\t\t\t~ Optimum time for sowing is in April - mid May. For Management of Mealybug, \n\t\t\t\t\t\t  sow Bajra, Arhar, Maize and Jowar in the fields surrounding cotton crop.");
        System.out.println("\t\t\t\t\t\t~ Picking of bolls should be done when bolls are fully mature.\n\t\t\t\t\t\t~ Avoid picking of wet bolls, pick cotton free from dry leaves trash.\n\t\t\t\t\t\t~ Damaged boll should be picked separately and discarded for seed purpose.");
    }
 
    @Override
    
    void Nagraj() {
        
        System.out.println("\n\t\t\t\t\t\tName              : Nagraj BGII Cotton Seeds");
        System.out.println("\t\t\t\t\t\tUsage/Application : Seeds can be directly seeded into your garden, or seeded indoors for transplanting later.");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 730 / Packet");
        System.out.println("\t\t\t\t\t\tUnits             : 570 gm");
    }
    
    @Override
            
    void Narmada() {
    	System.out.println("\n\t\t\t\t\t\tName      : Narmada -1125 Cotton Seeds");
        System.out.println("\t\t\t\t\t\tPrice     : Rs. 730 / Pouch");
        System.out.println("\t\t\t\t\t\tPack type : Packet");        
    }
    
    @Override
    
    void Alpha() {
        System.out.println("\n\t\t\t\t\t\tName          : Ema Gold Emamectin Benzoate 5% SG");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 2500 / Kg");
        System.out.println("\t\t\t\t\t\tPachaging Size: 1 Kg");
        System.out.println("\t\t\t\t\t\tDosage        : 100gms in 200litres of water per acre");
        
    }
    
    @Override
    
    void Amrut() {
        System.out.println("\n\t\t\t\t\t\tName          : Cotton Grow (Cotton Special) Multi Micro Nutrient Mixture");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 650 / Litre");
        System.out.println("\t\t\t\t\t\tPachaging Size: 1 Litre");
        System.out.println("\t\t\t\t\t\tDosage        : 7.5N : 5P : 19K + 9Ca + 2.5Mg (Micro nutrient mixture for Foliar application)");
    }
    
    void Hybrid_Cotton_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        Cotton c3=new Cotton();
        while (true) {
            System.out.println("\n\t\t\t\t\t\t**** Select Brand for hybrid of Sweeet cotton *****");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Nagraj");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Narmada");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: c3.Nagraj(); break;
                case 2: c3.Narmada(); break;
                case 3: c3.Cotton(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
 
    void Cotton_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t**** Select Brand for pesticides of Sweet cotton ****");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Alpha");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Amrut");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            Cotton c4=new Cotton();
            
            switch (choose) {
                case 1: c4.Alpha(); break;
                case 2: c4.Amrut(); break;
                case 3: c4.Cotton(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
 
    void Cotton() {
        Scanner scan = new Scanner(System.in);
        int choose;
        Cotton c2=new Cotton();
        while(true) {
            System.out.println("\n\t\t\t\t\t\t***** Which information do you need? ******");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Hybrid Cotton seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: c2.Cotton_detail(); break;
                case 2: c2.Hybrid_Cotton_Seeds(); break;
                case 3: c2.Cotton_pesticides(); break;
                case 4: project.Sum(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
}
