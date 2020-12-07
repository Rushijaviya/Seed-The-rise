import java.util.*;
abstract public class Fruits {
	public static void Mango() {
        Scanner scan = new Scanner(System.in);
        int choose;
    
        while(true) {
            System.out.println("\n\t\t\t\t\t\t************* Which information do you need? **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Mango seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Fruits.Mango_detail(); break;
                case 2: Fruits.Mango_Seeds(); break;
                case 3: Fruits.Mango_pesticides(); break;
                case 4: project.Fru(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
	}
    public static void Mango_detail() {
        
        /*Introduction to Mango*/
        
        System.out.println("\n\t\t\t\t\t\t*************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Mango *");
        System.out.println("\t\t\t\t\t\t*************************");
        
        System.out.println("\n\t\t\t\t\t\t~ Mango is basically a tropical plant but endures wide range of temperature.It grows well under tropical and sub-tropical conditions. \t\t\t\t\t\t~ The mango flowers and fruits during dry season, which is characterized by absence of rainfall.");
        
        /*Health benefits of Mango*/
        
        System.out.println("\t\t\t\t\t\t~ Mango helps in fighting cancer. Mango helps in cleansing skin.");
        
       
        System.out.println("\t\t\t\t\t\t~ The ideal temperature range for mango is 24 -30 C during the growing season, along with high humidity.  \n\t\t\t\t\t\t~ A rainfall range of 890-1,015 mm in a year is considered as ideal for growing mangoes.  ");
        
        System.out.println("\t\t\t\t\t\t~ Mango grows well on wide variety of soils, such as lateritic,alluvial, sandy loam and sandy.   \n\t\t\t\t\t\t~ The loamy, alluvial, well-drained, aerated and deep soils (2-2.5 m) rich in organic matter with a pH range of 5.5-7.5 are \n\t\t\t\t\t\t  ideal for mango cultivation.");
        
        System.out.println("\t\t\t\t\t\t~ INSECT PESTS:\t1.Mango Hoppers(Idioscopus clypealis, I.nitidulus and Amritodus atkinsoni)\t2.shoot borer");
        
        
       System.out.println("\t\t\t\t\t\t~ Mango is harvested 120 days after flower induction. \n\t\t\t\t\t\t~ Mangoes are hand-harvested, simply by snapping-off fruits from peduncles in less-developed plantings, or by clipping peduncles 4 \n\t\t\t\t\t\t  inches above the fruit when intended for export.  \n\t\t\t\t\t\t~ The mature green fruits can be kept at room temperature for about 4-10 days depending upon the variety. Shelf life of fruits could \t\t\t\t\t\t  be extended by precooling, chemical treatments, low temperature, etc.");
        
    }
    
    public static void Mango_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t************ Select Brand for hybrid of Mango *************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. GREEN INDIA");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. LIFERR ");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Fruits.gi(); break;
                case 2: Fruits.lom(); break;
                case 3: Fruits.Mango(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    public static void Mango_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t********** Select Brand for pesticides of Mango ***********");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Confidor");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Phoskill");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Fruits.Conf(); break;
                case 2: Fruits.Pos(); break;
                case 3: Fruits.Mango(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    public static void gi() {
        System.out.println("\n\t\t\t\t\t\tName      : GREEN INDIA SEEDS MANGO Seed");
        System.out.println("\t\t\t\t\t\tPrice     : 150 Rs/packet ");
        System.out.println("\t\t\t\t\t\tPack quantity : 20 seeds");
    }
    public static void lom() {
        System.out.println("\n\t\t\t\t\t\tName              : LIFERR Organic Mango Seed");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 400 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size    : 0.5 Kilogram");
      }
    
    public static void Conf() {
        System.out.println("\n\t\t\t\t\t\tName          : Confidor");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 800 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tContent       : Imidaclopride 17.8 % SL");
        System.out.println("\t\t\t\t\t\tFunction      : Imidacloprid acts on several types of post-synaptic nicotinic acetylcholine receptors in the nervous system. ...\n\t\t\t\t\t\t Following binding to the nicotinic receptor, nerve impulses are spontaneously discharged at first, \n\t\t\t\t\t\t followed by failure of the neuron to propagate any signal.");
        
    }
    public static void Pos() {
        System.out.println("\n\t\t\t\t\t\tName          : Phoskill");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 350 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tFeatures      : Monocrotophos is a systemic and contact poison. As an organophosphate, monocrotophos exerts its toxic action \n\t\t\t\t\t\t by inhibiting certain important enzymes of the nervous system (cholinesterase).");
    }



    public static void Pomogranate() {
        Scanner scan = new Scanner(System.in);
        int choose;
    
        while(true) {
            System.out.println("\n\t\t\t\t\t\t************* Which information do you need? **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Pomogranate seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Fruits.Pomogranate_detail(); break;
                case 2: Fruits.Pomogranate_Seeds(); break;
                case 3: Fruits.Pomogranate_pesticides(); break;
                case 4: project.Fru(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
	}
    public static void Pomogranate_detail() {
        
        /*Introduction to Pomogranate*/
        
        System.out.println("\n\t\t\t\t\t\t*******************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Pomogranate *");
        System.out.println("\t\t\t\t\t\t*******************************");
        
        System.out.println("\n\t\t\t\t\t\t~ The pomegranate (Punica granatum) is a fruit-bearing deciduous shrub in the family Lythraceae, subfamily Punicoideae, that grows \n\t\t\t\t\t\t  between 5 and 10 m (16 and 33 ft) tall.");
        
        System.out.println("\t\t\t\t\t\t~ Pomogranate thins your blood. Pomogranate fights heart disease and prostate cancer.");
        System.out.println("\t\t\t\t\t\t~ Hot and dry climate during fruit development improves its fruit quality.   \n\t\t\t\t\t\t~ The plants are affected if the temperature remains below 11 degree C for a longer time. ");
        System.out.println("\t\t\t\t\t\t~ Pomegranate can be grown on a wide range of soils."); 
        System.out.println("\t\t\t\t\t\t~ However, it grows well in medium deep, loamy and well-drained soils having a pH of 7.5.   ");
        
        System.out.println("\t\t\t\t\t\t~ INSECT PESTS: \t1.Anar butter fly \t2.whitefly");
       System.out.println("\t\t\t\t\t\t~ Pomegranate plants take 4-5 years to come into bearing.   \n\t\t\t\t\t\t~ At maturity, the fruits turn yellowish-red and get suppressed on sides.   \n\t\t\t\t\t\t~ The fruits become ready for picking 120-130 days after fruit set.");
        
    }
    
    public static void Pomogranate_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t************ Select Brand for hybrid of Pomogranate *************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Creative Farmer Pomegranate Seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Shudh Online Pomegranate Seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Fruits.cfp(); break;
                case 2: Fruits.sop(); break;
                case 3: Fruits.Pomogranate(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    public static void Pomogranate_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t********** Select Brand for pesticides of Pomogranate ***********");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Cythion");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Polo");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Fruits.Cyt(); break;
                case 2: Fruits.Pol(); break;
                case 3: Fruits.Pomogranate(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    public static void cfp() {
        System.out.println("\n\t\t\t\t\t\tName      : Creative Farmer Pomegranate Seeds");
        System.out.println("\t\t\t\t\t\tPrice     : 200 Rs/packet ");
        System.out.println("\t\t\t\t\t\tPack quantity : 50 seeds");
    }
    public static void sop() {
        System.out.println("\n\t\t\t\t\t\tName          : Shudh Online Pomegranate Seeds");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 450 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size    : 100 seeds");
      }
    
    public static void Cyt() {
        System.out.println("\n\t\t\t\t\t\tName          : Cythion");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 400 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tContent       : Melathion 50 % EC");
        System.out.println("\t\t\t\t\t\tFunction      : Malathion exerts its action on the nervous system of the pest by irreversibly inhibiting the activity of \t\t\t\t\t\t\t cholinesterase, thereby allowing acetylcholine to accumulate at cholinergic synapses and enhancing cholinergic receptor stimulation.\t\t\t\t\t\t This eventually leads to the pest's death.");
        
    }
    public static void Pol() {
        System.out.println("\n\t\t\t\t\t\tName          : Polo");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 350 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Powder");
        System.out.println("\t\t\t\t\t\tContent       : Difenthiuron 50 % WP");
        System.out.println("\t\t\t\t\t\tFeatures      :Diafenthiuron has a novel mode of action: Inhibition of mitochondrial respiration by its carbodiimide product.");
    }
    


    public static void Strawberry() {
        Scanner scan = new Scanner(System.in);
        int choose;
    
        while(true) {
            System.out.println("\n\t\t\t\t\t\t************* Which information do you need? **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Strawberry seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Fruits.Strawberry_detail(); break;
                case 2: Fruits.Strawberry_Seeds(); break;
                case 3: Fruits.Strawberry_pesticides(); break;
                case 4: project.Fru(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
	}
    public static void Strawberry_detail() {
        
        /*Introduction to Strawberry*/
        
        System.out.println("\n\t\t\t\t\t\t******************************");
        System.out.println("\t\t\t\t\t\t* Introduction to Strawberry *");
        System.out.println("\t\t\t\t\t\t******************************");
        
        System.out.println("\n\t\t\t\t\t\t~ The garden strawberry is a widely grown hybrid species of the genus Fragaria, collectively known as the strawberries, which are \n\t\t\t\t\t\t  cultivated worldwide for their fruit. \n\t\t\t\t\t\t~ The fruit is widely appreciated for its characteristic aroma, bright red color, juicy texture, and sweetness.");
        System.out.println("\t\t\t\t\t\t~ Strawberry help protect your heart.Strawberry can boost your immunity.");
        System.out.println("\t\t\t\t\t\t~ Strawberries want to flower and come to harvest in cool to warm weather. \n\t\t\t\t\t\t~ The ideal temperature for strawberry growing is 60°F to 80°F; those temperaturest allow strawberries to develop strong roots and \n\t\t\t\t\t\t  take up nutrients necessary to produce lots of flowers and fruit.  ");
        System.out.println("\t\t\t\t\t\t~ Like most garden plants, strawberries prefer a 'loam' soil, a soil-type made up of roughly equal amounts of clay;\n\t\t\t\t\t\t  sand (small-grain size); and silt, or organic matter.");
        System.out.println("\t\t\t\t\t\t~ INSECT PESTS: \t1.Strawberry bud weevil (clipper) \t2.Eastern flower thrip");
       System.out.println("\t\t\t\t\t\t~ Pick when strawberries are bright to dark red, depending on variety.\n\t\t\t\t\t\t~ Precooling (rapid removal of field heat) is essential within 1‑2 hours of harvest.  \n\t\t\t\t\t\t~ Optimum storage conditions for strawberries (7‑10 days) is 0°C and 90‑95% relative humidity.");
        
    }
    
    public static void Strawberry_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {
            System.out.println("\n\t\t\t\t\t\t************ Select Brand for  Strawberry *************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. FRESHO");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. LIVE GREEN ");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: Fruits.fr(); break;
                case 2: Fruits.lig(); break;
                case 3: Fruits.Strawberry(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    public static void Strawberry_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t********** Select Brand for pesticides of Strawberry ***********");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Durshban");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Regent");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: Fruits.Dr(); break;
                case 2: Fruits.Reg(); break;
                case 3: Fruits.Strawberry(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    public static void fr() {
        System.out.println("\n\t\t\t\t\t\tName      : FRESHO Strawberry Seed");
        System.out.println("\t\t\t\t\t\tPrice     : 190 Rs/packet ");
        System.out.println("\t\t\t\t\t\tPack quantity : 40 seeds");
    }
    public static void lig() {
        System.out.println("\n\t\t\t\t\t\tName              :LIVE GREEN Strawberry Seeds");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 400 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size    :100 Seeds");
      }
    
    public static void Dr() {
        System.out.println("\n\t\t\t\t\t\tName          : Durshban");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 370 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tContent       : Chlorpyriphos 50 % Ec");
        System.out.println("\t\t\t\t\t\tFunction      : Chlorpyrifos affects the nervous system by inhibiting the breakdown of acetylcholine (ACh), a neurotransmitter. When \t\t\t\t\t\tinsects are exposed, chlorpyrifos binds to the active site of the cholinesterase (ChE) enzyme, which prevents breakdown of ACh in the \t\t\t\t\t\tsynaptic cleft.");
        
    }
    public static void Reg() {
        System.out.println("\n\t\t\t\t\t\tName          : Regent");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 550 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tContent       : Fipronil 5 % SC");
        System.out.println("\t\t\t\t\t\tFeatures      : Fipronil blocks GABAA-gated chloride channels in the central nervous system. Disruption of the GABAA receptors by \t\t\t\t\t\tfipronil prevents the uptake of chloride ions resulting in excess neuronal stimulation and death of the target insect.");
    }

    public static void ekl() {
        System.out.println("\n\t\t\t\t\t\tName          : Ekalux");
        System.out.println("\t\t\t\t\t\tPrice         : Rs. 280 / Litre");
        System.out.println("\t\t\t\t\t\tState         : Liquid");
        System.out.println("\t\t\t\t\t\tContent       : Quinalphos 25 % EC");
        System.out.println("\t\t\t\t\t\tFunction      : Quinalphos is a highly effective insecticide with contact and stomach action.");
           }
    public static void rg() {
            System.out.println("\n\t\t\t\t\t\tName          : Rogor");
            System.out.println("\t\t\t\t\t\tPrice         : Rs. 300 / Litre");
            System.out.println("\t\t\t\t\t\tState         : Liquid");
            System.out.println("\t\t\t\t\t\tContent       : Dimethoate 30 % EC");
            System.out.println("\t\t\t\t\t\tFunction      : Dimethoate is a widely used organophosphate insecticide and acaricide. ... Like other organophosphates, dimethoate is \t\t\t\t\t\tan acetylcholinesterase inhibitor which disables cholinesterase, an enzyme essential for central nervous system function.");
            
        }

    abstract  void grapesq();
    abstract  void grapes_detail();
    abstract  void grapes_Seeds();    
    abstract  void Ros();
    abstract  void gene();
    abstract  void grapes_pesticides();
}
class grapes extends Fruits{
    
    @Override
    
    void grapes_detail() {
        /*Introduction to grapes*/
        
	System.out.println("\n\t\t\t\t\t\t**************************");
        System.out.println("\t\t\t\t\t\t* Introduction to grapes *");
        System.out.println("\t\t\t\t\t\t**************************");
        
        System.out.println("\n\t\t\t\t\t\t~ A grape is a fruit, botanically a berry, of the deciduous woody vines of the flowering plant genus Vitis.  \n\t\t\t\t\t\t~ Grapes can be eaten fresh as table grapes or they can be used for making wine, jam, grape juice, jelly, grape seed extract,\n\t\t\t\t\t\t  raisins, vinegar, and grape seed oil. ");
        System.out.println("\t\t\t\t\t\t~ Grapes are good for eye Protection.Grapes Keep blood Sugar low.Grapes are good for Brain.");
        System.out.println("\t\t\t\t\t\t~ It is successfully grown in areas where the temperature range is from 15-40 degree C. \n\t\t\t\t\t\t~ The fruitfulness of buds is influenced by light. Light intensity of 2,400-ft. candle is essential for optimum growth. \n\t\t\t\t\t\t~ Area with annual rainfall not exceeding 900mm well distributed throughout the year is ideal. ");
       System.out.println("\t\t\t\t\t\t~ Grapes can be cultivated in variety of soils including sandy loams, sandy clay loams, red sandy soils,shallow to medium black soils \t\t\t\t\t\t  and red loams. Grapes can also be grown successfully over a wide range of soil pH (4.0-9.5) however, soils having pH range of \n\t\t\t\t\t\t  6.5-8.0 are considered ideal. ");
        System.out.println("\t\t\t\t\t\t~ INSECT PESTS:\t1.Stem Gridler \t2.Mealy bug");
        System.out.println("\t\t\t\t\t\t~ Process grapes as soon as possible for the best flavor and nutrient value. \n\t\t\t\t\t\t~ Store surplus grapes in the refrigerator in a perforated plastic bag for up to two weeks. \n\t\t\t\t\t\t~ So enjoy the harvest while adding a bit of Vitamin C and potassium to your diet.");
        
    }
 
    @Override
    
    void Ros() {
        System.out.println("\n\t\t\t\t\t\tName      :Rosmeric grapes seed");
        System.out.println("\t\t\t\t\t\tPrice     : Rs. 100 / Pouch");
        System.out.println("\t\t\t\t\t\tPackaging size    : 20 Seeds");
        }
    
    @Override
            
    void gene() {
        System.out.println("\n\t\t\t\t\t\tName              : Generic GRAPE Seed ");
        System.out.println("\t\t\t\t\t\tPrice             : Rs. 150 / Packet");
        System.out.println("\t\t\t\t\t\tPackaging size    : 40 Seeds");
        }
    
    @Override
            
    void grapes_Seeds() {
        Scanner scan = new Scanner(System.in);
        int choose;
        grapes c3=new grapes();
        while (true) {
            System.out.println("\n\t\t\t\t\t\t********* Select Brand of grapes **********");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. ROSEMERC");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Generic");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();              
            switch (choose) {
                case 1: c3.Ros(); break;
                case 2: c3.gene(); break;
                case 3: c3.grapesq(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
 
    @Override
            
    void grapes_pesticides() {
        Scanner scan = new Scanner(System.in);
        int choose;
        while (true) {      
            System.out.println("\n\t\t\t\t\t\t******** Select Brand for pesticides of grapes ********");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Ekalux");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Rogor");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            choose=scan.nextInt();
            grapes c4=new grapes();
            
            switch (choose) {
                case 1: Fruits.ekl(); break;
                case 2: Fruits.rg(); break;
                case 3: c4.grapesq(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
 
    @Override
    
    void grapesq() {
        Scanner scan = new Scanner(System.in);
        int choose;
        grapes c2=new grapes();
        while(true) {
            System.out.println("\n\t\t\t\t\t\t************* Which information do you need? **************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Detail for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Grapes seeds");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Pesticides for this crop");
            System.out.println("\n\t\t\t\t\t\t\t\t  4. Go Back");
            choose=scan.nextInt();
            
            switch (choose) {
                case 1: c2.grapes_detail(); break;
                case 2: c2.grapes_Seeds(); break;
                case 3: c2.grapes_pesticides(); break;
                case 4: project.Fru(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
}
