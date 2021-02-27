/*
 * @author Ioannis Kyriazis 3212018107
 */

import java.util.ArrayList;

public class ListaMeTheamata { //ΛΙΣΤΑ ΓΙΑ ΤΗΝ ΑΠΟΘΗΚΕΥΣΗ ΤΩΝ ΘΕΑΜΑΤΩΝ
    private ArrayList<Theama> lista;
    private Theama theama=new Theama(null,null,null,null,null,0,0);
    
    
    public ListaMeTheamata(){ //ΔΟΜΗΤΗΣ ΤΩΝ ΛΕΙΤΟΥΡΓΙΩΝ ΤΗΣ ΛΙΣΤΑΣ ΜΕ ΤΑ ΘΕΑΜΑΤΑ
        lista=new ArrayList<Theama>();
    }
    public void kataxwrhsh(Theama theama){ //ΣΥΑΝΡΤΗΣΗ ΓΙΑ ΠΡΟΣΘΕΣΗ ΘΕΑΜΑΤΟΣ ΣΤΗΝ ΛΙΣΤΑ
        lista.add(theama);
    }
    public void neaTheseis(int thesh, int arithmos){ //ΑΝΑΝΕΩΣΗ ΘΕΣΕΩΝ
        lista.get(thesh).setTheseis(arithmos);
    }
    public int getMegethosListas(){ //ΑΠΟΘΗΚΕΥΣΗ ΤΟΥ ΜΕΓΕΘΟΥΣ ΤΗΣ ΛΙΣΤΑΣ ΘΕΑΜΑΤΩΝ ΣΕ ΜΙΑ GET ΣΥΝΑΡΤΗΣΗ ΓΙΑ ΕΥΚΟΛΗ ΧΡΗΣΙΜΟΤΗΤΑ ΤΗΣ
        return lista.size();
    }
    public String getTitlos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTitlos ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getTitlos();
    }
    public String getEidos(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getEidos ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getEidos();
    }
    public String getHmeromhnia(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getHmeromhnia ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getHmeromhnia();
    }
    public String getWra(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getWra ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getWra();
    }
    public String getTopothesia(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTopothesia ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getTopothesia();
    }
    public int getEishthrio(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getEishthrio ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getEishthrio();
    }
    public int getTheseis(int thesh){ //ΣΥΝΔΕΣΗ ΤΗΣ getTheseis ΤΟΥ ΘΕΑΜΑΤΟΣ ΜΕ ΤΗΝ ΛΙΣΤΑ ΤΩΝ ΘΕΑΜΑΤΩΝ
        return lista.get(thesh).getTheseis();
    }
    public void katarghshTheamatos(int thesh){ //ΓΙΑ ΤΗΝ ΔΙΑΓΡΑΦΗ ΘΕΑΜΑΤΟΣ
         lista.remove(thesh);
    }
}
