/*
 * @author Ioannis Kyriazis 3212018107
 */
public class VashDedomenwn { //ΚΛΑΣΗ ΓΙΑ ΤΑ ΔΕΔΟΜΕΝΑ ΚΑΘΕ ΧΡΗΣΤΗ (ΒΟΗΘΑ ΣΤΗΝ ΕΜΦΑΝΙΣΗ ΟΛΩΝ ΤΩΝ ΚΡΑΤΗΣΕΩΝ ΑΝΑ ΧΡΗΣΤΗ)
    private String username;
    private String kwdikos;
    private String titlos;
    private String eidos; //ΣΤΟΙΧΕΙΑ ΚΑΘΕ ΚΡΑΤΗΣΗΣ
    private String hmeromhnia;
    private String wra;
    private String topothesia;
    private int eishthrio;
    private int theseis;
    
    public VashDedomenwn(String username, String kwdikos, String titlos, String eidos, String hmeromhnia, String wra, String topothesia, int eishthrio,int theseis) //ΔΟΜΗΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ
    {
        this.username=username;
        this.kwdikos=kwdikos;
        this.titlos=titlos;
        this.eidos=eidos;
	this.hmeromhnia=hmeromhnia;
	this.wra=wra;
        this.topothesia=topothesia;
        this.eishthrio=eishthrio;
        this.theseis=theseis;
    }
     
    //ΒΟΗΘΗΤΙΚΕΣ ΣΥΝΑΡΤΗΣΕΙΣ ΓΙΑ ΕΙΣΑΓΩΓΗ ΚΑΙ ΕΞΑΓΩΓΗ ΣΤΟΙΧΕΙΩΝ
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
    
    
    public void setTitlos(String titlos){
        this.titlos=titlos;
    }
    public String getTitlos(){
        return this.titlos;
    }
    public void setEidos(String eidos){
        this.eidos=eidos;
    }
    public String getEidos(){
        return this.eidos;
    }
    public void setHmeromhnia(String hmeromhnia){
        this.hmeromhnia=hmeromhnia;
    }
    public String getHmeromhnia(){
        return this.hmeromhnia;
    }
    public void setWra(String wra){
        this.wra=wra;
    }
    public String getWra(){
        return this.wra;
    }
    public void setTopothesia(String topothesia){
        this.topothesia=topothesia;
    }
    public String getTopothesia(){
        return this.topothesia;
    }
    public void setEishthrio(int eishthrio){
        this.eishthrio=eishthrio;
    }
    public int getEishthrio(){
        return this.eishthrio;
    }
    public void setTheseis(int theseis){
        this.theseis=theseis;
    }
    public int getTheseis(){
        return this.theseis;
    }
}
