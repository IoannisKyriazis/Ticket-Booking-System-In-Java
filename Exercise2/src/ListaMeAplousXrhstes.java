/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.ArrayList;

public class ListaMeAplousXrhstes { //ΛΙΣΤΑ ΜΕ ΤΑ ΣΤΟΙΧΕΙΑ ΤΩΝ ΑΠΛΩΝ ΧΡΗΣΤΩΝ
    private ArrayList <AploiXrhstes> listax;
    private AploiXrhstes ax=new AploiXrhstes(null,null,null,null,null,null);
    
    
    public ListaMeAplousXrhstes(){ //ΔΟΜΗΤΗΣ ΤΩΝ ΛΕΙΤΟΥΡΓΙΩΝ ΤΗΣ ΛΙΣΤΑΣ ΤΩΝ ΑΠΛΩΝ ΧΡΗΣΤΩΝ
        listax=new ArrayList <AploiXrhstes>();
    }
    public void kataxwrhshX(AploiXrhstes ax){ //ΣΥΑΝΡΤΗΣΗ ΓΙΑ ΠΡΟΣΘΕΣΗ ΑΠΛΟΥ ΧΡΗΣΤΗ ΣΤΗΝ ΛΙΣΤΑ
        listax.add(ax);
    }
    public int getMegethosListasX(){ //ΑΠΟΘΗΚΕΥΣΗ ΤΟΥ ΜΕΓΕΘΟΥΣ ΤΗΣ ΛΙΣΤΑΣ ΣΕ ΜΙΑ GET ΣΥΝΑΡΤΗΣΗ ΓΙΑ ΕΥΚΟΛΗ ΧΡΗΣΙΜΟΤΗΤΑ ΤΗΣ
        return listax.size();
    }
    public String getOnoma(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getOnoma ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ
        return listax.get(thesh).getOnoma();
    }
    public String getEpitheto(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getEpitheto ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ
        return listax.get(thesh).getEpitheto();
    }
    public String getHmgennhshs(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getHmgennhshs ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ
        return listax.get(thesh).getHmgennhshs();
    }
    public String getFylo(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getFylo ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ
        return listax.get(thesh).getFylo();
    }
    public String getUsername(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getUsername ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ
        return listax.get(thesh).getUsername();
    }
    public String getKwdikos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getKwdikos ΤΟΥ ΑΠΛΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ
        return listax.get(thesh).getKwdikos();
    }
    
    public void diagrafhXrhsth(int thesh){ //ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΑΠΛΟΥ ΧΡΗΣΤΗ
         listax.remove(thesh);
    }
}
