/*
 * @author Ioannis Kyriazis 3212018107
 */

public class AploiXrhstes extends Xrhstes{//ΚΛΗΡΟΝΟΜΟΣ ΚΛΑΣΗ ΑΠΟ ΤΗΝ ΚΛΑΣΗ Xrhstes
    protected String username;//ΑΝΑΓΝΩΡΙΣΤΙΚΑ ΑΠΛΟΥ ΧΡΗΣΤΗ ΓΙΑ ΤΗΝ ΕΙΣΟΔΟ ΤΟΥ ΣΤΟ ΣΥΣΤΗΜΑ
    protected String kwdikos;
    
    public AploiXrhstes(String onoma, String epitheto, String hmgennhshs, String fylo, String username, String kwdikos) //ΔΗΜΙΟΥΡΓΙΑ ΔΟΜΗΤΗ
    {
        super(onoma,epitheto,hmgennhshs,fylo); //ΚΛΗΡΟΝΟΜΗΣΗ ΟΛΩΝ ΤΩΝ ΣΤΟΙΧΕΙΩΝ ΤΗΣ "ΜΑΜΑΣ ΚΛΑΣΗΣ"
        this.username=username;
        this.kwdikos=kwdikos;
    }
     
    
    //ΣΥΝΑΡΤΗΣΕΙΣ SET KAI GET ΓΙΑ ΤΗΝ ΑΠΟΘΗΚΕΥΣΗ ΣΤΟΙΧΕΙΩΝ ΚΑΘΕ ΑΠΛΟΥ ΧΡΗΣΤΗ
     public void setUsername(String username)
    {
        this.username=username;
    }
    public void setKwdikos(String kwdikos)
    {
        this.kwdikos=kwdikos;
    }
    
    
      public String getUsername()
    {
        return username;
    }
    public String getKwdikos()
    {
        return kwdikos;
    }
}
