/*
 * @author Ioannis Kyriazis 3212018107
 */

public class Xrhstes{
    protected String onoma;
    protected String epitheto; //ΔΗΛΩΣΗ ΣΤΟΙΧΕΙΩΝ "ΤΗΣ ΜΑΜΑΣ" ΚΛΑΣΗΣ ΠΟΥ ΘΑ ΤΑ ΜΟΙΡΑΣΕΙ ΝΑ ΤΙΣ ΚΛΑΣΕΙΣ "ΚΛΗΡΟΝΟΜΟΥΣ", ΤΟΝ ΔΙΑΧΕΙΡΙΣΤΗ ΚΑΙ ΤΟΝ ΑΠΛΟ ΧΡΗΣΤΗ
    protected String hmgennhshs;
    protected String fylo;
    
    public Xrhstes(String onoma, String epitheto, String hmgennhshs, String fylo) //ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ CONSTRUCTOR 
    {
        this.onoma=onoma;
        this.epitheto=epitheto;
        this.hmgennhshs=hmgennhshs;
        this.fylo=fylo;
    }
    
   
    
    //ΣΥΝΑΡΤΗΣΕΙΣ SET KAI GET ΓΙΑ ΤΗΝ ΑΠΟΘΗΚΕΥΣΗ ΚΑΙ ΠΡΟΒΟΛΗ ΣΤΟΙΧΕΙΩΝ ΚΑΘΕ ΧΡΗΣΤΗ
    public void setOnoma(String onoma)
    {
        this.onoma=onoma;
    }
    public void setEpitheto(String epitheto)
    {
        this.epitheto=epitheto;
    }
    public void setHmgennhshs(String hmgennhshs)
    {
        this.hmgennhshs=hmgennhshs;
    }
    public void setFylo(String fylo)
    {
        this.fylo=fylo;
    }
    
    
     public String getOnoma()
    {
        return onoma;
    }
     public String getEpitheto()
    {
        return epitheto;
    }
      public String getHmgennhshs()
    {
        return hmgennhshs;
    }
        public String getFylo()
    {
        return fylo;
    }
}
