/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.ArrayList;

public class ListaMeTaTheamataAnaXrhsth { //ΛΙΣΤΑ ΓΙΑ ΤΗΝ ΔΙΑΧΕΙΡΙΣΗ ΤΩΝ ΚΡΑΤΗΣΕΩΝ ΕΝΟΣ ΧΡΗΣΤΗ ΑΠΟ ΤΟΝ ΙΔΙΟ ΤΟΝ ΧΡΗΣΤΗ ΠΟΥ ΕΚΑΝΕ ΤΙΣ ΚΡΑΤΗΣΕΙΣ. ΔΕΝ ΕΧΕΙ ΔΙΚΑΙΟΔΟΣΙΑ Ο ΔΙΑΧΕΙΡΙΣΤΗΣ Η ΑΛΛΟΣ ΧΡΗΣΤΗΣ ΣΕ ΑΥΤΗ ΤΗΝ ΛΙΣΤΑ
    private ArrayList <VashDedomenwn> listath;
    private VashDedomenwn tha=new VashDedomenwn(null,null,null,null,null,null,null,0,0);
    
    
    public ListaMeTaTheamataAnaXrhsth(){ //ΔΟΜΗΤΗΣ ΤΩΝ ΛΕΙΤΟΥΡΓΙΩΝ ΤΗΣ ΛΙΣΤΑΣ ΜΕ ΤΗΝ ΒΑΣΗ ΔΕΔΟΜΕΝΩΝ
        listath=new ArrayList <VashDedomenwn>();
    }
    public void kataxwrhsh(VashDedomenwn tha){ //ΣΥΑΝΡΤΗΣΗ ΓΙΑ ΠΡΟΣΘΕΣΗ ΚΡΑΤΗΣΗΣ ΑΠΟ ΤΟΝ ΧΡΗΣΤΗ ΣΤΗΝ ΛΙΣΤΑ ΜΕ ΟΛΕΣ ΤΙΣ ΚΡΑΤΗΣΕΙΣ ΤΟΥ
        listath.add(tha);
    }
    public int getMegethosListasL(){ //ΑΠΟΘΗΚΕΥΣΗ ΤΟΥ ΜΕΓΕΘΟΥΣ ΤΗΣ ΛΙΣΤΑΣ ΣΕ ΜΙΑ GET ΣΥΝΑΡΤΗΣΗ ΓΙΑ ΕΥΚΟΛΗ ΧΡΗΣΙΜΟΤΗΤΑ ΤΗΣ
        return listath.size();
    }
    public String getUsername(int thesh) //ΣΥΝΔΕΣΗ ΤΗΣ getUsername ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
    {
        return listath.get(thesh).getUsername();
    }
    public String getKwdikos(int thesh) //ΣΥΝΔΕΣΗ ΤΗΣ getKwdikos ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
    {
        return listath.get(thesh).getKwdikos();
    }
    public String getTitlos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTitlos ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
        return listath.get(thesh).getTitlos();
    }
    public String getEidos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getEidos ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
        return listath.get(thesh).getEidos();
    }
    public String getHmeromhnia(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getHmeromhnia ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
        return listath.get(thesh).getHmeromhnia();
    }
    public String getWra(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getWra ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ T
        return listath.get(thesh).getWra();
    }
    public String getTopothesia(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTopothesia ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
        return listath.get(thesh).getTopothesia();
    }
    public int getEishthrio(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getEishthrio ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
        return listath.get(thesh).getEishthrio();
    }
    public int getTheseis(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTheseis ΤΗΣ ΚΡΑΤΗΣΗΣ ΤΟΥ ΧΡΗΣΤΗ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΗΣ ΒΑΣΗΣ ΔΕΔΟΜΕΝΩΝ 
        return listath.get(thesh).getTheseis();
    }
    public void akyrwshKrathshs(int thesh){ //ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΚΡΑΤΗΣΗΣ
         listath.remove(thesh);
    }
}
