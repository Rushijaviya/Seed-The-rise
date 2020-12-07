import java.util.*;

abstract public class Winter {
    public static void Wheat() {
        Scanner scan = new Scanner(System.in);
        int choose;    
        while(true) {
            System.out.println("\n\t\t\t\t\t\t************** Which information do you need? **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Hybrid Wheat seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            switch (choose) {
                case 1: Winter.Wheat_detail(); break;
                case 2: Winter.Hybrid_Wheat_Seeds(); break;
                case 3: Winter.Wheat_pesticides(); break;
                case 4: project.Wt(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
 
    public static void Wheat_detail() {        
        
        /*Introduction to Wheat*/
 
        System.out.println("\n\t\t\t\t\t\t*************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Wheat *");
        System.out.println("\t\t\t\t\t\t*************************");
        System.out.println("\n\t\t\t\t\t\t~ Wheat is the main cereal crop and mainly a rabi season crop in India. \n\t\t\t\t\t\t~ Wheat is a good source of manganese, and  magnesium in its unrefined state. \n\t\t\t\t\t\t~ wheat is the staple food for Indians in the Northern and Western parts of India.");
        System.out.println("\t\t\t\t\t\t~ Wheat can tolerate severe cold and snow and resume growth with the setting in of warm weather in spring . \n\t\t\t\t\t\t~ The optimum temperature range for ideal germination of wheat seed is 20°C to 25°C. ");
        System.out.println("\t\t\t\t\t\t~ Wheat is grown in wide range of soils in India. ");
        System.out.println("\t\t\t\t\t\t~ Best sowing time for wheat plantation is from November to December.");        
        System.out.println("\t\t\t\t\t\t~ It was demonstrated that 120 kg nitrogen, 60 kg phosphorus and 30 kg potash per hectare were required for optimum productivity. \n\t\t\t\t\t\t~ Row to row spacing should be 23 to 24 cm.");
        System.out.println("\t\t\t\t\t\t~ The wheat crop is harvested after the straw becomes dry ,brittle and wheat grains harden. \n\t\t\t\t\t\t~ The grains should be thoroughly dried before storage. ");
    }
 
    public static void Hybrid_Wheat_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t************** Select Brand for hybrid of bajra **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Lok");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Pratham");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Winter.Lok(); break;
                case 2: Winter.Pratham(); break;
                case 3: Winter.Wheat(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
 
    public static void Wheat_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t************** Select Brand for pesticides of Wheat **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Vitavax");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Weedmar ");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Winter.Vitavax(); break;
                case 2: Winter.Weedmar(); break;
                case 3: Winter.Wheat(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
    
    public static void Lok() {
        System.out.println("\n\t\t\t\t\t\tName       : Lok - 1 Wheat Seeds");
        System.out.println("\t\t\t\t\t\tPrice      : Rs. 30 / Pouch");
        System.out.println("\t\t\t\t\t\tPack type  : Bag");
        System.out.println("\t\t\t\t\t\tSpeciality : Uniform size, quality cultivation, Hygienically processed, Oblong Shape");
    }
 
    public static void Pratham() {
        System.out.println("\n\t\t\t\t\t\tName               : Pratham 7070 Wheat Seed");
        System.out.println("\t\t\t\t\t\tUsage/Application  : Hybrid wheat");
        System.out.println("\t\t\t\t\t\tPrice              : Rs. 1500 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size     : 15 Kilogram");
        System.out.println("\t\t\t\t\t\tPackage Type       : HDPE Bag");
    }
 
    public static void Vitavax() {
        System.out.println("\n\t\t\t\t\t\tName           : Dhanuka Vitavax Power Fungicide");
        System.out.println("\t\t\t\t\t\tPrice          : Rs. 2005 / Packet");
        System.out.println("\t\t\t\t\t\tState          : Liquid");
        System.out.println("\t\t\t\t\t\tDosage         : 3 g/acre");
        System.out.println("\t\t\t\t\t\tPackaging Size : 10 g / 100 g / 250 g / 500 g / 1 Kg ");
        System.out.println("\t\t\t\t\t\tFeatures       : Control seed and soil borne diseases.");
    }
 
    public static void Weedmar() {
        System.out.println("\n\t\t\t\t\t\tName           : Weedmar Super Herbicide");
        System.out.println("\t\t\t\t\t\tPrice          : Rs. 471 / Litre");
        System.out.println("\t\t\t\t\t\tState          : Liquid");
        System.out.println("\t\t\t\t\t\tPackaging Size : 250 ml / 500 ml / 1 Lt / 2.5 Lt / 5 Lt");
        System.out.println("\t\t\t\t\t\tDosage         : 600 ml/acre");
        System.out.println("\t\t\t\t\t\tContent        : Alkaloid and salt of fatty acid with mixture of wild plant oil");
        System.out.println("\t\t\t\t\t\tFunction       : To control broad leaf weeds, Cyperus sp ");   
    }
    
    abstract  void Barley();
    abstract  void Barley_detail();
    abstract  void Hybrid_Barley_Seeds();    
    abstract  void AGRO();
    abstract  void Imperial();
    abstract  void Nomite();
    abstract  void Bond();
    abstract  void Barley_pesticides();
}
 
class Barley extends Winter{
    @Override
    void Barley() {
        Scanner scan = new Scanner(System.in);
        int choose;
        Barley c2=new Barley();
        while(true) {
            System.out.println("\n\t\t\t\t\t\t************** Which information do you need? **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Hybrid Barley seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            switch (choose) {
                case 1: c2.Barley_detail(); break;
                case 2: c2.Hybrid_Barley_Seeds(); break;
                case 3: c2.Barley_pesticides(); break;
                case 4: project.Wt(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
 
    @Override
    void Barley_detail() {
 
        //Introduction to Barley
        
        System.out.println("\n\t\t\t\t\t\t*************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Barley *");
        System.out.println("\t\t\t\t\t\t*************************");
        System.out.println("\t\t\t\t\t\t~ Barley (Hordeum vulgare L.) is popularly known as “Jau”. ");
        System.out.println("\t\t\t\t\t\t~ Barley is an edible annual grass in the family Poaceae grown as a cereal grain crop. \n\t\t\t\t\t\t~ Barley is the fourth largest grain crop globally, after wheat, rice, and corn.");
        System.out.println("\t\t\t\t\t\t~ Barley has a nutlike flavour and is high in carbohydrates.");       
        System.out.println("\t\t\t\t\t\t~ Barley is mostly cultivated in sandy to moderately heavy loam soils. \n\t\t\t\t\t\t~ The crop requires around 12-15°C temperature during growing period and around 30-32°C at maturity.");
        System.out.println("\t\t\t\t\t\t~ Barley crop is tolerant to drought and can survive in high temperatures. "); 
        System.out.println("\t\t\t\t\t\t~ Barley crop will be ready for harvesting by end of the March to mid of April. ");      
        System.out.println("\t\t\t\t\t\t~ The average yield of rain fed crop ranges between 2,000 and 2,500 kg/ha.");
        System.out.println("\t\t\t\t\t\t~ Row spacing for irrigated situation should be 22.5cm and 22.5 to 25 cm for rainfed situation. \n\t\t\t\t\t\t~ Depth of sowing must be 5cm under irrigated situation, whereas, in rainfed condition it should be 6- 8cm. ");
    }
 
    @Override   
    void Hybrid_Barley_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        Barley c3=new Barley();
        while (true) {
            System.out.println("\n\t\t\t\t\t\t************** Select Brand for hybrid of Barley **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. AGRO");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Imperial");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: c3.AGRO(); break;
                case 2: c3.Imperial(); break;
                case 3: c3.Barley(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
 
    @Override        
    void Barley_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t************** Select Brand for pesticides of Barley **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Nomite");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Bond");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Go Back");
            choose=scan.nextInt();
            Barley c4=new Barley();
            switch (choose) {
                case 1: c4.Nomite(); break;
                case 2: c4.Bond(); break;
                case 3: c4.Barley(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
 
    @Override    
    void AGRO() {
        System.out.println("\n\t\t\t\t\t\tName       : R R AGRO Barley Seeds");
        System.out.println("\t\t\t\t\t\tPrice      : Rs. 140 / Pouch");
        System.out.println("\t\t\t\t\t\tPack type  : Packet");
        System.out.println("\t\t\t\t\t\tSpeciality : A very high fiber content, vitamins and minerals, antioxidants, heart health and diabetes protection.");
    }
 
    @Override    
    void Imperial() {
        System.out.println("\n\t\t\t\t\t\tName       : Imperial Malt Yellow Barley Seeds");
        System.out.println("\t\t\t\t\t\tPrice      : Rs. 50 / Pouch");
        System.out.println("\t\t\t\t\t\tPack type  : PP bag");
        System.out.println("\t\t\t\t\t\tSpeciality : Yellow Appearance, 15-28 Degree C Growing Temperature, heart health.");
    }
 
    @Override
    void Nomite() {
        System.out.println("\n\t\t\t\t\t\tName           : Nomite Bio Insecticide");
        System.out.println("\t\t\t\t\t\tPrice          : Rs. 1100 / Litre");
        System.out.println("\t\t\t\t\t\tState          : Liquid");
        System.out.println("\t\t\t\t\t\tDose           : 1.0 to 1.35 ml per litre of water ");
        System.out.println("\t\t\t\t\t\tFeatures       : To control White Fly");
    }
 
    @Override
    void Bond() {
        System.out.println("\n\t\t\t\t\t\tName           : Bond Bio Pesticide");
        System.out.println("\t\t\t\t\t\tPrice          : Rs. 750/Litre");
        System.out.println("\t\t\t\t\t\tState          : Liquid");
        System.out.println("\t\t\t\t\t\tUsage/         : Agriculture ");
        System.out.println("\t\t\t\t\t\tFeatures       : Long shelf life, High purity, Bio Pollar Spray For Insect Pest Control ");
    }
}