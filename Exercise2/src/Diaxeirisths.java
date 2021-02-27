/*
 * @author Ioannis Kyriazis 3212018107
 */

public class Diaxeirisths extends Xrhstes{ //ΚΛΗΡΟΝΟΜΟΣ ΚΛΑΣΗ ΑΠΟ ΤΗΝ ΚΛΑΣΗ Xrhstes
    protected String dusername; //ΑΝΑΓΝΩΡΙΣΤΙΚΑ ΔΙΑΧΕΙΡΙΣΤΗ ΓΙΑ ΤΗΝ ΕΙΣΟΔΟ ΤΟΥ ΣΤΟ ΣΥΣΤΗΜΑ
    protected String dkwdikos;
    
    public Diaxeirisths(String onoma, String epitheto, String hmgennhshs, String fylo, String dusername, String dkwdikos) //ΔΗΜΙΟΥΡΓΙΑ ΔΟΜΗΤΗ
    {
        super(onoma,epitheto,hmgennhshs,fylo); //ΚΛΗΡΟΝΟΜΗΣΗ ΟΛΩΝ ΤΩΝ ΣΤΟΙΧΕΙΩΝ ΤΗΣ "ΜΑΜΑΣ ΚΛΑΣΗΣ"
        this.dusername=dusername;
        this.dkwdikos=dkwdikos;
    }
        
        
    //ΣΥΝΑΡΤΗΣΕΙΣ SET KAI GET ΓΙΑ ΤΗΝ ΑΠΟΘΗΚΕΥΣΗ ΣΤΟΙΧΕΙΩΝ ΚΑΘΕ ΔΙΑΧΕΙΡΙΣΤΗ
     public void setdUsername(String dusername)
    {
        this.dusername=dusername;
    }
    public void setdKwdikos(String dkwdikos)
    {
        this.dkwdikos=dkwdikos;
    }
    
    
      public String getdUsername()
    {
        return dusername;
    }
    public String getdKwdikos()
    {
        return dkwdikos;
    }
    
}
