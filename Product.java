import java.util.*;

public class Product{
public static int count,count1;
	public static void ListofProducts(){
    	while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("\n\t\t\t\t\t\t****************** Choose any one option ******************");
            System.out.println("\t\t\t\t\t\t                   1. Hybrid Seeds");
            System.out.println("\t\t\t\t\t\t                   2. Pesticides");
            System.out.println("\t\t\t\t\t\t                   3. Go Back");
            int chosen = scan.nextInt();
            if (chosen == 1){
                System.out.println("\n\t\t\t\t\t\t     +----------------------------------------------------------+");
                System.out.println("\t\t\t\t\t\t     |No. |Product(Company)        |Rating| Price(/Kg)          |");
                System.out.println("\t\t\t\t\t\t     |----------------------------------------------------------|");
                System.out.println("\t\t\t\t\t\t     |1.  |Bajra(Sikko)            | 3.1★ | 120/-               |");
                System.out.println("\t\t\t\t\t\t     |2.  |Bajra(ahs)              | 4.2★ | 400/-               |");
                System.out.println("\t\t\t\t\t\t     |3.  |Sweet Corn(Spendour)    | 3.5★ | 100/-               |");
                System.out.println("\t\t\t\t\t\t     |4.  |Sweet Corn(Omaxe)       | 4.8★ | 250/-               |");
                System.out.println("\t\t\t\t\t\t     |5.  |Wheat(Lok)              | 2.8★ | 30/-                |");
                System.out.println("\t\t\t\t\t\t     |6.  |Wheat(Pratham)          | 3.9★ | 1500/-(minimum 15kg)|");
                System.out.println("\t\t\t\t\t\t     |7.  |Barley(Agro)            | 4.1★ | 140/-               |");
                System.out.println("\t\t\t\t\t\t     |8.  |Barley(Iperial)         | 3.4★ | 50/-                |");
                System.out.println("\t\t\t\t\t\t     |9.  |Rice(Basmati)           | 3.3★ | 120/-               |");
                System.out.println("\t\t\t\t\t\t     |10. |Rice(Kalabati)          | 4.1★ | 300/-               |");
                System.out.println("\t\t\t\t\t\t     |11. |Cotton(Nagraj)          | 4.4★ | 1460/-              |");
                System.out.println("\t\t\t\t\t\t     |12. |Cotton(Narmada)         | 4.1★ | 730/-               |");
                System.out.println("\t\t\t\t\t\t     |13. |Mango(GI)               | 3.7★ | 150/-               |");
                System.out.println("\t\t\t\t\t\t     |14. |Mango(LIFERR)           | 4.2★ | 400/-               |");
                System.out.println("\t\t\t\t\t\t     |15. |Pomogranate(Creative)   | 2.6★ | 200/-               |");
                System.out.println("\t\t\t\t\t\t     |16. |Pomogranate(Shudh)      | 3.8★ | 450/-               |");
                System.out.println("\t\t\t\t\t\t     |17. |Strawberry(FRESHO)      | 3.5★ | 190/-               |");
                System.out.println("\t\t\t\t\t\t     |18. |Strawberry(LIVE GREEN)  | 4.3★ | 400/-               |");
                System.out.println("\t\t\t\t\t\t     |19. |Grapes(Rosmeric)        | 2.9★ | 100/-               |");
                System.out.println("\t\t\t\t\t\t     |20. |Grapes(Generic)         | 3.2★ | 150/-               |");
                System.out.println("\t\t\t\t\t\t     +----------------------------------------------------------+");


                int arr[] = {120,400,100,250,30,1500,140,50,120,300,1460,730,150,400,200,450,190,400,100,150};
                
                System.out.println("\n\t\t\t\t\t\t****************** Choose any one option ******************");
                int choose = scan.nextInt();
                if(choose > 20){
                    System.out.println("\n\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
                }
                else{

                System.out.print("\t\t\t\t\t\tHow many Kg/litres of seeds do you want? ");
                int seedz = scan.nextInt();

                int price = arr[choose-1];

                count = price*seedz;
                }
            }
            else if(chosen == 2){
                System.out.println("\n\t\t\t\t\t\t     +--------------------------------------------------------+");
                System.out.println("\t\t\t\t\t\t     |No. |Product(Company)     |Rating| Price(/Kg)           |");
                System.out.println("\t\t\t\t\t\t     |--------------------------------------------------------|");
                System.out.println("\t\t\t\t\t\t     |1.  |Bajra(Sikko)         | 4.7★ | 3754/-               |");
                System.out.println("\t\t\t\t\t\t     |2.  |Bajra(Queen)         | 3.4★ | 1790/-               |");
                System.out.println("\t\t\t\t\t\t     |3.  |Sweet Corn(Sikko)    | 4.5★ | 3754/-               |");
                System.out.println("\t\t\t\t\t\t     |4.  |Sweet Corn(Queen)    | 3.8★ | 1790/-               |");
                System.out.println("\t\t\t\t\t\t     |5.  |Wheat(Vitavax)       | 4.8★ | 2005/-               |");
                System.out.println("\t\t\t\t\t\t     |6.  |Wheat(Weedmar)       | 2.8★ | 471/-                |");
                System.out.println("\t\t\t\t\t\t     |7.  |Barley(Nomite)       | 3.9★ | 1100/-               |");
                System.out.println("\t\t\t\t\t\t     |8.  |Barley(Bond)         | 4.2★ | 750/-                |");
                System.out.println("\t\t\t\t\t\t     |9.  |Rice(Dupont)         | 4.5★ | 13,500/-             |");
                System.out.println("\t\t\t\t\t\t     |10. |Rice(Virtako)        | 4.1★ | 360/-                |");
                System.out.println("\t\t\t\t\t\t     |11. |Cotton(Alpha)        | 4.2★ | 2500-                |");
                System.out.println("\t\t\t\t\t\t     |12. |Cotton(Amrut)        | 4.1★ | 650/-                |");
                System.out.println("\t\t\t\t\t\t     |13. |Mango(Confidor)      | 2.9★ | 800/-                |");
                System.out.println("\t\t\t\t\t\t     |14. |Mango(Phosfill)      | 3.5★ | 350/-                |");
                System.out.println("\t\t\t\t\t\t     |15. |Pomogranate(Cythion) | 4.1★ | 400/-                |");
                System.out.println("\t\t\t\t\t\t     |16. |Pomogranate(Polo)    | 3.7★ | 350/-                |");
                System.out.println("\t\t\t\t\t\t     |17. |Strawberry(Durshban) | 4.2★ | 370/-                |");
                System.out.println("\t\t\t\t\t\t     |18. |Strawberry(Regent)   | 4.5★ | 550/-                |");
                System.out.println("\t\t\t\t\t\t     |19. |Grapes(Ekalux)       | 2.9★ | 280/-                |");
                System.out.println("\t\t\t\t\t\t     |20. |Grapes(Rogor)        | 3.8★ | 300/-                |");
                System.out.println("\t\t\t\t\t\t     +--------------------------------------------------------+");
                
                int array[] = {3754,1790,3754,1790,2005,471,1100,750,13500,360,2500,650,800,350,400,350,370,550,280,300};
                
                System.out.println("\n\t\t\t\t\t\t****************** Choose any one option ******************");
                int chosen_pest = scan.nextInt();
                if(chosen_pest > 20){
                    System.out.println("\n\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
                }
                else{
                System.out.print("\t\t\t\t\t\tHow many Kg/litres of pesticides do you want? ");
                int pest = scan.nextInt();

                int pest_price = array[chosen_pest-1];

                count1 = pest_price*pest;
                }
            }
            else if(chosen == 3){
                project.Pr();
            }
            else{
                System.out.print("\n\t\t\t\t\t\t**************** Please Choose vaild choice *****************");
            }
        }
    }
    
    public static void Expense()
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.print("\n\t\t\t\t\t\tEnter total other expenses: ");
    	int expense=sc.nextInt();
    	System.out.print("\n\t\t\t\t\t\tEnter total production of a crop(in Kg): ");
    	int produce=sc.nextInt();
        System.out.print("\n\t\t\t\t\t\tEnter current price of a crop(per Kg): ");
        int ml=sc.nextInt();
    	int priceofproduct=produce*ml;
        System.out.println("\n\t\t\t\t\t\tThe total price of product produce is "+priceofproduct);
        int count = Product.count;
        int count1 = Product.count1;
    	System.out.println("\n\t\t\t\t\t\tYour total expense is "+(count+count1+expense));
    	int loss=count+count1+expense;
    	int profit=priceofproduct;
    	int Net=profit-loss;
    	if(Net>0)
    	{
            System.out.println("\n\t\t\t\t\t\tYour net profit is "+Net+" Rupees");
            project.Info();
    	}
    	else{
            int new_per = Math.abs(Net);
            System.out.println("\n\t\t\t\t\t\tYour net Loss is "+new_per+" Rupees");
            project.Info();
        }    	
    }
}
