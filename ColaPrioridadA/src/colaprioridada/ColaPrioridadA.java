
package colaprioridada;

public class ColaPrioridadA<T> {

    Arreglo_ADT<Cola_ADT> colaPA;
    int filaP;

    public ColaPrioridadA(int PrioridadA) {
        colaPA = new Arreglo_ADT(PrioridadA);
        this.filaP = PrioridadA;
        for (int i = 0; i < PrioridadA; i++) {
            colaPA.setItem(i, new ColaA());
        }
    }

    public boolean is_empty() {
        int elem = 0;
        for (int ñ = 0; ñ < filaP - 1; ñ++) {
            if (colaPA.getItem(ñ).is_empty()) {
                elem++;
            }
        }
        return elem == 0;
    }

    public int getlength() {
            jerarquia fuc;
        int tamanio = 0;
        
        for (int ñ = 0; ñ < filaP - 1; ñ++) {
            fuc = filaA.getItem(ñ);
            length += fuc.getlenght();
        }
        return lenght;
    }

    public void enqueue(int Prioridad, T valor) {
        if (Prioridad >= 0 && Prioridad < filaP) {
            colaPA.getItem(Prioridad).enqueue(valor);
        } else if (Prioridad > filaP) {
            colaPA.getItem(filaP - 1).enqueue(valor);
        }
    }

    public void dequeue() {
        for (int h = 0; h < filaP; h++) {
            if (!colaPA.getItem(h).estaVacia()) {
                colaPA.getItem(h).dequeue();
                break;
            }
        }
    }

    public void transversal() {
        for (int Z = 0; Z < filaP; Z++) {
            System.out.print("Prioridad " + Z + " ");
            colaPA.getItem(Z).transversal();
        }
    }

    @Override
    public String toString() {
        return "ColaPrioridadA{" + "ColaPri=" + colaPA.toString() + '}';
    }

 
     
    public static void main(String[] args) {
        // TODO code application logic here
       ColaPrioridadA Bv = new ColaPrioridadA(5);
       Bv.enqueue(4, "Maestro");
       Bv.enqueue(2, "Niños"); 
       Bv.enqueue(4, "Vigía");
       Bv.enqueue(5, "Capitán");
    }
    
}
no se pero era algo asi