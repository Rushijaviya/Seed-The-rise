import java.util.*; 
abstract public class Monsoon {
    public static void Bajra() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while(true) {
            System.out.println("\n\t\t\t\t\t\t***** Which information do you need? ******");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Hybrid bajra seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Monsoon.Bajra_detail(); break;
                case 2: Monsoon.Hybrid_Bajra_Seeds(); break;
                case 3: Monsoon.Bajra_pesticides(); break;
                case 4: project.Ms(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
    public static void Bajra_detail() {
        
        /*Introduction to Bajra*/
        
        System.out.println("\n\t\t\t\t\t\t*************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Bajra *");
        System.out.println("\t\t\t\t\t\t*************************");
        
        System.out.println("\n\t\t\t\t\t\t~ Bajra is known also as PEARL MILLET and it belongs to the family of gramineae. \n\t\t\t\t\t\t~ Bajra is a coarse grain crop and considered as poor man's staple. \n\t\t\t\t\t\t~ Bajra cultivates in drylands.");
    
        System.out.println("\t\t\t\t\t\t~ Warm weather and dry climate are suitable for Bajra cultivation. \n\t\t\t\t\t\t~ The optimum temprature range for the growth of bajra is between 20°C to 28°C");
        System.out.println("\t\t\t\t\t\t~ Bajra can be grown on a wide variety of soils. ");
        System.out.println("\t\t\t\t\t\t~ Most appropriate time of sowing is middle or last week of July");
        
        System.out.println("\t\t\t\t\t\t~ 4-5 kg/ha for drilling method and 2.5-3 kg/ha for dibbling method.. \n\t\t\t\t\t\t~ spacing 40 –45 cm between rows, 10 –15 cm within rows.");
        
        System.out.println("\t\t\t\t\t\t~ Harvest this crop after 90-95 days. \n\t\t\t\t\t\t~ Proper drying and staking before threshing with rollers or bullocks is advised.  \n\t\t\t\t\t\t~ Threshing may be done eitherby beating the ear heads with sticks or by trampling the ear heads under. "); 
        
        
    }
    
    public static void Hybrid_Bajra_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t***** Select Brand for hybrid of bajra ******");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Sikko");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. AHS ");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Monsoon.sikko(); break;
                case 2: Monsoon.ahs(); break;
                case 3: Monsoon.Bajra(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
    
    public static void Bajra_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t**** Select Brand for pesticides of bajra *****");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Sikko");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Queen");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Monsoon.sikko_Pes(); break;
                case 2: Monsoon.queen(); break;
                case 3: Monsoon.Bajra(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
    
    public static void sikko() {
        System.out.println("\n\t\t\t\t\t\tName      : Sikko Vakil-350 Bajra Seeds");
        System.out.println("\t\t\t\t\t\tPrice     : Rs. 120 / Pouch");
        System.out.println("\t\t\t\t\t\tPack type : Packet");
        System.out.println("\t\t\t\t\t\tSpeciality: High in Protein, No Artificial Flavour, No Genetic Engineering, No Preservatives, Organic");
    }
    public static void ahs() {
        System.out.println("\n\t\t\t\t\t\tName              : AHS Hybrid Bajra Gold");
        System.out.println("\t\t\t\t\t\tUsage/Application : Hybrid bajra");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 400 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size    : 1-50 Kilogram");
        System.out.println("\t\t\t\t\t\tPackage Type      : Plastic bag, Packets, Gunny Bags");
    }
    
    public static void sikko_Pes() {
        System.out.println("\n\t\t\t\t\t\tName          : Sikko Yellow Khanjar Organic Pesticide");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 3,754 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tPachaging Size: 50 ml / 100 ml / 250 ml / 500 ml / 1 Lt / 5 Lt");
        System.out.println("\t\t\t\t\t\tContent       : Alkaloid and salt of fatty acid with mixture of wild plant oil");
        System.out.println("\t\t\t\t\t\tFunction      : To control Helliothis, Spodoptera and other larva");
        
    }
    
    public static void queen() {
        System.out.println("\n\t\t\t\t\t\tName          : Queen Agricultural Pesticides");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 1,790 / Bottle");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tPurity        : 99%");
        System.out.println("\t\t\t\t\t\tPachaging Size: 1Lt");
        System.out.println("\t\t\t\t\t\tFeatures      : Control insects, weeds, fungi");
    }
    
    abstract  void Sweet_Corn();
    abstract  void Sweet_Corn_detail();
    abstract  void Hybrid_Sweet_Corn_Seeds();    
    abstract  void Splendour();
    abstract  void Omaxe();
    abstract  void Sweet_Corn_pesticides();
}
class corn extends Monsoon{
    
    @Override
    
    void Sweet_Corn_detail() {
        //Introduction to Sweet Corn
        
    	System.out.println("\n\t\t\t\t\t\t******************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Sweet Corn *");
        System.out.println("\t\t\t\t\t\t******************************");
        
        System.out.println("\n\t\t\t\t\t\t~ Sweet corn is also called as MAIZE and it belongs to the family of grass. \n\t\t\t\t\t\t~ In India, maize or corn is the third most important food cash crops after wheat & rice.");
      
        System.out.println("\t\t\t\t\t\t~ Sweet Corn helps in gaining weight.");
        System.out.println("\t\t\t\t\t\t~ Sweet Corn is Energy Enhancer and Helpful during Pregnancy.");
        
        /*Climate and Soil for Sweet Corn*/
       
        System.out.println("\t\t\t\t\t\t~ Corn does best with warm, sunny growing weather (75–86° F) well-distributed intermittent moderate rains, or\n\t\t\t\t\t\t  irriga­tion (15 or more inches during the growing season) \n\t\t\t\t\t\t~ Corn can take from 60 to 100 days to reach harvest depending upon variety and the amount of heat during the\n\t\t\t\t\t\t  growing season");
 
        System.out.println("\t\t\t\t\t\t~ Sweet Corn can tolerate many soil types but prefers well-drained soils with a pH between 5.5 and 7.0. \n\t\t\t\t\t\t~ sweet corn is to be grown at a field isolation of 250 m from other corn or by a tassel date of 14 days.");
       
        
        System.out.println("\t\t\t\t\t\t~ The planting time of Sweet Corn is June-July ");
      
        System.out.println("\t\t\t\t\t\t~ plant population for optimum yield is 45000-60000 plants per hectare with row spacing of 75-100 cm and intra\n\t\t\t\t\t\t  row spacing of 15-30 cm.");
        
        /*Pests of National Significance For Sweet Corn*/
        
        
        
        System.out.println("\t\t\t\t\t\t~ Corn is ready for harvest about 3 weeks after the tassel grows on top of the corn plant. \n\t\t\t\t\t\t~ The best time to pick corn is in the early morning or evening when it is cool.  \n\t\t\t\t\t\t~ Watch the corn closely because the quality changes fast.");
        
    }
 
    @Override
    
    void Splendour() {
        System.out.println("\n\t\t\t\t\t\tName      : Splendour Seeds Sweet Corn vegetable seeds");
        System.out.println("\t\t\t\t\t\tPrice     : Rs. 100 / Pouch");
        System.out.println("\t\t\t\t\t\tPack type : Packet");
        System.out.println("\t\t\t\t\t\tSpeciality: Tender with superior flavour and colour, grows upto to 4 to 5 feet, Colour of the kernel is Cream yellow");
    }
    
    @Override
            
    void Omaxe() {
        System.out.println("\n\t\t\t\t\t\tName              : Omaxe Seeds Sweet Corn Hybrid");
        System.out.println("\t\t\t\t\t\tUsage/Application : Hybrid Sweet Corn");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 250 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size    : 90 Seeds");
        System.out.println("\t\t\t\t\t\tPackage Type      : Plastic bag, Packets, Gunny Bags");
    }
    
    @Override
            
    void Hybrid_Sweet_Corn_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        corn c3=new corn();
        while (true) {
            System.out.println("\n\t\t\t\t\t\t**** Select Brand for hybrid of Sweeet Corn *****");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Splendour");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Omaxe");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: c3.Splendour(); break;
                case 2: c3.Omaxe(); break;
                case 3: c3.Sweet_Corn(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
 
    @Override
            
    void Sweet_Corn_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t**** Select Brand for pesticides of Sweet Corn ****");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Sikko");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Queen");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            corn c4=new corn();
            
            switch (choose) {
                case 1: Monsoon.sikko_Pes(); break;
                case 2: Monsoon.queen(); break;
                case 3: c4.Sweet_Corn(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
 
    @Override
    
    void Sweet_Corn() {
        Scanner scan = new Scanner(System.in);
        int choose;
        corn c2=new corn();
        while(true) {
            System.out.println("\n\t\t\t\t\t\t***** Which information do you need? ******");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Hybrid Sweet Corn seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: c2.Sweet_Corn_detail(); break;
                case 2: c2.Hybrid_Sweet_Corn_Seeds(); break;
                case 3: c2.Sweet_Corn_pesticides(); break;
                case 4: project.Ms(); break;
                default: System.out.println("\t\t\t\t\t\t****** Please Choose valid choice *******");
            }
        }
    }
}
