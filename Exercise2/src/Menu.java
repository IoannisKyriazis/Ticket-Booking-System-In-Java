/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.Scanner;

public class Menu {
    static ListaMeTheamata lista=new ListaMeTheamata();
    static ListaMeAplousXrhstes listax=new ListaMeAplousXrhstes();   //ΔΗΛΩΣΗ ΛΙΣΤΩΝ
    static ListaDiaxeiristwn listad=new ListaDiaxeiristwn();
    static ListaMeTaTheamataAnaXrhsth listath=new ListaMeTaTheamataAnaXrhsth();
    
    private static String user1=null; //ΔΗΛΩΣΗ USERNAME ΠΕΛΑΤΗ 
    private static  String pass1=null; //ΔΗΛΩΣΗ PASSWORD ΠΕΛΑΤΗ
    
    public static void menug() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΟ ΓΕΝΙΚΟ ΜΕΝΟΥ ΚΑΙ ΤΙΣ ΕΠΙΛΟΓΕΣ ΤΟΥ
    {
        Scanner input=new Scanner(System.in);
        int menu;
        
        do{ //ΕΠΑΝΑΛΗΨΗ ΣΕ ΠΕΡΙΠΤΩΣΗ ΛΑΘΟΥΣ ΣΤΟ ΜΕΝΟΥ
        System.out.print("***TICKETS BOOKING APPLICATION***\n1. DIAXEIRISTHS\n2. PELATHS\n0. EXIT\n\nEisagete thn epilogh sas: ");
        menu=input.nextInt();
        
        
        if(menu==0){
                System.exit(0); //ΕΞΟΔΟΣ ΑΠΟ ΤΟ ΠΡΟΓΡΑΜΜΑ
            }
        else if(menu==1){
            System.out.print("\n\n");
            diaxeirisths(); //ΛΕΙΤΟΥΡΓΙΑ ΔΙΑΧΕΙΡΙΣΤΗ
            
        }
        
        else if(menu==2){
            System.out.print("\n\n");
            aplosXrhsths(); //ΛΕΙΤΟΥΡΓΙΑ ΑΠΛΟΥ ΧΡΗΣΤΗ
            
        }
        }while(menu>0 && menu<3);
    }
    
    
    public static void menuD() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΟ ΜΕΝΟΥ ΤΟΥ ΔΙΑΧΕΙΡΙΣΤΗ
    {
         Scanner input=new Scanner(System.in);
        int menud;
        
        do{ //ΕΠΑΝΑΛΗΨΗ ΣΕ ΠΕΡΙΠΤΩΣΗ ΛΑΘΟΥΣ ΣΤΟ ΜΕΝΟΥ
        System.out.print("\n\n***ADMINISTRATOR***\n1. Kataxwrhsh theamatos\n2. Emfanish olwn twn theamatwn\n3. Katarghsh theamatos\n4. Emfanish olwn twn xrhstwn pou einai egkegrammenoi sto systhma\n5. Diagrafh xrhsth apo to systhma\n0. EXIT\n\nEisagete thn epilogh sas: ");
        menud=input.nextInt();
        
        
        if(menud==0){
                break;
            }
        if(menud==1){
            kataxwrhsh(); //ΚΑΤΑΧΩΡΗΣΗ ΤΟΥ ΜΟΝΑΔΙΚΟΥ ΔΙΑΧΕΙΡΙΣΤΗ
        }
        
        else if(menud==2){
            emfanishOlwnTwnTheamatwn(); //ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΚΑΤΑΧΩΡΗΣΕΙ Ο ΔΙΑΧΕΙΡΙΣΤΗΣ
        }
        else if(menud==3){
            katarghshTheamatos(); //ΚΑΤΑΡΓΗΣΗ ΣΥΓΚΕΚΡΙΜΕΝΟΥ ΘΕΑΜΑΤΟΣ
        }
        else if(menud==4){
            emfanishEgkegrammenwn(); //ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΣΤΟΙΧΕΙΩΝ ΤΩΝ ΕΓΓΕΓΡΑΜΜΕΝΩΝ ΧΡΗΣΤΩΝ 
        }
        else if(menud==5){
            diagrafhXrhsth(); //ΔΙΑΓΡΑΦΗ ΕΝΟΣ ΕΓΚΕΓΡΑΜΜΕΝΟΥ ΧΡΗΣΤΗ
        }
        }while(menud>0 && menud<6);
        menug();
    }
    
    
    
    
    public static void menuA() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΟ ΜΕΝΟΥ ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ
    {
        Scanner input=new Scanner(System.in);
        int menua;
        do{ //ΕΠΑΝΑΛΗΨΗ ΣΕ ΠΕΡΙΠΤΩΣΗ ΛΑΘΟΥΣ ΣΤΟ ΜΕΝΟΥ
        System.out.print("***APLOS XRHSTHS***\n1. Agora Eishthriou\n2. Emfanish olwn twn theamatwn\n3. Emfanish ana Xrhsth\n4. Akyrwsh krathshs\n5. Diagrafh xrhsth apo to systhma\n0. EXIT\n\nEisagete thn epilogh sas: ");
        menua=input.nextInt();
        
        
        if(menua==0){
                break;
            }
        else if(menua==1){
            agora(); //ΛΕΙΤΟΥΡΓΙΑ ΓΙΑ ΤΗΝ ΑΓΟΡΑ ΕΙΣΗΤΗΡΙΟΥ
        }
        
        else if(menua==2){
            emfanishOlwnTwnTheamatwn(); //ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΚΑΤΑΧΩΡΗΣΕΙ Ο ΔΙΑΧΕΙΡΙΣΤΗΣ
        }
        else if(menua==3){
            emfanishAnaXrhsth(); //ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΑΓΟΡΑΣΕΙ Ο ΧΡΗΣΤΗΣ
        }
        else if(menua==4){
            akyrwsh(); //ΑΚΥΡΩΣΗ ΘΕΑΜΑΤΟΣ 
        }
        else if(menua==5){
            diagrafhEntelws(); //ΔΙΑΓΡΑΦΗ ΧΡΗΣΤΗ ΑΠΟ ΤΟ ΣΥΣΤΗΜΑ ΕΝΤΕΛΩΣ
        }
        }while(menua>0 && menua<6);
        menug(); //ΕΠΙΣΤΡΟΦΗ ΣΤΟ ΓΕΝΙΚΟ ΜΕΝΟΥ ΚΑΤΑ ΤΗΝ ΛΗΞΗ ΤΗΣ ΜΕΘΟΔΟΥ ΑΥΤΗΣ
    }
    
    
    
    
    
    public static void aplosXrhsths() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΓΓΡΑΦΗ Η ΤΗΝ ΕΙΣΟΔΟ ΕΝΟΣ ΝΟΥ ΧΡΗΣΤΗ ΣΤΟ ΣΥΣΤΗΜΑ
    {
        Scanner input=new Scanner(System.in);
        AploiXrhstes ax=new AploiXrhstes(null,null,null,null,null,null); //ΔΗΛΩΣΗ ΚΑΙ ΑΡΧΙΚΟΠΟΙΗΣΗ ΜΕΤΑΒΛΗΤΩΝ ΚΑΙ ΛΙΣΤΩΝ
        int menuaa;
        
        do{
        System.out.print("***APLOS XRHSTHS***\n1. Eggrafh\n2. Eisodos\n0. EXIT\n\nEisagete thn epilogh sas: "); //ΜΕΝΟΥ
        menuaa=input.nextInt();
        
        if(menuaa==0){
            user1=null; //ΕΞΟΔΟΣ
            pass1=null;
            break;
        }
        else if(menuaa==1){
            prostheshXrhsth(); //ΠΡΟΣΘΕΣΗ ΝΕΟΥ ΧΡΗΣΤΗ
        }
        else if(menuaa==2){
            if(listax.getMegethosListasX()!=0){
            System.out.print("\n\n*EISODOS XRHSTH*\nGia na mporeite na diaxeiristeite to systhma prepei na eisagete ta stoixeia sas\n\n"); //ΕΙΣΟΔΟΣ ΝΕΟΥ ΧΡΗΣΤΗ ΑΦΟΥ ΕΧΕΙ ΚΑΝΕΙ ΤΗΝ ΕΓΓΡΑΦΗ
            System.out.print("Username: ");
            user1=input.next();
            System.out.print("Password: ");
            pass1=input.next();
        
            for(int i=0;i<listax.getMegethosListasX();i++){
                if(user1.equals(listax.getUsername(i)) && pass1.equals(listax.getKwdikos(i))){ //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ ΤΩΝ ΣΤΟΙΧΕΙΩΝ
                    System.out.print("\nEPITYXHS EISODOS STO SYSTHMA!\n\n");
                    menuA();
                }
             else{
                 System.out.print("\nTo USERNAME h o KWDIKOS sas den tairiazoun me ta pragmatika stoixeia. Prospathiste ek neou");
                 aplosXrhsths(); 
                }
            }
        }
            else{
                System.out.print("DEN yparxei kanenas aplos xrhsths. Ftiakste enan logariasmo!\n\n");
                aplosXrhsths();
            }
        }
        }while(menuaa>0 && menuaa<3);
        menug();
        System.out.print("\n\n\n\n");
    }
    
    
    
    
    public static void diaxeirisths() //ΜΕΘΟΔΟΣ ΕΓΓΡΑΦΗΣ ΚΑΙ ΕΙΣΟΔΟΥ ΕΝΟΣ ΔΙΑΧΕΙΡΙΣΤΗ ΜΟΝΟ
    {
        Scanner input=new Scanner(System.in);
        Diaxeirisths d=new Diaxeirisths(null,null,null,null,null,null);
        int menudd;
        String user;
        String pass;
        
        do{
        System.out.print("***DIAXEIRISTHS***\n1. Eggrafh\n2. Eisodos\n0. EXIT\n\nEisagete thn epilogh sas: "); //ΜΕΝΟΥ
        menudd=input.nextInt();
        
        if(menudd==0){
            user=null; //ΕΞΟΔΟΣ
            pass=null;
            break;
        }
        else if(menudd==1){
            prostheshDiaxeiristh(); //ΠΡΟΣΘΕΣΗ ΝΕΟΥ ΔΙΑΧΕΙΡΙΣΤΗ
        }
        else if(menudd==2){
            if(listad.getMegethosListasD()!=0){
            System.out.print("\n\n*EPIKYRWSH DIAXEIRISTHKHS IKANOTHTAS*\nGia na mporeite na diaxeiristeite to systhma prepei na eisagete ta stoixeia sas\nMPOREI NA EISAXTHEI MONO -1- DIAXEIRISTHS\n\n");
            System.out.print("Username: "); //ΕΙΣΟΔΟΣ ΝΕΟΥ ΔΙΑΧΕΙΡΙΣΤΗ ΣΤΟ ΣΥΣΤΗΜΑ
            user=input.next();
            
            System.out.print("Password: ");
            pass=input.next();
        
            for(int i=0;i<=listad.getMegethosListasD();i++){
                if(user.equals(listad.getdUsername(i)) && pass.equals(listad.getdKwdikos(i))){ //ΕΛΕΓΧΟΣ ΕΓΚΥΡΟΤΗΤΑΣ ΣΤΟΙΧΕΙΩΝ
                    System.out.print("\nEPITYXHS EISODOS STO SYSTHMA!\n\n");
                    menuD();
                }
        else{
            System.out.print("\nTo USERNAME h o KWDIKOS sas den tairiazoun me ta pragmatika stoixeia. Prospathiste ek neou\n\n");
            diaxeirisths();
        }
            }
        }
            else{
                System.out.print("Den yparxei kanenas diaxeirisths!\n\n");
                diaxeirisths();
            }
        }
        }while(menudd>0 && menudd<3);
        
        System.out.print("\n\n\n\n");
        menug();
    }
    
    
    public static void prostheshDiaxeiristh() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΠΡΟΣΘΕΣΗ ΝΕΟΥ ΔΙΑΧΕΙΡΙΣΤΗ 
    {
        Scanner input=new Scanner(System.in);
        Diaxeirisths d=new Diaxeirisths(null,null,null,null,null,null);
        System.out.print("\n\nMPOREI NA EISAXTHEI MONO -1- DIAXEIRISTHS");
        
        System.out.print("\n\nEisagete to onoma sas: ");
        d.setOnoma(input.nextLine());
        System.out.print("Eisagete to epitheto sas: ");
        d.setEpitheto(input.nextLine());
        System.out.print("Eisagete to username pou tha to xrhsimopoieite gia to login sas: ");      //ΠΛΗΚΤΡΟΛΟΓΗΣΗ ΚΑΙ ΑΠΟΘΗΚΕΥΣΗ ΜΕ ΤΗΝ ΒΟΗΘΕΙΑ ΤΩΝ SET ΣΥΝΑΡΤΗΣΕΩΝ ΤΟΥ ΝΕΟΥ ΔΙΑΧΕΙΡΙΣΤΗ
        d.setdUsername(input.nextLine());
        System.out.print("Eisagete ton kwdiko prosvashs sas (password): ");
        d.setdKwdikos(input.nextLine());
        
        if(listad.getMegethosListasD()<=1){ //ΜΟΝΟ ΕΝΑΣ ΔΙΑΧΕΙΡΙΣΤΗΣ ΕΠΙΤΡΕΠΕΤΑΙ
        listad.kataxwrhshD(d);
    }
        else{
            System.out.print("\nMONO 1 DIAXEIRISTHS EPITREPETAI");
        }
        System.out.print("\n\n\n\n");
    }
    
    
    
    public static void prostheshXrhsth() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΠΡΟΣΘΕΣΗ ΝΕΟΥ ΧΡΗΣΤΗ
    {
        Scanner input=new Scanner(System.in);
         AploiXrhstes ax=new AploiXrhstes(null,null,null,null,null,null);
        
        System.out.print("\n\nEisagete to onoma sas: ");
        ax.setOnoma(input.nextLine());
        System.out.print("Eisagete to epitheto sas: ");
        ax.setEpitheto(input.nextLine());
        System.out.print("Eisagete to username pou tha to xrhsimopoieite gia to login sas: ");      //ΠΛΗΚΤΡΟΛΟΓΗΣΗ ΚΑΙ ΑΠΟΘΗΚΕΥΣΗ ΜΕ ΤΗΝ ΒΟΗΘΕΙΑ ΤΩΝ SET ΣΥΝΑΡΤΗΣΕΩΝ ΝΕΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ
        ax.setUsername(input.nextLine());
        System.out.print("Eisagete ton kwdiko prosvashs sas (password): ");
        ax.setKwdikos(input.nextLine());
        System.out.print("Eisagete to fylo sas: ");
        ax.setFylo(input.nextLine());
        System.out.print("Eisagete thn hmeromhnia gennhshs sas: ");
        ax.setHmgennhshs(input.nextLine());
        
        listax.kataxwrhshX(ax);
        
        System.out.print("\n\n\n\n");
    }
    
    
    
    public static void kataxwrhsh() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΚΑΤΑΧΩΡΗΣΗ ΝΕΟΥ ΘΕΑΜΑΤΟΣ
    {
            Theama newtheama=new Theama(null,null,null,null,null,0,0); 
            Scanner input=new Scanner(System.in);
            
            System.out.print("\n\nEisagete ton titlo tou theamatos: ");
            newtheama.setTitlos(input.nextLine());
            System.out.print("Eisagete eidos tou theamatos: ");
            newtheama.setEidos(input.nextLine());
            System.out.print("Eisagete thn hmeromhnia pou tha pragmatopoiithei to theama: ");      //ΠΛΗΚΤΡΟΛΟΓΗΣΗ ΑΠΟ ΤΟΝ ΔΙΑΧΕΙΡΙΣΤΗ ΚΑΙ ΑΠΟΘΗΚΕΥΣΗ ΜΕ ΤΗΝ ΒΟΗΘΕΙΑ ΤΩΝ SET ΣΥΝΑΡΤΗΣΕΩΝ ΤΟΥ ΘΕΑΜΑΤΟΣ
            newtheama.setHmeromhnia(input.nextLine());
            System.out.print("Eisagete thn wra pou tha pragmatopoiithei to theama: ");
            newtheama.setWra(input.nextLine());
            System.out.print("Eisagete thn topothesia pou tha pragmatopoiithei to theama: ");
            newtheama.setTopothesia(input.nextLine());
            System.out.print("Eisagete thn timh tou eishthriou: ");
            newtheama.setEishthrio(input.nextInt());
            System.out.print("Eisagete ton arithmo thesewn: ");
            newtheama.setTheseis(input.nextInt());
            
            lista.kataxwrhsh(newtheama); //ΚΑΤΑΧΩΡΗΣΗ ΤΟΥ ΝΕΟΥ ΘΕΑΜΑΤΟΣ ΣΤΗΝ ΛΙΣΤΑ ΜΕ ΤΑ ΘΕΑΜΑΤΑ
            System.out.print("\n\n\n\n");
    }
    
    public static void emfanishOlwnTwnTheamatwn() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΠΡΟΣΘΕΣΕΙ Ο ΔΙΑΧΕΙΡΙΣΤΗΣ
    {
            Scanner input=new Scanner(System.in);
            System.out.print("\n\n");
            if(lista.getMegethosListas()!=0){ //ΕΛΕΓΧΕΙ ΤΟ ΜΕΓΕΘΟΣ ΤΗΣ ΛΙΣΤΑΣ 
                for(int i=0;i<lista.getMegethosListas();i++){
                    System.out.print("#"+(i+1)+"    TITLOS:  "+lista.getTitlos(i)+"    EIDOS:  "+lista.getEidos(i)+"    HMEROMHNIA DIEKSAGWGHS:  "+lista.getHmeromhnia(i)+"    WRA DIEKSAGWGHS:  "+lista.getWra(i)+"    TOPOTHESIA DIEKSAGWGHS:  "+lista.getTopothesia(i)+"    TIMH EISHTHRIOU:  "+lista.getEishthrio(i)+"    DIATHESIMES THESEIS:  "+lista.getTheseis(i)+"\n");
                }
            }
            else
                System.out.print("H Lista me ta theamata einai adeia!!");
            
            System.out.print("\n\n\n\n");
    }
    
    
    
    public static void emfanishEgkegrammenwn() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΕΓΓΕΓΡΑΜΜΕΝΩΝ ΧΡΗΣΤΩΝ 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("\n\n");
        if(listax.getMegethosListasX()!=0){ //ΕΛΕΓΧΕΙ ΤΟ ΜΕΓΕΘΟΣ ΤΗΣ ΛΙΣΤΑΣ ΠΟΥ ΑΦΟΡΑ ΤΟΥΣ ΧΡΗΣΤΕΣ 
                for(int i=0;i<listax.getMegethosListasX();i++){
                    System.out.print("#"+(i+1)+"    ONOMA:  "+listax.getOnoma(i)+"    EPWNYMO:  "+listax.getEpitheto(i)+"    USERNAME:  "+listax.getUsername(i)+"    PASSWORD:  "+listax.getKwdikos(i)+"    FYLO:  "+listax.getFylo(i)+"    HMER/NIA GENNHSHS:  "+listax.getHmgennhshs(i)+"\n");
            }
        }
        else
            System.out.print("H Lista me ta theamata einai adeia!!");
            
            System.out.print("\n\n\n\n");
    }
    
    
    public static void katarghshTheamatos() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΕΝΟΣ ΣΥΓΚΕΚΡΙΜΕΝΟΥ ΘΕΑΜΑΤΟΣ
    { 
        Scanner input=new Scanner(System.in);
            if(lista.getMegethosListas()==0){
		System.out.println("\nH lista me ta theamata einai adeia!");
            }
            else
            {
		emfanishOlwnTwnTheamatwn();
		boolean gegonos=false;
                
            do{
		System.out.print("\nPoio theama thelete na diagrapsete? Eisagete to noumero tou apo thn parapanw lista: "); //ΔΙΑΓΡΑΦΗ ΘΕΑΜΑΤΟΣ ΜΕ ΒΑΣΗ ΣΤΗΝ ΘΕΣΗ
		int epilogh=input.nextInt();
				
		if(epilogh<lista.getMegethosListas() || epilogh>lista.getMegethosListas()){
                    System.out.print("H epilogh sas den yparxei sthn lista!\n");
		}
		else{
                    lista.katarghshTheamatos(--epilogh);
                    gegonos=true;
		}
            }while(gegonos==false);
            }
            
            System.out.print("\n\n\n\n");
    }
    
    
    
    public static void agora() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΑΓΟΡΑ ΕΙΣΗΤΗΡΙΩΝ ΓΙΑ ΕΝΑ ΣΥΓΚΕΚΡΙΜΕΝΟ ΘΕΑΜΑ
    {
        Scanner input=new Scanner(System.in);
        Theama newtheama=new Theama(null,null,null,null,null,0,0);
        VashDedomenwn va=new VashDedomenwn(null,null,null,null,null,null,null,0,0); //ΔΗΛΩΣΗ ΚΑΙ ΑΡΧΙΚΟΠΟΙΗΣΗ ΟΛΩΝ ΤΩΝ ΑΠΑΙΤΟΥΜΕΝΟΝ ΜΕΤΑΒΛΗΤΩΝ ΚΑΙ ΛΙΣΤΩΝ
        AploiXrhstes ax=new AploiXrhstes(null,null,null,null,null,null);
        
        if(lista.getMegethosListas()==0){
		System.out.println("\nAuth thn stigmh den pragmatopoieitai kapoio theama!");
            }
            else
            {
		emfanishOlwnTwnTheamatwn();
                
           
		System.out.print("\nSe poio theama thelete na kleisete thesh? Epilekste apo thn parapanw lista ton titlo tou theamatos [PROSEXTE TIS DIATHESIMES THESEIS]: "); //ΑΓΟΡΑ ΜΕ ΒΑΣΗ ΤΟΝ ΤΙΤΛΟ ΤΟΥ ΘΕΑΜΑΤΟΣ
		String epilogh1=input.nextLine();
		
                    for(int i=0;i<lista.getMegethosListas();i++){ 
                        if(epilogh1.equalsIgnoreCase(lista.getTitlos(i))){ 
                    
                    System.out.print("Epileksate to theama me onoma: "+lista.getTitlos(i));
                    System.out.print("\nOI DIATHESIMES THESEIS EINAI:  "+lista.getTheseis(i)+"\n"); //ΥΠΕΝΘΥΜΗΣΗ ΣΤΟΝ ΧΡΗΣΤΗ ΤΙΣ ΕΠΙΛΟΓΕΣ ΤΟΥ
                    System.out.print("Poses theseis thelete na desmeusete? Eisagete to noumero: "); //ΕΙΣΑΓΩΓΗ ΘΕΣΕΩΝ
                    int eptheseis=input.nextInt();
                    
                    
                    if(eptheseis<=lista.getTheseis(i)){ //ΕΛΕΓΧΟΣ ΔΙΑΘΕΣΙΜΩΝ ΘΕΣΕΩΝ
                        int synolo=eptheseis*(lista.getEishthrio(i));
                        System.out.print("**H SYNOLIKH TIMH EINAI: "+synolo+"**\n");
                        System.out.print("Thelete na synexisete sthn agora? [1=>NAI  0=>OXI] : "); //ΕΠΙΒΕΒΑΙΩΣΗ ΣΥΝΕΧΕΙΑΣ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ
                        int anthelei=input.nextInt();
                        
                        if(anthelei==1){
                        System.out.print("Eisagete ton arithmo ths kartas sas: ");
                        String karta=input.next();
                        System.out.print("Eisagete to onomatepwnymo ths kartas etsi opws anagrafetai epanw ths: "); //ΕΙΣΑΓΩΓΗ ΣΤΟΙΧΕΙΩΝ ΚΑΡΤΑΣ 
                        String onomatepwnymokartas=input.next();
                        System.out.print("Eisagete thn hmeromhnia lhkshs ths kartas sas: ");
                        String hmlhkshskartas=input.next();
                        System.out.print("Eisagete to CVV ths kartas sas (vrisketai sto pisw meros ths. Einai treis arithmoi. p.x. 856): ");
                        int cvv=input.nextInt();
                        
                        System.out.print("Thelete na epivevaiwsete thn agora? [1=>NAI    0=>OXI ] : "); //ΕΠΙΒΕΒΑΙΩΣΗ ΑΓΟΡΑΣ
                        int anthelei1=input.nextInt();
                        
                        if(anthelei1==1){
                            va.setUsername(user1);
                            va.setKwdikos(pass1);
                            va.setTitlos(lista.getTitlos(i));
                            va.setEidos(lista.getEidos(i)); 
                            va.setHmeromhnia(lista.getHmeromhnia(i)); //ΑΠΟΘΗΚΕΥΣΗ ΣΤΟΙΧΕΙΩΝ ΣΤΗΝ ΛΙΣΤΑ ΚΑΘΕ ΧΡΗΣΤΗ
                            va.setWra(lista.getWra(i));
                            va.setTopothesia(lista.getTopothesia(i));
                            va.setEishthrio(lista.getEishthrio(i));
                            va.setTheseis(eptheseis);
                            listath.kataxwrhsh(va);
                            
                            System.out.print("EPITYXHS PLHRWMH! Tha lavete thn apodeiksh sto email sas!\nTo synoliko poso pou plhrwsate einai: "+synolo+"EUR\nNa perasete kala!!");
                            int th=lista.getTheseis(i)-eptheseis; //ΔΙΑΤΑΞΗ ΘΕΣΕΩΝ
                            lista.neaTheseis(i,th);
                        }
                        else{
                           System.out.print("\n\nTA STOIXEIA KAI OI THESEIS DEN APOTHIKEUTHKAN. EKSODOS APO THN KRATHSH THESEWN\n\n\n\n");
                           menuA();
                        }
                        }
                        else{
                           System.out.print("\n\nTA STOIXEIA KAI OI THESEIS DEN APOTHIKEUTHKAN. EKSODOS APO THN KRATHSH THESEWN\n\n\n\n");
                           menuA();
                        }
                    }
                    else{
                        System.out.print("Den yparxoun diathesimes theseis gia to sygkekrimeno theama");
                        menuA();
                    }
                    }
                        else{
                                System.out.print("O titlos pou plhktrologhsate den yparxei sthn lista!\n\n");
                                menuA();
                }
		}
            }
        System.out.print("\n\n\n\n");
    }
    
    
    public static void diagrafhEntelws() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΤΟΥ ΧΡΗΣΤΗ ΑΠΟ ΤΟ ΣΥΣΤΗΜΑ ΜΕ ΕΠΙΛΟΓΗ ΤΟΥ ΧΡΗΣΤΗ 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Eiste sigouros oti thelete na diagrafeite apo to systhma?? [1=>NAI  0=>OXI ] :  ");
        int epilogh2=input.nextInt();
        
        if(epilogh2==1){
        for(int i=0;i<listath.getMegethosListasL();i++){
            while(user1.equals(listax.getUsername(i)) && pass1.equals(listax.getKwdikos(i))){  //ΔΙΑΓΡΑΦΗ ΟΛΩΝ ΤΩΝ ΘΕΑΜΑΤΩΝ ΠΟΥ ΕΧΕΙ ΠΛΗΡΩΣΕΙ
                int thes=lista.getTheseis(i)+listath.getTheseis(i);
                lista.neaTheseis(i,thes);
                listath.akyrwshKrathshs(i);
            }
        }
        System.out.print("\n\nH akyrwsh olwn twn krathsewn sas olklhrwthike!\n\n");
        for(int j=0;j<listax.getMegethosListasX();j++){
            if(user1.equals(listax.getUsername(j)) && pass1.equals(listax.getKwdikos(j))){ //ΔΙΑΓΡΑΦΗ ΤΟΥ ΧΡΗΣΤΗ ΑΦΟΥ ΕΧΟΥΝ ΔΙΑΓΡΑΦΕΙ ΟΛΑ ΤΑ ΘΕΑΜΑΤΑ ΠΟΥ ΕΧΕΙ ΠΛΗΡΩΣΕΙ
                listax.diagrafhXrhsth(j);
            }
        }
        System.out.print("\n\nH akyrwsh tou logariasmou sas sas olklhrwthike!\n\n");
        menug();
        }
        else{
            System.out.print("H diagrafh sas AKYRWTHIKE!!\n\n");
            menug();
        }
        System.out.print("\n\n\n\n");
    }
    
    
    
    public static void emfanishAnaXrhsth() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΕΜΦΑΝΙΣΗ ΘΕΑΜΑΤΩΝ ΑΝΑ ΧΡΗΣΤΗ
    {
        Scanner input=new Scanner(System.in);
        VashDedomenwn va=new VashDedomenwn(null,null,null,null,null,null,null,0,0);
        System.out.print("\n\n");
            if(listath.getMegethosListasL()!=0){ 
                System.out.print("**OI KRATHSEIS SAS EINAI**\n");
                for(int i=0;i<listath.getMegethosListasL();i++){ //ΕΛΕΓΧΕΙ USERNAME KAI PASSWORD ΚΑΙ ΕΜΦΑΝΙΖΕΙ ΜΟΝΟ ΤΑ ΕΙΣΗΤΗΡΙΑ ΠΟΥ ΕΧΕΙ ΚΛΕΙΣΕΙ Ο ΣΥΓΚΕΚΡΙΜΕΝΟΣ ΧΡΗΣΤΗΣ
                    if(user1.equals(listath.getUsername(i)) && pass1.equals(listath.getKwdikos(i)))
                    System.out.print("#"+(i+1)+"    TITLOS:  "+listath.getTitlos(i)+"    EIDOS:  "+listath.getEidos(i)+"    HMEROMHNIA DIEKSAGWGHS:  "+listath.getHmeromhnia(i)+"    WRA DIEKSAGWGHS:  "+listath.getWra(i)+"    TOPOTHESIA DIEKSAGWGHS:  "+listath.getTopothesia(i)+"    TIMH EISHTHRIOU:  "+listath.getEishthrio(i)+"    KRATHMENES THESEIS:  "+listath.getTheseis(i)+"\n");
                }
            }
            else
                System.out.print("H Lista me ta theamata sas einai adeia!!");
            
            System.out.print("\n\n\n\n");
        
    }
    
    
    
    public static void akyrwsh() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΑΚΥΡΩΣΗ ΜΙΑΣ Η ΠΕΡΙΣΣΟΤΕΡΩΝ ΚΡΑΤΗΣΕΩΝ
    {
        Scanner input2=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        Theama newtheama=new Theama(null,null,null,null,null,0,0);
        
        if(listath.getMegethosListasL()!=0){
        emfanishAnaXrhsth();
        
            System.out.print("\nEisagete ton titlo tou theamatos pou thelete na akyrwsete: "); //ΑΚΥΡΩΣΗ ΜΕ ΒΑΣΗ ΤΟΝ ΤΙΤΛΟ
            String eisodos=input1.nextLine();
            
            System.out.print("\n\nEiste sigouros oti thelete na akyrwsete thn sygkekrimenh krathsh sas?? [1=>NAI  0=>OXI ] :  "); //ΕΠΙΒΕΒΑΙΩΣΗ
            int epilogh4=input2.nextInt();
        
            if(epilogh4==1){
                
                for(int i=0;i<listath.getMegethosListasL();i++){ 
                      if(eisodos.equalsIgnoreCase(listath.getTitlos(i)) && user1.equals(listath.getUsername(i))){ //ΕΛΕΓΧΟΣ ΓΙΑ ΤΟΝ ΣΥΓΚΕΚΡΙΜΕΝΟ ΧΡΗΣΤΗ ΠΟΥ ΕΙΝΑΙ ΣΥΝΔΕΔΕΜΕΝΟΣ
                            int the=lista.getTheseis(i)+listath.getTheseis(i);
                             lista.neaTheseis(i,the); //ΑΝΑΝΕΩΣΗ ΑΡΧΙΚΩΝ ΘΕΣΕΩΝ
                            listath.akyrwshKrathshs(i); //ΕΠΙΚΟΙΝΩΝΙΑ ΜΕ ΤΗΝ ΜΕΘΟΔΟ ΔΙΑΓΡΑΦΗΣ ΠΟΥ ΒΡΙΣΚΕΤΑΙ ΣΤΗΝ ΚΛΑΣΗ ΤΗΣ ΛΙΣΤΑΣ ΜΕ ΤΑ ΔΕΔΟΜΕΝΑ ΑΝΑ ΧΡΗΣΤΗ
                     }
             }
         }
        else if(epilogh4==0){
            System.out.print("Den egine kamia allagh!\n\n");
            menuA();
        }
        
        }
            else
                System.out.print("H Lista me ta theamata sas einai adeia!!");
        System.out.print("\n\n\n\n");
    }
    
    
    public static void diagrafhXrhsth() //ΜΕΘΟΔΟΣ ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΧΡΗΣΤΗ ΑΠΟ ΤΟΝ ΔΙΑΧΕΙΡΙΣΤΗ ΤΟΥ ΣΥΣΤΗΜΑΤΟΣ
    {
         Scanner input4=new Scanner(System.in);
            AploiXrhstes ax=new AploiXrhstes(null,null,null,null,null,null);
            VashDedomenwn va=new VashDedomenwn(null,null,null,null,null,null,null,0,0);
            System.out.print("\n\n");
            if(listax.getMegethosListasX()!=0){
                emfanishEgkegrammenwn();
                System.out.print("Poion xrhsth thelete na digrapsete? Eisagete to username tou: "); //ΔΙΑΓΡΑΦΗ ΑΝΑΛΟΓΑ ΜΕ ΤΟ USERNAME TOY
                String u=input4.next(); 
              for(int i=0;i<listax.getMegethosListasX();i++){ 
                    if(u.equals(listax.getUsername(i))){ //ΕΑΝ ΤΑΙΡΙΑΖΕΙ ΤΟΤΕ ΘΑ ΔΙΑΓΡΑΨΕΙ ΤΟΝ ΣΥΓΚΕΚΡΙΜΕΝΟ ΧΡΗΣΤΗ
                         listax.diagrafhXrhsth(i); //ΕΠΙΚΟΙΝΩΝΙΑ ΜΕ ΤΗΝ ΜΕΘΟΔΟ ΔΙΑΓΡΑΦΗΣ ΠΟΥ ΒΡΙΣΚΕΤΑΙ ΣΤΗΝ ΚΛΑΣΗ ΤΗΣ ΛΙΣΤΑΣ ΤΟΥ ΚΑΘΕ ΧΡΗΣΤΗ
                    }
            }
              }
            else{
                System.out.print("Den yparxoun xrhstes sto systhma!!");
                menuD();
            }
            
            System.out.print("\n\n\n\n");
    }
}
