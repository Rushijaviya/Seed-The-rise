import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class user{
    /* store name and password */
 
    public static void new_user() throws IOException{
        Scanner sc=new Scanner(System.in);
        String name,number,pass1;
        System.out.flush(); 
        File newfile=new File("C:\\Code\\Datafile.txt");
        if(newfile.createNewFile()){}
        System.out.println("\t\t\t\t\t\t************************* Welcome *************************");
        System.out.print("\n\t\t\t\t\t\tSet your Username: ");
        name=sc.nextLine();
        String valid=name;
        boolean z=getinput(valid);
        if(z)
        {
            System.out.println("Username is not available");
            project.main(null);
        }
        System.out.print("\n\t\t\t\t\t\tEnter your Mobile number: ");
        number=sc.nextLine();
        
        if(number.length()==10) {
        try {
            double d = Double.parseDouble(number);
        } catch (NumberFormatException n) {
            System.out.println("\t\t\tPlease enter a valid phone number!");
            project.main(null);
        }
        }
        else 
        {
            System.out.println("Number is wrong");
             project.main(null);
        }
        Console cnsl = System.console();
        char[] ch = cnsl.readPassword("\n\t\t\t\t\t\tEnter password : ");  
        pass1=String.valueOf(ch); 
        
 
      try {  
        
        FileWriter file=new FileWriter(newfile, true);
        PrintWriter pw=new PrintWriter(file);
       
        pw.println("\n"+name+"\n"+pass1+"\n");
        
        file.close();
        }
    catch(Exception e)
      {
        System.out.println("Some error occured!.");
        System.out.println("Sorry for inconvience");
        }
    }
    
    public static boolean getinput(String verify) throws IOException{
    		Scanner sc= new Scanner(System.in);
    	
            Path path=Paths.get("C:\\Code\\Datafile.txt").toAbsolutePath();
            List<String> titles =Files.lines(path).collect(Collectors.toList());
        	String verify1=verify;
        	boolean infile=titles.stream().anyMatch(p->p.equalsIgnoreCase(verify1));
    
        	  if(infile)
        		  return true;
        	  else return false;
    }
    public static boolean login() throws IOException {
        Scanner sc=new Scanner(System.in);
        	 String name,password;
             System.out.print("\n\t\t\t\t\t\t****************** Log In to Your Account *****************");
             System.out.print("\n\t\t\t\t\t\tUsername: ");
             name=sc.next();
            Console cnsl = System.console();
            char[] ch = cnsl.readPassword("\n\t\t\t\t\t\tpassword : ");  
            password=String.valueOf(ch);
            
             
            String verify1= name;
            String verify2=password;
            boolean d=getinput(verify1);
            boolean e=getinput(verify2);
            boolean f=d&e;
        
        return f;
        
       
}
}
 
public  class project {
    public static void Ms(){
        while(true) {
            Scanner sc=new Scanner(System.in);    
            
            System.out.println("\t\t\t\t\t\t*********************** Select Crop ***********************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Bajra");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Sweet Corn");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            int choose_crop;
            choose_crop=sc.nextInt();
            corn c1=new corn();
            switch (choose_crop) {
                case 1: Monsoon.Bajra(); break;
                case 2: c1.Sweet_Corn(); break;
                case 3: project.Info(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************\n");
            }
        }
    }
    
    public static void Wt(){
        while(true) {
            Scanner sc=new Scanner(System.in);                
            System.out.println("\t\t\t\t\t\t*********************** Select Crop ***********************");
            System.out.println("\n\t\t\t\t\t\t\t\t  1. Wheat");
            System.out.println("\n\t\t\t\t\t\t\t\t  2. Barley");
            System.out.println("\n\t\t\t\t\t\t\t\t  3. Go Back");
            int choose_crop;
            choose_crop=sc.nextInt();
            Barley c1=new Barley();
            switch (choose_crop) {
                case 1: Winter.Wheat(); break;
                case 2: c1.Barley(); break;
                case 3: project.Info(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************\n");
            }
        }
    }
    
    public static void Sum(){
        while(true) {
            Scanner sc=new Scanner(System.in);    
            
            System.out.println("\t\t\t\t\t\t*********************** Select Crop ***********************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Rice");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Cotton");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Go Back");
            int choose_crop;
            choose_crop=sc.nextInt();
            Cotton c1=new Cotton();
            switch (choose_crop) {
                case 1: Summer.Rice(); break;
                case 2: c1.Cotton(); break;
                case 3: project.Info(); break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************\n");
            }
        }
    }
    public static void Fru(){
        while(true) {
            Scanner sc=new Scanner(System.in);    
 
            System.out.println("\t\t\t\t\t\t*********************** Select Crop ***********************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Mango");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Pomogranate");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Strawberry");
            System.out.println("\n\t\t\t\t\t\t\t\t\t4. Grapes");
            System.out.println("\n\t\t\t\t\t\t\t\t\t5. Go Back");
            int choose_cropp;
            choose_cropp=sc.nextInt();
            grapes p1=new grapes();
            switch (choose_cropp) {
                case 1: Fruits.Mango(); 
                break;
                case 2: Fruits.Pomogranate();
                break;
                case 3: Fruits.Strawberry();
                break;
                case 4: p1.grapesq();
                break;
                case 5: project.Info();
                 break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************\n");
 
            }
        }
    }

    public static void Pr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\t\t\t\t\t************** Welcome to Product-Management **************");
        System.out.println("\t\t\t\t\t\t               1. List of all products");
        System.out.println("\t\t\t\t\t\t               2. Expense");
        System.out.println("\t\t\t\t\t\t               3. Go back");
        int option;
        option = sc.nextInt();
        switch(option){
            case 1:Product.ListofProducts();
            break;
            case 2:Product.Expense();
            break;
            case 3:project.Info();
            break;
            default: System.out.println("\t\t\t\t\t\t**************** Please Choose vaild choice *****************\n");
        }
    }
    public static void Info(){
        while(true) {
            System.out.println("\n\t\t\t\t\t\t********************** Select Season **********************");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Monsoon");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. Winter");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. Summer");
            System.out.println("\n\t\t\t\t\t\t\t\t\t4. Fruits");
            System.out.println("\n\t\t\t\t\t\t\t\t\t5. Product Management");
            System.out.println("\n\t\t\t\t\t\t\t\t\t6. Logout");
            Scanner sc=new Scanner(System.in);
            int choose_season;
            choose_season=sc.nextInt();
            if(choose_season==1) {
                project.Ms();
            }
            else if(choose_season==2) {
                project.Wt();
            }
            else if(choose_season==3) {
                project.Sum();
            }
            else if(choose_season==4){
                project.Fru();
            }
            else if(choose_season==5){
                project.Pr();
            }
            else if(choose_season==6){
                project.main(null);
            }
            else{
                System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    }
    
    
    public static void main(String[] args)  {
      Scanner sc=new Scanner(System.in);
        int choice,choose_crop;
        System.out.println("\n\t\t\t\t\t\t**************** Welcome to Seed: The rise ****************");
        while (true) {    
            System.out.println("\n\t\t\t\t\t\t\t\t\tSelect choice");
            System.out.println("\n\t\t\t\t\t\t\t\t\t1. Register");
            System.out.println("\n\t\t\t\t\t\t\t\t\t2. login ");
            System.out.println("\n\t\t\t\t\t\t\t\t\t3. exit");
            choice=sc.nextInt();
            
 
            switch (choice) {
            
                case 1: try{user.new_user();}
                catch(IOException e) {}break;
                
                case 2:
                	
				try {
					boolean  c=user.login();
					if(c)
					{
						 System.out.println("\n\t\t\t\t\t\t*********************** You Entered ***********************\n");
						project.Info();
					}
					else
					{	 System.out.println("\n\t\t\t\t\t\t**** The username or password is incorrect. Try again. ****");
						project.main(null);
					}
				} catch (IOException e) {
					
				}
                    	
                   
               
                    break;
                case 3:
                    if(true) {
                    System.out.println("\n\n\n\n\n********************************************************************* Thanks for coming *********************************************************************\n\n\n\n\n");
                    System.exit(0);
                    }
                    break;
                default: System.out.println("\t\t\t\t\t\t**************** Please Choose valid choice *****************");
            }
        }
    } 
}
