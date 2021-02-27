/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.ArrayList;
public class ListaDiaxeiristwn { //ΛΙΣΤΑ ΓΙΑ ΤΑ ΣΤΟΙΧΕΙΑ ΤΟΥ ΜΟΝΑΔΙΚΟΥ ΔΙΑΧΕΙΡΙΣΤΗ
    private ArrayList <Diaxeirisths> listad;
    private Diaxeirisths d=new Diaxeirisths(null,null,null,null,null,null);
    
    
    public ListaDiaxeiristwn(){ //ΔΟΜΗΤΗΣ ΤΩΝ ΛΕΙΤΟΥΡΓΙΩΝ ΤΗΣ ΛΙΣΤΑΣ ΜΕ ΤΟΝ ΔΙΑΧΕΙΡΙΣΤΗ
        listad=new ArrayList <Diaxeirisths>();
    }
    public void kataxwrhshD(Diaxeirisths d){ //ΣΥΑΝΡΤΗΣΗ ΓΙΑ ΠΡΟΣΘΕΣΗ ΤΟΥ ΔΙΑΧΕΙΡΙΣΤΗ ΣΤΗΝ ΛΙΣΤΑ
        listad.add(d);
    }
    public int getMegethosListasD(){ //ΑΠΟΘΗΚΕΥΣΗ ΤΟΥ ΜΕΓΕΘΟΥΣ ΤΗΣ ΛΙΣΤΑΣ ΣΕ ΜΙΑ GET ΣΥΝΑΡΤΗΣΗ ΓΙΑ ΕΥΚΟΛΗ ΧΡΗΣΙΜΟΤΗΤΑ ΤΗΣ
        return listad.size();
    }
    public String getdOnoma(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getdOnoma ΤΟΥ ΔΙΑΧΕΙΡΙΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ 
        return listad.get(thesh).getOnoma();
    }
    public String getdEpitheto(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getdEpitheto ΤΟΥ ΔΙΑΧΕΙΡΙΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ 
        return listad.get(thesh).getEpitheto();
    }
    public String getdUsername(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getdUsername ΤΟΥ ΔΙΑΧΕΙΡΙΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ 
        return listad.get(thesh).getdUsername();
    }
    public String getdKwdikos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getdKwdikos ΤΟΥ ΔΙΑΧΕΙΡΙΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ 
        return listad.get(thesh).getdKwdikos();
    }
}
